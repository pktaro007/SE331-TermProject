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

    <style type="text/css">
        html, body, #map-canvas { height: 100%; margin: 0; padding: 0;}
    </style>
    <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAE0651MlsQIQx6oU2JZhUZrDTgP6Uqu6w">
    </script>
    <script type="text/javascript">
        function initialize() {
            var mapOptions = {
                center: { lat: 18.7887639, lng: 98.9815946},
                zoom: 8
            };
            var map = new google.maps.Map(document.getElementById('map-canvas'),
                    mapOptions);
        }
        google.maps.event.addDomListener(window, 'load', initialize);
    </script>

</head>

<body>
    <div id="fb-root"></div>
    <script>(function(d, s, id) {
        var js, fjs = d.getElementsByTagName(s)[0];
            if (d.getElementById(id)) return;
            js = d.createElement(s); js.id = id;
            js.src = "//connect.facebook.net/en_US/sdk.js#xfbml=1&version=v2.3";
            fjs.parentNode.insertBefore(js, fjs);
        }(document, 'script', 'facebook-jssdk'));
    </script>

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
                    <li ng-class="{true: 'active'}[menuActive('/register')]">
                        <a href="#/register" translate>menu.register</a>
                    </li>
                    <li ng-class="{true: 'active'}[menuActive('/login')]">
                        <a href="#/login" translate>menu.login</a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="row">
            <div class="col-md-8">
                <div class="information">
                    <p><strong>Logged in as</strong>: {{user.username}}</p>
                    <p><strong>Status</strong>: {{user.status}}</p>
                </div>
            </div>
            <div class="col-md-4" >
                <div class="informationz">
                    <a href="#/adminpanel"><button type="button" class="btn btn-primary">Admin Panel</button></a>
                    <button type="button" class="btn btn-primary">Profile</button>
                    <button type="button" class="btn btn-primary">Log out</button>
                </div>
            </div>
        </div>
    </div>
    <ng-view>Loading...</ng-view>
</div>
</body>
</html>