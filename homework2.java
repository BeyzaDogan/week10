/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Excalibur
 */
// komut kullanmadan harf büyüklüğü değiştirme
import java.util.Scanner;

public class homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(" rastgele büyüklükte harflerle bir kelime giriniz:");
        String txt = input.nextLine();
        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) >= 65 && txt.charAt(i) <= 90) {
                System.out.print((char) (txt.charAt(i) + 32));//harf dönüşümü için bir diğer yol 32 eklemek veya çıkarmak çünkü A ie a arasında 32 fark var
            } else {
                System.out.print((char) (txt.charAt(i) - 32));

            }
        }

    }

}
