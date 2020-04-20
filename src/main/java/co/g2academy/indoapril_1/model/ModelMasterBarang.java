package co.g2academy.indoapril_1.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_master_barang")
@Entity
@EntityListeners(AuditingEntityListener.class)
public class ModelMasterBarang implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int Id_Barang;
    private String Nama_Barang;
    private String Nama_Supplier;
    private String Status;

    //Join column id_barang in database ModelBarangMasuk
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "id_barang")
    private List<ModelBarangMasuk> modelBarangMasuks = new ArrayList<ModelBarangMasuk>();


    //Join column id_barang in database ModelBarangMasul
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "id_barang")
    private List<ModelBarangKeluar> modelBarangKeluars = new ArrayList<ModelBarangKeluar>();


    //Join column nama_barang in database ModelDataBarang
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "id_barang")
    private List<ModelDataBarang> dataBarangs = new ArrayList<ModelDataBarang>();





    public ModelMasterBarang(int Id_Barang, String Nama_Barang, String Nama_Supplier, String Status){
        this.Id_Barang = Id_Barang;
        this.Nama_Barang = Nama_Barang;
        this.Nama_Supplier = Nama_Supplier;
        this.Status = Status;
    }
}
