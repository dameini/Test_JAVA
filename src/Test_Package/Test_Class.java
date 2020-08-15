package Test_Package;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Test_Class {
    public static void main(String[] args) {
        System.out.println("java");

        double randNum = Math.random();// 生成一个随机数
        System.out.println(randNum);

        System.out.println("输入");
        Scanner in = new Scanner(System.in);
        // String str = in.nextLine();
        // System.out.println(str);

        int[] intArray = new int[6];
        intArray[0] = 2;
        intArray = new int[intArray.length + 10];
        int c = intArray.length;
        System.out.println(c);

    }
}
