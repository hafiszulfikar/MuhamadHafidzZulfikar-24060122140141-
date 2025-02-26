public class MataKuliah {
    private String idMatKul, nama;
    private int sks;

    public MataKuliah(String id, String nama, int sks) {
        this.idMatKul = id;
        this.nama = nama;
        this.sks = sks;
    }

    public int getSks() {
        return sks;
    }

    public String getNama() {
        return nama;
    }
}
