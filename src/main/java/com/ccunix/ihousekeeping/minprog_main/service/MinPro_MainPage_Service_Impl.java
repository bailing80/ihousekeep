package com.ccunix.ihousekeeping.minprog_main.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.dao.T_u_rider_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.dao.T_u_service_project_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.domain.T_u_rider;
import com.ccunix.ihousekeeping.basedb.domain.T_u_service_project;
import com.ccunix.ihousekeeping.parammanager.domain.SystemParam;
import com.ccunix.ihousekeeping.parammanager.service.ParamManager_Service_Iface;
import com.ccunix.ihousekeeping.riderelegant.domain.T_U_Rider;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class MinPro_MainPage_Service_Impl extends BaseService implements MinPro_MainPage_Service_Iface {

	@Resource
	ParamManager_Service_Iface paramManager_Service_Iface;
	@Resource
	T_u_service_project_Dao_Iface t_u_service_project_Dao_Iface;
	@Resource
	T_u_rider_Dao_Iface t_u_rider_Dao_Iface;

	@Override
	public AppDataModel getMainPageInfo() throws Exception {

		AppDataModel appDataModel = getAppDataModel();

		T_u_service_project t_u_service_project = new T_u_service_project();
		T_u_rider t_u_rider = new T_u_rider();
		t_u_service_project.setIs_show(1);
		t_u_rider.setIs_excellent("01");
		List service_project_name = t_u_service_project_Dao_Iface.queryAll_t_u_service_project(t_u_service_project);
		for (int i = 0; i < service_project_name.size(); i++) {
			T_u_service_project t = (T_u_service_project) service_project_name.get(i);
			t.setPicture_bef(paramManager_Service_Iface.getSystemParam(SystemParam.SYSPARM.httpFileBasePath)
							+ t.getPicture_bef());
			t.setPicture_aft(paramManager_Service_Iface.getSystemParam(SystemParam.SYSPARM.httpFileBasePath)
					+ t.getPicture_aft());
		}

		List rider = t_u_rider_Dao_Iface.queryAll_t_u_rider(t_u_rider);

		appDataModel.data.put("service_project", service_project_name);
		appDataModel.data.put("rider", rider);

		return appDataModel;
	}

}
