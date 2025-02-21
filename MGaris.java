public class MGaris {
    public static void main(String[] args) {
        Titik t1 = new Titik(-2, 0);
        Titik t2 = new Titik(0, 4);
        Garis g1 = new Garis(t1, t2);

        g1.printGaris();
        System.out.println("Panjang garis: " + g1.getPanjang());
        System.out.println("Gradien garis: " + g1.getGradien());
        System.out.println("Titik tengah: (" + g1.getTengah().getX() + ", " + g1.getTengah().getY() + ")");
        System.out.println("Persamaan garis: " + g1.getPersamaanGaris());

        Titik t3 = new Titik(1, 2);
        Titik t4 = new Titik(3, 6);
        Garis g2 = new Garis(t3, t4);

        System.out.println("\nApakah g1 sejajar dengan g2? " + g1.isSejajar(g2));
        System.out.println("Jumlah garis yang dibuat: " + Garis.getCounterGaris());
    }
}
