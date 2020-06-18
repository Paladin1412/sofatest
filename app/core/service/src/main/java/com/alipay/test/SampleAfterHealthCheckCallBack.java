/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.alipay.test;

import com.alipay.sofa.runtime.api.healthcheck.AfterHealthCheckCallback;

/**
 * @author xufan.sxf
 * @version sofatest: SampleAfterHealthCheckCallBack.java, v 0.1 2020-06-18 13:55 xufan.sxf Exp $ 
 */
public class SampleAfterHealthCheckCallBack implements AfterHealthCheckCallback {
    @Override
    public void onHealthy() throws Exception {
        System.out.println("Health Check Passed");
    }
}
