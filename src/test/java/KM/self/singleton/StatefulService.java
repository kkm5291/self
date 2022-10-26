package KM.self.singleton;

public class StatefulService {

    private int price;

    public void order(String name, int price) {
        System.out.println("name = " + name + ", price = " + price);
        this.price = price; // 이게 문제가 됨
    }

    public int getPrice() {
        return price;
    }


}
