/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_manager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
/**
 *
 * @author Mateus
 */
public class DB_Actions {
    public static ResultSet Query(DB_Connection conn, String query, DataType[] values){
        ResultSet result = null;
        try {
            PreparedStatement state = conn.getConn().prepareStatement(query);
            for (int i = 0; i < values.length; i++) {
                if(values[i].getDataType() == DataType.Types.StringType){
                    state.setString(i + 1, values[i].getStringData());
                }else if (values[i].getDataType() == DataType.Types.IntType){
                    state.setInt(i + 1, values[i].getIntType());
                }else if (values[i].getDataType() == DataType.Types.FloatType){
                    state.setFloat(i + 1, values[i].getFloatData());
                }else if (values[i].getDataType() == DataType.Types.DateType){
                    state.setTimestamp(i + 1, values[i].getDateData());
                }
            }
            result = state.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }
    public static boolean Insert(DB_Connection conn, String query, DataType[] values){
        try {
            PreparedStatement state = conn.getConn().prepareStatement(query);
            for (int i = 0; i < values.length; i++) {
                if(values[i].getDataType() == DataType.Types.StringType){
                    state.setString(i + 1, values[i].getStringData());
                }else if (values[i].getDataType() == DataType.Types.IntType){
                    state.setInt(i + 1, values[i].getIntType());
                }else if (values[i].getDataType() == DataType.Types.FloatType){
                    state.setFloat(i + 1, values[i].getFloatData());
                }else if (values[i].getDataType() == DataType.Types.DateType){
                    state.setTimestamp(i + 1, values[i].getDateData());
                }
            }
            state.execute();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }
    public static boolean Delete(DB_Connection conn, String query, DataType[] values){
        try {
            PreparedStatement state = conn.getConn().prepareStatement(query);
            for (int i = 0; i < values.length; i++) {
                if(values[i].getDataType() == DataType.Types.StringType){
                    state.setString(i + 1, values[i].getStringData());
                }else if (values[i].getDataType() == DataType.Types.IntType){
                    state.setInt(i + 1, values[i].getIntType());
                }else if (values[i].getDataType() == DataType.Types.FloatType){
                    state.setFloat(i + 1, values[i].getFloatData());
                }else if (values[i].getDataType() == DataType.Types.DateType){
                    state.setTimestamp(i + 1, values[i].getDateData());
                }
            }
            state.execute();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }
    public static boolean Update(DB_Connection conn, String query, DataType[] values){
        try {
            PreparedStatement state = conn.getConn().prepareStatement(query);
            for (int i = 0; i < values.length; i++) {
                if(values[i].getDataType() == DataType.Types.StringType){
                    state.setString(i + 1, values[i].getStringData());
                }else if (values[i].getDataType() == DataType.Types.IntType){
                    state.setInt(i + 1, values[i].getIntType());
                }else if (values[i].getDataType() == DataType.Types.FloatType){
                    state.setFloat(i + 1, values[i].getFloatData());
                }else if (values[i].getDataType() == DataType.Types.DateType){
                    state.setTimestamp(i + 1, values[i].getDateData());
                }
            }
            state.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }
}
