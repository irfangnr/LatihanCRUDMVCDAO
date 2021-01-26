/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.irfanginanjar.latihanmvcjdbc.error;

/**
 *
 * NIM  : 10119056
 * Nama : Irfan Ginanjar
 * Kelas: IF2
 * 
 */
public class PelangganExeption extends Exception {

    /**
     * Creates a new instance of <code>PelangganExeption</code> without detail
     * message.
     */
    public PelangganExeption() {
    }

    /**
     * Constructs an instance of <code>PelangganExeption</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PelangganExeption(String msg) {
        super(msg);
    }
}
