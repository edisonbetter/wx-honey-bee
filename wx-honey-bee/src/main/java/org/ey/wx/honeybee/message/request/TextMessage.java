/**
 * 
 */
package org.ey.wx.honeybee.message.request;

/**
 * Text Message
 * 
 * @author Edison Yang
 * @date 2013-JUL-30
 */
public class TextMessage extends RequestMessage {	
	private String messageContent; //message content

	public String getMessageContent() {
		return messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}

}
