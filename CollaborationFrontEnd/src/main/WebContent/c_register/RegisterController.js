'use strict';
	

	 
	app.controller('RegisterController', ['$scope', 'RegistrationService', function($scope, RegistrationService) {
		console.log("UserController...")
	          var self = this;
	          self.user={id:'', name:'', password:'', emailid:'', address:'', contactnumber :'' };
	          self.users=[];
	               
	          self.fetchAllUsers = function(){
	        	  console.log(' self.fetchAllUsers')
	              UserService.fetchAllUsers()
	                  .then(
	                               function(d) {
	                                    self.users = d;
	                                    console.log('users...' + self.users)
	                               },
	                                function(errResponse){
	                                    console.error('Error while fetching Users');
	                                }
	                       );
	          };
	            
	          self.createUser = function(user){
	        	  console.log('createUser:' + user)
	              UserService.createUser(user)
	                      .then(
	                      self.fetchAllUsers, 
	                              function(errResponse){
	                                   console.error('Error while creating User.');
	                              } 
	                  );
	          };
	 
	         self.updateUser = function(user, id){
	        	 console.log('updateUser:' + user)
	        	 console.log('id:' + id)
	              UserService.updateUser(user, id)
	                      .then(
	                              self.fetchAllUsers, 
	                              function(errResponse){
	                                   console.error('Error while updating User.');
	                              } 
	                  );
	          };
	 
	         self.deleteUser = function(id){
	        	 console.log('deleteUser:' + id)
	              UserService.deleteUser(id)
	                      .then(
	                              self.fetchAllUsers, 
	                              function(errResponse){
	                                   console.error('Error while deleting User.');
	                              } 
	                  );
	          };
	 
	          self.fetchAllUsers();
	 
	          self.submit = function() {
	             
	                  console.log('Saving New User', self.user);    
	                  self.createUser(self.user);
	             
	              self.reset();
	          };
	               
	          self.edit = function(id){
	              console.log('id to be edited', id);
	              for(var i = 0; i < self.users.length; i++){
	                  if(self.users[i].id === id) {
	                     self.user = angular.copy(self.users[i]);
	                     break;
	                  }
	              }
	          };
	               
	          self.remove = function(id){
	              console.log('id to be deleted', id);
	              if(self.user.id === id) {//clean form if the user to be deleted is shown there.
	                 self.reset();
	              }
	              self.deleteUser(id);
	          };
	 
	           
	          self.reset = function(){
	        	  console.log('reset')
	              self.user={id:'', name:'', password:'', emailid:'', address:'', contactnumber :'' };
	              $scope.myForm.$setPristine(); //reset Form
	          };
	 
	      }]);
