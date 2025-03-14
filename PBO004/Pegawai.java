import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class Pegawai {
    protected String nip;
    protected String nid;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;
    protected String jabatan;

    public Pegawai(String nip, String nid, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String jabatan) {
        this.nip = nip;
        this.nid = nid;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
        this.jabatan = jabatan;
    }

    public long hitungMasaKerjaTahun() {
        return ChronoUnit.YEARS.between(tmt, LocalDate.now());
    }

    public long hitungMasaKerjaBulan() {
        return ChronoUnit.MONTHS.between(tmt, LocalDate.now()) % 12;
    }

    public void printInfo() {
        System.out.println("NIP: " + nip);
        System.out.println("NIDN: " + nid);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + formatTanggal(tanggalLahir));
        System.out.println("TMT: " + formatTanggal(tmt));
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji Pokok: Rp " + String.format("%,.2f", gajiPokok).replace(',', '.'));
    }

    protected String formatTanggal(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        return date.format(formatter);
    }
}
