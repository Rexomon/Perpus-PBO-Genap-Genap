// Kelas induk untuk Item Perpustakaan
// Abstract sehingga tidak bisa diinstansiasi langsung, maka harus diimplementasi oleh kelas anak
abstract class ItemPerpustakaan {
    protected String idBuku;
    protected String judul;
    protected String penerbit;
    protected int tahunTerbit;

    public ItemPerpustakaan(String idBuku, String judul, String penerbit, int tahunTerbit) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
    }

    // Abstract method yang harus diimplementasi oleh kelas anak
    public abstract String getInfo();
}
