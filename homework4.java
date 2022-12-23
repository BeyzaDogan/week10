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

public class homework4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("küçük harflerle bir kelime giriniz:");
        String txt = input.nextLine();
        char[] sesli = {'a', 'e', 'i', 'o', 'u'};
        char[] sessiz = {'r', 't', 'p', 'z', 'm', 'n', 's', 'k', 'f', 'g', 'h', 'c', 'd', 'v', 'y','j','q','w','b'};
        String txt1 = "";
        String txt2 = "";//metinsel yapıda olduğundan int gibi =0 demiyoruz
        for (int i = 0; i < txt.length(); i++) {
            
        for (int j = 0; j < sesli.length; j++) {
                if (txt.charAt(i)==sesli[j]) {
                txt1 += txt.charAt(i);

                }}}
               for(int i=0;i<txt.length();i++){
                 for (int k= 0; k< sessiz.length; k++) {
                if (txt.charAt(i)==sessiz[k]) {
                txt2 += txt.charAt(i);

                }}
            }
        

        System.out.println("seslilerden oluşan yeni kelime: " + txt1);
        System.out.println("sessizlerden oluşan yeni kelime:" + txt2);

    
}}
