package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// проверка на соответствие строки шаблону
        System.out.println("Ћабораторна€ работа є2.\n" +
                "¬ыполнила студентка «»Ќ–б - 41 „ерникова Ћюбовь.\n" +
                "ѕроверить €вл€етс€ ли заданна€ строка шестизначным числом, записанным в дес€тичной системе счислени€ без нулей в старших разр€дах.\n" +
                "ѕример правильных выражений: 123456, 234567.\n" +
                "ѕример неправильных выражений: 1234567, 12345.");
        Scanner in = new Scanner(System.in);
        System.out.print("¬ведите шестизначное число, записанное в дес€тичной системе счислени€ без нулей в старших разр€дах");
        String num = in.next();
        //System.out.println(num);

        Pattern p1 = Pattern.compile("[1-9]{6}");
        Matcher m1 = p1.matcher(num);
        boolean b = m1.matches();
        if(b==true)
        {
            System.out.println("«аданное число €вл€етс€ шестизначным, " +
                    "записанным в дес€тичной системе счислени€ без нулей в старших разр€дах");
        }
        else System.out.println("«аданное число не €вл€етс€ шестизначным, " +
                "записанным в дес€тичной системе счислени€ без нулей в старших разр€дах");

        in.close();
    }
}
