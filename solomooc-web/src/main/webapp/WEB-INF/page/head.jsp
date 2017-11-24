<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@include file="base.jsp"%>
<c:set var="slm" value="<%=request.getContextPath()%>"/>

	<!-- LOADER -->
    <div id="loader-wrapper">
        <div id="loader-container">
            <p id="loadingText">Loading</p>
        </div>
    </div>

    <!-- HEADER -->
    <header class="tt-header">
        <div class="container">
            <div class="top-inner">

                <a class="logo" href="index.html"><img src="${slm}/staticfile/img/header/logo.png" height="60" width="258" alt=""></a>

            </div>
            <button class="cmn-toggle-switch"><span></span></button>
            <div class="toggle-block">
                <nav class="main-nav clearfix">
                    <ul>
                        <li class="active"><a href="index.html">首页</a></li>
                        <li><a href="courses.html">课程</a></li>
                        <li><a href="about.html">关于我们</a></li>
                        <li class="parent">
                            <a href="#">页面<i class="menu-toggle fa fa-angle-down"></i></a>
                            <ul>
                                <li class="parent">
                                    <a href="index.html">主页s<i class="menu-toggle fa fa-angle-down"></i></a>
                                    <ul>
                                        <li><a href="index.html">主页1</a></li>
                                        <li><a href="index_2.html">主页2</a></li>
                                        <li><a href="index_3.html">主页3</a></li>
                                    </ul>
                                </li>
                                <li class="parent">
                                    <a href="blog_left_sidebar.html">博客<i class="menu-toggle fa fa-angle-down"></i></a>
                                    <ul>
                                        <li><a href="blog_left_sidebar.html">左侧边栏</a></li>
                                        <li><a href="blog_right_sidebar.html">右侧边栏</a></li>
                                        <li><a href="blog_detail.html">侧边栏细节</a></li>
                                    </ul>
                                </li>
                                <li class="parent">
                                    <a href="shop.html">课程<i class="menu-toggle fa fa-angle-down"></i></a>
                                    <ul>
                                        <li><a href="shop.html">课程页面</a></li>
                                        <li><a href="shop_detail.html">课程细节</a></li>
                                        <li><a href="cart.html">购物车</a></li>
                                        <li><a href="checkout.html">支付页面</a></li>
                                    </ul>
                                </li>
                                <li class="parent">
                                    <a href="courses.html">课程<i class="menu-toggle fa fa-angle-down"></i></a>
                                    <ul>
                                        <li><a href="courses.html">课程</a></li>
                                    </ul>
                                </li>
                            </ul>                             
                        </li>
                        <li><a href="blog_left_sidebar.html">博客</a></li>
                    </ul>
                </nav>
                <div class="nav-more">
                    <a class="tt-top-search" href="#">
                        <i class="stroke-icon icon-Search"></i>
                    </a>                    
                </div>
                <div class="top-line">
                    <div class="container">
                        <div class="top-info">
                            <i class="stroke-icon icon-Timer"></i>
                            <span>周一--周五 : 上午9.00 - 下午06.00</span>                  
                        </div>                    
                        <div class="top-info">
                            <i class="fa fa-phone"></i>
                            <a href="tel:18004567890">+ (123) 456 7890</a> 
                        </div>                        

                        <div class="top-info">
                            <i class="fa fa-unlock-alt" aria-hidden="true"></i>
                            <a href="#">注册</a>
                            <a href="#">登录</a>
                        </div>                    
                    </div>
                </div>
            </div>
        </div>       
    </header>
    <div class="tt-search-popup">
        <div class="tt-search-popup-vertical">
          <div class="container">
             <div class="row">
                <div class="col-md-10 col-md-offset-1 col-sm-12 col-sm-offset-0 col-xs-12 col-xs-offset-0">
                   <form>
                        <h3 class="tt-search-popup-title">根据关键字查找</h3>
                        <div class="tt-search-popup-field">
                            <input type="text" placeholder="请输入关键字" class="input" required>
                            <div class="tt-search-popup-devider"></div>
                            <div class="tt-search-popup-submit">
                                <i class="fa fa-search"></i>
                                <input type="submit" value="">
                            </div>    
                        </div>
                        <a href="#" class="close"><span>+</span></a>
                   </form> 
                </div> 
             </div>
          </div>
        </div>
    </div>    
    <div class="tt-header-margin"></div>
