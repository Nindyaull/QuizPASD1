import java.util.Scanner;

public class DosenMain_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nidn, nama, jenjangPendidikan, prodi, dummy;
        int tahunMasuk;
        System.out.print("Masukkan Jumlah Data: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Dosen_22[] arrayOfDosen = new Dosen_22[jumlah];

        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan Data Dosen Ke-" + (i+1));
            System.out.print("Masukkan NIDN             : ");
            nidn = sc.nextLine();
            System.out.print("Masukkan Nama             : ");
            nama = sc.nextLine();
            System.out.print("Jenjang Pendidikan(S2/S3) : ");
            jenjangPendidikan = sc.nextLine();
            System.out.print("Program Studi             : ");
            prodi = sc.nextLine();
            System.out.print("Tahun Masuk               : ");
            dummy = sc.nextLine();
            tahunMasuk = Integer.parseInt(dummy);
            System.out.println("------------------------------------------------");

            arrayOfDosen[i] = new Dosen_22(nidn, nama, tahunMasuk, jenjangPendidikan, prodi); 
        }

        int i = 1;
        for (Dosen_22 dsn : arrayOfDosen) {
            System.out.println("Data Dosen Ke-" + i);
            dsn.tampilkanInfo();
            i++;
        }

        System.out.println("--- UBAH DATA DOSEN ---");
        System.out.print("Ubah prodi dosen ke-: ");
        int pilih = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan Prodi Baru: ");
        String prodiBaru = sc.nextLine();
        arrayOfDosen[pilih-1].ubahProdi(prodiBaru);
        System.out.print("Masukkan Jenjang Pendidikan Baru: ");
        String jenjangBaru = sc.nextLine();
        arrayOfDosen[pilih-1].ubahPendidikan(jenjangBaru);

        System.out.println("\n--- DATA DOSEN SETELAH DIUBAH ---");
        int j = 1;
        for (Dosen_22 dsn : arrayOfDosen) {
            System.out.println("Data Dosen Ke-" + j);
            dsn.tampilkanInfo();
            j++;
        }
    }
}
