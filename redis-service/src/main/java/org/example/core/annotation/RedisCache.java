package org.example.core.annotation;

import java.lang.annotation.*;

/**
 * @author chenbin
 * @date 2021/7/31
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RedisCache {
}
