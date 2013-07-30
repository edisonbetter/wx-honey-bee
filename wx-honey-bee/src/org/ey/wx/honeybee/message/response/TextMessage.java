/**
 * 
 */
package org.ey.wx.honeybee.message.response;

/**
 * Text Message of Response
 * 
 * @author Edison Yang
 * @date 2013-JUL-30
 */
public class TextMessage extends ResponseMessage {
	private String messageContent; //message content

	public String getMessageContent() {
		return messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	
}
