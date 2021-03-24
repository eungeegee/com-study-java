package com.study;

class App {
    public static void main(String[] args){
        Person eungeegee = new Person("은지",34);
        String intro = eungeegee.introduce("어맛! ");
        System.out.println(intro);
        eungeegee.printCount();

        Person mama = new Person("금자씨", 59);
        mama.printCount();
        System.out.println("static 선언변수 출력 Person.count = " + Person.count); // static 선언된 변수는 클래스 명으로만 접근가능함 ! 인스턴스로는 접근 불가

        Calculate cal = new Calculate();
        cal.printBigDecimal();
    }
}
