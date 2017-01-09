app.controller('ChatController', ['ChatService', function(ChatService){
	var self = this;
	self.messages = [];
	self.message = "";


	self.addMessage = function(){
		ChatService.send(self.message);
		self.message = "";
	};

	ChatService.recieve().then(null,null,function (message) {
		self.messages.push(message);
	});

}])
