package KM.self.order;

import KM.self.AppConfig;
import KM.self.discount.DiscountPolicy;
import KM.self.member.Grade;
import KM.self.member.Member;
import KM.self.member.MemberRepository;
import KM.self.member.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceImplTest {

    @Test
    void createOrder() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        MemberService memberService = ac.getBean("memberService", MemberService.class);
        MemberRepository memberRepository = ac.getBean("memberRepository", MemberRepository.class);
        DiscountPolicy discountPolicy = ac.getBean("discountPolicy", DiscountPolicy.class);

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);


    }
}