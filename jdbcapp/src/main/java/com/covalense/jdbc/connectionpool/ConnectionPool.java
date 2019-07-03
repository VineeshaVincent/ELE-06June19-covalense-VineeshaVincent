package com.covalense.jdbc.connectionpool;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.Vector;

public class ConnectionPool {

	private Vector<Connection> pool=new Vector<>();
	private int poolSize;
	private String dbUrl;
	private String userNM;
	private String password;
	private Connection con=null;
	private String driverClassNM="com.mysql.jdbc.Driver";
	private static ConnectionPool poolRef=null;
	
	public static ConnectionPool getConnectionpool()throws Exception{

		if(poolRef==null) {
			poolRef=new ConnectionPool();
		}
		return poolRef;
	}	
		private void LoadProperies()throws Exception{
			Properties properties=new Properties();
			properties.load(new FileInputStream("db.properties"));
		
	//poolSize=Integer.parseInt(properties.getProperty("poolsize"));
	poolSize=Integer.parseInt(Propertyutil.getPropertyutil().getProperty("poolsize"));
	dbUrl=Propertyutil.getPropertyutil().getProperty("dbUrl");
	userNM=Propertyutil.getPropertyutil().getProperty("userNM");
	password=Propertyutil.getPropertyutil().getProperty("password");
	driverClassNM=Propertyutil.getPropertyutil().getProperty("driverClassNM");
	}
		private void initializePool()throws Exception{
			
			pool=new Vector<>();
			Connection con=null;
		
		Class.forName(driverClassNM);
		for(int i=0;i<poolSize;i++) {
			
				con=DriverManager.getConnection(dbUrl,userNM,password);
				pool.add(con);
			
	}//End of for
	}//End of constructor
	private ConnectionPool()throws Exception{
		LoadProperies();
		initializePool();
	}
	public Connection getConnectionFrompool() {
		return pool.remove(0);
	}
	public Connection returnconnectionToPool(Connection con) {
		pool.add(con);
		return con;
	}
	
}//End of class
