/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.alipay.test;

import com.alipay.sofa.runtime.api.annotation.SofaClientFactory;
import com.alipay.sofa.runtime.api.client.ServiceClient;
import com.alipay.sofa.runtime.api.client.param.ServiceParam;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author xufan.sxf
 * @version sofatest: SampleClientBean.java, v 0.1 2020-06-18 11:08 xufan.sxf Exp $ 
 */
public class SampleClientBean implements InitializingBean {

    @SofaClientFactory
    private ServiceClient serviceClient;

    @Override
    public void afterPropertiesSet() throws Exception {
        ServiceParam serviceParam = new ServiceParam();
        serviceParam.setInterfaceType(SampleService.class);
        serviceParam.setInstance(new SampleServiceImpl());
        serviceClient.service(serviceParam);
        // 在初始化bean的过程中会调用这个函数，顺便实现了服务的发布
        /*
        instantiate and populate properties -> setBeanName -> setBeanFactory -> setApplicationContext ->
        postProcessBeforeInitialization(BeanPostProcessor) -> @PostConstruct -> afterPropertiesSet(InitializingBean) ->
        postProcessAfterInitialization(BeanPostProcessor) -> ready to use
         */
        /*
        @PreDestroy -> destroy(DisposableBean) -> terminated
         */
    }
}
