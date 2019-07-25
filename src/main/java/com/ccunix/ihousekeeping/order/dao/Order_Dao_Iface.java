package com.ccunix.ihousekeeping.order.dao;

import java.util.List;

import com.ccunix.ihousekeeping.advertisement.domain.Advertisement_Manager;
import com.ccunix.ihousekeeping.order.domain.Order;
/**
 * 
 * @author 黄爽
 *
 */
public interface Order_Dao_Iface {
	public List queryAll_order(Order order);
	
	public int getOrderNo_seq() throws Exception;
}
