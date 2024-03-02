package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application03 {

    public static void main(String[] args) {

        /*수업목표. FileOutPutStream 을 이해하고 사용할 수 있다*/
        /*필기. FileOutPutStream
        *  프로그램의 데이터를 파일로 내보내기 위한 용도의 스트림
        *  바이트 단위로 데이터를 처리한다*/

        FileOutputStream fout = null;

        try {
            fout = new FileOutputStream("src/main/java/com/ohgiraffers/section02/stream/testOutPutStream.txt");

            fout.write(97);


            /*10 : 개행 문자 (엔터)*/
            byte[] barr = new byte[] {98,99,100,101,102,10,103};  // 개행하고 103 ->g

            fout.write(barr);

            /*1번 인덱스부터 3의 길이만큼 파일에 내보내기*/
            fout.write(barr,1,3);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(fout != null) {

                try {
                    fout.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
