/**
 * 
 */
package org.ey.wx.honeybee.util;

import java.io.InputStream;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.ey.wx.honeybee.message.BaseMessage;
import org.ey.wx.honeybee.message.MessageType;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;

/**
 * Message Utility
 * Parse incoming xml to a HashMap
 * Transform entity object to xml
 * 
 * @author Edison Yang
 * @date 2013-JUL-30
 */
public class MessageUtil {
	
	@SuppressWarnings("unchecked")
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
	
	public static String marchal(BaseMessage message){
		xstream.alias(MessageType.XML.toString(), message.getClass());
		xstream.aliasField("ToUserName", message.getClass(), "toUserName");
		xstream.aliasField("ToUserName", message.getClass(), "toUserName");
		return xstream.toXML(message);
	}
	
	private static XStream xstream = new XStream(new XppDriver(){
		public HierarchicalStreamWriter createWriter(Writer out){
			return new PrettyPrintWriter(out){
				boolean cdata = true;
				
				@SuppressWarnings("rawtypes")
				public void startNode(String name, Class clazz){
					super.startNode(name, clazz);
				}
				
				protected void writeText(QuickWriter writer, String text){
					if(cdata){
						writer.write("<![CDATA[");
						writer.write(text);
						writer.write("]]>");
					}else{
						writer.write(text);
					}
				}
			};
		}
	});
}
