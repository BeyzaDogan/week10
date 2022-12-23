/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Excalibur
 */
import java.util.Scanner;
import java.util.Random;

public class homework1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("küçük harflerle bir cümle giriniz:");
        String txt = input.nextLine();
        int a;
        for (int i = 0; i < txt.length(); i++) {
            char h = txt.charAt(i);
            Random rastgele = new Random();
            a = rastgele.nextInt(100);
            if (a % 2 == 0) {
                System.out.print(Character.toUpperCase(txt.charAt(i)));

            } else {
                System.out.print(Character.toLowerCase(txt.charAt(i)));

            }
        }

    }

}
