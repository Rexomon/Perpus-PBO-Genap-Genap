// Kelas induk untuk Transaksi

import java.util.Date;

class Transaksi {
    protected String idTransaksi;
    protected Anggota anggota;
    protected Buku buku;
    protected Date tanggalPinjam;
    protected Date tanggalKembali;
    protected boolean statusSelesai;

    public Transaksi(String idTransaksi, Anggota anggota, Buku buku) {
        this.idTransaksi = idTransaksi;
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalPinjam = new Date();
        this.statusSelesai = false;
    }

    public void prosesKembali() {
        this.tanggalKembali = new Date();
        this.statusSelesai = true;
        this.buku.tambahStok();
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public String getTanggalPinjam() {
        return tanggalPinjam.toString();
    }

    public String getTanggalKembali() {
        return tanggalKembali.toString();
    }

    public boolean isStatusSelesai() {
        return statusSelesai;
    }
}
