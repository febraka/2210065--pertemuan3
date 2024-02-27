package tugas.pbo.pkg3;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jamMulai, menitMulai, jamKeluar, menitKeluar, selisihMenit, lamaJam, lamaMenit;

        System.out.print("Jam Mulai (Jam, Menit) : ");
        jamMulai = input.nextInt();
        menitMulai = input.nextInt();

        System.out.print("Jam Keluar (Jam, Menit) : ");
        jamKeluar = input.nextInt();
        menitKeluar = input.nextInt();

        selisihMenit = (jamKeluar * 60 + menitKeluar) - (jamMulai * 60 + menitMulai);

        if (jamKeluar < jamMulai) {
            selisihMenit += 12 * 60;
        }

        System.out.println("Lama (menit) : " + selisihMenit);

        lamaJam = selisihMenit / 60;
        lamaMenit = selisihMenit % 60;

        System.out.println("Lama (Jam, Menit) : " + lamaJam  + " jam " + lamaMenit + " menit");

        input.close();
    }
}

