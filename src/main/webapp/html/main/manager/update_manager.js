$(document).ready(function() {
	queryEditManager(update_id);
});
// 通过ID查询管理员数据
function queryEditManager(id) {
	var obj = new Object();
	obj.id = id;
	$.ajax({
		url : getRootPath()
				+ "/Manager_Controller_4W/query_manager_By_Id.action",
		data : obj,
		success : show_edit_manager
	});
}
// 将信息回显到编辑框
function show_edit_manager(data) {
	var d = $(data)[0];
	$("#name").val(d.name);
	$("#phone").val(d.phone);
	$("#user_manager_role_name").val(d.user_manager_role_name);
	$("#is_login").val(d.is_login);
	if (d.is_login == 1) {
		$("#is_login_1").attr("checked", "checked");
	} else {
		$("#is_login_2").attr("checked", "checked");
	}

}