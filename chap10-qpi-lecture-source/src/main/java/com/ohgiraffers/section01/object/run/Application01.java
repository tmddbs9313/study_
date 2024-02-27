package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

public class Application01 {

    public static void main(String[] args) {

        /*수업목표. object 클래스의 toString() 메소드 오버라이딩 목적을 이해하고 활용.*/
        /*필기. 모든 클래스는 Object 클래스의 후손이다.
        *  따라서 Object 클래스가 가진 메소드를 자신의 것 처럼 사용할 수 있다.
        *  또한 부모 클래스가 가지는 메소드를 오버라이딩 해서 사용하는 것도 가능하다.
        *
        * 필기. Object 클래스의 메소드 중 관례상 가장 많이 사용하는 메소드들이 있다.
        *  toString(), equals(), hashcode()이다.*/

        Book book1 = new Book(1,"홍길동전","허균",50000);  //alt-enter눌럿더니 바뀜.
        Book book2 = new Book(2,"목민심서","적약용",30000);  //alt-enter눌럿더니 바뀜.
        Book book3 = new Book(2,"목민심서","적약용",40000);  //alt-enter눌럿더니 바뀜.

        /*필기. toString() 을 호출하지 않고 레퍼런스변수 (boo1,2,3)만 출력하는 경우에도
           동일하게 결과가 나오게된다. 이 경우 자동으로 toString() 메소드를 호출해준다.
        *  그래서 이런 편리한 점을 이용해서 toString() 메소드를 재정의(오버라이딩)해서 사용한다.*/

        System.out.println(book1.toString());  //toString 숨어있음.
        System.out.println(book2);
        System.out.println(book3);




    }

}
