package com.ohgiraffers.section03.increment;

public class Application1 {

    public static void main(String[] args) {

        /*
        증감연산자
        피연산자의 앞 or 뒤에 사용 가능
        ++ : 1 증가의 의미
        -- : 1 감소의 의미
         */
        // 목차1. 증감연산자 단독 사용
        // 단항으로 사용될 때는 1증가/1감소의 의미를 가짐
        int num = 20;
        System.out.println("num : " + num);

        num++;  // 1이 증가
        System.out.println("num : " + num);

        ++num;
        System.out.println("num : " + num);

        num--; // 1이 감소
        System.out.println("num : " + num);

        --num;
        System.out.println("num : " + num);

        // 증감연산자를 다른 연산자와 사용
        /*
        주의사항
        증감연산자는 다른 연산자와 함께 사용할 때 의미가 달라짐
        다른 연산자와 함께 사용할 때 증감 연산자의 의미
        num++ : 다른 연산 먼저 진행하고 마지막에 피연산자 값 1 증가
        ++num : 피연산자의 값을 먼저 1 증가시킨 후 다른 연산 진행

         */

        int firstNum = 20;
        int result = firstNum++ * 3;
        System.out.println("result " + result);
        System.out.println("firstNum " + firstNum);

        int secondNum = 20;
        int result1 = ++secondNum * 3;

        System.out.println("result1 = " + result1);
        System.out.println("secondNum = " + secondNum);

        int num1 = 10;
        int result2 = --num1 * 3;
        System.out.println("result2 = " + result2);
        System.out.println("num1 = " + num1);

        int num2 = 10;
        int result3 = num2-- * 3;
        System.out.println("result3 = " + result3);
        System.out.println("num2 = " + num2);

    }
}