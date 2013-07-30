/**
 * 
 */
package org.ey.wx.honeybee.entity;

/**
 * Article
 * 
 * @author Edison Yang
 * @date 2013-JUL-30
 */
public class Article extends Multimedia{
	private String imageUrl; // image url, support format JPG/PNG, recommend resolution 640*320
	private String url; // link url

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
