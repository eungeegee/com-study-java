package com.study; // 패키지 ? 클래스의 모음집
// import com.study.HelloJava // import 는 클래스를 가져올때 사용한다. 해단 패키지 이하 클래스를 모두 가져올때는 [패키지명.*] 별표사용


/**
 * 접근제한자 : 클래스, 필드, 메서드 선언시 함께 사용함
 * 1. public    : 어느 클래스에서나 접근 할 수 있음(클래스 파일 최상위는 클래스는 public 만 가능, 클래스 내부의 클래스는 이하 접근자 사용 가능)
 * 2. protected : 같은 패키지 내 클래스 및 상속한 클래스 까지 접근가능
 * 3. 제한자없음   : 같은 패키지 내 클래스 까지 접근 할 수 있다. default 또는 friendly 라고 칭함
 * 4. private   : 자신의 클래스 내에서만 접근 가능
 * 5. static    : 모든 클래스인스턴스가 공유하는 값, 하나의 메모리를 공유함
 * 6. final     : 상수 선언(const 같은존재, java 에서는 const 사용안함)
 * 7. abstract
 * 8. native
 * 9. volatile
 * 10. transient
 * 11. synchronized
 */


public class Person {
    static int count;
    String name;
    int age;
    // 생성자 = 클래스명과 동일한 이름으로 선언되는 메서드
    Person(String name, int age){
        this.name = name;
        this.age = age;
        count++; // static 변수는 this 키워드 사용할 수 없음
    }

    /**
     * @param etc String
     * @return String "나는 xx살 xxx 입니다"
     */
    String introduce(String etc){
        return etc + "나는 " + this.age + "살 " + this.name + "입니다~!";
    }

    void printCount(){
        System.out.println("Person의 인스턴스 갯수 :"+count);
    }
}
