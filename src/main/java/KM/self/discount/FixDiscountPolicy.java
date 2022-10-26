package KM.self.discount;

import KM.self.member.Grade;
import KM.self.member.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
public class FixDiscountPolicy implements DiscountPolicy{
    /*
    VIP일 경우 1000원 할인
    이외엔 할인 없음
     */



    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        }
        else
            return 0;
    }
}
