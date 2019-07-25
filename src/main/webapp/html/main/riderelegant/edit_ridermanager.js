$(document).ready(function() {
	editRiderelegant(update_id);

});

function editRiderelegant(id) {
	//alert("Editid:"+id);
	var obj = new Object();
	obj.id = id;
	$.ajax({
				url : getRootPath()+ "/Riderelegant_Manager_Controller_4W/queryBy_t_u_rider.action",
				data : obj,
				success : show_edit_riderelegant
			});
	
	$.ajax({
		url : getRootPath() + "/Riderelegant_Manager_Controller_4W/queryAll_USer_Manager_Role.action",
		data :null,
		success : show_add_riderelegant
	});
	
	$.ajax({
		url : getRootPath() + "/Riderelegant_Manager_Controller_4W/queryAll_t_u_rider.action",
		data :null,
		success : show_leader
	});
}

function show_edit_riderelegant(data){
	var d =$(data)[0];
	$("#phone").val(d.phone);
	$("#name").val(d.name);
	$("#pwd").val(d.pwd);
}


function show_add_riderelegant(data){
	/*alert("[show_add_riderelegant][调用]");
	alert("$(data)[0].id:"+$(data)[0].id);*/
	//alert("$(data).length:"+$(data).length);
	for(var i =0;i<$(data).length;i++){
		$("#user_manager_role_id").append("<option value='"+$(data)[i].id+"'>"+$(data)[i].name+"</option>");
		
	}

}

function show_leader(data){
	$("#leader_role_id").append("<option>"+"无"+"</option>");
	for(var i =0;i<$(data).length;i++){
		if($(data)[i].id != update_id){
			$("#leader_role_id").append("<option value='"+$(data)[i].id+"'>"+$(data)[i].name+"</option>");
		}
		
	}
	
}
