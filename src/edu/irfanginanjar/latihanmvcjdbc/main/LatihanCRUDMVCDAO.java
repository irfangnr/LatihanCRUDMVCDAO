/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.irfanginanjar.latihanmvcjdbc.main;

import edu.irfanginanjar.latihanmvcjdbc.database.KingsBarberShopDataBase;
import edu.irfanginanjar.latihanmvcjdbc.entity.Pelanggan;
import edu.irfanginanjar.latihanmvcjdbc.error.PelangganExeption;
import edu.irfanginanjar.latihanmvcjdbc.service.PelangganDao;
import edu.irfanginanjar.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * NIM  : 10119056
 * Nama : Irfan Ginanjar
 * Kelas: IF2
 * 
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganExeption{
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDataBase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {
                } catch (PelangganExeption ex) {
                    Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    
    
    }
}
