var app = angular.module('Employee Managemet', []); //create model
app.controller("EMP", function ($scope) { //create controller
$scope.items = [];
$scope.addItem = function (item) {  //to add item
$scope.items.push(item);
$scope.item = {};
},
$scope.removeItem = function (index) {   //to remove item
console.log(index);
$scope.items.splice(index, 1)
},
$scope.editItem = function (index) { //to edit item
$scope.editing = $scope.items.indexOf(index);
}
});