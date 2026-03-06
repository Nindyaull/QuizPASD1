public class MataKuliah_22 {
    String kodeMK;
    String namaMK;
    int sks;
    Dosen_22[] dosenPengampu = new Dosen_22[3];
    int jumlahDosen = 0;

    public MataKuliah_22(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    public void tampilkanInfo() {
        System.out.println("Kode Matkul          : " + kodeMK);
        System.out.println("Nama Matkul          : " + namaMK);
        System.out.println("Jumlah SKS           : " + sks);

        System.out.println("Dosen Pengampu:");
        for (int i = 0; i < jumlahDosen; i++) {
            dosenPengampu[i].tampilkanInfo();
        }
    }

    public void ubahNamaMK(String nmMK) {
        namaMK = nmMK;
    }

    public void ubahSKS(int updtSKS) {
        if (updtSKS >= 2) {
            sks = updtSKS;
            System.out.println("SKS berhasil diubah!");
        } else {
            System.out.println("SKS tidak boleh kurang dari 2!");
        }
    }

    public void tambahDosen(Dosen_22 dosen) {
        dosenPengampu[jumlahDosen] = dosen;
        jumlahDosen++;
    }
}