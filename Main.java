// Kelas utama yang mengelola seluruh sistem perpustakaan

// Main class untuk testing

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            // Inisialisasi perpustakaan/Instance
            Scanner input = new Scanner(System.in);
            Perpustakaan perpus = new Perpustakaan("Perpustakaan Digital", "Jl. Contoh No. 123");
            System.out.println("Selamat datang di " + perpus.getNama());
            System.out.println("Alamat: " + perpus.getAlamat());

            int pilihan;
            do {
            System.out.println("====================================");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tambah Anggota");
            System.out.println("3. Peminjaman Buku");
            System.out.println("4. Pengembalian Buku");
            System.out.println("5. Lihat Daftar Buku");
            System.out.println("6. Lihat Daftar Anggota");
            System.out.println("7. Lihat Daftar Transaksi");
            System.out.println("8. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = input.nextInt();

            input.nextLine();
            System.out.println("====================================");

                if(pilihan == 1){
                    // Tambah buku
                    Buku buku1 = new Buku("B001", "Java Programming", "Penerbit A", 2023, "ISBN-001", "John Doe", 3);

                    System.out.print("Masukkan judul buku: ");
                    buku1.setJudul(input.nextLine());

                    System.out.print("Masukkan ID buku: ");
                    buku1.setID(input.nextLine());

                    System.out.print("Masukkan penerbit buku: ");
                    buku1.setPenerbit(input.nextLine());

                    System.out.print("Masukkan tahun terbit buku: ");
                    buku1.setTahunTerbit(input.nextInt());
                    input.nextLine();

                    System.out.print("Masukkan ISBN buku: ");
                    buku1.setIsbn(input.nextLine());

                    System.out.print("Masukkan penulis buku: ");
                    buku1.setPenulis(input.nextLine());

                    System.out.print("Masukkan stok buku: ");
                    buku1.setStok(input.nextInt());

                    perpus.tambahBuku(buku1);
                }

                if(pilihan == 2){
                    // Tambah anggota
                    Anggota anggota1 = new Anggota("A001", "Jane Smith", "Jl. Pembaca No. 45", "08123456789", "MEMBER-001");

                    System.out.print("Masukkan nama anggota: ");
                    anggota1.setNama(input.nextLine());

                    System.out.print("Masukkan ID anggota: ");
                    anggota1.setIdAnggota(input.nextLine());

                    System.out.print("Masukkan alamat anggota: ");
                    anggota1.setAlamat(input.nextLine());

                    System.out.print("Masukkan nomor telepon anggota: ");
                    anggota1.setNoTelp(input.nextLine());

                    perpus.tambahAnggota(anggota1);
                }

                if(pilihan == 3){
                    // Peminjaman buku
                    System.out.print("Masukkan ID anggota: ");
                    String idAnggota = input.nextLine();
                    Anggota anggota1 = perpus.cariAnggota(idAnggota);

                    System.out.print("Masukkan ISBN buku: ");
                    String isbn = input.nextLine();
                    Buku buku1 = perpus.cariBuku(isbn);

                    if (buku1.isTersedia() && anggota1.isStatusAktif()) {
                        System.out.println("Tambah ID transaksi: ");
                        String idTransaksi = input.nextLine();

                        Transaksi transaksi1 = new Transaksi(idTransaksi, anggota1, buku1);
                        buku1.kurangiStok();
                        perpus.tambahTransaksi(transaksi1);

                        System.out.println("Nama Peminjam: "+ anggota1.getNama() + buku1.getInfo() +" Tanggal Peminjaman: " + transaksi1.getTanggalPinjam());
                    }
                }

                if (pilihan == 4) {
                    // Pengembalian buku
                    System.out.print("Masukkan ID transaksi: ");
                    String idTransaksi = input.nextLine();
                    Transaksi transaksi1 = perpus.cariTransaksi(idTransaksi);

                    if (transaksi1 != null) {
                        transaksi1.prosesKembali();
                        System.out.println("Pengembalian berhasil: " + transaksi1.getIdTransaksi() + " Tanggal Kembali: " + transaksi1.getTanggalKembali());
                    }
                }

                if (pilihan == 5) {
                    //Lihat daftar buku
                    perpus.daftarBuku();
                }

                if (pilihan == 6) {
                    //Lihat daftar anggota
                    perpus.daftarAnggota();
                }

                if (pilihan == 7) {
                    //Lihat daftar transaksi
                    perpus.daftarTransaksi();
                }
            } while (pilihan != 8);

            input.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
