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

public class homework3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner input = new Scanner(System.in);
            System.out.println(" bir kelime giriniz:");
            String txt=input.nextLine();
            int n=txt.length();
            for(int i=n/2;i>=0;i--){
            System.out.print(txt.charAt(i));
             }
            for(int j=n-1;j>=n/2+1;j--){
            System.out.print(txt.charAt(j));

           
            }
                
                
                
            
            }


    }
    

