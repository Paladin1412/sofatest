/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.alipay.test.web.home;

/**
 * @author xufan.sxf
 * @version : SpringBeanImplOne.java, v 0.1 2020-06-18 9:50 xufan.sxf Exp $ 
 */
public class SpringBeanImplOne implements SpringBean {
    @Override
    public String getWord() {
        return "One";
    }
}
