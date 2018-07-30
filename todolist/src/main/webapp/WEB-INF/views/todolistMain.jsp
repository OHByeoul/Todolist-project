<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<%@include file="import/resources.jsp"%>
	<script src="/scripts/todolistMain.js"></script>
	<link rel = "stylesheet" type="text/css" href="/css/todolistMain.css">
</head>
<body>

    <header>
        <div class="center-block text-center">
            <h3>
                TODOLIST<br>
            </h3>
        </div>
    </header>
    <nav class="navbar navbar-default mega-nav">
        <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#MainMenu" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
        </div>
        <div class="collapse navbar-collapse" id="MainMenu">
            <ul class="nav navbar-nav menu-list">
                <li class="dropdown list-category">
                    <a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                        <i class="fa fa-navicon"></i> Categories <i class="fa fa-angle-down" aria-hidden="true"></i>
                    </a>
                    <ul class="dropdown-menu mega-dropdown-menu">
                        <li><a href="#">Cushion</a></li>
                        <li><a href="#">Bath</a></li>
                        <li><a href="#">Air Conditioner</a></li>
                        <li><a href="#">Radiator</a></li>
                        <li><a href="#">Washing Machine</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#">View all</a></li>
                    </ul>
                </li>
                <li><a href="#">Home</a></li>
                <li><a href="#">Products</a></li>
                <li><a href="#">Latest News</a></li>
                <li><a href="#">Contacts</a></li>
            </ul>
            <form id="mega-search" class="navbar-form navbar-right">
                <div class="input-group">
                    <input type="text" class="form-control" placeholder="Search...">
                    <span class="input-group-btn">
                        <button class="btn btn-default" type="button">
                            <i class="glyphicon glyphicon-search"></i>
                        </button>
                    </span>
                </div>
            </form>
        </div>
        </div>
    </nav>
    <main role="contents">
        <div class="container">  
         <%@include file= "todo/todoAddForm.jsp" %>
            <section class="main-banner">
                <img src="https://shop365.com.sg/media/wysiwyg/home/Home-Page-Banner---Kenwood-_-Delonghi.jpg" alt="" class="img-responsive" />
            </section>
        </div>
        <div class="darkness">
       
        </div>
    </main>
    <footer>
        <div class="darkness"></div>
    </footer>
</body>
 <script src="/scripts/todo/todoAdd.js"></script>
</html>
