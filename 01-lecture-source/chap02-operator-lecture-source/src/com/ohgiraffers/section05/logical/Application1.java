package com.ohgiraffers.section05.logical;

import java.sql.SQLOutput;

public class Application1 {

    public static void main(String[] args) {

        /*
        수업목표. 논리연산자에 대해 이해하고 활용할 수 있다.
        논이 연산자
        논리값 (true or false) 를 취급하는 연산자이다.

        논리연산자 종류
        1. 논리 연결 연산자 : 두개의 피연산자를 가지는 이항 연산자이며 연산자의 결함 방향 왼쪽에서 오른쪽
                            두개의 논리식을 판단하여 참과 거짓을 판단
        1-1. && 논리(AND)연산자 : 두개의 논리식이 모두 참일경우 참을 반환. 둘중에 한개라도 거짓이면 거짓 반환
        1-2. || 논리(OR)연산자 : 두개의 논리식중 둘중 하나라도 참인경우 참 반환 둘다 거짓일경우 거짓 반환
        2. 논리 부정 연산자 : 피연산자가 하나인 단향연산자로 피연산자의 결함 방향은 왼쪽에서 오른쪽
        2-1. ! 논리(NOT)연산자 : 논리의 결과가 참이면 거짓을, 거짓이면 참을 반환
         */

        // 논리 연산자 결과값 확인
        System.out.println("true와 true의 논리 and 연산" + (true && true));
        System.out.println("true와 false의 논리 and 연산" + (true && false));
        System.out.println("false와 true의 논리 and 연산" + (false && true));
        System.out.println("false와 false의 논리 and 연산" + (false && false));

        System.out.println("==============================");
        System.out.println("true와 true의 논리 or 연산" + (true || true));
        System.out.println("true와 false의 논리 or 연산" + (true || false));
        System.out.println("false와 true의 논리 or 연산" + (false || true));
        System.out.println("false와 false의 논리 or 연산" + (false || false));

        // 2. 논리식에 논리연산자 활용

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        System.out.println("a가 b보다 작으면서 c가 d보다 작은지 확인 : " + (a < b && c < d));
        System.out.println("a가 b보다 작으면서 c가 d보다 큰지 확인 : " + (a < b && c > d));
        System.out.println("a가 b보다 크면서 c가 d보다 작은지 확인 : " + (a > b && c < d));
        System.out.println("a가 b보다 크면서 c가 d보다 큰지 확인 : " + (a > b && c > d));

        System.out.println("a가 b보다 작거나 c가 d보다 작은지 확인 : " + (a < b || c < d));
        System.out.println("a가 b보다 작거나 c가 d보다 큰지 확인 : " + (a < b || c > d));
        System.out.println("a가 b보다 크거나 c가 d보다 작은지 확인 : " + (a > b || c < d));
        System.out.println("a가 b보다 크거나 c가 d보다 큰지 확인 : " + (a > b || c > d));

    }
}