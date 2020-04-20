package co.g2academy.indoapril_1.response;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class ResponseMasterBarang {
    private int Id_Barang;
    private String Nama_Barang;
    private String Nama_Supplier;
    private String Status;

    public ResponseMasterBarang(int id_Barang,
                                String nama_barang,
                                String Nama_Supplier,
                                String status){
        this.Id_Barang = id_Barang;
        this.Nama_Barang = nama_barang;
        this.Nama_Supplier = Nama_Supplier;
        this.Status = status;
    }
}
