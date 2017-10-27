<%@page import="java.util.List"%>
<%@page import="com.briup.Bean.Product"%>
<%@page import="com.briup.Dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%
    	String path=request.getContextPath();
        String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
    %>
    <script type="text/javascript" src="js/viewBook.js"></script>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>briup电子商务-首页</title>
<link rel="stylesheet" href="css/common.css"/>
<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet" href="css/icons.css" />
<link rel="stylesheet" href="css/table.css" />
<script type="text/javascript" src="js/viewBook.js"></script>
<script type="text/javascript" src="js/checkEdition.js"></script>
</head>
<body>
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
    	<a href="#"><img src="images/logo.png"></a>
    	<div class="h3_center">
        	<div class="search_box">
            	<input type="text"/>
                <span>搜索</span>
            </div>
            <p>
            	<a href="#">文学类</a>|
            	<a href="#">教育类</a>|
                <a href="#">计算机</a>|
                <a href="#">儿童类</a>|
                <a href="#">漫画类</a>|
            </p>
        </div>
        <div class="h3_right">
        <div class="myyy">
        <a href="index.jsp">返回主界面</a>
        </div>
     	<div class="myyy">
            	<%
        			if(request.getSession().getAttribute("user")!=null)
        			{%>
        				<a href="userinfo.jsp">个人信息</a>
        		<% 	}else {%>
        			    <a onclick="userinfo()">个人信息</a>
        		<% }%>
                <span class="sj_down"></span>
             </div> 
            <div class="tsc">
            	 <% 
            if(session.getAttribute("user")!=null)
        			{%>
        				<a href="shopCart.jsp">去购物车结算</a>
        			<%}else{%>
        			<a onclick="userinfo()">去购物车结算</a>
        		<%}%>
                <span class="sj_right"></span>
            </div>
        </div>
    </div>
    <!--头部导航-->
    <div class="nav_top">
    	<div class="nav_top_center">
            <div>
                全部图书分类
            </div>
            <ul>
                <li><a href="#">文学类</a></li>
                <li><a href="#">教育类</a></li>
                <li><a href="#">计算机</a></li>
                <li><a href="#">儿童类</a></li>
                <li><a href="#">漫画类</a></li>
            </ul>
        </div>
    </div>
    
	<div class="container5">
    	<div class="cn5_top">
            <div class="cn5_top_x center01">
            	<a class="font20" >书籍</a> >
            	<%
            			String product_id=request.getParameter("Product_id");
            			int id=Integer.parseInt(product_id);
            			ProductDao dao=new ProductDao();
            			Product product=dao.findProductById(id);
            			int id2=dao.findCatIdByPId(id);
            			String name=dao.findCatDeNameById(id2);
            	%>
                <a href=""><%=name %> </a>
            </div>
            <div class="cn5_top_y center01">
            	<div class="cn5topy_1">
                	<div class="cn5topy_imgview">
                    	<img src="<%=product.getFeature_images()%>"/>
                        <ul class="cn5topy_imglist">
                        <%
                        	for(int i=0;i<5;i++)
                        	{%>
                        		<li><a ><img src="<%=product.getFeature_images()%>"></a></li>
                       <% 	}
                        %>
                        </ul>
                    </div>
                </div>
                <div class="cn5topy_2">
                	<h1 class="pro_title font15"><%=product.getName()%></h1>
                    <div class="pro_price">
                            <div class="pro_price_x">
                                <p> briup价：<b><%=product.getPrice() %></b> <a href="#">(降价通知)</a></p>
                            </div>
                    </div>
                    <div class="pro_ship">
                        <div>
                        	<div class="pro_key fl">服&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;务：</div>
                            <ul class="pro_service f1">
                                <li class="service_fq">分期付款</li>
                                <li class="service_myf">免运费</li>
                                <li class="service_zt">自提</li>
                                <li class="service_th">7天无理由退换货</li>
                            </ul>
                        </div>
                    </div>
                    <div class="pro_selects">
                    	<div class="pro_select">
                        	<div class="pro_key pro_key_vertical fl">选择版本：</div>
                            <ul class="pro_select_vals">
                                <li id="edition1" onclick="check1(1)">精装版</li>
                                <li id="edition2" onclick="check1(2)">简装版</li>
                                <li id="edition3" onclick="check1(3)">收藏版</li>
                            </ul>
                        </div>
                    </div>
                    
                    <div class="pro_buy">
                    	<div class="pro_buy_nums">
                        	<input id="id1" type="text" value="1"/>
                            <dl>
                            	<dd onclick="add()">+</dd>
                                <dd onclick="subtract()">-</dd>
                            </dl>
                        </div>
                        <div class="pro_addshop">
                        			<%
                        		if((session.getAttribute("user"))!=null)
                        		{%>
               <a id="addCar" onclick="addToCar()" href="AddToCarServlet?product_id=<%=id %>" style="color: #000;font-size: 15px">加入购物车</a>
                        	  <%} else{ %>
               <a onclick="toLogin()"  style="color:#000;font-size:15px" >加入购物车</a>
                        		<% }%>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    	<div class="c5_b2">
    	 <%	
                	List<Product> list1=(List<Product>)application.getAttribute("list");
                	for(Product p:list1){
                		if((int)p.getId()==id)
                		{%>
        	
            <div class="c5_b2_right">
            	<!--选项卡-->
            	<ul class="c5_b2_tabs">
                	<li id="check1" onclick="check(1)" style="position:relative;top:-1px;border-top:2px solid #e4393c;">商品简介</li>
                    <li id="check2" onclick="check(2)" style="position:relative;top:-1px;border-top:0px solid #e4393c;">商品主要内容</li>
                </ul>
                <!--内容-->
              	 <div id="text1" style="height:750px">
                    <div class="c5_b2_right_1 box">
                            <div class="introduce_item">
                              <ul>
                              	<li>作者：<%=p.getWriter() %></li>
                                <li>商品名称：<%=p.getName() %></li>
                                <li>商品编号：<%=p.getISBN() %></li>
                              </ul>
                            </div>
                    </div>
                   <div class="intro_pics">
                            <img class="intro_pic" src="<%=p.getFeature_images() %>" style="width: 451px;height: 600px">
                   </div>     
                </div>
                
                <div id="text2" style="display:none;height: 700px;float: left">
                	<ul >
                		<div style="width: 300px;float: left;margin-left: 20px">
                			<li style="font-size:16px;font-family: cursive;color: red;">商品简介：</li>
                			<li><%=p.getDescription() %></li>
                		</div >
                		<div style="width: 300px;float: left;margin-left: 100px">
                       	    <li style="font-size:16px;font-family: cursive;color: red;">商品目录：</li>
                       	    <li><%=p.getBill() %></li>
                        </div>
                        <div style="width: 100px;float: left">
                       	    <li style="font-size:16px;font-family: cursive;color: red;">商品评价：</li>
                       	    <li><%=p.getExplain() %></li>
                        </div>
                    </ul>
                </div>
           </div>
                	<%}}%>
                
                
            <div class="c5_b2_right">
              	<div class="c5_b2_right_2">
                    	<h1>正品行货</h1>
                        <p>briup网上商城向您保证所售商品均为正品，briup自营商品开具机打发票或电子发票。</p>
                        
                        <h1>全国联保</h1>
                        <p>凭质保证书及briup网上商城发票，可享受全国联保服务，与您亲临商场选购的商品享受相同的质量保证。briup网上商城还为您提供具有竞争力的商品价格和运费政策，请您放心购买！</p>
                        
                        <h1>正品行货</h1>
                        <p>briup网上商城向您保证所售商品均为正品，briup自营商品开具机打发票或电子发票。</p>
                        
                        <h1>全国联保</h1>
                        <p>凭质保证书及briup网上商城发票，可享受全国联保服务，与您亲临商场选购的商品享受相同的质量保证。briup网上商城还为您提供具有竞争力的商品价格和运费政策，请您放心购买！</p>
                        
            		</div> 
            </div>
            
            <!--左侧栏-->
            <div class="c5_b2_left_container">
                <div class="c5_b2_left box">
                    <h1>服务时间 早9：00~凌晨1：00</h1>
                    <p>
                    <a href="#">
                        <img class="callmebyqq" src="images/icon_qq_03.png"/>
                    </a>
                    </p>
                </div>
                
                <div class="c5_b2_left box">
                    <h1>其他种类</h1>
                    <dl>
                        <dd>文学类</dd>
                        <dd>漫画类</dd>
                        <dd>通书类</dd>
                    </dl>
                    <dl>
                        <dd>文学类</dd>
                        <dd>漫画类</dd>
                        <dd>通书类</dd>
                    </dl>
                </div>
            </div> 
        </div>
    </div>
    	
    <div class="c20"></div>
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
            <p>沪ICP备14033591号-8 杰普briup.com版权所有 杰普软件科技有限公司 </p>
          	<img src="images/police.png">
        </div>
    </div>

</body>
</html>
