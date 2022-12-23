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

public class homework8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        String[] secenek = {"tas", "kagit", "makas"};
        System.out.println("seçiminizi yapın: makas(0) taş(1) kağıt(2)");
        int kullanıcı = input.nextInt();

        int pc = (int) (Math.random() * 3);

        if (secenek[kullanıcı] == "tas" && secenek[pc] == "tas") {
            System.out.println("sonuç berabere");
        }
        if (secenek[kullanıcı] == "tas" && secenek[pc] == "kagit") {
            System.out.println("kaybettiniz");
        }
        if (secenek[kullanıcı] == "tas" && secenek[pc] == "makas") {
            System.out.println("siz kazandınız tebrikler");

        }
        if (secenek[kullanıcı] == "kagit" && secenek[pc] == "kagit") {
            System.out.println("sonuç berabere");

        }

        if (secenek[kullanıcı] == "kagit" && secenek[pc] == "tas") {
            System.out.println("siz kazandınız tebrikler");
        }
        if (secenek[kullanıcı] == "kagit" && secenek[pc] == "makas") {
            System.out.println("kaybettiniz");
        }
        if (secenek[kullanıcı] == "makas" && secenek[pc] == "makas") {
            System.out.println("sonuç berabere");
        }
        if (secenek[kullanıcı] == "makas" && secenek[pc] == "kagit") {
            System.out.println("siz kazandınız tebrikler");
        }
        if (secenek[kullanıcı] == "makas" && secenek[pc] == "tas") {

            System.out.println("kaybettiniz");
        }

    }
}
