(function() {
	'use strict';

	angular.module("srvApp",[])// ['ui.router'])
	.controller("srvCtrl", srvCtrl);
//	.config(function($stateProvider, $urlRouterProvider) {
//	    
//		  //  $urlRouterProvider.otherwise('/home');
//		    
//		    $stateProvider
//		        
//		        // HOME STATES AND NESTED VIEWS ========================================
//		        .state('home', {
//		            url: '/home',
//		            templateUrl: 'marshall.html'
//		        })
//		        
//		        // ABOUT PAGE AND MULTIPLE NAMED VIEWS =================================
//		        .state('about', {
//		        	url: '/about',
//		            templateUrl: 'newz.html'
//		        });
//		        
//		});
	
	srvCtrl.$inject = [ 'CountryService', '$http' ];
	
	function srvCtrl(CountryService, $http) {
		var vm = this;
		CountryService.all(onAllSucess);
		
		function onAllSucess(data){
			vm.countries = data.destinationResult.dList;
		}
		
		function onStateSucess(data){
			vm.states = data.specificPlaceResult.specificCities;
		}

		function onSucess(data) {
			vm.countrydata = data.destination.countryName;
		}

		vm.neww = function(id) {
			console.log(id);
			CountryService.all(onAllSucess);
			CountryService.queryForStates(id.countryId, onStateSucess);
		}
		vm.onclick = function(id){
			vm.img = id.imgUrl;
			console.log(vm.img);
		}
		
	};

})();
