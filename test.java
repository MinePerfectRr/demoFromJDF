package com.lyj.hwod;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
//       chooseWay(4,1,1,10);
        Scanner scanner=new Scanner(System.in);
        int way=scanner.nextInt();
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        int z=scanner.nextInt();
        chooseWay(way,x,y,z);

    }

    public static void chooseWay(int way,int x,int y,int z){
        switch (way){
            case 1 -> System.out.println(x*8+y*13 );
            case 2  -> System.out.println(x*8+y*13+z*20);
            case 3  -> System.out.println(x*8+y*13*0.8+z*20);
            case 4  -> System.out.println((x*8+y*13+z*20)-(x*8+y*13+z*20)/100*10);
            default -> System.out.println("请输入正确切存在的方案！" );
        }

    }
}
