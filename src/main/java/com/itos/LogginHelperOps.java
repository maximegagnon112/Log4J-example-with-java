package com.itos;

import org.apache.log4j.Logger;

/**
 * 
 * @author Dilanka
 *
 */
 class LogginHelperOps{
	
	final static Logger logger = Logger.getLogger(LogginHelperOps.class);
	
	public static void main(String[] args) {
	
		LogginHelperOps obj = new LogginHelperOps();
		
		try{
			obj.divide();
		}catch(ArithmeticException ex){
			logger.fatal("Sorry, something wrong in your calculation!", ex);
		}
		
		
	}
	
	private void divide(){
		
		int i = 10 /0;

	}
	
}
