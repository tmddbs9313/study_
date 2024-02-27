package com.ogiraffers.section02.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application01 {
    public static void main(String[] args) {



    /*수업목표.입출력스트림에 대해 이해하고 파일을 대상으로 하는 FileInputStream을 사용할 수 있다*/

    /*  필기. 입출력 스트림 개요
    *   프로그래밍 시 많은 종류의 데이터들을 다루어야 한다.
    *   하지만 데이터는 프로그램 내부에 있을 수 있지만, 프로그램 외부의 데이터를 가져와서 사용해야 할 수 도 있다
    *   또한 프로그램에서 생성한 데이터를 외부로 출력할 수도 있다
    *
    * 필기.외부데이터란
        프로그램 외부에 존재하는 모든 데이터를 의미한다.
        외부데이터는 하드디스크 상의 파일이 될 수 있고, 네트워크 상에 존재하는 자원이 될 수 있다.
        외부 데이터를 대상으로 작업할때 가장 먼저 해야할 일은 자바 프로그램과 외부 데이터를 연결하는 것이다,
        프로그램과 외부 데이터가 연결 된 길을 스트림(stream)이라고한다.
        스트림은 단방향이기때문에 데이터를 읽어오기 위한 길은 입력 스트림
                           데이터를 출력하기 위한 같은 출력 스트림

      필기. 그 중 InputStream 과 Reader 는 데이터를 읽어오는 입력스트림이고,
       OutputStream 과 Writer 는 데이터를 내보내는 출력 스트림이다.*/

        FileInputStream fin = null;

        try {
            fin = new FileInputStream("src/main/java/com/ogiraffers/section02/stream/testInputStream.txt");

            /*필기. read() : 파일에 기록된 값을 순차적으로 읽어오고 더 이상 읽어올 데이터가 없는 경우 -1 을 반환*/

            int value;

            while ((value = fin.read()) != -1) {
                System.out.println(value);

                System.out.println((char)value);
            }

            /*필기. 한글 한 글자에 3byte 이기 때문에 1byte 씩 값을 읽어오면 글자가 깨진다.*/

            //File 클래스의 length()로 파일의 길이를 알 수 잇다.
            System.out.println("파일의 길이: " + new File("src/main/java.com/ogiraffers/section02/stream/testInputStream.txt").length());


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(fin !=null) {
                try {

                    /*필기. 자원 반납을 해야하는 이유
                    *  1. 장기간 실행중인 프로그램에서 스트림을 닫지않는경우
                    *   메모리 누수(leak)가 발생하게 된다.
                    *  2. close() 메소드는 자원을 반납하며 flush()를 해주기 때문에
                    *   close() 만 제대로 해줘도 된다.
                    *   close() 는 반드시 마지막에 호출해 주어야 한다.*/

                    fin.close();

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
