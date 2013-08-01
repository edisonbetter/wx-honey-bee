/**
 * 
 */
package org.ey.wx.honeybee.message.request;

/**
 * Location Message
 * 
 * @author Edison Yang
 * @date 2013-JUL-30
 */
public class LocationMessage extends RequestMessage {
	private String longitude_x; //longitude
	private String latitude_y; //latitude
	private String scale; //map zoom
	private String label; //location info

	public String getLongitude_x() {
		return longitude_x;
	}

	public void setLongitude_x(String longitude_x) {
		this.longitude_x = longitude_x;
	}

	public String getLatitude_y() {
		return latitude_y;
	}

	public void setLatitude_y(String latitude_y) {
		this.latitude_y = latitude_y;
	}

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
}
