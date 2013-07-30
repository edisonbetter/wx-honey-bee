/**
 * 
 */
package org.ey.wx.honeybee.message;

/**
 * Event Type
 * 
 * @author Edison Yang
 * @date 2013-JUL-30 
 */
public enum EventType {
	SUBSCRIBE("subscribe"),
	UNSUBSCRIBE("unsubscribe"),
	CLICK("click");
	
	
	private final String value;
	
	private EventType(final String value){
		this.value = value;
	}
	
	@Override
	public String toString() {
		return this.value;
	}
}
