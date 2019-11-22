package com.example.lib2;
import java.util.Scanner;
public class m20130707 {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        int M, D, S;
        while(cin.hasNextInt()) {
            M = cin.nextInt();
            D = cin.nextInt();
            switch((M*2+D)%3) {
                case 0: System.out.println("普通");break;
                case 1: System.out.println("吉");break;
                default: System.out.println("大吉");break;
            }
        }
    }
}
