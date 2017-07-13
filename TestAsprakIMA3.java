/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.asprak.ima.pkg3;
import java.util.*;

/**
 *
 * @author Unknown
 */
public class TestAsprakIMA3 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int arrayInt[] = new int[10];
           Scanner sc = new Scanner(System.in);
           System.out.println("Masukan 10 angka : ");
           for(int i = 0 ; i < 10 ; i ++){
               System.out.print("Angka ke " + (i+1) +" : ");
               arrayInt[i] = sc.nextInt();
           }
           
           System.out.println("Sebelum Sorting : ");
           for(int i = 0 ; i < 10 ; i ++){
               System.out.print(arrayInt[i] + ", ");
           }
           
           int n = arrayInt.length;  
           int temp = 0;  
           for(int i=0; i < n; i++){
               for(int j=1; j < (n-i); j++){  
                   if(arrayInt[j-1] > arrayInt[j]){   
                        temp = arrayInt[j-1]; 
                        arrayInt[j-1] = arrayInt[j];  
                        arrayInt[j] = temp;  
                    }  
                }  
           }
           
           System.out.println("\nSetelah sorting (Bubble Sort) : ");
           for(int i = 0 ; i < 10 ; i ++){
               System.out.print(arrayInt[i] + ", ");
           }
           
           List<Integer> number = new ArrayList<>();
           
           int tempo = 0;
           for(int i = 0 ; i < 10 ; i ++){
               if(tempo!=arrayInt[i]){
                   tempo = arrayInt[i];
                   number.add(tempo);
               }
           }
           
           System.out.println("\nSetelah menghilangkan angka duplikat : ");
           for(int i = 0 ; i < number.size() ; i ++){
               System.out.print(number.get(i) + ", ");
           } 
    }
    
}
