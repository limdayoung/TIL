package test.q13;
/*
 * 작성자 : 임다Garbage1성일 : 2018.07.19
 * ■ 대구분 : 메모리관리 
 * ■ 소구분 : Garbage collector 개념 및 동작원리 / Memory Leak 탐지 및 예방 (객관식)
 * ■ 난이도 : 상 
 * [Q13] 다음은 Garbage Collection 에 대한 설명이다. 보기 중 잘못된 설명을 고르시오.  
 * ① 자바 프로그램 실행 중 객체가 garbage collect 되지 않을 수 있다.
 * ② finalize() 메소드를 오버라이딩하고 필요한 자원을 반납했을 경우, 모든 자원은 확실하게 반납된다.
 * ③ garbage collection 이 객체의 완전한 소멸(destruction)을 의미하는 것은 아니다.
 * ④ System.gc() 메소드를 호출하여 강제로 garbage collection을 실행해도 garbage collection이 보장되는 것은 아니다.
 * 답 : 2. 프로세스 실행 중 가비지 컬랙션이 동작하지 않는 경우도 발생하며,
 * finalize() 메소드가 호출되지 않을 수도 있다.
 * 따라서 자원 반납 기능은 finalize() 메소드 의외의 별도의 코드로 작성해야 한다.
 */
public class Garbage1 {
}
