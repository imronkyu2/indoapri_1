package co.g2academy.indoapril_1.controller;

import co.g2academy.indoapril_1.response.ResponseBarangMasuk;
import co.g2academy.indoapril_1.response.ResponseDataBarang;
import co.g2academy.indoapril_1.service.ServiceBarangMasuk;
import co.g2academy.indoapril_1.service.ServiceDataBarang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api_4")
public class DataBarangControler {
    @Autowired
    ServiceDataBarang service;

    //Menampilkan Seluruh Data
    @GetMapping("/DataBarang")
    public List<ResponseDataBarang> getDataBarang(){
        return service.getDataBarangList();
    }
}
