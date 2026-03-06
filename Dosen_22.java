public class Dosen_22 {
    String nidn;
    String nama;
    int tahunMasuk;
    String jenjangPendidikan;
    String prodi;

    public Dosen_22(String nidn, String nama, int tahunMasuk, String jenjangPendidikan, String prodi) {
        this.nidn = nidn;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.jenjangPendidikan = jenjangPendidikan;
        this.prodi = prodi;
    }

    public void tampilkanInfo() {
        System.out.println(" NIDN              : " + nidn);
        System.out.println("Nama               : " + nama);
        System.out.println("Tahun Masuk        : " + tahunMasuk);
        System.out.println("Jenjang Pendidikan : " + jenjangPendidikan);
        System.out.println("Program Studi      : " + prodi);
        System.out.println("------------------------------------------------");
    }

    public void ubahProdi(String prodi2) {
        prodi = prodi2;
    }

    public void ubahPendidikan(String jenjang) {
        jenjangPendidikan = jenjang;
    }
}
