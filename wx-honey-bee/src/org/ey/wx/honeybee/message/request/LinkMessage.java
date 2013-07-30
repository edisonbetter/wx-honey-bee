/**
 * 
 */
package org.ey.wx.honeybee.message.request;

/**
 * Link Message
 * 
 * @author Edison Yang
 * @date 2013-JUL-30
 */
public class LinkMessage extends RequestMessage {
	private String title; //message title
	private String description; //message description
	private String url; //message url

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
