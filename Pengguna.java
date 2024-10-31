// Kelas induk untuk Pengguna
// Abstract sehingga tidak bisa diinstansiasi langsung, maka harus diimplementasi oleh kelas anak
abstract class Pengguna {
    protected String id;
    protected String nama;
    protected String alamat;
    protected String noTelp;

    public Pengguna(String id, String nama, String alamat, String noTelp) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
    }

    public String getStatus() {
        return "Status tidak diketahui";
    }
}
