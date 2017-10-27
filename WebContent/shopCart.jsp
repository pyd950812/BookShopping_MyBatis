<%@page import="com.briup.Dao.OrderLineDao"%>
<%@page import="com.briup.Bean.Product"%>
<%@page import="com.briup.Dao.ProductDao"%>
<%@page import="com.briup.Bean.OrderLine"%>
<%@page import="java.util.List"%>

<%@page import="com.briup.Bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%
    	String path=request.getContextPath();
            String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
    %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
	<title>购物车页面</title>
<link rel="stylesheet" href="css/fullCar.css" />
<link rel="stylesheet" href="css/common.css"/>
<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet" href="css/icons.css" />
<link rel="stylesheet" href="css/table.css" />
<script type="text/javascript" src="js/shopCart.js"></script>
</head>
<body onload="addNumber()">
	<!--顶部-->
	<div class="top">
    	<div class="top_center">
            <ul class="top_bars">
            	<li><a href="RemoveSessionServlet">退出</a>|</li>
                <li><a href="#">我的订单<span class="jt_down"></span></a>|</li>
                <li><a href="#">关注杰普<span class="jt_down"></span></a>|</li>
                <li><a href="#">网站导航<span class="jt_down"></span></a></li>
            </ul>
        </div>
    </div>
    <!--头部-->
    <div class="header3">
    	<a href="index.jsp"><img src="images/logo.png"  class="oneImg"></a>
        <div class="h3_right">
        	<img src="images/play_03.png" alt="">
        </div>
    </div>
<!--中间部分div-->
<div class="empty">
	<div class="peisong"><pre>全部商品 <a id="titleNumber" style="margin-left: 10px;font-size: 14px" >2</a></pre></div>
	<div class="mainCenter">
		<div class="allCheck">
			<input id="allCheckBox" type="checkbox" onclick="selectAll()"><p>全选</p>
			<p style="margin-left: 20px;">订单号</p>
			<p class="leftM">商品</p>
			<p class="rightM" style="margin-left: 200px">单价(元)</p>
			<p class="leftM">数量</p>
			<p class="leftM" style="margin-left: 80px">小计(元)</p>
			<p class="leftM" style="margin-left: 100px">操作</p>
		</div>
		<div class="mainPro" style="height: auto">
			<div class="aa">
				<input type="checkbox"><span id="but">自营</span>
			</div>
			<%
				UserBean user=(UserBean)request.getSession().getAttribute("user");
				    int id=user.getId();
				    OrderLineDao dao=new OrderLineDao();
				    List<OrderLine> list=dao.findAllOrderLineByUserId(id);
				    for(int i=0;i<list.size();i++)
				   	{
					   OrderLine order=list.get(i);
					   int order_id=(int)order.getId();
					   int product_id=order.getProduct_id();
					   ProductDao dao1=new ProductDao();
					   Product p=dao1.findProductById(product_id);
			%>
			<div id="orderline<%=i %>" class="bb" >
				<input name="cartCheckBox" type="checkbox" >
				<span  id="sp<%=i %>" style="margin-left: 70px;margin-top: 50px"><%=order.getId() %></span>
				<img src="<%=p.getFeature_images() %>" style="width: 100px;height: 100px;margin-left: 100px" >
				 <span style="margin-left: 30px;margin-top: 60px">
                   	<%=p.getName() %>
                    <br>
                </span>
                <div >
                	<span  style="margin-top: 50px;margin-left: 100px">¥<a id="price<%=i%>"><%=p.getPrice() %></a></span>
                </div>
                <div style="float: left;margin-left: 70px">
                	<span id="add<%=i %>" onclick="add(<%=i %>)" style="border:1px solid #747474;margin-top: 54px;height: 20px;width: 20px;text-align: center;">+</span>
                	<input id="text<%=i %>"  type="text" value="1" style="margin-top: 54px;width: 40px;height: 20px;text-align: center;">
                	<span  id="del<%=i %>" onclick="del(<%=i %>)" style="border:1px solid #747474;margin-top: 54px;height: 20px;width: 20px;text-align: center;">-</span>
                </div>
                <div  class="ri" style="margin-top: 60px">¥<a id="total<%=i %>"><%=p.getPrice() %></a></div>
               	<div class="righ">
               		 <div class="rig">
               				<span>
               				<a  id="delet<%=i %>" onclick="delet(<%=i%>)"  style="margin-left: -80px;cursor: pointer;">删除 </a>
               				</span>
               		 </div>
               	</div>
			</div>
			<% }%>
		</div>
		<div class="allButtom">
		  <%
						  
		  
		  %>
			<p class="caozuo"><a id="lin" href="confirm.jsp?" onclick="account()" style="color: #000;font-size: 16px;font-family: cursive;">去结算</a></p>
			<span>已选择<a id="allNum" style="font-size: 16px;color: red"></a>件商品&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;总价(不含运费)：<font>¥<a id="alltotal" style="color: red;font-size: 26px">222</a></font></span>
		</div>
	</div>
</div>
     <!--脚部-->
    <div class="footer3" >
    	<div class="f3_top" style="width:100%">
        	<div class="f3_center">
                <div class="ts1">品目繁多 愉悦购物</div>
                <div class="ts2">正品保障 天天低价</div>
                <div class="ts3">极速物流 特色定制</div>
                <div class="ts4">优质服务 以客为尊</div>
            </div>
        </div>
        <div class="f3_middle">
        	<ul class="f3_center">
            	<li class="f3_mi_li01">
                	<h1>购物指南</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li01">
                	<h1>配送方式</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li01">
                	<h1>支付方式</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li01">
                	<h1>售后服务</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li01">
                	<h1>服务保障</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li06">
                	<h1>客服中心</h1>
                    <img src="images/qrcode_jprj.jpg" width="80px" height="80px">
                    <p>抢红包、疑问咨询、优惠活动</p>
                </li>
            </ul>
        </div>
         <div class="f3_bottom">
        	<p class="f3_links">
                <a href="#">关于我们</a>|
                <a href="#">联系我们</a>|
                <a href="#">友情链接</a>|
                <a href="#">供货商入驻</a> 
           	</p>
            <p>沪ICP备14033591号-8 杰普软件briup.com版权所有 杰普软件科技有限公司 </p>
          	<img src="images/police.png">
        </div>
    </div>
</body>
</html>