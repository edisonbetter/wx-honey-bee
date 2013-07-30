/**
 * 
 */
package org.ey.wx.honeybee.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
 * @author Edison Yang
 * @date 2013-JUL-25
 */
public class SignUtil {
	private static String token = "wxhoneybeeey"; //it should be consistent with the info from interface
	
	public static boolean checkSignature(String signature, String timestamp, String nonce){
		String[] params = {token, timestamp, nonce};
		Arrays.sort(params);
		
		StringBuilder content = new StringBuilder();
		for(int i = 0; i < params.length; i++){
			content.append(params[i]);
		}
		
		MessageDigest md = null;
		
		try {
			md = MessageDigest.getInstance("SHA-1");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		byte[] digest = md.digest(content.toString().getBytes());
		String tempString = StringUtil.byteToString(digest);
		
		content = null;
		// compare the digested string with the signature
		return tempString != null ? tempString.equals(signature.toUpperCase()) : false; 
	}
}
