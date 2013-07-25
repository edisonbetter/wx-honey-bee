/**
 * 
 */
package org.ey.wx.honeybee.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ey.wx.honeybee.util.SignUtil;

/**
 * @author Edison Yang
 * @date 2013-JUL-25
 */
public class CoreServlet extends HttpServlet {
	private static final long serialVersionUID = 6601429757056780860L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String signature = req.getParameter("signature"); // WeChat signature
		String timestamp = req.getParameter("timestamp"); // Time stamp
		String nonce = req.getParameter("nonce"); // random number
		String echostr = req.getParameter("echostr"); // random string
		
		PrintWriter out = resp.getWriter();
		
		if(SignUtil.checkSignature(signature, timestamp, nonce)){
			out.print(echostr);
		}
		
		out.close();
		out = null;
	}
	
	
}
