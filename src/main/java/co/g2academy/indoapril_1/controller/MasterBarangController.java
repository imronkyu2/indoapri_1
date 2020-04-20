package co.g2academy.indoapril_1.controller;


import co.g2academy.indoapril_1.response.ResponseBarangMasuk;
import co.g2academy.indoapril_1.response.ResponseMasterBarang;
import co.g2academy.indoapril_1.service.ServiceBarangMasuk;
import co.g2academy.indoapril_1.service.ServiceMasterBarang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api_2")
public class MasterBarangController {
    @Autowired
    ServiceMasterBarang service;

    //Menampilkan Seluruh Data
    @GetMapping("/MasterBarang")
    public List<ResponseMasterBarang> getMasterBarang(){
        return service.getMasterBarangList();
    }


}
