<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="resources/css/css.css" type="text/css">
<script type="text/javascript" src="resources/js/jquery-1.8.2.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">

	var orderMethod = '${movieVo.orderMethod=='asc'?'desc':'asc'}';

	function query(orderField) {
		location = "selects?orderField="+orderField+"&orderMethod="+orderMethod;
	}

	function sel(flag) {
		$(".ck").prop("checked",flag);
	}
	
	function fx() {
		$(".ck").each(function(){
			this.checked=!this.checked;
		})
	}
	
	function del() {
		var ids = [];
		$(".ck:checked").each(function(){
			ids.push(this.value);
		});
		
		if(ids.length == 0 ) {
			alert("请选择需要删除的数据")
			return;
		}
		
		location = "deleteByIds?ids="+ids;
		
	}
	
	function sta(value,id) {
		var status=value=="上架"?"正在热映":"已经下架";
		location = "updateStatus?status="+status+"&id="+id;

	}
	
</script>
 	<form action="/selects" method="post">
		<table>
			<tr>
				<td colspan="100">
						影片名<input type="text" name="name" value="${movieVo.name }">
						导演<input type="text" name="actor" value="${movieVo.actor }">
						电影年代<input type="text" name="year" value="${movieVo.year }">
						上映时间<input type="date" name="sTime" value="${movieVo.sTime }">--
						<input type="date" name="eTime" value="${movieVo.eTime }">
						<br>
						价格<input type="text" name="p1" value="${movieVo.p1 }">--
						<input type="text" name="p2" value="${movieVo.p2 }">
						电影时长<input type="text" name="starLongTime" value="${movieVo.starLongTime }">--
						<input type="text" name="endLongTime" value="${movieVo.endLongTime }">
						<input type="submit" value="查询">
					<input type="button" value="删除" onclick="del()"> 
				</td>
			</tr>
			<tr>
				<th>
					<input type="checkbox" onclick="sel(this.checked)">
					<input type="button" value="反选" onclick="fx()">
				</th>
				<th>编号</th>
				<th>影片名</th>
				<th>导演</th>
				<th>票价</th>
				<th><a href="javascript:query('startTime')">上映时间</a></th>
				<th><a href="javascript:query('longTime')">时长</a></th>
				<th>类型</th>
				<th><a href="javascript:query('year')">年代</a></th>
				<th>区域</th>
				<th>状态</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${info.list }" var="m">
				<tr>
					<td>
						<input type="checkbox" value="${m.id }" class="ck">
					</td>
					<td>${m.id }</td>
					<td>${m.name }</td>
					<td>${m.actor }</td>
					<td>${m.price }</td>
					<td>${m.startTime }</td>
					<td>${m.longTime }</td>
					<td>${m.type }</td>
					<td>${m.year }</td>
					<td>${m.area }</td>
					<td>${m.status }</td>
					<td>
						<input type="button" value="${m.status=='已经下架'?'上架':'下架' }" onclick="sta(this.value,'${m.id}')" >
					</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="100">
					${page }
				</td>
			</tr>
		</table>
	</form> 

</body>
</html>