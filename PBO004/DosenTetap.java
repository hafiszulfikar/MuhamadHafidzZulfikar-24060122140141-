import java.time.LocalDate;


class DosenTetap extends Dosen {
    private final int BUP = 65;

    public DosenTetap(String nip, String nid, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String jabatan, String fakultas) {
        super(nip, nid, nama, tanggalLahir, tmt, gajiPokok, jabatan, fakultas);
    }

    public int hitungTunjangan() {
        return (int) (0.02 * hitungMasaKerjaTahun() * gajiPokok);
    }

    public LocalDate hitungBUP() {
        return tanggalLahir.plusYears(BUP).plusMonths(1);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Masa Kerja: " + hitungMasaKerjaTahun() + " tahun " + hitungMasaKerjaBulan() + " bulan");
        System.out.println("BUP: " + formatTanggal(hitungBUP()));
        System.out.println("Tunjangan: 2% x " + hitungMasaKerjaTahun() + " x Rp " + String.format("%,.2f", gajiPokok).replace(',', '.') + " = Rp. " + String.format("%,.2f", (double) hitungTunjangan()).replace(',', '.'));
    }
}