/**
 * 
 */
package org.ey.wx.honeybee.message.request;

/**
 * Voice Message
 * 
 * @author Edison Yang
 * @date 2013-JUL-30
 */
public class VoiceMessage extends RequestMessage {
	private String mediaId; //media id
	private String format; //media format

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}
	
}
