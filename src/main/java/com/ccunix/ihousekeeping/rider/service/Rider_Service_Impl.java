package com.ccunix.ihousekeeping.rider.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.advertisement.dao.Advertisement_Manager_Dao_Iface;
import com.ccunix.ihousekeeping.advertisement.domain.Advertisement_Manager;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.dao.T_s_advertisement_manager_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.dao.T_u_order_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.dao.T_u_rider_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.domain.T_s_advertisement_manager;
import com.ccunix.ihousekeeping.order.dao.Order_Dao_Iface;
import com.ccunix.ihousekeeping.order.domain.Order;
import com.ccunix.ihousekeeping.rider.dao.Rider_Dao_Iface;
import com.ccunix.ihousekeeping.rider.domain.Rider;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Rider_Service_Impl extends BaseService implements Rider_Service_Iface {
	@Resource
	public Rider_Dao_Iface rider_Dao_Iface;
 
	@Resource
	public T_u_rider_Dao_Iface t_u_rider_Dao_Iface;

	/**
	 * 关键字查询及查询所有数据
	 * @param advertisement_Manager
	 * @return
	 */
	@Override
	public List queryAll_rider(Rider rider) {
		List<Rider> ls = rider_Dao_Iface.queryAll_rider(rider);
		//向前台送数据前将是否轮播的"0","1"改为字符串"是","否"
		for (Rider s : ls) {
//			if (s.getIs_wheel() == 1) {
//				s.setIs_wheel_str("是");
//			} else {
//				s.setIs_wheel_str("否");
//			}
		}
		return ls;
	}


}
