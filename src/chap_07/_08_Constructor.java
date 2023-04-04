package chap_07;

public class _08_Constructor {
    public static void main(String[] args) {
        Blackbox b1 = new Blackbox();
        b1.modelName = "까망";
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "블랙";
        System.out.println(b1.modelName);
        System.out.println(b1.serialNumber);
        System.out.println("----------------------");

        Blackbox b2 = new Blackbox("하양", "UHD", 300000, "화이트");
        System.out.println(b2.modelName);
        System.out.println(b2.serialNumber);
    }
}
