package ohgiraffers.section01.exception;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws Exception {
        System.out.println("가지고 있는 돈은" + money +"원 입니다.");

        if(money >= price) {
            System.out.println("상춤을 구입하기 위한 금액이 충분합니다!!");
        }else {
            /*필기. 강제로 예외를 발생
            *  예외 발생 시키고 헤드에 throws 구문을 추가한다.
            *  예외를 발생시킨 쪽에서는 throws 로 예외에 대한 책임을 위임(너가해라)해서
            *  해당 예외에 대한 처리를 강제화 시킨다*/
            throw new Exception();
        }

    }
}
