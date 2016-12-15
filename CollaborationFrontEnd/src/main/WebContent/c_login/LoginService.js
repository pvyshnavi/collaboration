'use strict';
	 
	app.factory('LoginService', ['$http', '$q','$rootScope', function($http, $q,$rootScope){
		console.log("LoginService...")
	   
		var BASE_URL='http://localhost:8081/CollaborationBackEnd/user/'
		
		return {
	         
	            fetchAllUsers: function() {
	                    return $http.get(BASE_URL+'/user')
	                            .then(
	                                    function(response){
	                                    	console.log('fetchAllUsers response:' +response.data)
	                                        return response.data;
	                                    }, 
	                                    function(errResponse){
	                                        console.error('Error while fetching UserDetails');
	                                        return $q.reject(errResponse);
	                                    }
	                            );
	            },
	             
	            createUser: function(user){
	            	
	            	return $http.post(BASE_URL+'/user',user)
	                            .then(
	                                    function(response){
	                                    	console.log('createUser response:' +response.data)
	                                        return response.data;
	                                    }, 
	                                    function(errResponse){
	                                        console.error('Error while creating UserDetails');
	                                        return $q.reject(errResponse);
	                                    }
	                            );
	            },
	             
	            updateUser: function(user,id){
	            	
	            	return $http.put(BASE_URL+'/user/'+id,user)
	                            .then(
	                                    function(response){
	                                    	console.log('createUser :' +response.data)
	                                        return response.data;
	                                    }, 
	                                    function(errResponse){
	                                        console.error('Error while updating UserDetails');
	                                        return $q.reject(errResponse);
	                                    }
	                            );
	            },
	             
	            deleteUser: function(id){
	            	
	            	return $http.delete(BASE_URL+'/user/'+id)
	                            .then(
	                                    function(response){
	                                    	console.log('deleteUser :' +response.data)
	                                        return response.data;
	                                    }, 
	                                    function(errResponse){
	                                        console.error('Error while deleting UserDetails');
	                                        return $q.reject(errResponse);
	                                    }
	                            );
	            },
	            
	            authenticate:function(user){
	            	return $http.post(BASE_URL+'/user/authenticate/',user)
	            	.then(
	            			function(response){
	            				if(response.data.errorMessage!="")
	            					{
	            					$rootScope.currentUser={
	            							name:response.data.name,
	            							id:response.data.id,
	            							role:response.data.role
	            				};
	            					}
	            				return response.data;
	            			}
	            			);
	            	
	            },
	         
	    }
	 
	}]);
