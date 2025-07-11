package com.github.hcsp.datatype;

// 修复compare方法，使得main方法不再抛出空指针异常

// 比较一个int和一个Integer是否相等
// 当且仅当它们代表的整数相等时，此方法返回true
// 不要修改本方法参数的类型

public class Main {

    public static void main(String[] args) {
        System.out.println(compare(123, 456));
        System.out.println(compare(123, 123));
        System.out.println(compare(123, null));
    }


    public static boolean compare(int a, Integer b) {
        Integer integerI = a;
        if (integerI.equals(b)) {
            return a == b;
        }
        else{
            return false;
        }
    }
}
