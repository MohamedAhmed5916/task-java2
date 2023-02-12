/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taskjava2;
        import java.util.Scanner;

/**
 *
 * @author Home™
 */
public class Taskjava2 {
    public static int func(int x){
        for (int i = 0; i < x; i++) {
                System.out.println("opp");

        }
        return x;
    }
    public static float func(float y){
        System.out.println("multiplication:"+y*3);
        return y;
    }
    public static String func(String y){
        System.out.println("Hello "+y);
        return y;
    }

   public static void AddArray(int[]arr2){
         
        for (int i = 0; i < 4; i++) {
            arr2[i] += 5;
        }
     }
    public static void main(String[] args) {


   
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number from 1 to 7: ");
        int num = input.nextInt();
         if(num>7||num<=0){
             System.out.println("invalid number");}
        String[] week = {"Saturday","Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        int index = num - 1;  
        System.out.println("The day of the week is: " + week[index]);
        switch (index) {
        case 0: // Saturday
        System.out.println("*");
        break;
        case 1,2: // Sunday
        System.out.println("Enter a number (N): ");
        int N = input.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Enter a number: ");
            array[i] = input.nextInt();
        }

        double average = 0;

        for (int i = 0; i < N; i++) {
            average = average+array[i]; 
        }

        average = average/N;

        System.out.println("Average==" + average);

        break; 
         case 3: // Tuesday 
         break; 
         case 4:// Wednesday 
         System.out.println("Enter number of row: "); 
         int row = input.nextInt(); 
           System.out.println("Enter number of colum: "); 
         int col = input.nextInt(); 

         int[][] matrix = new int[row][col]; 
             
         for (int rowIndex = 0; rowIndex <row ; rowIndex++) { 
             for (int colIndex = 0; colIndex < col; colIndex++) { 
                 System.out.println("Enter a number: ");  

                 matrix[rowIndex][colIndex] = input.nextInt();  
             }           
         }  
               
         for (int rowIndex = 0; rowIndex < row; rowIndex++) { 
             for (int colIndex = 0; colIndex < col; colIndex++) {     
                 System.out.print(matrix[rowIndex][colIndex] + " ");
             }     
               System.out.println(); 
           }      
         case 5://thursday
            int[] arr2= new int[4];
             for (int i = 0; i < 4; i++) { 
                 System.out.println("Enter a number of array: ");  
                     arr2[i] = input.nextInt(); 
             } 
               AddArray(arr2);
               for (int i = 0; i < 4; i++) {
                   System.out.print(arr2[i]+" ");
             }
         case 6://friday
             System.out.println("enter number print:");
              Scanner in = new Scanner(System.in);
                 int x=in.nextInt();
                 func(x);
                System.out.println("enter number multiplication:");
                float y=in.nextFloat();
                func(y);
                System.out.println("enter a text:");
                String z=in.next();
                func(z);
                
             

        }

            

    }
   
}
    

