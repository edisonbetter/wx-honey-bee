/**
 * 
 */
package org.ey.wx.honeybee.message.response;

import org.ey.wx.honeybee.entity.Music;

/**
 * Music Message
 * 
 * @author Edison Yang
 * @date 2013-JUL-30
 */
public class MusicMessage extends ResponseMessage {
	
	private Music music; //music

	public Music getMusic() {
		return music;
	}

	public void setMusic(Music music) {
		this.music = music;
	}
	
}
