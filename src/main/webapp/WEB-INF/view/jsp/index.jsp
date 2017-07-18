  <%--
  Created by IntelliJ IDEA.
  User: hackerfreak
  Date: 18/7/17
  Time: 10:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
  <html>
  <head>
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <style>
          .border-black-2{
              border:2px solid black;
          }
          .round-10{
              border-radius:10px;
          }
          .padding-10{
              padding:10px;
          }
          #user-img{
              border: 2px solid #7D7D7D;
          }
          .font-md{
              font-size:18px;
          }
          .font-lg{
              font-size:28px;
          }
          .fa{
              margin:2px 4px 2px;
          }
          #main-body{
              margin-top:30px;
          }
          .share{
              margin:10px 2px 10px;
          }
          .panel-default{
              border:3px solid black;
          }
          .panel-heading{font-weight:bold;}
          .panel-body{
              border-top:3px solid black;
          }
          .time{color: #7F8C8D;}
          #search{
              border:3px solid #7D7D7D;
              border-radius:21px;
              vertical-align: middle;
          }
          .btn-default{
              border-radius:10px;
              background:#eee;
              border:2px solid black;
              padding-left:25px;
              padding-right:25px;
              font-size:18px;
              font-weight:bold;
          }
          label.col-sm-3{
              padding-left:0px;
              text-align:left;
          }
          .form-control {
              border:2px solid black;
              border-radius:0px;
          }
          .dropdown-menu{
              text-align:center;
          }
          button.dropdown-toggle{
              background:#fff;
          }
      </style>
  </head>
  <body>

  <div class="container-fluid" id="main-wrapper">
      <div class="container-fluid border-black-2 round-10 padding-10" id="navbar">
          <div class="row font-lg">
              <div class="col-xs-8 pull-left" id="brand">
                  <a href="#"><u>Link Sharing</u></a>
              </div>
              <div class="col-xs-3" id="search">
                  <span class="glyphicon glyphicon-search"></span>
                  &nbsp;&nbsp;Search
                  <span class="glyphicon glyphicon-remove-sign pull-right"></span>
              </div>
          </div>
      </div>
      <div id="main-body" class="container-fluid">
          <div class="row">
              <div class="col-sm-8 font-md">
                  <div class="panel panel-default border-black-2">
                      <div class="panel-heading">Recent Shares</div>
                      <div class="panel-body">
                          <div class="container-fluid">
                              <div class="row share">
                                  <div class="col-sm-3">
                                      <img src="user.jpg" alt="user" class="img-responsive center-block" id="user-img">
                                  </div>
                                  <div class="col-sm-9">
                                      <div class="row">
                                          <div class="col-sm-8">
                                              Uday Pratap Singh &nbsp;&nbsp; <span class="time">@uday 5min</span>
                                          </div>
                                          <div class="col-sm-4 pull-right text-right">
                                              <a hre="#"> Grails</a>
                                          </div>
                                      </div>
                                      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam consequat tin elit, eu posuere arcu sollicitudin quis. Fusce porta ipsum lacus, eget finibus nisi accumsan non.</p>
                                      <div class="row">
                                          <div class="col-sm-4 pull-left">
                                              <i class="fa fa-facebook-official fa-2x" aria-hidden="true"></i>
                                              <i class="fa fa-tumblr fa-2x" aria-hidden="true"></i>
                                              <i class="fa fa-google-plus fa-2x" aria-hidden="true"></i>
                                          </div>
                                          <div class="col-sm-4 pull-right text-right">
                                              <a href="#"><u>View Post</u></a>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                              <div class="row share">
                                  <div class="col-sm-3">
                                      <img src="user.jpg" alt="user" class="img-responsive center-block" id="user-img">
                                  </div>
                                  <div class="col-sm-9">
                                      <div class="row">
                                          <div class="col-sm-8">
                                              Uday Pratap Singh &nbsp;&nbsp; <span class="time">@uday 10min</span>
                                          </div>
                                          <div class="col-sm-4 pull-right text-right">
                                              <a hre="#"> Grails</a>
                                          </div>
                                      </div>
                                      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam consequat tin elit, eu posuere arcu sollicitudin quis. Fusce porta ipsum lacus, eget finibus nisi accumsan non.</p>
                                      <div class="row">
                                          <div class="col-sm-4 pull-left">
                                              <i class="fa fa-facebook-official fa-2x" aria-hidden="true"></i>
                                              <i class="fa fa-tumblr fa-2x" aria-hidden="true"></i>
                                              <i class="fa fa-google-plus fa-2x" aria-hidden="true"></i>
                                          </div>
                                          <div class="col-sm-4 pull-right text-right">
                                              <a href="#"><u>View Post</u></a>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                      </div>
                  </div>
                  <div class="panel panel-default">
                      <div class="panel-heading">
                          <div class="container-fluid">
                              <div class="row">
                                  <div class="col-sm-8">
                                      Top Posts
                                  </div>
                                  <div class="dropdown  pull-right">
                                      <button class="btn btn-default dropdown-toggle" type="button" id="menu1" data-toggle="dropdown">Today<span class="caret"></span></button>
                                      <ul class="dropdown-menu" role="menu" aria-labelledby="menu1">
                                          <li>Today</li>
                                          <li>1 Week</li>
                                          <li>1 Month</li>
                                          <li>1 Year</li>
                                      </ul>
                                  </div>
                              </div>
                          </div>

                      </div>
                      <div class="panel-body">
                          <div class="row share">
                              <div class="col-sm-3">
                                  <img src="user.jpg" alt="user" class="img-responsive center-block" id="user-img">
                              </div>
                              <div class="col-sm-9">
                                  <div class="row">
                                      <div class="col-sm-8">
                                          Uday Pratap Singh &nbsp;&nbsp; <span class="time">@uday 21Jul 2013</span>
                                      </div>
                                      <div class="col-sm-4 pull-right text-right">
                                          <a hre="#"> Grails</a>
                                      </div>
                                  </div>
                                  <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam consequat tin elit, eu posuere arcu sollicitudin quis. Fusce porta ipsum lacus, eget finibus nisi accumsan non.</p>
                                  <div class="row">
                                      <div class="col-sm-4 pull-left">
                                          <i class="fa fa-facebook-official fa-2x" aria-hidden="true"></i>
                                          <i class="fa fa-tumblr fa-2x" aria-hidden="true"></i>
                                          <i class="fa fa-google-plus fa-2x" aria-hidden="true"></i>
                                      </div>
                                      <div class="col-sm-4 pull-right text-right">
                                          <a href="#"><u>View Post</u></a>
                                      </div>
                                  </div>
                              </div>
                          </div>
                      </div>
                  </div>
              </div>
              <div class="col-sm-4">
                  <div class="panel panel-default">
                      <div class="panel-heading font-md">Login</div>
                      <div class="panel-body">
                          <div class="container-fluid">
                              <form class="form-horizontal" action="#">
                                  <div class="form-group">
                                      <div class="row">
                                          <label class="control-label col-sm-3" for="email">Email:</label>
                                          <div class="col-sm-9">
                                              <input type="email" class="form-control" id="email" name="email">
                                          </div>
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <div class="row">
                                          <label class="control-label col-sm-3" for="pwd">Password:</label>
                                          <div class="col-sm-9">
                                              <input type="password" class="form-control" id="pwd" name="pwd">
                                          </div>
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <div class="col-sm-7 text-center font-md">
                                          <a href="#"> <u>Forgot Password</u> </a>
                                      </div>
                                      <div class="col-sm-5">
                                          <button class="btn btn-default">Login</button>
                                      </div>
                                  </div>
                              </form>
                          </div>
                      </div>
                  </div>
                  <div class="panel panel-default">
                      <div class="panel-heading font-md">Register</div>
                      <div class="panel-body">
                          <div class="container-fluid">
                              <form class="form-horizontal" action="/register">
                                  <div class="form-group">
                                      <div class="row">
                                          <label class="control-label col-sm-3" for="fname">First Name</label>
                                          <div class="col-sm-9">
                                              <input type="text" class="form-control" id="fname" name="fname">
                                          </div>
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <div class="row">
                                          <label class="control-label col-sm-3" for="lname">Last Name</label>
                                          <div class="col-sm-9">
                                              <input type="text" class="form-control" id="lname" name="lname">
                                          </div>
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <div class="row">
                                          <label class="control-label col-sm-3" for="email">Email:</label>
                                          <div class="col-sm-9">
                                              <input type="email" class="form-control" id="email" name="email">
                                          </div>
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <div class="row">
                                          <label class="control-label col-sm-3" for="uname">Username</label>
                                          <div class="col-sm-9">
                                              <input type="text" class="form-control" id="uname" name="username">
                                          </div>
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <div class="row">
                                          <label class="control-label col-sm-3" for="pwd">Password:</label>
                                          <div class="col-sm-9">
                                              <input type="password" class="form-control" id="pwd" name="password">
                                          </div>
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <div class="row">
                                          <label class="control-label col-sm-3" for="pwd">Confirm Password</label>
                                          <div class="col-sm-9">
                                              <input type="password" class="form-control" id="pwd" name="c_pwd">
                                          </div>
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <div class="row">
                                          <label class="control-label col-sm-3" for="photo">Photo</label>
                                          <div class="col-sm-5">
                                              <input type="text" class="form-control" id="photo" name="photo">
                                          </div>
                                          <div class="col-sm-4">
                                              <button class="btn btn-default">Browse</button>
                                          </div>
                                      </div>
                                  </div>
                                  <div class="form-group">
                                      <div class="col-sm-5 pull-right">
                                          <button class="btn btn-default">Register</button>
                                      </div>
                                  </div>
                              </form>
                          </div>
                      </div>
                  </div>
              </div>
          </div>
      </div>
  </div>
  </div>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

  <script>
      $(function(){
          var search_height=$("#search").height();
          var search_height=search_height+"px";
          $(".glyphicon-remove-sign").css("line-height",search_height);
          $(".glyphicon-search").css("line-height",search_height);
          var nav_height=$("#navbar").height();
          var nav_height=nav_height+"px";
          $("#navbar").css("line-height",nav_height,"vertical-align","middle");
      });
  </script>
  </body>
  </html>
