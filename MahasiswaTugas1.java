import java.util.ArrayList;
import java.util.Scanner;

class Mahasiswa {
    String nama;
    String nim;
    String jenisKelamin;
    double ipk;

    public Mahasiswa(String nama, String nim, String jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }
}

public class MahasiswaTugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        int jumlahMahasiswa;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline dari input sebelumnya

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Masukkan jenis kelamin (P/L): ");
            String jenisKelamin = scanner.nextLine().toUpperCase(); // Konversi ke huruf besar
            System.out.print("Masukkan IPK: ");
            double ipk = scanner.nextDouble();
            scanner.nextLine(); // Membersihkan newline dari input sebelumnya

            Mahasiswa mahasiswa = new Mahasiswa(nama, nim, jenisKelamin, ipk);
            daftarMahasiswa.add(mahasiswa);
        }

        System.out.println("\nData Mahasiswa:");

        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            Mahasiswa mahasiswa = daftarMahasiswa.get(i);
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("Nama: " + mahasiswa.nama);
            System.out.println("NIM: " + mahasiswa.nim);
            System.out.println("Jenis Kelamin: " + (mahasiswa.jenisKelamin.equals("P") ? "Perempuan" : "Laki-laki"));
            System.out.println("IPK: " + mahasiswa.ipk);
            System.out.println("----------------------");
        }

        // Hitung rata-rata IPK
        double totalIpk = 0;
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            totalIpk += mahasiswa.ipk;
        }
        double rataRataIpk = totalIpk / jumlahMahasiswa;

        System.out.println("\nRata-rata IPK: " + rataRataIpk);

        scanner.close();
    }
}
