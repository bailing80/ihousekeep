package com.ccunix.ihousekeeping.area_type.service;

import java.util.List;

import com.ccunix.ihousekeeping.area_type.domain.Area_type_Manager;
import com.ccunix.ihousekeeping.basedb.domain.T_u_area_type;

/**
 * 
 * @ClassName: Area_type_Manager_Service_Iface
 * @author 肖云鹏
 * @date 2019年7月17日 上午10:49:48
 *
 */
public interface Area_type_Manager_Service_Iface {
	public void delete_all_area_type_manager(T_u_area_type t_u_area_type);

	public List query_all_area_type_manager(Area_type_Manager area_type_Manager)throws Exception;

}
