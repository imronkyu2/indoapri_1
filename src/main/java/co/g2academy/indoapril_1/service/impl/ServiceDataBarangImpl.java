package co.g2academy.indoapril_1.service.impl;


import co.g2academy.indoapril_1.model.ModelDataBarang;
import co.g2academy.indoapril_1.model.ModelMasterBarang;
import co.g2academy.indoapril_1.repository.RepositoryDataBarang;
import co.g2academy.indoapril_1.repository.RepositoryMasterBarang;
import co.g2academy.indoapril_1.response.ResponseDataBarang;
import co.g2academy.indoapril_1.response.ResponseMasterBarang;
import co.g2academy.indoapril_1.service.ServiceDataBarang;
import co.g2academy.indoapril_1.service.ServiceMasterBarang;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Repository("SeviceDataBarang")
public class ServiceDataBarangImpl implements ServiceDataBarang {
    private RepositoryDataBarang repository;

    //Menampilkan Data Master Barang All
    @Override
    public List<ResponseDataBarang> getDataBarangList() {
        return repository.findAll().stream().map(this::toResponseDataBarangSimple).collect(Collectors.toList());
    }

    private ResponseDataBarang toResponseDataBarangSimple(ModelDataBarang entity){
        return new ResponseDataBarang(entity.getId_Data_Barang(),
                entity.getNama_Barang(),
                entity.getId_Barang_Masuk(),
                entity.getId_Barang_Keluar(),
                entity.getQtt_Min_Stock(),
                entity.getQtt_Stock(),
                entity.getTanggal_Update_Stock());
    }

}
