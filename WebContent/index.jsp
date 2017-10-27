<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%
    	String path=request.getContextPath();
        String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
    %>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>briup电子商务-首页</title>
<link rel="stylesheet" href="css/common.css"/>
<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet" href="css/icons.css" />
<link rel="stylesheet" href="css/table.css" />
<script type="text/javascript" src="js/checkEdition.js"></script>
<SCRIPT language="JavaScript">
                var NowFrame = 1;
				var MaxFrame = 4;
				function show(d1) {
				if(Number(d1)){
				clearTimeout(theTimer);  //当触动按扭时，清除计时器
				NowFrame=d1;                //设当前显示图片
				}
					for(var i=1;i<(MaxFrame+1);i++){
					if(i==NowFrame)
					document.getElementById('div'+NowFrame).style.display ='';   //当前图片示
					else
					document.getElementById('div'+i).style.display ='none';    //隐藏其他图片层
					}
			       { if(NowFrame == MaxFrame)   //设置下一个显示的图片
					NowFrame = 1;
				   else
					NowFrame++;}
					 theTimer=setTimeout('show()', 3000);   //设置定时器，显示下一张图片
				}
				
</SCRIPT>
</head>
<body onload="show()">
	<!--顶部-->
	<div class="top">
    	<div class="top_center">
    	<%
    		if(session.getAttribute("user")!=null)
    		{%>
    			<span>欢迎</span>
    	        <span style="color: red">${sessionScope.user.username}</span>
    		<% }else{%>
    			您还没有登录，请先-><a href="login.html" style="color:red ">登录</a>
    	<%}%>
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
    	<a href=""><img src="images/logo.png"></a>
    	<div class="h3_center">
        	<div class="search_box">
            	<input type="text"/>
                <span>搜索</span>
            </div>
            <p>
            <c:forEach items="${list1}" var="category"> 
                <a href="#">${category.name}</a>|
            </c:forEach>
            </p>
        </div>
        <div class="h3_right">
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
             
             <%
             if(request.getSession().getAttribute("user")!=null)
 			{
             %>
            <div class="tsc">
            	<a href="shopCart.jsp">去购物车结算</a>
                <span class="sj_right"></span>
            </div>
           <% }else {%>
            <div class="tsc">
            	<a onclick="userinfo()">去购物车结算</a>
                <span class="sj_right"></span>
            </div>
           <% }%>
           
        </div>
    </div>
    <!--头部导航-->
    <div class="nav_top">
    	<div class="nav_top_center">
            <div>
                全部图书分类
            </div>
            <ul>
                <li>
                <c:forEach items="${list1}" var="category">
                	<a href="" style="margin-left: 30px;font-size: 16px;">${category.name }</a>
                </c:forEach>
                </li>
            </ul>
        </div>
    </div>
    
	<div class="container3">
    	<div class="c3_b1">
        	<div class="c3_b1_left">
            	<dl>
            	<c:forEach items="${list1}" var="category">
               		<dd>
                    	<h1>${category.name}</h1>
                    	<p>
                    	<c:forEach items="${category.cate_detail}" var="cate_detail">
                        	<a href="list.jsp?CateName=${category.name}&CateDetail=${cate_detail.name}">${cate_detail.name }</a>
                        </c:forEach>
                      	</p>
                    </dd>
                </c:forEach>
                </dl>
            </div>
            <div class="c3_b1_center">
            	<div class="c3_b1_center" style="margin-top: -10px">
					<div class="c3_b1_center" style="width: 680px; height: 280px;">
						<img id="div1" src="images/4.jpg" border="0"
							style="width: 680px; height: 280px; display: none;"> <img
							id="div2" src="images/1.jpg" border="0"
							style="width: 680px; height: 280px; display: none"> <img
							id="div3" src="images/2.jpg" border="0"
							style="width: 680px; height: 280px; display: none"> <img
							id="div4" src="images/3.jpg" border="0"
							style="width: 680px; height: 280px; display: none">
					</div>
					<div  style="position:absolute;top:460px;left: 850px"  align="center">
				    <A href="javascript:show(1)" style="cursor:pointer;color: red;font-size: 20px">1</A>&nbsp;&nbsp;&nbsp;
				    <A href="javascript:show(2)" style="cursor:pointer;color: red;font-size: 20px">2</A>&nbsp;&nbsp;&nbsp;
				    <A href="javascript:show(3)" style="cursor:pointer;color: red;font-size: 20px">3</A>&nbsp;&nbsp;&nbsp;
				    <A href="javascript:show(4)" style="cursor:pointer;color: red;font-size: 20px">4</A>
   				 </div>
                </div>
                <div class="c3_b1_c_bottom">
                    <ul>
                    	<c:forEach items="${list }" var="product" begin="1" step="1" end="3">
                        <li>
                           <a href="viewBook.jsp?Product_id=${product.id }"><img style="width: 120px;height: 150px;margin-top: 20px;margin-left: 20px" src="${product.feature_images }"/></a>
                           <a href="">${product.name }</a>  
                        </li>
                        </c:forEach>
                    </ul>
            	</div>
            </div>
            <div class="c3_b1_right">
            	<h1>杰普快报<a href="#">更多</a></h1>
            	<ul>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">没有什么能够阻挡  </a></li>
                	<li><a href="#">华东交大学子 </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                </ul>
            </div>
            <div style="clear:both"></div>
        </div>
        <div class="c3_b2">
        	<ul>
        		<c:forEach items="${list}" var="product" begin="1" step="1" end="8">
            	<li>
                	<div class="c3_b2_txt">
                    	<h1><a href="viewBook.jsp?Product_id=${product.id }" style="font-size: 20px;font-family: cursive;color: black" href="">${product.name }</a></h1>
                        <p>Java经典</p>
                        <h2>畅销书籍</h2>
                        <h2>覆盖java基础及全新内容</h2>
                        <p><a href="#">更多精彩，点击进入</a></p>
                    </div>
                </li>
                </c:forEach> 
            </ul>
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
            <p>沪ICP备14033591号-8 杰普briup.com版权所有 杰普软件科技有限公司 </p>
          	<img src="images/police.png">
        </div>
    </div>

</body>
</html>
