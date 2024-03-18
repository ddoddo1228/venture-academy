package com.ddo.section05.typecasting;

public class Application01 {
    public static void main(String[] args) {
        /* 데이터 형변환 */
        /* 데이터 형변환이 필요한 이유
        * - 자바에서 다른 타입끼리의 연산은 피연산자들이 모두 같은 타입인 경우 실행할 수 있다.
        * - 즉, 같은 데이터 타입끼리만 연산을 수행할 수 있다.
        * */

        /* 형변환의 종류와 규칙
        * 1. 자동형변환 (묵시적 형변환) : 컴파일러가 자동으로 수행해주는 타입 반환
        * 1-1. 작은 자료형에서 큰 자료형으로는 자동 형변환 된다.
        * 1-2. 정수는 실수로 자동 형변환 된다.
        * 1-3. 문자형은 int형에서 자동 형변환 된다.
        * 1-4. 논리형은 형변환 규칙에서 제외된다.
        * 2. 강제형변환(명시적 형변환): 형변환(casting) 연산자를 이용한 강제적으로 수행하는 형변환
        * 2-1. 자동형변환이 적용되지 않는 경우 강제 형변환이 필요하다.
        * */

        /* 1. 자동형변환 규칙 테스트
        /* 1-1. 작은 자료형에서 큰 자료형으로는 자동 형변환 된다. */
        /* 작은 자료형에서 큰 자료형으로 공간만 옮기는 경우 데이터 손실이 발생하지 않기 때문에 컴파일러가 자동으로 처리해준다. */
        /* 1-1-1. 정수끼리의 자동 형변환 */
        /* 점점 더 큰 자료형으로 데이터를 옮겨도 문제 없이 자동 형변환 처리 된다. */
        byte bnum = 1;
        short snum = bnum;
        int inum = snum;
        long lnum = inum;

        /* 연산 시에도 자동으로 큰 쪽 자료형에 맞춰서 계산한다. */
        int num1 = 1;
        long num2 = 20;

//        int result1 = num1 + num2;
        long result1 = num1 +num2;

        System.out.println("result1 : " + result1);

        /* 1-1-2. 실수 끼리의 자동 형변환 */
        float fnum = 4.0f;
        double dnum = fnum;

        /* 연산 시에도 자동으로 큰 쪽 자료형에 맞춰서 계산된다. */
        double result2 = fnum + dnum;

        /* 1-2. 정수는 실수로 자동 형변환 된다. */
        /* 정수를 실수로 변경할 때 소수점 자리수가 없어도 실수형태로 표현이 가능하다. 이 때 데이터 손실이 없기 때문에 자동 형변환이 가능하다. */
//        long eight = 8888888888888888;

        long eight = 8;
        float four = eight;

        System.out.println("four: " +four);

        /* 따라서 실수와 정수의 연산은 실수로 연산 결과가 반호나된다. */
        float result3 = eight + four;

        System.out.println("result3 : " + result3);

        /* 1-3. 문자형은 int 형으로 자동 형변환 된다. */
        char ch = 'a';
        int charNumber = ch;

        System.out.println("charNumber : " + charNumber);

        /* int로 type이 정해지지 않은 리터럴 형태의 정수는 char형 변수에 기록 가능하다. */
        char ch2 = 65;
        System.out.println("ch2: " + ch2);

        /* 1-4. 논리형은 형변환 규칙에서 제외된다. */
        /* 어느 자료형이든 boolean을 형변환 해서 담을 수 없다. */
        boolean isTrue = true;
//        byte b = isTrue;
//        short s = isTrue;
//        int i = isTrue;
//        long l = isTrue;
//        char c = isTrue;
//        float f = isTrue;
//        double d = isTrue;
    }
}
