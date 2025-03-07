// Simpan sebagai ExceptionOnArray.java
public class ExceptionOnArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        try {
            System.out.println(array[5]); // Mengakses indeks yang tidak ada
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Indeks di luar batas array!");
        }
    }
}
