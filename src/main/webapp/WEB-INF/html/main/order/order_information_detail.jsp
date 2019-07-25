<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/html/base/baseurl.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单详细显示</title>
<link href="<%=baseurl%>/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script src="<%=baseurl%>/js/jquery.js"></script>
<!-- <script type="text/javascript" src="<%=baseurl%>/html/main/order/order_information_detail.js"></script>  -->
<script src="<%=baseurl%>/js/jquery.form.js"></script>
<script src="<%=baseurl%>/js/base.js"></script>
<script src="<%=baseurl%>/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="<%=baseurl%>/html/main/order/order_information_detail.js"></script>
</head>
<body>
	<table border="1" class="table table-striped" style="width: 100%">
		<tr>
			<td>订单编号</td>
			<td><input id="order_no" type="text" size="2"
				class="form-control" style="width: 100%"></td>
		</tr>
		<tr>
			<td>下单时间</td>
			<td><input id="order_time_str" type="text" size="2"
				class="form-control" style="width: 100%"></td>
		</tr>
		<tr>
			<td>预约时间</td>
			<td><input id="appointment_time_str" type="text" size="2"
				class="form-control" style="width: 100%"></td>
		</tr>
		<tr>
			<td>客户姓名</td>
			<td><input id="nick_name" type="text" size="2"
				class="form-control" style="width: 100%"></td>
		</tr>
		<tr>
			<td>客户电话</td>
			<td><input id="user_phone" type="text" size="2"
				class="form-control" style="width: 100%"></td>
		</tr>
		<tr>
			<td>客户地址</td>
			<td><input id="address" type="text" size="2"
				class="form-control" style="width: 100%; background-color: transparent; border: 0;" ></td>
		</tr>
		<tr>
			<td>支付方式</td>
			<td><input id="pay_fun" type="text" size="2"
				class="form-control" style="width: 100%; background-color: transparent; border: 0;"></td>
		</tr>
		<tr>
			<td>支付时间</td>
			<td><input id="pay_time_str" type="text" size="2"
				class="form-control" style="width: 100%; background-color: transparent; border: 0;"></td>
		</tr>
		<tr>
			<td>订单金额</td>
			<td><input id="order_total_money" type="text" size="2"
				class="form-control" style="width: 100%; background-color: transparent; border: 0;"></td>
		</tr>
		<tr>
			<td>实际支付金额</td>
			<td><input id="order_pay_money" type="text" size="2"
				class="form-control" style="width: 100%; background-color: transparent; border: 0;"></td>
		</tr>
		<tr>
			<td>优惠券类型</td>
			<td><input id="coupon_type_id" type="text" size="2"
				class="form-control" style="width: 100%; background-color: transparent; border: 0;"></td>
		</tr>
			<tr>
			<td>金额</td>
			<td><input id="money" type="text" size="2"
				class="form-control" style="width: 100%; background-color: transparent; border: 0;"></td>
		</tr>
		</tr>
			<tr>
			<td>子项目名称</td>
			<td><input id="item_name" type="text" size="2"
				class="form-control" style="width: 100%; background-color: transparent; border: 0;"></td>
		</tr>
		</tr>
			<tr>
			<td>服务项目</td>
			<td><input id="project_id" type="text" size="2"
				class="form-control" style="width: 100%; background-color: transparent; border: 0;"></td>
		</tr> 
	</table>
</body>
</html>