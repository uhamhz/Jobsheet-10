package SCRIPT;

import java.util.Arrays;
import java.util.Scanner;

public class BioskopWithScanner17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baris, kolom;
        String nama, next, pemilihanMenu;
        String[][] penonton = new String[4][2];
        boolean afterMenu;

        while (true) {
            System.out.println("1.Input Data Penonton\n2.Tampilkan Daftar Penonton\n3.Exit");
            pemilihanMenu = input.nextLine();
            if (pemilihanMenu.equals("1")) {
                while (afterMenu = true) {
                    System.out.print("Masukan Nama : ");
                    nama = input.nextLine();
                    System.out.print("Masukan Baris : ");
                    baris = input.nextInt();
                    System.out.print("Masukan Kolom : ");
                    kolom = input.nextInt();
                    input.nextLine();
                    if (baris > 4 || kolom > 2) {
                        System.out.println("Kursi Tidak Tersedia!");
                        continue;
                    }
                    if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi Sudah Terisi!");
                        afterMenu = true;
                        continue;
                    }
                        penonton[baris - 1][kolom - 1] = nama;

                        System.out.print("Input penonton lainnya? (y/n) : ");
                        next = input.nextLine();

                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                }
            } else if (pemilihanMenu.equals("2")) {
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            penonton[i][j] = "***";
                        }
                    }
                }

                for (int i = 0; i <= 3;i++) {
                    System.out.println("Penonton baris ke-" + (i + 1) + " : " + String.join(", ", penonton[i]));
                    // System.out.println(Arrays.toString(penonton[i]));
                }
            } else if (pemilihanMenu.equals("3")) {
                return;
            }
        }
    }
}
