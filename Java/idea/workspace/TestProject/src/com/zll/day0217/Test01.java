package com.zll.day0217;

import java.util.Date;
import java.util.Scanner;

/**
 * @Auther: zll
 * @Date: 2021/2/17 - 21:59
 * @Description: com.zll.day0217
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.print("请输入姓名：");
        String name = input.next();

        System.out.println(new Date());
        System.out.println();

        int  i = 10;
        System.out.println(Integer.toBinaryString(i));//以字符串的形式输出 i 的二进制数

    }
}
