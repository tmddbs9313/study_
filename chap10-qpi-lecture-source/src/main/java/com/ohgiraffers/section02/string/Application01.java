package com.ohgiraffers.section02.string;

public class Application01 {

    public static void main(String[] args) {

        /*수업목표. String 클래스의 자주 상용하는 메소드에 대해 알 수 있다.*/

        /*필기. charAt() : 해당 문자열의 특정 인덱스에 해당하는 문자를 반환한다.
         *  */

        String str1 = "apple";

        for(int i = 0; i < str1.length(); i++){
            System.out.println("charAt(" + i + ") = " + str1.charAt(i));
        }

        /*필기. compareTo() : 인자로 문자열을 전달하여, 같으면 0 을 반환,
           전달된 문자열이 작으면 음수 크면 양수를 반환한다*/

        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";

        System.out.println("compareTo() : " + (str2.compareTo(str3)));  //같으면 0을 반환
        System.out.println("compareTo() : " + (str2.compareTo(str4)));  //32
        System.out.println("compareTo() : " + (str4.compareTo(str2)));  //-32

        /*필기. compareToIgnoreCase() : 대소문자 구분하지 않고 비교*/
        System.out.println("compareToIgnoreCase() : " + (str3.compareToIgnoreCase(str4)));  //0

        /*필기. concat() : 문자열 합쳐주기, 원본 문자열에는 영향을 주지 않는다.*/
        System.out.println("concat() : " + (str2.concat(str5)));  //javaoracle
        System.out.println("str2 : " + str2);  //java

        /*필기. trim() : 문자열의 앞 뒤에 공백을 제거한 문자열을 반환한다.*/
        String trimStr = "     java     ";  //공백 5칸씩

        System.out.println("trimStr : #" +trimStr + "#");
        System.out.println("trim() : #" +trimStr.trim() +"#");  //#java#

        /*필기. toLowerCase() : 모든 문자를 소문자로 변환 ->toUpper*/
        String caseStr = "JavaOracle";
        System.out.println("toLowerCase() : " + caseStr.toLowerCase());  //javaoracle

        /*필기. length() : 문자열의 길이를 정수형으로 반환*/
        System.out.println("length() :" +caseStr.length());

        /*필기. replace() : 문자열에서 대체할 문자열로 기존 문자열을 변경해서 반환*/
        String javaoracle = "javaoracle";

        System.out.println("replace() : " +javaoracle.replace("java","python"));

        /*필기. isEmptu() : 문자열의 길이가 0이면 true, 아니면 false 반환*/
        System.out.println("isEmptu() : "+ "".isEmpty());
        System.out.println("isEmptu() : "+ "abs".isEmpty());


    }

}
