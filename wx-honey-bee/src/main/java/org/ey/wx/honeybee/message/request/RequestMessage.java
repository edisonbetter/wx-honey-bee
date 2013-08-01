/**
 * 
 */
package org.ey.wx.honeybee.message.request;

/**
 * Base Message class (normal user -> public account)
 * 
 * @author Edison Yang
 * @date 2013-JUL-30
 */
public class RequestMessage {
	private String messageId; // message id

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
		
}
