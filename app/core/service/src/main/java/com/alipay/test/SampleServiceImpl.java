/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.alipay.test;

import com.alipay.sofa.runtime.api.annotation.SofaService;

/**
 * @author xufan.sxf
 * @version : SampleServiceImpl.java, v 0.1 2020-06-18 10:28 xufan.sxf Exp $ 
 */
@SofaService
public class SampleServiceImpl implements SampleService {
    @Override
    public String hello() {
        return "service annotation";
    }
}
