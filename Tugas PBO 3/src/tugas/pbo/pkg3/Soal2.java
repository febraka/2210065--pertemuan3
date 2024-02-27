package tugas.pbo.pkg3;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan1, bilangan2;
        char operasi;

        System.out.print("Masukkan bilangan pertama: ");
        bilangan1 = input.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        bilangan2 = input.nextInt();

        System.out.print("Masukkan operasi aritmatika (+, -, *, /, %) : ");
        operasi = input.next().charAt(0);

        switch(operasi) {
            case '+':
                System.out.printf("Hasil penjumlahan %d dan %d adalah: %d\n", bilangan1, bilangan2, bilangan1 + bilangan2);
                break;
            case '-':
                System.out.printf("Hasil pengurangan %d dan %d adalah: %d\n", bilangan1, bilangan2, bilangan1 - bilangan2);
                break;
            case '*':
                System.out.printf("Hasil perkalian %d dan %d adalah: %d\n", bilangan1, bilangan2, bilangan1 * bilangan2);
                break;
            case '/':
                if (bilangan2 != 0)
                    System.out.printf("Hasil pembagian %d dan %d adalah: %.2f\n", bilangan1, bilangan2, (float)bilangan1 / bilangan2);
                else
                    System.out.println("Pembagian dengan nol tidak diperbolehkan.");
                break;
            case '%':
                if (bilangan2 != 0)
                    System.out.printf("Hasil modulus %d dan %d adalah: %d\n", bilangan1, bilangan2, bilangan1 % bilangan2);
                else
                    System.out.println("Modulus dengan nol tidak diperbolehkan.");
                break;
            default:
                System.out.println("operasi yang dimasukkan tidak valid.");
        }
    }
}