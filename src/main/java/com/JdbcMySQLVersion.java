package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JdbcMySQLVersion {

    //Test connection to DB
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/iit-web?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String user = "iit-user";
        String password = "IIT-Us3r-P@ssw0rd";

        String query = "SELECT VERSION()";

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {

            if (rs.next()) {

                System.out.println(rs.getString(1));
            }

        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(JdbcMySQLVersion.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }
}