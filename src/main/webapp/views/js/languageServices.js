/**
 * Created by Taro on 3/18/2015.
 */
'use strict';
var languageServices =angular.module('languageServices',[]);

languageServices.factory('UrlLanguageStorage',['$location',function($location){
    return{
        put: function(name,value){
        },
        get: function (name){
            return $location.search()['lang']
        }
    };
}]);