<!DOCTYPE html>
<html ng-app="myApp">
<head>
	<meta http-equiv="content-type" content="text/html;  charset="UTF-8">
	<meta charset="utf-8">
	<title>COLLABORATION</title>
	<meta name="generator" content="Bootply" />
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
		<link rel="stylesheet" href="resources/css/style.css">
	
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.js"></script>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.js"></script>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular-route.js"></script>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular-resource.js"></script>
		
		<script  src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
		<script  src="https://use.fontawesome.com/20c7f48529.js"></script>
		
</head>
<body>
<h1 align='center'>
		<font color='skyblue'><b><i>COLLABORATION</b></i></font>
	</h1>
	
	<div class="wrapper">
		<div class="box">
			<div class="row row-offcanvas row-offcanvas-left">
				<!-- sidebar -->
				<div class="column col-sm-2 col-xs-1 sidebar-offcanvas" id="sidebar">
					<ul class="nav">
						<li><a href="#" data-toggle="offcanvas"
							class="visible-xs text-center"><i
								class="glyphicon glyphicon-chevron-right"></i></a></li>
					</ul>
					<ul class="nav hidden-xs" id="lg-menu">
						<li class="active"><a href="#featured"><i
								class="glyphicon glyphicon-list-alt"></i>About</a></li>
								
						<div class="btn-group">
							<button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Blog <span class="caret"></span>
							</button>
							<ul class="dropdown-menu">
								<li><a href="#/blog_create">Create Blog</a></li>
								<li><a href="#/list_blog">Listout Blogs</a></li>
								<li><a href="#/view_blog">View Blog</a></li>
							</ul>
						</div>
						
						<li><a href="#/event"><i class="glyphicon glyphicon-paperclip"></i>Events</a></li>
								
						<div class="btn-group">
							<button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown"> Forum <span class="caret"></span>
							</button>
							<ul class="dropdown-menu">
								<li><a href="#/list_chat_forum">List forums</a></li>
								<li><a href="#/view_chat_forum">View forums</a></li>
							</ul>
						</div>
						
						<li><a href="#/job_opportunities"><i class="glyphicon glyphicon-paperclip"></i>Job Opportunities</a></li>
												
						<div class="btn-group">
							<button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown"> Friend <span class="caret"></span>
							</button>
							<ul class="dropdown-menu">
								<li><a href="#/search_friend">search friends</a></li>
								<li><a href="#/view_friend">View friends</a></li>
							</ul>
						</div>
					</ul>
					<ul class="list-unstyled hidden-xs" id="sidebar-footer">
						<li><a href="http://www.bootply.com"><h3>Collaboration</h3>
								<i class="glyphicon glyphicon-heart-empty"></i> Connect</a></li>
					</ul>
					<!-- tiny only nav-->
					<ul class="nav visible-xs" id="xs-menu">
						<li><a href="#featured" class="text-center"><i
								class="glyphicon glyphicon-list-alt"></i></a></li>
						<li><a href="#stories" class="text-center"><i
								class="glyphicon glyphicon-list"></i></a></li>
						<li><a href="#" class="text-center"><i
								class="glyphicon glyphicon-paperclip"></i></a></li>
						<li><a href="#" class="text-center"><i
								class="glyphicon glyphicon-refresh"></i></a></li>
					</ul>
				</div>
				<!-- /sidebar -->
				<!-- main right col -->
				<div class="column col-sm-10 col-xs-11" id="main">
					<!-- top nav -->
					<div class="navbar navbar-blue navbar-static-top">
						<div class="navbar-header">
							<button class="navbar-toggle" type="button"
								data-toggle="collapse" data-target=".navbar-collapse">
								<span class="sr-only">Toggle</span> <span class="icon-bar"></span>
								<span class="icon-bar"></span> <span class="icon-bar"></span>
							</button>
				<a href="/" class="navbar-brand logo">C</a>
						
		</div>
	
													<nav class="collapse navbar-collapse" role="navigation">
							<form class="navbar-form navbar-left">
								<div class="input-group input-group-sm"
									style="max-width: 360px;">
									<input type="text" class="form-control" placeholder="Search"
										name="srch-term" id="srch-term">
									<div class="input-group-btn">
										<button class="btn btn-default" type="submit">
											<i class="glyphicon glyphicon-search"></i>
										</button>
									</div>
								</div>
							</form>
							<ul class="nav navbar-nav">
								<li><a href="#/"><i class="glyphicon glyphicon-home"></i>
										Home </a></li>
								<li><a href="#/login1" role="button" data-toggle="modal"><i
										class="glyphicon glyphicon-log-in"></i> Login </a></li>
								<li><a href="#/register1" role="button" data-toggle="modal"><i
										class="glyphicon glyphicon-user"></i> Register </a></li>
								<!-- <li><a href="#">Inbox <span class="badge">4</span></a>	</li>	 -->
							</ul>
							<ul class="nav navbar-nav navbar-right">
								<li class="dropdown"><a href="#" class="dropdown-toggle"
									data-toggle="dropdown"><i class="glyphicon glyphicon-user"></i></a>
									<ul class="dropdown-menu">
										<li><a href="">More</a></li>
										<li><a href="">More</a></li>
										<li><a href="">More</a></li>
										<li><a href="">More</a></li>
										<li><a href="">More</a></li>
									</ul></li>
							</ul>
						</nav>
					</div>
					<!-- /top nav -->
					<div class="padding">
						<div class="full col-sm-9">
							<!-- content -->
							<div class="row">
								<!-- main col left -->
								<div class="col-sm-5">
									<div class="panel panel-default">
										<!--  <div class="panel-thumbnail">
											<img src="resources/image/home/blog/blogbg.jpg" class="img-responsive">
										</div>-->
										<!--  <div class="panel-body">
											<p class="lead">Blog Post</p>
											<p>45 Followers, 13 Posts</p>
											<p>
												<img
													src="https://lh3.googleusercontent.com/uFp_tsTJboUY7kue5XAsGA=s28"
													width="28px" height="28px">
											</p>
										</div>-->
									</div>
									<div class="panel panel-default">
										<div class="panel-heading">
											<a href="#" class="pull-right">View all</a>
											<h4>Event List</h4>
										</div>
										<div class="panel-body">
											<div class="list-group">
												<a href="http://bootply.com/tagged/modal"
													class="list-group-item">Event Photos</a> <a
													href="http://bootply.com/tagged/datetime"
													class="list-group-item">Task Grids</a> <a
													href="http://bootply.com/tagged/datatable"
													class="list-group-item">Dashboard</a>
											</div>
										</div>
									</div>
									<div class="well">
										<form class="form-horizontal" role="form">
											<h4>What's New</h4>
											<div class="form-group" style="padding: 14px;">
												<textarea class="form-control"
													placeholder="Update your status"></textarea>
											</div>
											<button class="btn btn-primary pull-right" type="button">Post</button>
											<ul class="list-inline">
												<li><a href=""><i
														class="glyphicon glyphicon-upload"></i></a></li>
												<li><a href=""><i
														class="glyphicon glyphicon-camera"></i></a></li>
												<li><a href=""><i
														class="glyphicon glyphicon-map-marker"></i></a></li>
											</ul>
										</form>
									</div>
									<div class="panel panel-default">
										<div class="panel-heading">
											<h4>Be collaborative</h4>
										</div>
										<div class="panel-body">You have more friends than you
											think..... To be connected you can just follow them on</div>
									</div>
								</div>
								<!-- main col right -->
								<div class="col-sm-7">
									<div class="well">
										<form class="form">
											<h4>Sign-up</h4>
											<div class="input-group text-center">
												<input type="text" class="form-control input-lg"
													placeholder="Enter your email address"> <span
													class="input-group-btn"><button
														class="btn btn-lg btn-primary" type="button">OK</button></span>
											</div>
										</form>
									</div>
									<div class="panel panel-default">
										<div class="panel-heading">
											<a href="#" class="pull-right">View all</a>
											<h4>Share with us..</h4>
										</div>
										<div class="panel-body">
											<div class="clearfix"></div>
											<hr>
											Is there is something new to Share with us??? Come lets join
											be collaborative, explore your ideas...
										</div>
									</div>
									<div class="panel panel-default">
										<div class="panel-heading">
											<a href="#" class="pull-right">View all</a>
											<h4>Bulletein</h4>
										</div>
										<div class="panel-body">
											<!--  <img src="//placehold.it/150x150"
												class="img-circle pull-right">--> <a href="#">Keyword:
												Job</a>
											<div class="clearfix"></div>
											<hr>
											<p>
												If you're looking for help with your carrier,
												<code>job opportunties </code>
												are provided to build a strong gateway for your life..
											</p>
											<hr>
											<form>
												<div class="input-group">
													<div class="input-group-btn">
														<button class="btn btn-default">+1</button>
														<button class="btn btn-default">
															<i class="glyphicon glyphicon-share"></i>
														</button>
													</div>
													<input type="text" class="form-control"
														placeholder="Add a comment..">
												</div>
											</form>
										</div>
									</div>
									<div class="panel panel-default">
										<!--  <div class="panel-thumbnail">
											<img src="resources/image/home/social/socialfollowers.png" class="img-responsive">
										</div>-->
										<!--<div class="panel-body">
											<p class="lead">Social Good</p>
											<p>1,200 Followers, 83 Posts</p>
											  <p>
												<img
													src="resources/image/home/social/photo1.jpg"
													width="28px" height="28px"> <img
													src="resources/image/home/social/photo2.jpg"
													width="28px" height="28px"> <img
													src="resources/image/home/social/photo3.jpg"
													width="28px" height="28px">
											</p>
										</div>-->
									</div>
								</div>
							</div>
							<!--/row-->
							<div class="row">
								<div class="col-sm-6">
									<a href="#">Twitter</a> <small class="text-muted">|</small> <a
										href="#">Facebook</a> <small class="text-muted">|</small> <a
										href="#">Google+</a>
								</div>
							</div>
							<div class="row" id="footer">
								<div class="col-sm-6"></div>
								<div class="col-sm-6">
									<p>
										<a href="#" class="pull-right">©Copyright 2016</a>
									</p>
								</div>
							</div>
						</div>
						<!-- /col-9 -->
					</div>
					<!-- /padding -->
				</div>
				<!-- /main -->
			</div>
		</div>
	</div>
	<!--post modal-->
	<div id="postModal" class="modal fade" tabindex="-1" role="dialog"
		aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					Update Status
				</div>
				<div class="modal-body">
					<form class="form center-block">
						<div class="form-group">
							<textarea class="form-control input-lg" autofocus=""
								placeholder="What do you want to share?"></textarea>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<div>
						<button class="btn btn-primary btn-sm" data-dismiss="modal"
							aria-hidden="true">Post</button>
						<ul class="pull-left list-inline">
							<li><a href=""><i class="glyphicon glyphicon-upload"></i></a></li>
							<li><a href=""><i class="glyphicon glyphicon-camera"></i></a></li>
							<li><a href=""><i class="glyphicon glyphicon-map-marker"></i></a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="jumbotron">
		<div class="container">
			<div class="col-sm-8 col-sm-offset-2">
				<div ng-view></div>
				<!--  SPA -->
			</div>
		</div>
	</div>
	<script src="app.js"></script>
	<!-- <script src="c_home/HomeController.js"></script>
	 -->
	<script src="c_login/LoginController.js"></script>
	<script src="c_login/LoginService.js"></script>
	<!-- <script src="c_blog/BlogController.js"></script>
	<script src="c_blog/BlogService.js"></script>
	<script src="c_forum/ChatForumController.js"></script>
	<script src="c_forum/ChatForumService.js"></script>
	<script src="c_friend/FriendController.js"></script>
	<script src="c_friend/FriendService.js"></script>
 -->
	
	</body>
</html>

