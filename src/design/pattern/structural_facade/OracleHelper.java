
package design.pattern.structural_facade;

import java.sql.Connection;

public class OracleHelper {

	public static Connection getOracleDBConnection(){
		//get Oracle DB connection using connection parameters
		System.out.println("get Oracle DB connection using connection parameters");
		return null;
	}
	
	public void generateOraclePDFReport(String tableName, Connection con){
		//get data from table and generate pdf report
		System.out.println("Oracle get data from table and generate pdf report");
	}
	
	public void generateOracleHTMLReport(String tableName, Connection con){
		//get data from table and generate pdf report
		System.out.println("Oracle get data from table and generate pdf report");
	}
	
}
