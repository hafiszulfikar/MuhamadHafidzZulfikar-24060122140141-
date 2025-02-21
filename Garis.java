// Program   : Garis
// NIM/Nama  : 24060122140141/MuhamadHafidzZulfikar
// Tanggal   : 21/2/2025
//**********************************//

class Titik {
    private int x, y;

    public Titik() {
        this.x = 0;
        this.y = 0;
    }

    public Titik(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
}

class Garis {
    private Titik awal, akhir;
    private static int counterGaris = 0;

    public Garis() {
        this.awal = new Titik(0, 0);
        this.akhir = new Titik(1, 1);
        counterGaris++;
    }

    public Garis(Titik awal, Titik akhir) {
        this.awal = awal;
        this.akhir = akhir;
        counterGaris++;
    }

    public Titik getAwal() { return awal; }
    public Titik getAkhir() { return akhir; }
    public void setAwal(Titik awal) { this.awal = awal; }
    public void setAkhir(Titik akhir) { this.akhir = akhir; }
    public static int getCounterGaris() { return counterGaris; }

    public double getPanjang() {
        return Math.sqrt(Math.pow(akhir.getX() - awal.getX(), 2) + Math.pow(akhir.getY() - awal.getY(), 2));
    }

    public double getGradien() {
        if (akhir.getX() == awal.getX()) throw new ArithmeticException("Gradien tidak terdefinisi (garis vertikal)");
        return (double) (akhir.getY() - awal.getY()) / (akhir.getX() - awal.getX());
    }

    public Titik getTengah() {
        return new Titik((awal.getX() + akhir.getX()) / 2, (awal.getY() + akhir.getY()) / 2);
    }

    public boolean isSejajar(Garis g) {
        return this.getGradien() == g.getGradien();
    }

    public boolean isTegakLurus(Garis g) {
        return this.getGradien() * g.getGradien() == -1;
    }

    public void printGaris() {
        System.out.println("Garis dari (" + awal.getX() + ", " + awal.getY() + ") ke (" + akhir.getX() + ", " + akhir.getY() + ")");
    }

    public String getPersamaanGaris() {
        double m = getGradien();
        double c = akhir.getY() - m * akhir.getX();
        return "y = " + m + "x + " + c;
    }
}
