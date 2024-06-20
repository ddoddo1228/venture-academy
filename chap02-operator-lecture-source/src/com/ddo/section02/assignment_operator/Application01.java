package com.ddo.section02.assignment_operator;

public class Application01 {
    public static void main(String[] args) {
        /* 대입 연산자와 산술 복합 대입 연산자 */
        /* '=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 대입함
        '+=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 더한 결과를 왼쪽의 피연산자에 대입함
        '-=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 뺀 결과를 왼쪽의 피연산자에 대힙함
        '*=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 곱한 결과를 왼쪽의 피연산자에 대힙함
        '/=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 결과를 왼쪽의 피연산자에 대힙함
        '%=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 나머지 결과를 왼쪽의 피연산자에 대힙함
        * */
        int num = 12;
        System.out.println("num ; " + num);

        num = num +3;
        System.out.println("num ; " + num);

        num+=3;
        System.out.println("num ; " + num);

        num-=3;
        System.out.println("num ; " + num);

        num*=3;
        System.out.println("num ; " + num);

        num/=3;
        System.out.println("num ; " + num);

        /* 주의! 산술 복합 대입연산자 순서에 주의해야한다. */
        num =-3;
        System.out.println("num ; " + num);

    }
}
