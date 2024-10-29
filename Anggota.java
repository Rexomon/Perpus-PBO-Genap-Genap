// Kelas anak dari Pengguna

import java.util.Date;

class Anggota extends Pengguna {
    private String idAnggota;
    private Date tanggalBergabung;
    private boolean statusAktif;

    public Anggota(String id, String nama, String alamat, String noTelp, String idAnggota) {
        super(id, nama, alamat, noTelp);
        this.idAnggota = idAnggota;
        this.tanggalBergabung = new Date();
        this.statusAktif = true;
    }

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
