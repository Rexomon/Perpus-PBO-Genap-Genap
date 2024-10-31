// Kelas anak dari ItemPerpustakaan
class Buku extends ItemPerpustakaan {
    private String isbn;
    private String penulis;
    private int stok;
    private boolean tersedia;

    // Constructor Overloading
    public Buku(String idBuku, String judul, String penerbit, int tahunTerbit, String isbn, String penulis) {
        super(idBuku, judul, penerbit, tahunTerbit);
        this.isbn = isbn;
        this.penulis = penulis;
        this.stok = 1;
        this.tersedia = true;
    }

    public Buku(String id, String judul, String penerbit, int tahunTerbit, String isbn, String penulis, int stok) {
        this(id, judul, penerbit, tahunTerbit, isbn, penulis);
        this.stok = stok;
    }

    // Override method dari kelas induk
    @Override
    public String getInfo() {
        return "Judul Buku: " + judul + " - Penulis: " + penulis + " (ISBN: " + isbn + ")" + " - Stok: " + stok + " - Penerbit: " + penerbit + " - Tahun Terbit: " + tahunTerbit;
    }

    // Getter dan Setter
    public String getIsbn() {
        return isbn;
    }

    public String getJudul() {
        return judul;
    }

    public boolean isTersedia() {
        return tersedia && stok > 0;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setID(String id) {
        this.idBuku = id;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getStok() {
        return stok;
    }

    public void kurangiStok() {
        if (stok > 0) {
            stok--;
            if (stok == 0) {
                tersedia = false;
            }
        }
    }

    public void tambahStok() {
        stok++;
        tersedia = true;
    }
}
