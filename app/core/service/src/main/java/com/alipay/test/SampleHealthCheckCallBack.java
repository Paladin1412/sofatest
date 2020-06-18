/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.alipay.test;

import com.alipay.sofa.runtime.api.healthcheck.HealthCheckCallback;
import com.alipay.sofa.runtime.api.healthcheck.Result;

/**
 * @author xufan.sxf
 * @version sofatest: SampleHealthCheckCallBack.java, v 0.1 2020-06-18 13:48 xufan.sxf Exp $ 
 */
public class SampleHealthCheckCallBack implements HealthCheckCallback {

    @Override
    public Result isHealthy() throws Exception {
        return Result.healthy();
    }

    @Override
    public String getId() {
        return "CustomHealthCheck";
    }
}
