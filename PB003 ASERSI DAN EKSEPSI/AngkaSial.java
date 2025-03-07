// Simpan sebagai AngkaSial.java
public class AngkaSial {
    public void cekAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException("Angka sial ditemukan!");
        }
        System.out.println(angka + " bukan angka sial.");
    }
    
    public static void main(String[] args) {
        AngkaSial obj = new AngkaSial();
        try {
            obj.cekAngka(10);
            obj.cekAngka(13); // Akan memicu eksepsi
            System.out.println("Program selesai."); // Tidak akan dieksekusi
        } catch (AngkaSialException e) {
            System.out.println("Terjadi eksepsi: " + e.getMessage());
        }
    }
}
