package co.g2academy.indoapril_1.repository;

import co.g2academy.indoapril_1.model.ModelBarangMasuk;
import co.g2academy.indoapril_1.model.ModelMasterBarang;
import org.hibernate.sql.Delete;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface RepositoryBarangMasuk extends JpaRepository<ModelBarangMasuk, Integer> {

//    @Query(value = "SELECT * FROM ModelMasterBarang ORDER BY id",
//           countQuery = "SELECT count (*) FROM ModelMasterBarang",
//           nativeQuery = true)
    List<ModelBarangMasuk>findAll();


}
