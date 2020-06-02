package com.larva.refactoring.demo.extractClass.before;

public class Main {

    public static void main(String[] args){
        Book refactoring = Book.builder()
                .title("Refactoring: improving the design of existing code")
                .isbn("ISBN0201485672")
                .price("44.95$")
                .authorName("Martin Fowler")
                .authorMail("fowler@acm.org")
                .build();

        Book math = Book.builder()
                .title("프로그래머 수학")
                .isbn("ISBN1234")
                .price("20000원")
                .authorName("유키 히로시")
                .authorMail("hyuki@hyuki.com")
                .build();

        System.out.println("refactoring:");
        System.out.println(refactoring.toXml());
        System.out.println("math:");
        System.out.println(math.toXml());
    }
}
