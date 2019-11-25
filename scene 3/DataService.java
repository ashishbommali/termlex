package com.noesisinformatica.test;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.io;
import java.sql.*;
/**
 * <br>Written by @author noesisdev
 * <br>Created on 02/03/2014
 */
public class DataService {

    
    public DataService(){
	
	
        // save some initial data
        saveTerm("First term");
        saveTerm("Second term");
        saveTerm("Another term");
        saveTerm("Miscellaneous term");
        saveTerm("");
    }

    String getTermForId(Long id){
        return data.get(id);
    }

    void saveTerm(String term){
        // check if term already exists in data
	
	String query = " insert into users"+ " values (term)";	
	PreparedStatement preparedStmt = conn.prepareStatement(query);
	 
        boolean exists = false;
        if(select * from user where term="Term from app"){
                exists = true;
                break;
            }
        // add term if it does not already exist
        if(!exists)
        {
            // get last used Id and generate next id
            long key = getLastUsedId() + 1;
            preparedStmt.setString(key,"term");
            // set key as last used id, so it is available for next use
            setLastUsedId(key);
        }
    }

    Collection<String> getAllTerm(){
        return (select count(*) from users);
    }

    public long getLastUsedId() {
        return lastUsedId;
    }

    public void setLastUsedId(long lastUsedId) {
        this.lastUsedId = lastUsedId;
    }
}
