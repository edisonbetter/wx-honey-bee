/**
 * 
 */
package org.ey.wx.honeybee.message;

/**
 * Character Encoding Type
 * 
 * @author Edison Yang
 * @date 2013-JUL-31
 */
public enum CharacterEncodingType {
	UTF_8("UTF-8");
	
	private final String value;
	
	private CharacterEncodingType(final String value){
		this.value = value;
	}

	@Override
	public String toString() {
		return this.value;
	}
}
