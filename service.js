angular.module('srvApp').service('CountryService', CountryService);

CountryService.$inject = [ '$http' ];
function CountryService($http) {

	var queryForStates = function(id, success) {

		var httpHeader = {
			'Content-Type' : 'application/json'
		};
		$http({
			method : 'GET',
			// params : { countryCode : id},
			url : 'http://localhost:8080/Abroad/destination/'+id+'/cities',
			header : httpHeader
		}).then(function successCallback(response) {
			success(response.data);
			// return response.data.destination.countryName;
		}, function errorCallback(response) {
			console.log("error");
		});
	};

	
	var all = function(success) {

		var httpHeader = {
			'Content-Type' : 'application/json'
		};
		$http({
			method : 'GET',
			// params : { countryCode : id},
			url : 'http://localhost:8080/Abroad/destination',
			header : httpHeader
		}).then(function successCallback(response) {
			success(response.data);
			// return response.data.destination.countryName;
		}, function errorCallback(response) {
			console.log("error");
		});
	};
	

	var service = {
		all : all,
		queryForStates : queryForStates
	};

	return service;
}