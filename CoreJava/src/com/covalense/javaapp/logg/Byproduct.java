package com.covalense.javaapp.logg;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
public class Byproduct {

	private static final Logger loger=Logger.getLogger("FLIPKART");
			
		
		
		void buy()
		{
		
		
		loger.log(Level.SEVERE, "hi it is a severe message");
		loger.log(Level.WARNING, "hi it is a warning message");
		loger.log(Level.INFO, "hi it is a info message");
		loger.log(Level.CONFIG, "hi it is a config message");
		loger.log(Level.FINE, "hi it is a fine message");
		loger.log(Level.FINER, "hi it is a finer message");
		loger.log(Level.FINEST, "hi it is a finest message");
		}
	

	
		
		
	}

	
		
	
	

