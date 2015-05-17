<!DOCTYPE html>

<html lang="en" ng-app="labApp">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title translate>home.title</title>
  <meta name="description" content="">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <link rel="stylesheet" href="bower_components/html5-boilerplate/css/normalize.css">
  <link rel="stylesheet" href="bower_components/html5-boilerplate/css/main.css">
  <link rel="stylesheet" href="app.css">
  <link rel="stylesheet" href="css/style.css">
  <link rel="stylesheet" href="bower_components/bootstrap/dist/css/bootstrap.css">
  <script src="bower_components/html5-boilerplate/js/vendor/modernizr-2.6.2.min.js"></script>
  <script src="bower_components/angular/angular.js"></script>
  <script src="bower_components/angular-route/angular-route.js"></script>
  <script src="bower_components/angular-resource/angular-resource.js"></script>
  <script src="bower_components/jquery/dist/jquery.min.js"></script>
  <script src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
  <script src="app.js"></script>
  <script src="js/controller.js"></script>
  <script src="js/productController.js"></script>
  <script src="js/productService.js"></script>
  <link rel="stylesheet" href="css/style.css">

  <!-- add il8n script-->
  <script src="bower_components/angular-translate/angular-translate.js"></script>
  <script src="bower_components/angular-translate-loader-url/angular-translate-loader-url.js"></script>
  <script src="js/languageServices.js"></script>
  <script src="js/languageControllers.js"></script>

</head>

<body>
<div class="container-fluid">
  <div class="page-header">
    <div class="header">
      <h1>Wat Phra Singh Woramahaviharn <br/> <small>Chiang Mai, Thailand</small></h1>

    </div>
    <div class="navbar navbar-default" ng-controller="languageController">

      <div class="collapse navbar-collapse">
        <ul class="nav navbar-nav navbar-left">
          <li ng-class="{true: 'active'}[menuActive('/home')]">
            <a href="#/home" translate>menu.home</a>
          </li>
          <li ng-class="{true: 'active'}[menuActive('/history')]">
            <a href="#/history" translate>menu.history</a>
          </li>
          <li ng-class="{true: 'active'}[menuActive('/activity')]">
            <a href="#/activity" translate>menu.activity</a>
          </li>
          <li ng-class="{true: 'active'}[menuActive('/dhamma')]">
            <a href="#/dhamma" translate>menu.dhamma</a>
          </li>
          <li ng-class="{true: 'active'}[menuActive('/gallery')]">
            <a href="#/gallery" translate>menu.gallery</a>
          </li>
          <li ng-class="{true: 'active'}[menuActive('/qa')]">
            <a href="#/qa" translate>menu.qa</a>
          </li>
          <li ng-class="{true: 'active'}[menuActive('/contact')]">
            <a href="#/contact" translate>menu.contact</a>
          </li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
          <li ng-class="{true: 'active'}[menuActive('/contact')]">
            <a href="#/register" translate>menu.register</a>
          </li>
          <li ng-class="{true: 'active'}[menuActive('/')]">
            <a href="#login" class="x" translate>menu.login</a>
          </li>
        </ul>
      </div>
      <script>
        $('.x').click(function (event) {
          event.preventDefault();
          var target = $(this).attr('href');
          $(target).toggleClass('hidden show');
        });
      </script>
    </div>
    <div id="login" class="hidden">
      <div class="form">
        <form class="form-horizontal">
          <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">Email</label>
            <div class="col-sm-10">
              <input type="email" class="form-control" id="inputEmail3" placeholder="Email">
            </div>
          </div>
          <div class="form-group">
            <label for="inputPassword3" class="col-sm-2 control-label">Password</label>
            <div class="col-sm-10">
              <input type="password" class="form-control" id="inputPassword3" placeholder="Password">
            </div>
          </div>
          <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
              <div class="checkbox">
                <label>
                  <input type="checkbox"> Remember me
                </label>
              </div>
            </div>
          </div>
          <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
              <button type="submit" class="btn btn-default">Sign in</button>
            </div>
          </div>
        </form>
      </div>
    </div>
  </div>
  <ng-view>Loading...</ng-view>
</div>

</body>
</html>