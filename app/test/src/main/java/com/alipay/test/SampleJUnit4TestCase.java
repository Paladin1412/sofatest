/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.alipay.test;

import com.alipay.sofa.runtime.test.junit4.SofaJUnit4ClassRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author xufan.sxf
 * @version sofatest: SampleJUnit4TestCase.java, v 0.1 2020-06-18 14:37 xufan.sxf Exp $ 
 */
@RunWith(SofaJUnit4ClassRunner.class)
public class SampleJUnit4TestCase {
    @Test
    public void test() {
        System.out.println("JUnit4 test case passed");
        Assert.assertTrue(true);
    }
}
