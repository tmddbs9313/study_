package ohgiraffers.section02.extend.run;

import ohgiraffers.section02.extend.*;

public class Applicaton02 {
    public static void main(String[] args) {

        /*수업목표, 와일드카드에 대해 이해할 수 있다.*/
        /*필기. 와일드카드(WildCard)
        *  제네릭 클래스 타입으 ㅣ객체를 메소드의 매개변수로 받을 때,
        *  그 객체의 타입 변수를 제한할 수 있다.
        *  <?> : 제한 없음.
        *  <? extends Type> :와일드카드 상한제한(Type과 Type 의 후손을 이용해 생선한 인스턴스만 가능)
        *  <? super Type> :와일드카드 하한제한(Type과 Type 의 부모를 이용해 생선한 인스턴스만 가능)*/

        WildCardFarm wildCardFarm = new WildCardFarm();

//        wildCardFarm.anyType(new RabbitFarm<Mammal>(new Mammal()));  //레빗팜은 extends 타입 제한으로 포우류 못들어옴
//        wildCardFarm.anyType(new RabbitFarm<Reptile>(new Reptile()));  //토끼의 후손이 아니라 xx

        /*어떠한 토끼농장이던 상관없이 매개변수로 사용 가능*/
        wildCardFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        /*bunny 이거나 Bunny 의 후손들만 매개변수로 사용 가능하다.*/
//        wildCardFarm.extendsType(new RabbitFarm<Rabbit>(new Rabbit())); //드런크바니만 받을 수 있도록 설정해놧기때문 와일드카드팜에
        wildCardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        /*Bunny 이거나 Bunny 의 부모들만 매개변수로 사용 가능하다.*/
        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
//        wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));


    }
}
