package KM.self.discount;

import KM.self.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);
}
