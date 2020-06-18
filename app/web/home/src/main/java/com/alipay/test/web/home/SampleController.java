/**
 * Alipay.com Inc.
 * Copyright (c) 2005-2010 All Rights Reserved.
 */
package com.alipay.test.web.home;

import com.alipay.sofa.runtime.api.annotation.AppConfig;
import com.alipay.sofa.runtime.api.annotation.SofaClientFactory;
import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.aware.AppConfigurationAware;
import com.alipay.sofa.runtime.api.client.ReferenceClient;
import com.alipay.sofa.runtime.api.client.param.ReferenceParam;
import com.alipay.sofa.runtime.api.component.AppConfiguration;
import com.alipay.test.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

/**
 * A sample controller.
 */
@Controller
public class SampleController {

	@SofaClientFactory
	private ReferenceClient referenceClient;

	@RequestMapping(value="/sample",method = RequestMethod.GET)
	public void doGet(ModelMap modelMap) {
		ReferenceParam<SampleService> referenceParam = new ReferenceParam<>();
		referenceParam.setInterfaceType(SampleService.class);
		SampleService s = referenceClient.reference(referenceParam);
		modelMap.put("hello",s.hello());
	}
}
