// Kelas induk untuk Pengguna
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

    public abstract String getStatus();
}
