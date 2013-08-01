/**
 * 
 */
package org.ey.wx.honeybee.message.response;

import org.ey.wx.honeybee.message.BaseMessage;

/**
 * Response Message (public account -> normal user)
 * 
 * @author Edison Yang
 * @date 2013-JUL-30
 */
public class ResponseMessage extends BaseMessage {
	private int FuncFlag; // 0x0001, a star lables an immediate message

	public int getFuncFlag() {
		return FuncFlag;
	}

	public void setFuncFlag(int funcFlag) {
		FuncFlag = funcFlag;
	}
	
}
