/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.irfanginanjar.latihanmvcjdbc.event;

import edu.irfanginanjar.latihanmvcjdbc.entity.Pelanggan;
import edu.irfanginanjar.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * NIM  : 10119056
 * Nama : Irfan Ginanjar
 * Kelas: IF2
 * 
 */
public interface PelangganListener {
    public void onChange(PelangganModel model);
    public void onInsert(Pelanggan pelanggan);
    public void onDelete();
    public void onUpdate(Pelanggan pelanggan);
}
