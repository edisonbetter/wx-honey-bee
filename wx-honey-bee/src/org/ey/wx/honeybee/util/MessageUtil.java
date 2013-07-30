/**
 * 
 */
package org.ey.wx.honeybee.util;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * Message Utility
 * Parse incoming xml to a HashMap
 * Transform entity object to xml
 * 
 * @author Edison Yang
 * @date 2013-JUL-30
 */
public class MessageUtil {
	public static Map<String, String> unmarshal(HttpServletRequest request) throws Exception{
		Map<String, String> map = new HashMap<String, String>();
		SAXReader reader = new SAXReader();
		InputStream inputStream = request.getInputStream();
		
		Document document = reader.read(inputStream);
		Element root = document.getRootElement();
		List<Element> elementList = root.elements();
		
		// traverse all sub nodes
		for(Element e: elementList){
			map.put(e.getName(), e.getText());
		}
		
		inputStream.close();
		inputStream = null;
		
		return map;
	}
}
