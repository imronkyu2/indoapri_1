package co.g2academy.indoapril_1.repository;

import co.g2academy.indoapril_1.model.ModelMasterBarang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface RepositoryMasterBarang extends PagingAndSortingRepository<ModelMasterBarang, Long> {
//    List<ModelMasterBarang> findAll();
}
