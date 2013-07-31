/**
 * 
 */
package org.ey.wx.honeybee.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ey.wx.honeybee.message.CharacterEncodingType;
import org.ey.wx.honeybee.service.CoreService;
import org.ey.wx.honeybee.util.SignUtil;

/**
 * @author Edison Yang
 * @date 2013-JUL-25
 */
public class CoreServlet extends HttpServlet {
	private static final long serialVersionUID = -7227963943179804529L;

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

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// set the character encoding to UTF-8 for both request and response
		req.setCharacterEncoding(CharacterEncodingType.UTF_8.toString());
		resp.setCharacterEncoding(CharacterEncodingType.UTF_8.toString());
		
		// process the request and return the result
		String respMessage = CoreService.processRequest(req);
		
		PrintWriter out = resp.getWriter();
		out.print(respMessage);
		out.close();
	}

	
}
