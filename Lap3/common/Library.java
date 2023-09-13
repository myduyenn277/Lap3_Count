package Lap3.common;

import java.util.Scanner;


public class Library {
    protected Scanner sc;
    public Library(){
        sc  = new Scanner(System.in);
    }
    
    public String getString(String m){
        System.out.println(m);
        return sc.nextLine();
    }
    
        public int getInt(String p, int m, int n) {
        int a = -1;
        while (true) {
            System.out.print(p + ": ");
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if (a >= m && a <= n) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a number between " + m + " and " + n);
            }
        }
        return a;
    }
   
   
    }
   




