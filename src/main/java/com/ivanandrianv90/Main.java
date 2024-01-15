package com.ivanandrianv90;

public class Main {
    public static void main(String[] args) {
        int x = 15;
        int y = 40;
        int z = 22;
        int q = 10;
        String paramsFirst = "green";
        String paramsSecond = "dragon";
        String parmsThird = "blue";
        double dobleFirst = 1.13;
        float floatFirst = 6.3F;


        System.out.println("x + y = " + (x + y));
        System.out.println("paramsFirst + paramsSecond = " + paramsFirst+paramsSecond);
        System.out.println("paramsFirst space paramsSecond = " + paramsFirst + " " + paramsSecond);
        System.out.println("q + floatFirst = " + q + floatFirst);
        System.out.println("q + dobleFirst = " + q + dobleFirst);
        System.out.println("floatFirst + dobleFirst = " + floatFirst + dobleFirst);
        System.out.println("x - y = " + (x - y));
        System.out.println("floatFirst - dobleFirst = " + (floatFirst - dobleFirst));
        System.out.println("x * y = " + (x * y));
        System.out.println("dobleFirst * y = " + (dobleFirst * y));
        System.out.println("floatFirst * y = " + (floatFirst * y));
        System.out.println("y / q = " + (y / q));
        System.out.println("x / dobleFirst = " + (x / dobleFirst));
        System.out.println("x / floatFirst = " + (x / floatFirst));
        System.out.println("q % x = " + (q % x));
        System.out.println("z % q = " + (z % q));
        System.out.println("floatFirst % x = " + (floatFirst % x));
        System.out.println("dobleFirst % x = " + (dobleFirst % x));
        System.out.println("+x = " + +x);
        System.out.println("-x = " + -x);
        System.out.println("x++ = " + (x++)); //15
        System.out.println("++x = " + (++x)); //17
        System.out.println("x-- = " + (x--)); //17
        System.out.println("q-- = " + (q--)); //10
        System.out.println("q-- = " + (q--)); //9
        System.out.println("x == y = " + (x == y)); //false
        System.out.println("x == y = " + (!(x == y))); //true
        System.out.println("x != y = " + (x != y));
        System.out.println("x < y = " + (x < y));
        System.out.println("x > y = " + (x > y));
        System.out.println("x >= y = " + (x >= y));
        System.out.println("x <= y = " + (x <= y));

        boolean t = true;
        boolean f = false;
        int first = 1;
        int second = 2;

        System.out.println("true && false = " + (t && f)); // false
        System.out.println((first == 6) && (second == 9)); // false
        System.out.println((first == 6) && (second == 2)); // false
        System.out.println((first == 1) && (second == 2)); //true
        System.out.println((first == 1) && (second == 9)); // false
        System.out.println(!((first == 6) && (second == 2))); // true


        System.out.println("true || false = " + (t || f)); // true
        System.out.println((first == 6) || (second == 9)); // false
        System.out.println((first == 6) || (second == 2)); // true
        System.out.println((first == 1) || (second == 2)); //true
        System.out.println((first == 1) || (second == 9)); // true
        System.out.println(!((first == 6) || (second == 2))); // false

        //Ternary

        System.out.println((first == 10)
            ? "false"
                : "true");


        //istanceof
        String helloJava = "first";
        System.out.println(helloJava instanceof String); // true


        //Error

        //System.out.println(first/0);

        //int aInt = 0;
        //System.out.println(aInt instanceof Integer);


        //Overflow
        //int intOver = 4294967296;
        //System.out.println(intOver + 1);

        //String nullTest = null;
        //if (nullTest.length() != 5) {
        //    System.out.println("Done");
        //};

    }
}
