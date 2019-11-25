package com.noesisinformatica.test;

import java.sql.*;
import java.io.*;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args )
    {
	try{
	String myDriver = "org.gjt.mm.mysql.Driver";
      String myUrl = "jdbc:mysql://localhost/test";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "root", "");
	}
	catch(Exception e){
	System.out.println("something fishy!");
	}

        DataService dataService = new DataService();
        System.out.println( "Number of terms : " + dataService.getAllTerm().size());
        dataService.saveTerm("Term from app");
    }
}
