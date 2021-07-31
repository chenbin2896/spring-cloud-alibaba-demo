package org.example.consumer;

import com.alibaba.cloud.sentinel.rest.SentinelClientHttpResponse;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;

/**
 * @author chenbin
 * @date 2021/7/26
 */
public class ExceptionUtil {

    /**
     * 限流熔断
     *
     * @param request
     * @param body
     * @param execution
     * @param exception
     * @return
     */
    public static SentinelClientHttpResponse handleBlock(HttpRequest request, byte[] body, ClientHttpRequestExecution execution, BlockException exception) {
        return new SentinelClientHttpResponse("限流熔断");
    }

    /**
     * 异常降级业务逻辑
     */
    public static SentinelClientHttpResponse handleFallback(HttpRequest request,
                                                            byte[] body,
                                                            ClientHttpRequestExecution execution,
                                                            BlockException ex) {
        return new SentinelClientHttpResponse("异常降级");
    }
}
