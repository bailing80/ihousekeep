package com.ccunix.ihousekeeping.rider.dao;

import java.util.List;

import com.ccunix.ihousekeeping.advertisement.domain.Advertisement_Manager;
import com.ccunix.ihousekeeping.order.domain.Order;
import com.ccunix.ihousekeeping.rider.domain.Rider;
 
public interface Rider_Dao_Iface {
	public List queryAll_rider(Rider rider);
}
