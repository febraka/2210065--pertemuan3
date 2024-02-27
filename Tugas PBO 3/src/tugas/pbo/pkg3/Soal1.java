package tugas.pbo.pkg3;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        double bilangan = scanner.nextDouble();

        int depanKoma = (int) bilangan;
        int belakangKoma = (int) (bilangan * 100) % 100;

        boolean depan = depanKoma % 3 == 0;
        boolean belakang = belakangKoma % 3 == 0;

        if (depan && belakang) {
            System.out.println("Angka di depan koma dan di belakang koma adalah kelipatan 3");
        } else if (depan) {
            System.out.println("Angka di depan koma adalah kelipatan 3, angka di belakang koma bukan kelipatan 3");
        } else if (belakang) {
            System.out.println("Angka di depan koma bukan kelipatan 3, angka di belakang koma adalah kelipatan 3");
        } else {
            System.out.println("Angka di depan koma dan di belakang koma bukan kelipatan 3");
        }
    }
}
