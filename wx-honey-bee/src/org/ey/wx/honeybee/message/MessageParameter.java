/**
 * 
 */
package org.ey.wx.honeybee.message;

/**
 * Wei xin Message Parameter type
 * 
 * @author Edison Yang
 * @date 2013-JUL-31
 */
public enum MessageParameter {
	TO_USER_NAME("ToUserName"),
	FROM_USER_NAME("FromUserName"),
	CREATE_TIME("CreateTime"),
	MSG_TYPE("MsgType"),
	CONTENT("Content"),
	MSG_ID("MsgId"),
	EVENT("EVENT");
	
	private final String value;
	
	private MessageParameter(final String value){
		this.value = value;
	}

	@Override
	public String toString() {
		return this.value;
	}
	
}
