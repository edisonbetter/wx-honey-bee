/**
 * 
 */
package org.ey.wx.honeybee.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.ey.wx.honeybee.message.EventType;
import org.ey.wx.honeybee.message.MessageParameter;
import org.ey.wx.honeybee.message.MessageType;
import org.ey.wx.honeybee.message.factory.MessageFactory;
import org.ey.wx.honeybee.message.response.TextMessage;
import org.ey.wx.honeybee.util.MessageUtil;

/**
 * Core Service to process request
 * 
 * @author Edison Yang
 * @date 2013-JUL-31
 */
public class CoreService {
	
	public static String processRequest(HttpServletRequest request){
		String respMessage = null;
		String respContent = "Please wait and try again";
		
		Map<String, String> requestMap = null;
		try {
			requestMap = MessageUtil.unmarshal(request);
		} catch (Exception e) {
			e.printStackTrace();
		}

		String msgType = requestMap.get(MessageParameter.MSG_TYPE.toString());	
		respContent = "You sent " + msgType + " message";
		
		if(msgType.equals(MessageType.EVENT.toString())){
			String eventType = requestMap.get(MessageParameter.EVENT.toString());
			if(eventType.equals(EventType.SUBSCRIBE)){
				respContent = "Thank you for following";
			}
		}
		
		TextMessage textMessage = MessageFactory.createTextMessage(requestMap);
		textMessage.setMessageContent(respContent);
		
		
		respMessage = MessageUtil.marchal(textMessage);
		return respMessage;
	}
}
