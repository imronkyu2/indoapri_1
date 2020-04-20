package co.g2academy.indoapril_1.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestDataBarang {
    private int Id_Data_Barang;
    private String Nama_Barang;
    private Integer Id_Barang_Masuk;
    private Integer Id_Barang_Keluar;
    private Integer Qtt_Min_Stock;
    private Integer Qtt_Stock;
    private Date Tanggal_Update_Stock;
}
