package com.ccunix.ihousekeeping.order.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.advertisement.dao.Advertisement_Manager_Dao_Iface;
import com.ccunix.ihousekeeping.advertisement.domain.Advertisement_Manager;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.base.util.DateTimeUtil;
import com.ccunix.ihousekeeping.basedb.dao.T_s_advertisement_manager_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.dao.T_u_order_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.domain.T_s_advertisement_manager;
import com.ccunix.ihousekeeping.order.dao.Order_Dao_Iface;
import com.ccunix.ihousekeeping.order.domain.Order;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Order_Service_Impl extends BaseService implements Order_Service_Iface {
	@Resource
	public Order_Dao_Iface order_Dao_Iface;
 
	@Resource
	public T_u_order_Dao_Iface t_u_order_Dao_Iface;

	/**
	 * 关键字查询及查询所有数据
	 * @author 黄爽
	 * @return
	 */
	@Override
	public List queryAll_order(Order order){
		List<Order> ls = order_Dao_Iface.queryAll_order(order);
		//向前台送数据前将是否轮播的"0","1"改为字符串"是","否"
		for (Order s : ls) {
//			if (s.getIs_wheel() == 1) {
//				s.setIs_wheel_str("是");
//			} else {
//				s.setIs_wheel_str("否");
//			}
		}
		return ls;
	}

	@Override
	public String makeOrderNo() throws Exception {
		String yymmdd = DateTimeUtil.getDateString(DateTimeUtil.dateFormat_yyMMDD, new Date());
		int seq = order_Dao_Iface.getOrderNo_seq();
		String str = yymmdd + seq;
		return str;
	}

}
