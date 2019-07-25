package com.ccunix.ihousekeeping.minprog_main.service;

import com.ccunix.ihousekeeping.base.domain.AppDataModel;

public interface MinPro_MainPage_Service_Iface {
	
	/**
	 * 获取首页信息
	 * @return
	 * @throws Exception
	 */
	public AppDataModel getMainPageInfo() throws Exception;

}
