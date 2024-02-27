package com.ohgiraffers.section02.string;

public class Application04 {

    public static void main(String[] args) {

        /*수업목표. 이스케이프(escape) 문자에 대해 이해하고 적용할 수 있다*/
        /*필기. 문자열 내에서 사용하는 문자중 특수 문자를 표현하거나 특수 기능을 사용할때 사용
        *  \n : 개행
        *  \t : 탭
        *  \' : 작은 따옴표
        *  \" : 큰 따옴표
        *  \\ : 역슬래쉬 표시*/

        System.out.println("안녕하세요 \n 저는 홍길동 입니다.");
        System.out.println("안녕하세요 \t 저는 홍길동 입니다.");
        System.out.println("안녕하세요. 저는 '홍길동' 입니다.");
//        System.out.println(''');  홀따옴표 문자와 문자 리터럴 기호가 중복됨.
        System.out.println('\'');

        System.out.println("안녕하세요. 저는 \"홍길동\" 입니다.");


    }
}
