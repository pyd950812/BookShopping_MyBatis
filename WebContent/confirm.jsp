<%@page import="com.briup.Dao.GetCategoryDao"%>
<%@page import="com.briup.Dao.OrderLineDao"%>
<%@page import="com.briup.Bean.Order"%>
<%@page import="com.briup.Dao.ProductDao"%>
<%@page import="com.briup.Bean.Product"%>
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
	<title>结算页面</title>
<link rel="stylesheet" href="css/common.css"/>
<link rel="stylesheet" href="css/icons.css" />
<link rel="stylesheet" href="css/table.css" />
<link rel="stylesheet" href="css/orderSure.css" />
<script type="text/javascript" src="js/confirm.js"></script>
<script type="text/javascript">

window.onload=function(){
	var c=document.getElementsByClassName("oneUL");
	var n=c.length;
	document.getElementById("numb").innerHTML=n;
}	

</script>
</head>
<body >
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
    	<a href="#"><img src="images/logo.png"  class="oneImg"></a>
    	

        <div class="h3_right">
        	<img src="images/play_03.png" alt="">
        </div>
       
    </div>
	<p class="orderButtom">填写并核对订单信息</p>
    <!--中间复杂部分-->
    <div class="content">
    	<div class="contentCenter">
    		<div class="centerTop">
    			<b style="font-size:20px;">收货人信息</b>
    			<p style="font-size:15px;">
    			<%
    				UserBean user=(UserBean) request.getSession().getAttribute("user");
    			%>
					收件人姓名：<input type="text" name="name" value="<%=user.getUsername()%>"><br/><br/>
					收件人地址：<input type="text" name="address" value="<%=user.getAddress()%>"><br/><br/>
					收件人电话：<input type="text" name="tel" value="<%=user.getPhone()%>">
				</p>
    		</div>
    		<p class="singleP"><b>送货清单</b><span><a href="shopCart.jsp">返回修改购物车</a></span></p>
			   	
    		<div class="bigDiv">
    			<div class="twoDiv">
    				<b>商家：briup自营</b>
    				
    				<%
    				    					String[] s=request.getParameterValues("amount");
    				    				    				String aa= request.getParameter("total");
    				    				    				int all=Integer.parseInt(aa);
    				    						//UserBean user=(UserBean)request.getSession().getAttribute("user");
    				    					    int id=user.getId();
    				    					    OrderLineDao dao =new OrderLineDao();
    				    					    List<OrderLine> list=dao.findAllOrderLineByUserId(id);
    				    					    for(int i=0;i<list.size();i++)
    				    					   	{
    				    					    	int n=Integer.parseInt(s[i]);
    				    						   OrderLine order=list.get(i);
    				    						   int order_id=(int)order.getId();
    				    						   int product_id=order.getProduct_id();
    				    						   ProductDao dao1=new ProductDao();
    				    						   Product p=dao1.findProductById(product_id);
    				    						  int id1=dao1.findCategory_detail_IdById(product_id);
    				    						  GetCategoryDao dao2=new GetCategoryDao();
    				    						  String Catname=dao2.findCatNameById(id1);
    				    				%>
    				
					<ul class="oneUL">
    					<li>
    						<img src="<%=p.getFeature_images() %>" class="pic">
    						<p><%=Catname %>&nbsp;&nbsp;&nbsp;&nbsp;<%=p.getName() %>&nbsp;&nbsp;</p>
    						<p><font>¥<%=p.getPrice() %></font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;×<a id="n1"><%=n%></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;有货</p>
    						<p><img src="images/sureLogo_14.png" alt=""><span>七天无理由退换货</span></p>

    					</li>
    					<li><pre>【赠品】  高级定制干花书签  随机  ×1</pre></li>
					</ul>
			   <%}%>
					
    			</div>
    		</div>
	
    		<div class="money">
    			<span><font  style="font-size: 20px;"><a id="numb">2</a></font>&nbsp;&nbsp;&nbsp;件商品，总商品金额：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;¥<%=all %></span>
    			<span><img src="images/sureLogo_18.png" alt="">运费：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;¥0.00</span>
    			
    			<span>应付总额：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;¥<%=all %></span>
    		</div>
    		<div class="submit">
    			<span>应付金额：<font id="font1" style="font-size: 24px;"><%=all %></font><a href="overTheOrderServlet" onclick="return submitOrder()" ><img src="images/21_03.png" ></a></span>
    		</div>
    	</div>

    </div>
	  <!--脚部-->
    <div class="footer3">
    	<div class="f3_top">
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