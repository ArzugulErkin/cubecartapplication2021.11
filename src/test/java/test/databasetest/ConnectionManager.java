package test.databasetest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    //create a method to connect to database

    public static Connection connectToDatabaseServer(String dburl,String dbPort,
                                                     String defaultDatabase,String dbUserName,String dbPassword,ConnectionType connectionType){
        //define a connection object
        Connection connection=null;
        String JTDS_Driver="net.sourceforge.jtds.jdbc.Driver";//mssql
        String MYSQL_Driver="com.mysql.cj.jdbc.Driver";//mysql

        switch (connectionType){
            case MSSQL:
                try {
                    Class.forName(JTDS_Driver);//initialize the SQL server driver
                } catch (ClassNotFoundException e) {
                    new RuntimeException("Please check the sql server driver information");
                }
                String connectionURL="jdbc:jtds:sqlserver://"+dburl+":"+dbPort+";DataBaseName="+defaultDatabase;
                try {
                    connection= DriverManager.getConnection(connectionURL,dbUserName,dbPassword);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case MYSQL:
                try {
                    Class.forName(MYSQL_Driver).newInstance();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                String mySQLConnectionUrl="jdbc:mysql://"+dburl+":"+dbPort+"/"+defaultDatabase+"?useSSL=false";
                try {
                    connection=DriverManager.getConnection(mySQLConnectionUrl,dbUserName,dbPassword);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;

            default:
                System.out.println("You need to specify a database connection type MSSQl or MYSQL ");

                try {
                    if(!connection.isClosed()){
                        System.out.println("Database connection is established!");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
        return connection;
    }

    //write a method to close the connection
    public static void closeDatabaseConnection(Connection connection){
        try {
            if(connection.isClosed()){
                System.out.println("Connection has already been closed!!");
            }
            else{
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
