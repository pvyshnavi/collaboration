app.controller('EventController',function($scope,$location,EventService)
	{
	$scope.event={eventDescription:'',eventContent:''}
	$scope.events={}
	$scope.showEventDetail=false
	
	$scope.saveEvent=function()
	{
		console.log('Entering saveEvent() in eventcontroller.js')
		EventService.saveEvent($scope.event)
		.then(
		function(response)
		{
			console.log("Successfully inserted the event details");
			alert("The event details have been posted successfully!");
			$location.path('/home');
		}
		,
		function(response)
		{
			console.log("Posting Failure: " +response.status);
			if(response.status==401)
			{
			$location.path('/login')
			}
			else
			{
			console.log(response.data.message)
			$location.path('/postEvent')
			}
		})
	}
	
	function getAllEvents()
	{
		$scope.showeventDetail=false;
		console.log('Entering getAllEvents()')
		EventService.getAllEvents()
		.then(function(response)
		{
		console.log(response.status);
		$scope.events=response.data;
		}
		,
		function(response)
		{
			console.log(response.status)
		})
	}
	getAllEvents();
	
	$scope.getEventDetail=function(eventId)
	{
		$scope.showEventDetail=true;
		EventService.getEventDetail(eventId)
		.then(function(response)
		{
			$scope.eventDetail=response.data;
			console.log(response.status)
		}
		,
		function(response)
		{
			console.log(response.status)
		})
	}
	
})