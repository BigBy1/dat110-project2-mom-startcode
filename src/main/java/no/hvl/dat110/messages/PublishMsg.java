package no.hvl.dat110.messages;

public class PublishMsg extends Message {

	// message sent from client to create publish a message on a topic 
	
	private String user = "";
	private String topic = "";
	private String message = "";

	public PublishMsg(String user, String topic, String message) {
		this.user = user;
		this.topic = topic;
		this.message = message;
	}

	public String getUser() {
		return user;
	}

	public String getTopic() {
		return topic;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	// TODO:
	// Implement object variables - a topic and a message is required

	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text

	public String getMessage() {

		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	//string metoden
	public String toString() {
		return "Vi har motatt en forespørsel fra " + user + ", anngående " + topic + " med verdien "
				+ message;
	}
}
