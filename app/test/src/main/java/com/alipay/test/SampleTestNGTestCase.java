/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.alipay.test;

import com.alipay.sofa.runtime.test.testng.TestNGEclipseSofaTest;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author xufan.sxf
 * @version sofatest: SampleTestNGTestCase.java, v 0.1 2020-06-18 14:39 xufan.sxf Exp $ 
 */
public class SampleTestNGTestCase extends TestNGEclipseSofaTest {
    @Test
    public void test() {
        System.out.println("TestNG test case passed");
        Assert.assertTrue(true);
    }
}
