import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputDataPenduduk {
    public static void main(String[] args) {
        List<Penduduk> daftarPenduduk = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("=== Aplikasi Input Data Penduduk ===");
            System.out.println("1. Tambah Penduduk");
            System.out.println("2. Tampilkan Daftar Penduduk");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    // Kode untuk tambah penduduk
                    System.out.print("Masukkan nama penduduk: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan umur penduduk: ");
                    int umur = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan alamat penduduk: ");
                    String alamat = scanner.nextLine();

                    Penduduk penduduk = new Penduduk(nama, umur, alamat);
                    daftarPenduduk.add(penduduk);
                    System.out.println("Data penduduk berhasil ditambahkan.");
                    System.out.println();

                    break;
                case 2:
                    // Kode untuk tampilkan daftar penduduk
                    break;
                case 3:
                    // Kode untuk keluar
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    System.out.println();
                    break;
            }
        }

        scanner.close();
    }
}
