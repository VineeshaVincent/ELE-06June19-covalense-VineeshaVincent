package com.covalense.javaapp.assignmentsix;

import java.util.logging.Logger;

interface Lamda{  
    public String msg();  
}  

public class LamdaMsg {
	
	public static void main(String[] args) { 
		final Logger loger= Logger.getLogger("LamdaMsg ");
		Lamda l=()->{  
	        return "Hello...Good morning!!!";  
	    };  
	    loger.info(l.msg());  
	}  
}


