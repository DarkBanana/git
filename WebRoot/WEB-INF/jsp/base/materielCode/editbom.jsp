<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
<link rel="stylesheet" type="text/css"
	href="${baseurl}/jEasyUIcustom/uimaker/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${baseurl}/jEasyUIcustom/uimaker/icon.css">

<title>修改BOM</title>
<script type="text/javascript">
	function bomsave() {
		//准备使用jquery 提供的ajax Form提交方式
		//将form的id传入，方法自动将form中的数据组成成key/value数据，通过ajax提交，提交方法类型为form中定义的method，
		//使用ajax form提交时，不用指定url，url就是form中定义的action
		//此种方式和原始的post方式差不多，只不过使用了ajax方式

		//第一个参数：form的id
		//第二个参数：bomsave_callback是回调函数，bomsave_callback当成一个方法的指针
		//第三个参数：传入的参数， 可以为空
		//第四个参数：dataType预期服务器返回的数据类型,这里action返回json
		//根据form的id找到该form的action地址
		jquerySubByFId('bomform', bomsave_callback, null, "json");

	}
	//ajax调用的回调函数，ajax请求完成调用此函数，传入的参数是action返回的结果
	function bomsave_callback(data) {
		console.log("返回结果" + data)
		message_alert(data);
		//如果成功，自动关闭
		if (data.resultInfo.type == '1') {
			//延迟1秒执行关闭方法
			setTimeout("toquerybom()", 1000);
		}
	}
	//回 角色显示页面
	function toquerybom() {
		if (parent.parent.parent) {
			//让第二层页面执行跳转
			parent.location = '${baseurl}bom/querybom.action';
		}
	}
</script>
</head>
<body>
	<form id="bomform" action="${baseurl}bom/editbomsubmit.action"
		method="post">
		<!-- 更新BOM的id -->
		<input type="hidden" name="id" value="${bomCustom.id}" />
		<TBODY>
			<table cellpadding="5">
				<tr>
					
					<td>柜体类型:</td>
					<td>
						<select required name="bomCustom.ctypeid" style="width:162px; height: 35px;">
						<option value="${ctList2.id}">${ctList2.cname}</option>
							 <c:forEach items="${ctList}" var="ct">
							 	<option value="${ct.id}">${ct.cname}</option>
							 </c:forEach>
						</select>
					</td> 
					
					<td>外购/自产:</td>
					<td>
					<select required name="bomCustom.materielmethod" style="width:162px; height: 35px;">
						  <option value="${list00}">${list}</option>
						  <option value="${list11}">${list1}</option>
					</select>
					</td> 
					
					<td>产线:</td>
					<td>
					<select  name="bomCustom.materielmark" style="width:162px; height: 35px;">
						 <option value="${list22}">${list2}</option>
						  <option value="${list33}">${list3}</option>
					</select>
					</td> 
				</tr>
				<tr>
				
					<td>名称:</td>
					<td><input required class="easyui-textbox" type="text"
						name="bomCustom.unitname" value="${bomCustom.unitname}"
						style="height: 35px;"></input></td>
					
					<td>部件编码:</td>
					<td><input  class="easyui-textbox" type="text"
						name="bomCustom.unitcode" value="${bomCustom.unitcode}"
						style="height: 35px;"></input></td>
						
					<td>数量:</td>
					<td><input required class="easyui-textbox" type="text"
						name="bomCustom.materielnumber" value="${bomCustom.materielnumber}"
						style="height: 35px;"></input></td>
				</tr>
				<tr>
					<td>单件工时(分钟):</td>
					<td><input required class="easyui-textbox" type="text"
						name="bomCustom.tasktime" value="${bomCustom.tasktime}"
						style="height: 35px;"></input></td>
				</tr>
				<tr>
					<td colspan=4 align=right class=category><a id="submitbtn"
						style="margin-left: 100px" class="easyui-linkbutton"
						iconCls="icon-ok" href="#" onclick="bomsave()">提交</a> <a
						id="closebtn" style="margin-left: 100px" class="easyui-linkbutton"
						iconCls="icon-cancel" href="#" onclick="parent.closemodalwindow()">关闭</a>
					</td>
				</tr>
			</table>
	</form>
</body>
</html>