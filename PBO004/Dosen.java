import java.time.LocalDate;

class Dosen extends Pegawai {
    protected String fakultas;

    public Dosen(String nip, String nid, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String jabatan, String fakultas) {
        super(nip, nid, nama, tanggalLahir, tmt, gajiPokok, jabatan);
        this.fakultas = fakultas;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas: " + fakultas);
    }
}