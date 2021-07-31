package org.example.core.aspect;

import cn.hutool.log.Log;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.example.core.util.RedisOperator;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author chenbin
 * @date 2021/7/31
 */
@Component
@Aspect
public class RedisAspect {

    private Log LOGGER = Log.get();

    @Resource
    private RedisOperator redisOperator;

    @Pointcut("@annotation(org.example.core.annotation.RedisCache)")
    public void pointcutMethod() {

    }

    @Around("pointcutMethod()")
    public Object around(ProceedingJoinPoint joinPoint) {
        //前置：从Redis里获取缓存
        //先获取目标方法参数
        long startTime = System.currentTimeMillis();
        String applId = null;
        Object[] args = joinPoint.getArgs();
        if (args != null && args.length > 0) {
            applId = String.valueOf(args[0]);
        }

        //获取目标方法所在类
        String target = joinPoint.getTarget().toString();
        String className = target.split("@")[0];

        //获取目标方法的方法名称
        String methodName = joinPoint.getSignature().getName();

        //redis中key格式：    applId:方法名称
        String redisKey = applId + ":" + className + "." + methodName;

        Object obj = redisOperator.get(redisKey);

        if (obj != null) {
            LOGGER.info("**********从Redis中查到了数据**********");
            LOGGER.info("Redis的KEY值:" + redisKey);
            LOGGER.info("REDIS的VALUE值:" + obj.toString());
            return obj;
        }
        long endTime = System.currentTimeMillis();
        LOGGER.info("Redis缓存AOP处理所用时间:" + (endTime - startTime));
        LOGGER.info("**********没有从Redis查到数据**********");
        try {
            obj = joinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        LOGGER.info("**********开始从MySQL查询数据**********");
        //后置：将数据库查到的数据保存到Redis
        redisOperator.set(redisKey, obj);
        return obj;
    }
}
