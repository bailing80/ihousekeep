package com.ccunix.ihousekeeping.minprog_main.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.ihousekeeping.base.controller.BaseMultiController;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.domain.AppDataModel_Sec;
import com.ccunix.ihousekeeping.minprog_main.service.MinPro_MainPage_Service_Iface;

@Controller
@RequestMapping("MainPage_Controller_4X")
public class MainPage_Controller_4X extends BaseMultiController {

	@Resource
	MinPro_MainPage_Service_Iface mainPage_Service_Iface;

	@RequestMapping("getMainInfo")
	@ResponseBody
	public AppDataModel_Sec getMainInfo() {

		AppDataModel_Sec appDataModel_Sec = getAppDataMode_sec();

		AppDataModel appDataModel = null;
		try {
			appDataModel = mainPage_Service_Iface.getMainPageInfo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return getAppDataMode_sec().setData(encodeURI(appDataModel));

	}
}
