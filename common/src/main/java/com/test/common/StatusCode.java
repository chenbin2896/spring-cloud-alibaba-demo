package com.test.common;

import java.io.Serializable;

/**
 * 状态码
 *
 * @author Administrator
 */
public class StatusCode implements Serializable {
    /**
     * 成功
     */
    public static final int OK = 20000;
    /**
     * 失败
     */
    public static final int ERROR = 20001;
}
