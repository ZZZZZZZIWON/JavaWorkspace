package chap_07;
class HamBurger1 {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HamBurger1() {
    }

    void cook() {
        this.name = "햄버거";
        System.out.println( this.name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println("> 양상추");
        System.out.println("+ 패티");
        System.out.println("+ 피클");
    }
}

class CheeseBurger1 extends HamBurger1 {

    @Override
    void cook() {
        super.cook();
        this.name = "치즈버거";
        setName("치즈버거");
        System.out.println("+ 치즈");

    }
}

class ShrimpBurger1 extends HamBurger1 {

    @Override
    void cook() {
        super.cook();
        this.name = "새우버거";
        setName("새우버거");
        System.out.println("+ 새우");

    }
}
public class _Quiz_07 {
    public static void main(String[] args) {
        HamBurger1[] hamBurgers = new HamBurger1[3];
        hamBurgers[0] = new HamBurger1();
        hamBurgers[1] = new CheeseBurger1();
        hamBurgers[2] = new ShrimpBurger1();

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("---------------");
        for (HamBurger1 hamBurger : hamBurgers) {
        hamBurger.cook();
        System.out.println("---------------");
        }
        System.out.println("메뉴 준비가 완료되었습니다.");
    }
}
