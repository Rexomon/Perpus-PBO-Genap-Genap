import java.util.ArrayList;

public class Perpustakaan {
    //Enkapsulasi karena menggunakan private variabel
    private String nama;
    private String alamat;
    private ArrayList<Buku> daftarBuku;
    private ArrayList<Anggota> daftarAnggota;
    private ArrayList<Transaksi> daftarTransaksi;

    // Constructor
    public Perpustakaan(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.daftarBuku = new ArrayList<>();
        this.daftarAnggota = new ArrayList<>();
        this.daftarTransaksi = new ArrayList<>();
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Method untuk mengelola buku, anggota dan transaksi
    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
        System.out.println("Buku " + buku.getJudul() + " berhasil ditambahkan");
    }

    public void tambahAnggota(Anggota anggota) {
        daftarAnggota.add(anggota);
        System.out.println("Anggota " + anggota.getNama() + " berhasil didaftarkan");
    }

    public void tambahTransaksi(Transaksi transaksi) {
        daftarTransaksi.add(transaksi);
    }

    // Method untuk menampilkan daftar buku, anggota dan transaksi
    public void daftarBuku() {
        System.out.println("Daftar Buku:");
        for (Buku buku : daftarBuku) {
            System.out.println(buku.getInfo());
        }
    }

    public void daftarAnggota() {
        System.out.println("Daftar Anggota:");
        for (Anggota anggota : daftarAnggota) {
            System.out.println(anggota.getNama() + " (" + anggota.getStatus() + ")" + " - Bergabung pada " + anggota.getTanggalBergabung() + " - ID: " + anggota.getIdAnggota() + " - Alamat: " + anggota.getAlamat() + " - No. Telp: " + anggota.getNoTelp());
        }
    }

    public void daftarTransaksi() {
        System.out.println("Daftar Transaksi:");
        for (Transaksi transaksi : daftarTransaksi) {
            System.out.println("ID Transaksi: " + transaksi.getIdTransaksi());
        }
    }

    // Method untuk mencari buku, anggota dan transaksi
    public Buku cariBuku(String isbn) {
        for (Buku buku : daftarBuku) {
            if (buku.getIsbn().equals(isbn)) {
                return buku;
            }
        }
        return null;
    }

    public Anggota cariAnggota(String idAnggota) {
        for (Anggota anggota : daftarAnggota) {
            if (anggota.getIdAnggota().equals(idAnggota)) {
                return anggota;
            }
        }
        return null;
    }

    public Transaksi cariTransaksi(String idTransaksi) {
        for (Transaksi transaksi : daftarTransaksi) {
            if (transaksi.getIdTransaksi().equals(idTransaksi)) {
                return transaksi;
            }
        }
        return null;
    }
}
