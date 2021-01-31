package org.epamAssignment;
import java.util.*;
//Author :-  RohitKalluri
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1:");
        int x1=sc.nextInt();
        System.out.println("Enter number 2:");
        int x2=sc.nextInt();
        System.out.println("CALCULATOR MENU");
        System.out.println("press 0 to exit\npress 1 to add\npress 2 to subtract\npress 3 to multiply\npress 4 to divide\npress 5 to display result\n");
        boolean flag=false;
        int input;
        functions fun=new functions();
        int res=-999;
        do{
            System.out.println("Please Enter your choice:");
            input=sc.nextInt();
            switch(input)
            {
                case 5:
                    System.out.println("End Result is: "+res);
                    res=0;
                    break;
                case 1:
                res= fun.add(x1,x2);
                 break;
                case 2:
                   res= fun.subtract(x1,x2);
                    break;
                case 3:
                  res=  fun.multiply(x1,x2);
                    break;
                case 4:
                   res= fun.divide(x1,x2);
                    break;
                case 0:
                    flag=true;
                    break;
                default:
                    System.out.println("Please Enter correct choice!");
            }
        }while(flag!=true);
        System.out.println("ended!");
        sc.close();
    }
}
