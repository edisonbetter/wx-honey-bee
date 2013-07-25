/**
 * 
 */
package org.ey.wx.honeybee.util;

/**
 * @author Edison Yang
 * @date 2013-JUL-25
 */
public class StringUtil {
	
	/**
	 * transform the given byte array to a String
	 * @param byteArray
	 * @return
	 */
	public static String byteToString(byte[] byteArray){
		StringBuilder resultString = new StringBuilder("");
		
		for(int i = 0; i < byteArray.length; i++){
			resultString.append(byteToHexString(byteArray[i]));
		}
		
		return resultString.toString();
	}

	/**
	 * transform the byte to a Hex String
	 * @param b
	 * @return
	 */
	private static Object byteToHexString(byte b) {
		char[] digit = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		char[] tempArray = new char[2];
		
		tempArray[0] = digit[(b >>> 4) & 0X0F];
		tempArray[1] = digit[b & 0X0F];
		
		return tempArray;
	}
}
