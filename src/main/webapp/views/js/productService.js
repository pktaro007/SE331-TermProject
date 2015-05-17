'use strict'
var productService = angular.module('productServices',['ngResource']);

productService.factory('productService',function($resource){
    return $resource('/product/:id', { id: '@_id' }, {
        update: {
            method: 'PUT' // this method issues a PUT request
        }
    },{
        save: {
            method: 'PUT' // this method issues a PUT request
        }
    });

})

