/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.asprak.ima.pkg1;

import java.util.*;
/**
 *
 * @author Unknown
 */
public class TestAsprakIMA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String word, reverse = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan kata : ");
        
        word = sc.nextLine();
        int length = word.length();
        for ( int i = length - 1; i >= 0; i-- )
        {
            reverse = reverse + word.charAt(i);
        }
        if (word.equals(reverse))
        {
            System.out.println("Kata " + word + " merupakan kata palindrom");
        }
        else
        {
            System.out.println("Kata " + word + " bukan kata palindrom");
        }
      }
    
}
