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

public class homework5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("bir kelime giriniz:");
        String txt = input.nextLine();
        int n = txt.length() / 2;
        for (int i = 0; i < txt.length(); i++) {

            System.out.print(txt.charAt(i + n));
            System.out.print(txt.charAt(n - i - 1));

        }

    }

}
