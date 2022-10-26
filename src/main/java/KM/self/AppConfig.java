package KM.self;

import KM.self.discount.DiscountPolicy;
import KM.self.discount.FixDiscountPolicy;
import KM.self.discount.RateDiscountPolicy;
import KM.self.member.MemberRepository;
import KM.self.member.MemberService;
import KM.self.member.MemberServiceImpl;
import KM.self.member.MemoryMemberRepository;
import KM.self.order.OrderService;
import KM.self.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration // 싱글톤을 유지시켜주는 어마어마한 친구
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(
                memberRepository(),
                discountPolicy());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }



}
