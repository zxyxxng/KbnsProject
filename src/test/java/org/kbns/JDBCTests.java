package org.kbns;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.junit.Assert.fail;

@Slf4j
public class JDBCTests {
    public static Connection oracleConn;

    public static String userid = "system";
    public static String password = "kbnskbns1!";
    
    public static String oracleUrl = "jdbc:oracle:thin:@//192.168.0.90:1521/orcl";


    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConnection(){
        try {
            oracleConn = DriverManager.getConnection(oracleUrl, userid, password);
            log.info(String.valueOf(oracleConn));
        } catch (SQLException e) {
            fail(e.getMessage());
        }
    }
}