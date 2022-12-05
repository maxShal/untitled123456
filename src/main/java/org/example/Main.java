package org.example;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String s = in.nextLine();
        System.out.println("Введите количество итераций");
        int N = in.nextInt();
        in.skip("\n");
        System.out.println(StringProcessor.StringCopy(s,N));
        System.out.println("ведите вторую строку");
        String str2 = in.nextLine();
        System.out.println("Количествоо вхождений первой второй строки в первую = "+ StringProcessor.quantity(s,str2));
        System.out.println("Введите строку чисел");
        String str3 = in.nextLine();
        System.out.println(StringProcessor.StringChange(str3));
        System.out.println("Введите новую строку");
        StringBuilder strin = new StringBuilder(in.nextLine());
        System.out.println(StringProcessor.StringDelete(strin));


    }
}