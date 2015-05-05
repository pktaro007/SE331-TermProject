<!DOCTYPE html>

<html lang="en" ng-app="labApp">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>My AngularJS App</title>

    <link rel="stylesheet" href="bower_components/html5-boilerplate/css/normalize.css">
    <link rel="stylesheet" href="bower_components/html5-boilerplate/css/main.css">
    <link rel="stylesheet" href="app.css">
    <link rel="stylesheet" href="bower_components/bootstrap/dist/css/bootstrap.css">

    <script src="bower_components/html5-boilerplate/js/vendor/modernizr-2.6.2.min.js"></script>
    <script src="bower_components/angular/angular.js"></script>
    <script src="bower_components/angular-route/angular-route.js"></script>
    <script src="bower_components/angular-resource/angular-resource.js"></script>
    <script src="bower_components/jquery/dist/jquery.min.js"></script>
    <script src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
    <script src="bower_components/angular-translate/angular-translate.js"></script>
    <script src="bower_components/angular-translate-loader-url/angular-translate-loader-url.js"></script>

    <script src="app.js"></script>
    <script src="js/controller.js"></script>
    <script src="js/productController.js"></script>
    <script src="js/productService.js"></script>
    <script src="js/languageServices.js"></script>
    <script src="js/languageControllers.js"></script>

</head>
<header>
    <div>
        <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav navbar-left">
                <li ng-class="{true: 'active'}[menuActive('/home')]">
                    <a href="#/home" translate>menu.home</a>
                </li>
                <li ng-class="{true: 'active'}[menuActive('/history')]">
                    <a href="#/history" translate>menu.history</a>
                </li>
                <li ng-class="{true: 'active'}[menuActive('/activity')]">
                    <a href="/activity" translate>menu.activity</a>
                </li>
                <li ng-class="{true: 'active'}[menuActive('/dhamma')]">
                    <a href="/dhamma" translate>menu.dhamma</a>
                </li>
                <li ng-class="{true: 'active'}[menuActive('/gallery')]">
                    <a href="/gallery" translate>menu.gallery</a>
                </li>
                <li ng-class="{true: 'active'}[menuActive('/qa')]">
                    <a href="/qa" translate>menu.qa</a>
                </li>
                <li ng-class="{true: 'active'}[menuActive('/contact')]">
                    <a href="/contact" translate>menu.contact</a>
                </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li ng-class="{true: 'active'}[menuActive('/contact')]">
                    <a href="/contact" translate>menu.register</a>
                </li>
                <li ng-class="{true: 'active'}[menuActive('/')]">
                    <a href="#login" class="x" translate>menu.login</a>
                </li>
            </ul>
        </div>
    </div>
</header>
<body>
<ng-view>Loading...</ng-view>
</body>
</html>
