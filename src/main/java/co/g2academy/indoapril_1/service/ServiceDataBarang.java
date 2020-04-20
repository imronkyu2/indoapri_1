package co.g2academy.indoapril_1.service;

import co.g2academy.indoapril_1.response.ResponseBarangMasuk;
import co.g2academy.indoapril_1.response.ResponseDataBarang;

import java.util.List;

public interface ServiceDataBarang {
    //Untuk Menampilkan Data Barang Masuk All
    List<ResponseDataBarang> getDataBarangList();
}
