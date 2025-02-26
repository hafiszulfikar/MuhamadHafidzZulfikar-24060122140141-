public class Mahasiswa {
    private String nim, nama, prodi;
    private MataKuliah[] listMatKul = new MataKuliah[50];
    private int jumlahMatKul = 0;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosen) {
        this.dosenWali = dosen;
    }

    public void setKendaraan(Kendaraan k) {
        this.kendaraan = k;
    }

    public void addMatKul(MataKuliah mk) {
        listMatKul[jumlahMatKul] = mk;
        jumlahMatKul++;
    }

    public int getJumlahSKS() {
        int total = 0;
        for (int i = 0; i < jumlahMatKul; i++) {
            total += listMatKul[i].getSks();
        }
        return total;
    }

    public void printDetailMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Dosen Wali: " + dosenWali.getNama());
        if (kendaraan != null) {
            System.out.println("Kendaraan: " + kendaraan.getJenis());
        }
        System.out.println("Mata Kuliah: ");
        for (int i = 0; i < jumlahMatKul; i++) {
            System.out.println("- " + listMatKul[i].getNama());
        }
        System.out.println("Total SKS: " + getJumlahSKS());
    }
}
