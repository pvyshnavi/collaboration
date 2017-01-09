package com.collab.portal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "c_chat")
@Component
public class Chat {
	
	private int chat_id;
	private int user_id;
	public int getChat_id() {
		return chat_id;
	}
	public void setChat_id(int chat_id) {
		this.chat_id = chat_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	
	
	
	
	
	
	
	//@Id
	//@Column(name="serialNo")
	//@GeneratedValue
	//private String serialNo;
	
	//private String sender;
	//private String receiver;
	//private String message;
	
	//public String getSerialNo() {
		//return serialNo;
	//}
	//public void setSerialNo(String serialNo) {
		//this.serialNo = serialNo;
	//}
	//public String getSender() {
		//return sender;
	//}
	//public void setSender(String sender) {
		//this.sender = sender;
	//}
	//public String getReceiver() {
		//return receiver;
	//}
	//public void setReceiver(String receiver) {
		//this.receiver = receiver;
	//}
	//public String getMessage() {
		//return message;
	//}
	//public void setMessage(String message) {
		//this.message = message;
	//}


}
