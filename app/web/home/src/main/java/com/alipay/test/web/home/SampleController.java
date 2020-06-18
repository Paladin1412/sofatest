/**
 * Alipay.com Inc.
 * Copyright (c) 2005-2010 All Rights Reserved.
 */
package com.alipay.test.web.home;

import com.alipay.sofa.runtime.api.aware.AppConfigurationAware;
import com.alipay.sofa.runtime.api.component.AppConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

/**
 * A sample controller.
 */
@Controller
public class SampleController implements AppConfigurationAware {

	@Autowired
	private SpringBean springBean;

	private AppConfiguration appConfiguration;

	@RequestMapping(value="/sample",method = RequestMethod.GET)
	public void doGet(ModelMap modelMap) {

       modelMap.put("hello",appConfiguration.getPropertyValue("config"));

	}

	@Override
	public void setAppConfiguration(AppConfiguration appConfiguration) {
		this.appConfiguration = appConfiguration;
	}
}
