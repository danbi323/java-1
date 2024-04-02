package com.ohgirrafers.section01.user;

public class MemberRegister {

    public void regist(Member[] members){
        System.out.println("회원 등록합니다.");

        for (int i=0; i< members.length; i++){
            System.out.println(members[i].getName() + "님이 회원 등록에 성공");
        }

        if (MemberRepository.store(members)){
            System.out.println("총 " + members.length + "명 회원 등록에 성공");
        }
    }
}