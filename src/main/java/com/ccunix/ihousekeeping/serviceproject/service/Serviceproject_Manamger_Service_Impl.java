package com.ccunix.ihousekeeping.serviceproject.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.dao.T_s_system_param_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.dao.T_u_service_project_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.domain.T_s_system_param;
import com.ccunix.ihousekeeping.basedb.domain.T_u_service_project;
import com.ccunix.ihousekeeping.serviceproject.dao.Serviceproject_Manamger_Dao_Iface;
import com.ccunix.ihousekeeping.serviceproject.domain.ServiceItem_bean;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Serviceproject_Manamger_Service_Impl extends BaseService implements Serviceproject_Manamger_Service_Iface {
	// 批量删除
	@Resource 
	T_u_service_project_Dao_Iface t_u_service_project_Dao_Iface;
	@Resource
	Serviceproject_Manamger_Dao_Iface serviceproject_Manamger_Dao_Iface;

	@Override
	public void delete_batch_service_project(T_u_service_project t_u_service_project) {
		String[] ids = t_u_service_project.getId().split(",");
		try {
			for (String string : ids) {
				T_u_service_project service_project = new T_u_service_project();
				service_project.setId(string);
				service_project.setIs_show(2);
				t_u_service_project_Dao_Iface.update_t_u_service_project(service_project);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 查询数据
	@Override
	public List queryAll_service_project(ServiceItem_bean serviceItem_bean) {
		List<ServiceItem_bean> ls = null;
		try {
			ls = serviceproject_Manamger_Dao_Iface.queryAll_service_project(serviceItem_bean);
			if (ls.size() > 0) {
				for (ServiceItem_bean item_bean : ls) {
					if (item_bean.getIs_show() == 1) {
						item_bean.setIs_show_str("是");
					} else {
						item_bean.setIs_show_str("否");
					}
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ls;

	}

}
