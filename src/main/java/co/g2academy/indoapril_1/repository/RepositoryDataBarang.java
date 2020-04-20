package co.g2academy.indoapril_1.repository;

import co.g2academy.indoapril_1.model.ModelDataBarang;
import co.g2academy.indoapril_1.model.ModelMasterBarang;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface RepositoryDataBarang extends PagingAndSortingRepository<ModelDataBarang, Long> {
    List<ModelDataBarang> findAll();
}
