package com.ddo.section02.lopping;

public class Application {
    public static void main(String[] args) {
        A_for a = new A_for();
/* 단독 for문 흐름 확인용 메소드 호출 */
        //a.testSimpleForStatement();
/* 반복문을 사용하는 예제 */
        //a.testForExample1();
        //a.testForExample2();
        //a.testForExample3();
        //a.testForExample4();
        //a.printSimpleGugu();

        /* 반복문을 일상 생활에서 사용하는 예제 */
        A_nestedFor a2 = new A_nestedFor();
/* 중첩 반복문을 사용하는 예제 */
        //a2.printTriangleStars();
        //a2.printGuguFromTwoToNine();
        //a2.printUpgrdeGuguFromTwoToNine();
        //a2.printStarInputRowTime();

        B_while b = new B_while();
        /* 단독 while문 흐름 확인용 메소드 호출 */
    //    b.testSimpleWhileStatement();
     //   b.testWhileExample1();
       // b.testWhileExample2();
       // b.testWhileExample3();
        C_doWhile c =new C_doWhile();
        c.testSimpleDoWhileStatement();
        /* do-while 반복문을 사용하는 예제 */
        c.testDoWhileExample();
    }
}
