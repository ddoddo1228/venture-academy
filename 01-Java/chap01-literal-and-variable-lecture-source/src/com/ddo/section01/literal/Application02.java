package com.ddo.section01.literal;

public class Application02 {
    public static void main(String[] args) {
        /* 값을 직접 연산하여 출력할 수 있다.
        * 이 때 값의 형태에 따라 사용할 수 있는 연산자의 종류와 연산의 결과가 달라진다 */

        /* 1. 숫자와 숫자의 연산
        * 1.1 정수와 정수의 연산 */
        System.out.println("=======정수와 정수의 연산=======");
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10);
        System.out.println(123 / 10);
        System.out.println(123 % 10);   //모드(mod) 연산 -> 두 수를 나눈 나머지를 반환

        /* 2. 실수와 실수의 연산 */
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 10.0);

        /* 2. 문자의 연산 */
        /* 문자는 숫자로 인식된다. 따라서 숫자의 사용 가능한 연산이 전부 사용 가능하다 */
        System.out.println("==========문자와 문자의 연산===========");
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        /* 문자와 정수의 연산 */
        /* 문자에 정수 연산도 가능
        * 이 쯤 되면 문자 a는 숫자 97과 같다라는 것을 알 수 있다.
        * 컴퓨터는 문자를 인식하지 못하고 숫자로만 인식할 수 있기 때문에, 모든 문자에 대응되는 숫자들이 매칭 되어 있다.*/
        System.out.println("============문자와 정수의 연산=============");
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 1);
        System.out.println('a' / 1);
        System.out.println('a' % 1);

        /* 2-3. 문자와 실수의 연산 */
        /* 실수도 숫자이기 때문에 정수의 연산처럼 모든 연산이 가능하다. */
        /* 단 결과는 실수 형태로 나오게 된다. */
        System.out.println("============문자와 실수의 연산============");
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 1.0);
        System.out.println('a' / 1.0);
        System.out.println('a' % 1.0);
        /* 3. 문자열의 연산
        * 3-1. 문자열과 문자열의 연산
        * 문자열과 문자열의 '+' 연산 결과는 문자열 합치기(문자열 이어붙이기)가 된다.
        * 문자열은 '+' 연산 외에 다른 연산을 사용하지 못한다. */
        System.out.println("==============문자열과 문자열의 연산==========");
        System.out.println("hello"+"world");
//        System.out.println("hello"-"world");
//        System.out.println("hello"*"world");
//        System.out.println("hello"/"world");
//        System.out.println("hello"%"world");

        /* 3-2. 문자열과 다른 형태의 값 연산 */
        /* 문자열과의 연산은 '+' 연산만 가능하다. */
        /* 연산 결과는 다른 형태의 값들도 문자열로 취급하여 문자열 이어붙이기(문자열 합치기) 결과가 나오게 된다. */
        System.out.println("===========문자열과 다른 형태의 값 연산=========");
        /* 3-2-1. 문자열과 정수의 연산 */
        System.out.println("helloworld" + 123);
        /* 3-2-2. 문자열과 실수의 연산 */
        System.out.println("helloworld" + 123.456);
        /* 3-2-3. 문자열과 문자의 연산 */
        System.out.println("helloworld" + 'a');
        /* 3-2-4. 문자열과 논리값의 연산 */
        System.out.println("helloworld" + true);

        /* 주의 사항 : 숫자로 된 문자열 형태의 값은 '+' 연산의 결과가 문자열 합치기 결과가 되는 것에 주의하자 */
        System.out.println("==============문자열 형태의 숫자 값 '+' 연산===========");
        System.out.println("123"+"456");

        /* 논리값 연산 */
        /* 4-1 논리값과 논리값의 연산 */
        /* 논리값 끼리의 연산은 모든 연산자 사용이 불가능하다. */
//        System.out.println(true + false);
//        System.out.println(true - false);
//        System.out.println(true * false);
//        System.out.println(true / false);
//        System.out.println(true % false);

        /* 4-2. 논리값과 정수의 연산 */
        /* 논리값과 정수의 연산은 모든 연산자 사용이 불가능하다. */
//        System.out.println(true + 1);
//        System.out.println(true - 1);
//        System.out.println(true * 1);
//        System.out.println(true / 2);
//        System.out.println(true % 2);

        /* 4-3. 논리값과 실수의 연산 */
        /* 논리값과 실수의 연산은 모든 연산자 사용이 불가능하다. */
//        System.out.println(true + 1.0);
//        System.out.println(true - 1.0);
//        System.out.println(true * 1.0);
//        System.out.println(true / 1.0);
//        System.out.println(true % 1.0);

        /* 4-4. 논리값과 문자의 연산 */
        /* 논리값과 문자의 연산은 모든 연산자 사용이 불가능하다. */
        /* 이유는, 문자는 내부적으로 숫자 취급을 하기 떄문에 결국 논리값과 연산과 동일한 의미이다. */
//        System.out.println(true + 'a');
//        System.out.println(true - 'a');
//        System.out.println(true * 'a');
//        System.out.println(true % 'a');
//        System.out.println(true / 'a');

        /* 4-5. 논리값과 문자열의 연산 */
        /* 논리값과 문자열의 연산은 '+' 연산만 사용 가능하다. */
        /* 이유는, 위에서 테스트 해 본 문자열 합치기가 되는 원리와 동일하다. */
        System.out.println("==========논리와 문자열의 연산=============");
//        System.out.println(true + 'a');
//        System.out.println(true - 'a');
//        System.out.println(true * 'a');
//        System.out.println(true % 'a');
//        System.out.println(true / 'a');
    }
}
