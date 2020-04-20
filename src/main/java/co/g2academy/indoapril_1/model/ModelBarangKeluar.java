package co.g2academy.indoapril_1.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_barang_keluar")
@Entity
@EntityListeners(AuditingEntityListener.class)
public class ModelBarangKeluar implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int Id_Barang_Keluar;
    private Integer Id_Barang;
    private Integer Qtt_Barang_Keluar;
    private Date Tanggal_Keluar;

    //Join column id_barang_keluar in database ModelDataBarang
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "id_barang_keluar")
    private List<ModelDataBarang> dataBarangs = new ArrayList<ModelDataBarang>();

}
