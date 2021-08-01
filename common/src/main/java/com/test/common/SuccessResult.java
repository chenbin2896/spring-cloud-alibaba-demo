package com.test.common;

/**
 * @author chenbin
 * @date 2021/8/1
 */
public class SuccessResult extends Result{

    public SuccessResult(Object data) {
        super(true, 200, "操作成功", data);
    }
}
