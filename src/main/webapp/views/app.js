'use strict';

// Declare app level module which depends on views, and components
var LabApp = angular.module('labApp', [
    'ngRoute',
    'languageControllers',
    'languageServices',
    'pascalprecht.translate'
])
LabApp.config(['$routeProvider',
  function($routeProvider) {
  $routeProvider.
      when('/home',{
          templateUrl: 'site/home.html'
      }).
      when('/history',{
          templateUrl: 'site/history.html'
      }).
      when('/activity',{
          templateUrl: 'site/activity.html'
      }).
      when('/dhamma',{
          templateUrl: 'site/dhamma.html'
      }).
      when('/gallery',{
          templateUrl: 'site/gallery.html'
      }).
      when('/qa',{
          templateUrl: 'site/QA.html'
      }).
      when('/contact',{
          templateUrl: 'site/contact.html'
      }).
      when('/register',{
          templateUrl: 'site/register.html'
      }).
      when('/login',{
          templateUrl: 'site/login.html'
      }).
      when('/forgot',{
          templateUrl: 'site/forgot.html'
      }).
      when('/adminpanel',{
          templateUrl: 'site/adminpanel.html'
      }).
       otherwise({redirectTo: '/home'});
}]);

LabApp.config(function($translateProvider){
    $translateProvider.useUrlLoader('/messageBundle');
    $translateProvider.useStorage('UrlLanguageStorage');
    $translateProvider.preferredLanguage('en');
    $translateProvider.fallbackLanguage('en');
});