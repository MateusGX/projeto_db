/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_manager;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author Mateus
 */
public class DataType {
    public enum Types {
        StringType, DateType, IntType, FloatType
    }
    
    private Types dType;
    private String dString;
    private Timestamp dData;
    private int dInt;
    private float dFloat;
    
    public DataType(String data){
       this.dType = Types.StringType;
        this.dString = data;
    }
    
    public DataType(Timestamp data){
        this.dType = Types.DateType;
        this.dData = data;
    }
    
    public DataType(int data){
        this.dType = Types.IntType;
        this.dInt = data;
    }
    
    public DataType(float data){
       this.dType = Types.FloatType;
       this.dFloat = data;
    }
    
    public Types getDataType(){
        return this.dType;
    }
    
    public int getIntType(){
        return this.dInt;
    }
    
    public String getStringData(){
        return this.dString;
    }
    
    public Timestamp getDateData(){
        return this.dData;
    }
    
    public float getFloatData(){
        return this.dFloat;
    }
}
