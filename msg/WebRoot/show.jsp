<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'show.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		#app {
		height: 100%;
		width: 100%;
		display: grid;
		grid-template-rows: 66px 1fr;
		grid-template-areas: "navigation" "showbox";
	}
	#navigation {
		grid-area: navigation;
		border-bottom: 1px solid black;
	}
	#showbox{
		grid-area: showbox;
		height: 100%;
		width: 100%;
		display: grid;
		grid-template-columns: 20% 1fr;
		grid-template-areas:"checkbox infobox";
	}
	#checkbox{
		grid-area: checkbox;
		border-right: 1px dotted black;
	}
	
	#infobox{
		grid-area: infobox;
	}
	
	li{
		margin:30px 20%;
		font-size: 20px;
		list-style-type: none;
	}
	a{
		text-decoration: none;
	}
	</style>
  </head>
  
  <body>
    <div id="app">
    	<div id="navigation">
    		<div style="width: 70%;height: 100%;float: left;text-align: left;font-size: 40px">
    			<p style="margin: 0px;margin-left:10px;margin-top:4px;">短信息管理平台</p>
    		</div>
    		<div style="width: 20%;height: 100%;float: right;">
    		</div>
    	</div>
    	<div id="showbox">
    		<div id="checkbox">
    			<ul style="margin: auto;">
    				<li><a href="write.jsp" target="view">写信</a></li>
    				<li><a href="#" target="view">收信箱</a></li>
    				<li><a href="#" target="view">发信箱</a></li>
    			</ul>
    		
    		</div>
    		<div id="infobox">
    			<iframe scrolling="no" frameborder="0" name="view"></iframe>
    		</div>
    	</div>
    </div>
  </body>
</html>
