/**
 * 
 */
package org.ey.wx.honeybee.entity;

/**
 * Multimedia 
 * 
 * @author Edison Yang
 * @date 2013-JUL-30
 */
public abstract class Multimedia {
	private String title; //multimedia name
	private String description; //multimedia description
	
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
}
