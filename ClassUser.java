ublic class User {
    private String idUser;
    private String nama;

public User(String idUser, String nama){
    this.idUser = idUser;
    this.nama = nama;
}
public void login(){
    System.out.println("Berhasil Login");
}

public void logout(){
    System.out.println("Berhasil Keluar");
}
}
