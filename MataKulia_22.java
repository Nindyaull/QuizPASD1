import java.util.Scanner;

public class MataKulia_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kodeMK, namaMK, dummy;
        int sks;

        System.out.print("Masukkan Jumlah Data: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        MataKuliah_22[] arrayMK = new MataKuliah_22[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan Data Mata Kuliah Ke-" + (i+1));

            System.out.print("Kode MK  : ");
            kodeMK = sc.nextLine();

            System.out.print("Nama MK  : ");
            namaMK = sc.nextLine();

            System.out.print("SKS      : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);

            arrayMK[i] = new MataKuliah_22(kodeMK, namaMK, sks);

            System.out.print("Jumlah Dosen Pengampu: ");
            int jumlahDosen = sc.nextInt();
            sc.nextLine();

            for (int j = 0; j < jumlahDosen; j++) {
                System.out.println("Masukkan Data Dosen Ke-" + (j+1));

                System.out.print("NIDN              : ");
                String nidn = sc.nextLine();

                System.out.print("Nama              : ");
                String nama = sc.nextLine();

                System.out.print("Jenjang Pendidikan: ");
                String jenjang = sc.nextLine();

                System.out.print("Program Studi     : ");
                String prodi = sc.nextLine();

                System.out.print("Tahun Masuk       : ");
                int tahun = sc.nextInt();
                sc.nextLine();

                Dosen_22 dsn = new Dosen_22(nidn, nama, tahun, jenjang, prodi);

                arrayMK[i].tambahDosen(dsn);
            }
        }

        System.out.println("\n=== DATA MATA KULIAH ===");
        int i = 1;
        for (MataKuliah_22 mk : arrayMK) {
            System.out.println("\nData Mata Kuliah Ke-" + i);
            mk.tampilkanInfo();
            i++;
        }
    }
}