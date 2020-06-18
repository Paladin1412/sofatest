/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.alipay.test;

import com.alipay.sofa.runtime.test.autowire.annotation.XAutoWire;
import com.alipay.sofa.runtime.test.autowire.annotation.XConfigure;
import com.alipay.sofa.runtime.test.autowire.annotation.XMode;
import com.alipay.sofa.runtime.test.junit4.SofaJUnit4ClassRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author xufan.sxf
 * @version sofatest: SampleConfigJUnit4TestCase.java, v 0.1 2020-06-18 14:46 xufan.sxf Exp $ 
 */
@RunWith(SofaJUnit4ClassRunner.class)
@XMode(XMode.JVM)
@XConfigure(virtualBundleConfigLocation = "test.xml")
public class SampleConfigJUnit4TestCase {
    @XAutoWire(XAutoWire.BY_NAME)
    private TestBean testBean;


    @Test
    public void test() {
        System.out.println("Config test case passed");
        Assert.assertEquals("Test",testBean.sayTest());
    }
}
