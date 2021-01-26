/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.irfanginanjar.latihanmvcjdbc.service;

import edu.irfanginanjar.latihanmvcjdbc.entity.Pelanggan;
import edu.irfanginanjar.latihanmvcjdbc.error.PelangganExeption;
import java.util.List;
/**
 *
 * NIM  : 10119056
 * Nama : Irfan Ginanjar
 * Kelas: IF2
 * 
 */
public interface PelangganDao {
    
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganExeption;
        public void updatePelanggan(Pelanggan pelanggan) throws PelangganExeption;
            public void deletePelanggan(Integer id) throws PelangganExeption;
                public Pelanggan getPelanggan(Integer id) throws PelangganExeption;
                public Pelanggan getelanggan(String email) throws PelangganExeption;
                public List<Pelanggan> selectAllPelanggan() throws PelangganExeption;
    
}
