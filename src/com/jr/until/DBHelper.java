package com.jr.until;

import com.mysql.cj.conf.ConnectionPropertiesTransform;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class DBHelper {
    public static Connection getconn() throws IOException, ClassNotFoundException, SQLException {

        InputStream is= ConnectionPropertiesTransform.class.getClassLoader().getResourceAsStream("jdbc.properties");


        Properties properties=new Properties();
        properties.load(is);

        String url=properties.getProperty("url");
        String username=properties.getProperty("user");
        String password=properties.getProperty("password");
        String driverClass=properties.getProperty("driverClass");
        Class.forName(driverClass);
        Connection con= DriverManager.getConnection(url,username,password);

        return con;
    }


    public static void closeAll(ResultSet rs, PreparedStatement ps, Connection con){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(ps!=null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(con!=null){
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
