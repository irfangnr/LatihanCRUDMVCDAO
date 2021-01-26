/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.irfanginanjar.latihanmvcjdbc.database;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import edu.irfanginanjar.latihanmvcjdbc.impl.PelangganDaoImpl;
import edu.irfanginanjar.latihanmvcjdbc.service.PelangganDao;
import java.sql.SQLException;

/**
 *
 * NIM  : 10119056
 * Nama : Irfan Ginanjar
 * Kelas: IF2
 * 
 */
public class KingsBarberShopDataBase {
    private static Connection connection;
    private static PelangganDao pelangganDao;
    
    public static Connection getConnection() throws SQLException{
        if(connection==null) {
            
            
            
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost:3306/kingsbarbershop");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = (Connection) dataSource.getConnection();
        }
        
        return connection;
    }
    public static PelangganDao getpePelangganDao() throws SQLException{
        
        if(pelangganDao==null){
            pelangganDao=new PelangganDaoImpl(getConnection());
        }
        
        return pelangganDao;
    }
}
