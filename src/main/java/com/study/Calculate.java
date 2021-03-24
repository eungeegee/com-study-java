package com.study;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculate {

    void printBigDecimal(){
        // 프로그래밍 언어에서 부동소수점+부동소수점 의 경우 오차범위가 존재한다(이유 : 부동소수점을 2진수로 변환하여 계산하기 때문)
        // 때문에 정확한 수치를 요구하는 경우 BigDecimal 을 사용함!
        // 나눗셈의 경우 나머지가 있을 경우 규칙을 정해줘야 함, 안하면 java.lang.ArithmeticException 발생
        // 나눗셈 규칙 : 계산할 소수점의 자리수, 끝수 내림(DOWN)/올림(UP)/반올림(HALF_UP) 선택
        // java.math.RoundingMode => DOWN, UP, HALF_UP, CEILING, FLOOR
        BigDecimal value1 = new BigDecimal("0.8"); // 인자는 숫자형이 아닌 문자열을 전달함
        BigDecimal value2 = new BigDecimal("0.1");

        BigDecimal resultAdd = value1.add(value2);  // 연산자가 아닌 빅데시말 메서드를 통해 연산함!
        System.out.println("빅데시말 0.8 + 0.1 = "+resultAdd);

        BigDecimal resultSubtract = value1.subtract(value2);
        System.out.println("빅데시말 0.8 - 0.1 = "+resultSubtract);

        BigDecimal resultMulti = value1.multiply(value2);
        System.out.println("빅데시말 0.8 * 0.1 = "+resultMulti);

        BigDecimal resultDivide = value1.divide(value2, 0, RoundingMode.DOWN); // 나눗셈은 소수점자리, 내림여부 인자추가
        System.out.println("빅데시말 0.8 / 0.1 = "+resultDivide);

        BigDecimal resultReminder = value1.remainder(value2); // 나눗셈은 소수점자리, 내림여부 인자추가
        System.out.println("빅데시말 0.8 % 0.1 = "+resultReminder);


    }
}
