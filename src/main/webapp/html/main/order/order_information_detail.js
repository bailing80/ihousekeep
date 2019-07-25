$(document).ready(function() {
	queryorder_information(detail_id);

});

function queryorder_information(id) {
	alert(id)
	var obj = new Object();
	obj.id = detail_id;
	$.ajax({
			url : getRootPath()
					+ "/Order_Controller_4W/query_all_t_u_order.action",
			data : obj,
			success : show_order_information_detail
			});

}

function show_order_information_detail(data) {
	var d = $(data)[0];
	$("#order_no").val(d.order_no);
	$("#nick_name").val(d.nick_name);
	$("#user_phone").val(d.user_phone);
	$("#address").val(d.address);
	$("#order_time_str").val(d.order_time_str);
	$("#appointment_time_str").val(d.appointment_time_str);
	$("#pay_fun").val(d.pay_fun);
	$("#pay_time_str").val(d.pay_time_str);
	$("#order_total_money").val(d.order_total_money);
	$("#order_pay_money").val(d.order_pay_money);
	$("#coupon_type_id").val(d.coupon_type_id);
	$("#money").val(d.money);
	$("#item_name").val(d.item_name);
	$("#project_id").val(d.project_id);
	

}