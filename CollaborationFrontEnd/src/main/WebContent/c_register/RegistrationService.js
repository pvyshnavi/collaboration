'use strict'
	

	app.factory('RegistrationService', ['$http', '$q', function($http, $q) {
		
		console.log("RegistrationService!!!")
		
		var BASE_URL='http://localhost:8081/CollaborationBackend'
		return {
			
			fetchAllUsers: function() 
			{
				return $http.get(BASE_URL+'/user/')
					.then(
							function(response)
							{
								return response.data;
							},
							function(errResponse)
							{
								console.error('Error while  fetchin UserDetails');
								return $q.reject(errResponse);
							}
						);
		    },
		
	//	createUsers: function(user)
	//	{
	//		return $http.post(BASE_URL+'/user/',user)
	//			.then(
	//					function(response) 
	//					{
	//						return response.data;
	//					},
	//					function(errResponse)
	//					{
	//						console.error('Error while  fetchin UserDetails');
	//						return $q.reject(errResponse);
	//					}
	//				);
	//	},
		
		 createUser: function(User){
	 
	     	var jsonObject = angular.toJson(User)
	     	console.log('toJson:' + jsonObject)
	             return $http.post('http://localhost:8081/CollaborationBackend/user/', jsonObject)
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
	

//	deleteUser: function(id)
//		{
//		return $http.delete(BASE_URL+'/user/'+id)
//			.then(
//					function(response)
//					{
//						return response.data;
//					},
//					function(errResponse)
//					{
//						console.error('Error while  fetchin UserDetails');
//						return $q.reject(errResponse);
//					}
//	             );
//		},
		
//	updateUser: function(user, id) 
//		{
//	  return $http.delete(BASE_URL+'/user/'+id, user)
//			.then(
//					function(response)
//					{
//						return response.data;
//					},
//					function(errResponse)
//					{
//						console.error('Error while  fetchin UserDetails');
//						return $q.reject(errResponse);
//					}
//				);
//		},
		
		}
		
	}])
