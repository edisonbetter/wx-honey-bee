/**
 * 
 */
package org.ey.wx.honeybee.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * @author Edison Yang
 * @date 2013-AUG-01 
 */
public class Test {
	
	private static Log logger = LogFactory.getLog(Test.class);
	
	@org.junit.Test
	public void test() {
		//for(int i=0; i<1000; i++){
			logger.debug("This is a debug message");
			logger.info("This is a info message");
			logger.warn("This is a warn message");
			logger.fatal("This is a fatal message");
			logger.error("This is a error message");
			
		//}
		
	}

}
