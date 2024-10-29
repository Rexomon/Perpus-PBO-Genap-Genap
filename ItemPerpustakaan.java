// Kelas induk untuk Item Perpustakaan
abstract class ItemPerpustakaan {
    protected String id;
    protected String judul;
    protected String penerbit;
    protected int tahunTerbit;

    public ItemPerpustakaan(String id, String judul, String penerbit, int tahunTerbit) {
        this.id = id;
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
    }

    // Abstract method yang harus diimplementasi oleh kelas anak
    public abstract String getInfo();
}
