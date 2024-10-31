// Kelas anak dari Pengguna

import java.util.Date;

class Anggota extends Pengguna {
    private Date tanggalBergabung;
    private boolean statusAktif;

    public Anggota(String idAnggota, String nama, String alamat, String noTelp) {
        super(idAnggota, nama, alamat, noTelp);
        this.tanggalBergabung = new Date();
        this.statusAktif = true;
    }

    //Merupakan method override dari kelas induk
    @Override
    public String getStatus() {
        return statusAktif ? "Aktif" : "Tidak Aktif";
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public String getNama() {
        return nama;
    }

    public Date getTanggalBergabung() {
        return tanggalBergabung;
    }

    public void setIdAnggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public boolean isStatusAktif() {
        return statusAktif;
    }

    public void setStatusAktif(boolean statusAktif) {
        this.statusAktif = statusAktif;
    }
}
