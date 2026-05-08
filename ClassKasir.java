public class Kasir extends user {
    private String shift;

    public Kasir(String idUser, String nama, String shift) {
        super(idUser, nama);
        this.shift = shift;
    }

    public void cekStok() {
        System.out.println("Tampilkan menu yang tersedia");
    }

    public void cekPembayaran() {
        System.out.println("Tampilkan Pembayaran");
    }
}
