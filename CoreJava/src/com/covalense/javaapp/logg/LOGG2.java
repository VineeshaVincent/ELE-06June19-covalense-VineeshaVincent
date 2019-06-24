package com.covalense.javaapp.logg;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
public class LOGG2 {

	private static final Logger loger=Logger.getLogger("FLIPKART");
	
	
	public static void main(String[] args) {
		
		LogManager.getLogManager().reset();
		loger.setLevel(Level.ALL);
		
		
		
			try {
				FileHandler fh =new FileHandler("myFevlogdata.log",true);
				fh.setLevel(Level.INFO);
				fh.setFormatter(new SimpleFormatter());
				loger.addHandler(fh);
				


				loger.log(Level.SEVERE, "hi it is a severe message");
				loger.log(Level.WARNING, "hi it is a warning message");
				loger.log(Level.INFO, "hi it is a info message");
				loger.log(Level.CONFIG, "hi it is a config message");
				loger.log(Level.FINE, "hi it is a fine message");
				loger.log(Level.FINER, "hi it is a finer message");
				loger.log(Level.FINEST, "hi it is a finest message");
				
				Byproduct by=new Byproduct();
				by.buy();
				System.out.println("DONE");
			} catch (SecurityException e) {
			
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		
	}
}
