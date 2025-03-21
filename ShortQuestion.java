/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shortquestion;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ThinkPad
 */
public class ShortQuestion {

    public static void nhapMang(int[] a, Scanner scanner) {
        System.out.println("Nhap mang :");
        for (int i = 0; i < a.length; i++) {

            a[i] = scanner.nextInt();
        }
    }

    public static void xuatMang(int[] a) {
        System.out.println("Mang: " + Arrays.toString(a));
    }

    public static void xapXep(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("Mang giam dan: " + Arrays.toString(a));
    }

    public static void soChan(int[] a) {
        boolean find = false;
        for (int num : a) {
            if (num % 2 == 0) {

                System.out.println(num + " la so chan ");
                find = true;
            }
        }
        if (!find) {
            System.out.println(" ko thay so chan");
        } else {
            System.out.println();
        }
    }

    public static void soLe(int[] a) {
        boolean find = false;
        for (int num : a) {
            if (num % 2 == 1) {

                System.out.println(num + " la so le ");
                find = true;
            }
        }
        if (!find) {
            System.out.println(" ko thay so le");
        } else {
            System.out.println();
        }
    }

    public static void max(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Max: " + max);
    }

    public static void chia7(int[] a) {
        int total = 0;
        for (int n : a) {
            if (n % 7 == 0) {
                total += n;
            }
        }
        System.out.println("KQ: " + total);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhap sl ptu: ");
            n = scanner.nextInt();
        } while (n < 1 || n > 100);
        int[] a = new int[n];
        nhapMang(a, scanner);
        xuatMang(a);
        xapXep(a);
        soChan(a);
        soLe(a);
        max(a);
        chia7(a);
    }
}
