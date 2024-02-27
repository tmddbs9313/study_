package ohgiraffers.section02.userexception;

import ohgiraffers.section02.userexception.exception.PriceNegativeException;

import java.util.regex.PatternSyntaxException;

public class Application01 {

    public static void main(String[] args) {

        /*수업목표. 사용자 정의의 예외 클래스를 정의 후 발생한 사용자 정의의 예외를 처리할 수 있다.*/

        /*필기. 사전에 정의된 예외 클래스 외에 개발자가 원하는 명칭의 예외 클래스를 작성하는 것이 가능하다.
        *  extends Exception 으로 예외 처리 클래스를 상속받아 더 구체적인 예외 이름을 정의하는 것이다.*/

        ExceptionTest et = new ExceptionTest();

        try {
            //상춤의 가격을 음수로 입력한 경우
//            et.checkEnoughMoney(-50000,500000);
            //가진 돈을 음수로 입력하는 경우
//            et.checkEnoughMoney(50000,-10000);

            //가진 돈이 상품의 가격보다 적을 때
//            et.checkEnoughMoney(50000,10000);

            //정상적으로 구매가 가능한 경우
            et.checkEnoughMoney(10000,50000);


        }catch (Exception e){
            throw new RuntimeException(e);

        }
    }
}
