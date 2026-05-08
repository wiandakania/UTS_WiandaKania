public class Pelanggan extends User{
    private String tanggal;

public Pelanggan(String idUser, String nama, String tanggal){
    super(idUser, nama);
    this.tanggal = tanggal;
}
public void pilihMenu(){
    System.out.println("Tampilkan menu yang bisa dipesan");
}
public void pesanMenu(){
    System.out.println("Menu yang dipesan");
}
}
