package com.ohgiraffers.section02.encapsulation.problem4;

public class Monster {

    /* 접근제한자
    클래스 혹은 클래스 멤버에 참조연산자로 접근할수있는 범위를 제한시키기 위한 키워드
    1. public : 모든 패키지 접근 허용
    2. protected : 동일 패키지 접근 허용
    3. defult : 동일 패키지에만 접근 허용(작성하지 않은 defult)
    4. private : 해당 클래스 내부에만 접근 가능
     */

    // 위에 네가지 접근제한자는 클래스 멤버(필드,메소드) 에 모두 가능하다.
    // 하지만 클래스는 public, defult만 사용가능

    private String kinds;
    private int hp;

    public void setKinds(String kinds) {
        this.kinds = kinds;
    }

    public void setHp(int hp) {
        if (hp > 0){
            this.hp = hp;
        }else {
            this.hp = 0;
        }
    }

    public String getInfo(){
        return "몬스터는 " + this.kinds + " 체력은 " + this.hp;
    }
}
