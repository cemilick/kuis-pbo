/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.divisi;

import com.mahasiswa.Mahasiswa;
import com.perhitungan.Perhitungan;
/**
 *
 * @author cemil
 */
public class Android extends Mahasiswa implements Perhitungan {

    public Android(String nama, String nik, int tulis, int coding, int wawancara) {
        super(nama, nik, tulis, coding, wawancara);
    }
    
    public void setTulis(int tulis) {
        this.tulis = tulis;
    }

    public void setCoding(int coding) {
        this.coding = coding;
    }

    public void setWawancara(int wawancara) {
        this.wawancara = wawancara;
    }

    @Override
    public String keterangan() {
        if(this.nilaiAkhir() >= 85) return "Keterangan : LULUS\nSelamat kepada " + this.nama + " telah diterima sebagai Android";
        else return "Keterangan : GAGAL\nMohon Maaf kepada " + this.nama + " telah ditolak sebagai Android";
    }

    @Override
    public double nilaiAkhir() {
        return (super.tulis * 0.2) + (super.coding * 0.5) + (super.wawancara * 0.3);
    }
    
}
