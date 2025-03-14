import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DosenTetap dosen = new DosenTetap("9545647548", "78647324", "Andi", LocalDate.of(1990, 5, 5), LocalDate.of(2015, 1, 1), 5000000.00, "Dosen Tetap", "Fakultas Sains dan Matematika");
        dosen.printInfo();
    }
}
