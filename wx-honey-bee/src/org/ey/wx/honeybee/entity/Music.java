/**
 * 
 */
package org.ey.wx.honeybee.entity;

/**
 * Music
 * 
 * @author Edison Yang
 * @date 2013-JUL-30
 */
public class Music extends Multimedia{
	private String url; // music url
	private String hqMusicUrl; // high quality music url

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getHqMusicUrl() {
		return hqMusicUrl;
	}

	public void setHqMusicUrl(String hqMusicUrl) {
		this.hqMusicUrl = hqMusicUrl;
	}
	
}
