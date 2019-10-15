package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// �������� �� ������������ ������ �������
        System.out.println("������������ ������ �2.\n" +
                "��������� ��������� ����� - 41 ��������� ������.\n" +
                "��������� �������� �� �������� ������ ������������ ������, ���������� � ���������� ������� ��������� ��� ����� � ������� ��������.\n" +
                "������ ���������� ���������: 123456, 234567.\n" +
                "������ ������������ ���������: 1234567, 12345.");
        Scanner in = new Scanner(System.in);
        System.out.print("������� ������������ �����, ���������� � ���������� ������� ��������� ��� ����� � ������� ��������");
        String num = in.next();
        //System.out.println(num);

        Pattern p1 = Pattern.compile("[1-9]{6}");
        Matcher m1 = p1.matcher(num);
        boolean b = m1.matches();
        if(b==true)
        {
            System.out.println("�������� ����� �������� ������������, " +
                    "���������� � ���������� ������� ��������� ��� ����� � ������� ��������");
        }
        else System.out.println("�������� ����� �� �������� ������������, " +
                "���������� � ���������� ������� ��������� ��� ����� � ������� ��������");

        in.close();
    }
}
