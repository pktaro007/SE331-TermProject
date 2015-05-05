/**
 * Created by Taro on 3/18/2015.
 */
'use strict';
var langController = angular.module('languageControllers',['languageServices']);

langController.controller('languageController',['$scope','$translate','$location','$locale',
    function($scope,$translate,$location,$locale){
        var currentLocal =$locale.id.substring(0,2);

        $scope.currentLocale = currentLocal;
        $scope.changeLanguage = function(locale){
            $translate.use(locale);
            $location.search('lang',locale);
            $scope.currentLocale=locale;
        }

    }])