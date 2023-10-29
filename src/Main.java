public class Main {
    public static void main(String[] args) {
        Phone samsung = new SamsungPhone("Galaxy S23 Plus", 9993453456L, 300);
        SamsungPhone.receiveCall("Валера\n");
        samsung.info();

        Phone xiaomi = new XiaomiPhone("Not 30Pro", 799456756123L, 239);
        XiaomiPhone.receiveCall("Денис\n");
        xiaomi.info();

        Phone apple = new ApplePhone("iPhone 15 Ultra", 109945645567L, 345);
        ApplePhone.receiveCall(("Коля\n"));
        apple.info();
    }
}