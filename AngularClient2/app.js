var app = angular.module('myApp', []);
app.config(['$httpProvider', function($httpProvider) {
    $httpProvider.defaults.timeout = 20000;
}])
app.controller('myCtrl', function($scope, $http) {
    this.retrieve = function() {
    $http.get('http://localhost:8080/movies')
    .then(function (response) {
        console.log('inside'+ response);
        $scope.movies = response.data;
    }, function (response) {
        console.log('came here');
    });
    }

    this.add = function (id, title, director) {
    var data = {
		id: id,
		title: title,
		director: director
	};
    $http.post('http://localhost:8080/movies', JSON.stringify(data)).then(function (response) {
		if (response.data)
		$scope.msg = "Post Data Submitted Successfully!";
	}, function (response) {
			$scope.msg = "Service not Exists";
			$scope.statusval = response.status;
			$scope.statustext = response.statusText;
			$scope.headers = response.headers();
	});
};

});

