app.factory('EventService',function($http)
{
	var eventService={};
	
	var BASE_URL ="http://localhost:8083/Backend"
	
	eventService.saveEvent=function(event)
	{
		return $http.post(BASE_URL + "/postEvent" , event);
	}
	
	eventService.getAllEvents=function()
	{
		return $http.get(BASE_URL + "/getAllEvents");
	}
	
	eventService.getEventDetail=function(eventId)
	{
		return $http.get(BASE_URL + "/getEventDetail/"+eventId);
	}
	
	return eventService;
})