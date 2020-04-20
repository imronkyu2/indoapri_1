package co.g2academy.indoapril_1.response;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@Builder
@NoArgsConstructor
public class ResponseDataBarang {
    private int Id_Data_Barang;
    private String Nama_Barang;
    private Integer Id_Barang_Masuk;
    private Integer Id_Barang_Keluar;
    private Integer Qtt_Min_Stock;
    private Integer Qtt_Stock;
    private Date Tanggal_Update_Stock;

    public ResponseDataBarang(int Id_Data_Barang,
                              String Nama_Barang,
                              Integer Id_Barang_Masuk,
                              Integer Id_Barang_Keluar,
                              Integer Qtt_Min_Stock,
                              Integer Qtt_Stock,
                              Date Tanggal_Update_Stock){
        this.Id_Data_Barang = Id_Data_Barang;
        this.Nama_Barang = Nama_Barang;
        this.Id_Barang_Masuk = Id_Barang_Masuk;
        this.Id_Barang_Keluar = Id_Barang_Keluar;
        this.Qtt_Min_Stock = Qtt_Min_Stock;
        this.Qtt_Stock = Qtt_Stock;
        this.Tanggal_Update_Stock = Tanggal_Update_Stock;
    }
}
