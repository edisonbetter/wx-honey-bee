/**
 * 
 */
package org.ey.wx.honeybee.message;

/**
 * Base Message
 * 
 * @author Edison Yang
 * @date 2013-JUL-30
 */
public abstract class BaseMessage {
	private String toUserName; //public account
	private String fromUserName; //normal user
	private MessageType messageType; // message type (text/image/location/link)
	private long creationTime; //message creation time

	public String getToUserName() {
		return toUserName;
	}

	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	public String getFromUserName() {
		return fromUserName;
	}

	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}

	public MessageType getMessageType() {
		return messageType;
	}

	public void setMessageType(MessageType messageType) {
		this.messageType = messageType;
	}

	public long getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(long creationTime) {
		this.creationTime = creationTime;
	}
	
}
