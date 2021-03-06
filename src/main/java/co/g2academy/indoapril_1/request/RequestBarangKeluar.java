package co.g2academy.indoapril_1.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestBarangKeluar {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int Id_Barang_Keluar;
    private Integer Id_Barang;
    private Integer Qtt_Barang_Keluar;
    private Date Tanggal_Keluar;
}
