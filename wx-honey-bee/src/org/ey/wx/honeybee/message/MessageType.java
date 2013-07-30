/**
 * 
 */
package org.ey.wx.honeybee.message;

/**
 * Message Type
 * 
 * @author Edison Yang
 * @date 2013-JUL-30
 */
public enum MessageType {
	TEXT("text"),
	MUSIC("music"),
	NEWS("news"),
	IMAGE("image"),
	LINK("link"),
	LOCATION("location"),
	VOICE("voice"),
	EVENT("event");
	
	
	private final String value;
	
	private MessageType(final String value){
		this.value = value;
	}

	@Override
	public String toString() {
		return this.value;
	}
	
	
}
