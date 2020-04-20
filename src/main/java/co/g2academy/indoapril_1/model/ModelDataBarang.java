package co.g2academy.indoapril_1.model;

import jdk.net.SocketFlow;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_data_barang")
@Entity
@EntityListeners(AuditingEntityListener.class)
public class ModelDataBarang implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int Id_Data_Barang;
    private String Nama_Barang;
    private Integer Id_Barang_Masuk;
    private Integer Id_Barang_Keluar;
    private Integer Qtt_Min_Stock;
    private Integer Qtt_Stock;
    private Date Tanggal_Update_Stock;


}
