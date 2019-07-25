package com.ccunix.ihousekeeping.rider.service;

import java.util.List;

import com.ccunix.ihousekeeping.advertisement.domain.Advertisement_Manager;
import com.ccunix.ihousekeeping.basedb.domain.T_s_advertisement_manager;
import com.ccunix.ihousekeeping.order.domain.Order;
import com.ccunix.ihousekeeping.rider.domain.Rider;

/**
 * 后台管理端-广告管理-接口
 * @author 黄爽
 *
 */
public interface Rider_Service_Iface {
 
	List queryAll_rider(Rider rider);
	//void delete_all_t_s_advertisement_manager(T_s_advertisement_manager advertisement_Manager);

}
