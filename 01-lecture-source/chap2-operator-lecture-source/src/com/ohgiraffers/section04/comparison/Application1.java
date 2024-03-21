package com.ohgiraffers.section04.comparison;

public class Application1 {

    public static void main(String[] args) {
        // 비교연산자
        /*
        비교연산자는 피연산자 사이에 상대적은 크기를 판단해 참 혹은 거짓을 반환
        연산자중 참 혹은 거짓을 반환하는 연산자는 삼항연산자의 조건식이나 조건문의 조건절에 많이 사용
        (충분한 연습 필요)
         */

        /*
        비교연산자의 종류
        == : 왼쪽의 피연산자와 오른쪽의 피연산자가 같으면 true 다르면 false 반환
        != : 왼쪽의 피연산자와 오른쪽의 피연산자가 다르면 true 같으면 false 반환
        > : 왼쪽의 피연산자가 오른쪽의 피연산자보다 크면 true 작으면 false
        >= : 왼쪽의 피연산자가 오른쪽의 피연산자보다 크거나 같으면 true 아니면 false 반환
        < : 왼쪽의 피연산자가 오른쪽의 피연산자보다 작으면 true 아니면 false
        <= : 왼쪽의 피연산자가 오른쪽의 피연산자보다 작거나 같으면 true 아니면 false
         */

        // 1. 숫자값 비교
        // 1-1 정수비교
        int inum1 = 10;
        int inum2 = 20;

        System.out.println("============정수 값 비교============");
        System.out.println("inum1과 inum2가 같은지 비교 : " + (inum1 == inum2));
        System.out.println("inum1과 inum2가 다른지 비교 : " + (inum1 != inum2));
        System.out.println("inum1이 inum2보다 큰지 비교 : " + (inum1 > inum2));
        System.out.println("inum1이 inum2보다 크거나 같은지 비교 : " + (inum1 >= inum2));
        System.out.println("inum1이 inum2보다 작은지 비교 : " + (inum1 < inum2));
        System.out.println("inum1이 inum2보다 작거나 같은지 비교 : " + (inum1 <= inum2));

        double dnum1 = 10.0;
        double dnum2 = 20.0;

        System.out.println("============정수 값 비교============");
        System.out.println("dnum1과 dnum2가 같은지 비교 : " + (dnum1 == dnum2));
        System.out.println("dnum1과 dnum2가 다른지 비교 : " + (dnum1 != dnum2));
        System.out.println("dnum1이 dnum2보다 큰지 비교 : " + (dnum1 > dnum2));
        System.out.println("dnum1이 dnum2보다 크거나 같은지 비교 : " + (dnum1 >= dnum2));
        System.out.println("dnum1이 dnum2보다 작은지 비교 : " + (dnum1 < dnum2));
        System.out.println("dnum1이 dnum2보다 작거나 같은지 비교 : " + (dnum1 <= dnum2));

        // 2. 문자값 비교
        char ch1 = 'a';
        char ch2 = 'A';

        System.out.println("============문자 값 비교=============");
        System.out.println("ch1과 ch2가 같은지 비교 : " + (ch1 == ch2));
        System.out.println("ch1과 ch2가 다른지 비교 : " + (ch1 != ch2));
        System.out.println("ch1과 ch2가 큰지 비교 : " + (ch1 > ch2));
        System.out.println("ch1과 ch2가보다 크거나 같은지 비교 : " + (ch1 >= ch2));
        System.out.println("ch1과 ch2가보다 작은지 비교 : " + (ch1 < ch2));
        System.out.println("ch1과 ch2가보다 작거나 같은지 비교 : " + (ch1 <= ch2));

        // 3. 논리값 비교
        // ==과 !=은 비교 가능하지만 대소비교는 불가능
        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println("============논리값 비교=============");
        System.out.println("bool1과 bool2가 같은지 비교 : " + (bool1 == bool2));
        System.out.println("bool1과 bool2가 같지 않은지 비교 : " + (bool1 != bool2));

        // 4. 문자열의 값 비교
        // 문자열도 ==과 !=는 가능하지만 대소비교는 불가능
        String str1 = "집가고싶당";
        String str2 = "집가고싶당";

        System.out.println("============문자열 비교=============");
        System.out.println("str1과 str2가 같은지 비교 : " + (str1 == str2));
        System.out.println("str1과 str2가 같지 않은지 비교 : " + (str1 != str2));

        int x = 10;
        int y = 11;

        boolean result =  x <= y;
        System.out.println("x가 y보다 작거나 같은지 비교 : " + result );
    }
}
