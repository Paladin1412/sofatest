/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.alipay.test;

/**
 * @author xufan.sxf
 * @version : SampleServiceImplTwo.java, v 0.1 2020-06-18 10:39 xufan.sxf Exp $ 
 */
public class SampleServiceImplTwo implements SampleService {
    @Override
    public String hello() {
        return "service unique-id";
    }
}
