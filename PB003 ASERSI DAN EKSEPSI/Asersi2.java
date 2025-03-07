// Simpan sebagai Asersi2.java
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = -5;
        assert (jariJari > 0) : "Jari-jari harus lebih besar dari 0!";
        double keliling = 2 * Math.PI * jariJari;
        System.out.println("Keliling lingkaran: " + keliling);
    }
}
