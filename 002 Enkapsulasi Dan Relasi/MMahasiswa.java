public class MMahasiswa {
    public static void main(String[] args) {
        Dosen dosen = new Dosen("123", "Pak Budi", "Informatika");
        Mahasiswa mhs = new Mahasiswa("2201001", "Aldi", "Informatika");
        Kendaraan motor = new Kendaraan("B1234XYZ", "Motor");
        MataKuliah mk1 = new MataKuliah("IF101", "PBO", 3);
        MataKuliah mk2 = new MataKuliah("IF102", "Struktur Data", 4);

        mhs.setDosenWali(dosen);
        mhs.setKendaraan(motor);
        mhs.addMatKul(mk1);
        mhs.addMatKul(mk2);

        mhs.printDetailMhs();
    }
}
