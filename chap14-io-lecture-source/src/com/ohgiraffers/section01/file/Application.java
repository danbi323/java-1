package com.ohgiraffers.section01.file;

import java.io.File;
import java.io.IOException;

public class Application {

    public static void main(String[] args) {
        /*
         * JDK1.0부터 지원하는 API로 파일 처리를 수해앟는 대표적인 클래스이다
         * 대상 파일에 대한 정보로 인스턴스를 생성하고 파일의 생성, 삭제 등등의
         * 처리를 수행하는 기능을 제공하고 있따.*/

        File file = new File("src/com/ohgiraffers/section01/file/test.txt");

        boolean createSuccess;

        {
            try {
                createSuccess = file.createNewFile();
                System.out.println("createSuccess = " + createSuccess);
            } catch (IOException e) {

                e.printStackTrace();
            }
        }

        System.out.println("파일의 크기 : " + file.length() + "byte");
        System.out.println("파일의 경로 : " + file.getPath());
        System.out.println("현재 파일의 상위경로 : " + file.getParent());
        System.out.println("파일의 절대경로 : " + file.getAbsoluteFile());

        boolean deleteSucces = file.delete();

        System.out.println("deleteSucces = " + deleteSucces);
    }


}