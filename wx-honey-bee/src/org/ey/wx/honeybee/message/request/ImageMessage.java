/**
 * 
 */
package org.ey.wx.honeybee.message.request;

/**
 * Image Message
 * 
 * @author Edison Yang
 * @date 2013-JUL-30
 */
public class ImageMessage extends RequestMessage {
	private String imageUrl; //image url

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
}
