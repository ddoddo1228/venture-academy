package com.ddo.section01.literal;

public class Application01 {
    public static void main(String[] args) {
        System.out.println();
       /* 여러가지 값의 형태를 출력해보자 */
        /* 1. 숫자 형태의 값
        * 1-1. 정수 형태의 값
        * 1-2. 실수 형태의 값
        * 2. 문자 형태의 값
        * 3. 문자열 형태의 값
        * 4. 논리 형태의 값 */

        /* 1. 숫자 형태의 값 */
        /* 2. 정수 형태의 값 출력 */
        System.out.println(123);

        /* 1-2. 실수 형태의 값 */
        System.out.println(1.23);

        /* 2. 문자 형태의 값 출력 */
        System.out.println('a');    //문자 형태의 값은 홑따옴표(single-quotation)으로 감싸줘야 한다.
//        System.out.println('ab'); //두개 이상은 문자로 취급하지 않기 때문에 에러 발생
//        System.out.println('');   //아무 문자도 기록되지 않는 경우도 에러 발생
        System.out.println('1');    //숫자 값이지만 홑따옴표로 감싸져있는 경우 문자 '1'이라고 판단

        /* 3. 문자열 형태의 값 */
        System.out.println("안냐세요"); //문자열은 문자 여러개가 나열된 형태, 쌍따옴표(double-quotation)으로 감싸줘야 한다.
        System.out.println("123");      //정수 이지만 쌍따옴표로 감싸져 있기 때문에 문자열로 보아야 한다.
        System.out.println("");         //아무 값도 없는 빈 쌍따옴표도 문자열로 취급한다.
        System.out.println("a");        //한 개의 문자도 쌍따옴표로 감싸면 문자열이다. (문자 a와 다르다)

        /* 4. 논리 형태의 값 */
        System.out.println(true);       //true 혹은 false를 논리형이라고 한다.
        System.out.println(false);
    }
}
