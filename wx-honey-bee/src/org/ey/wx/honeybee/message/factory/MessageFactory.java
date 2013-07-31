/**
 * 
 */
package org.ey.wx.honeybee.message.factory;

import java.util.Date;
import java.util.Map;

import org.ey.wx.honeybee.message.MessageParameter;
import org.ey.wx.honeybee.message.MessageType;
import org.ey.wx.honeybee.message.response.TextMessage;

/**
 * Message Factory to create message
 * 
 * @author Edison Yang
 * @date 2013-JUL-31
 */
public class MessageFactory {
	public static TextMessage createTextMessage(Map<String, String> map){
		TextMessage message = new TextMessage();
		message.setFromUserName(map.get(MessageParameter.TO_USER_NAME));
		message.setToUserName(map.get(MessageParameter.FROM_USER_NAME));
		message.setCreationTime(new Date().getTime());
		message.setMessageType(MessageType.TEXT);
		message.setFuncFlag(0);
	
		return message;
	}
}
