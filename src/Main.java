public class Main {
    public static void main(String[] args) throws NameException {
        ApplePhone phone = new ApplePhone("+7 999 000 000","Apple",135.9);
        phone.receiveCall("Оля");
        phone.info();
        System.out.println();


        XiaomiPhone phone1 = new XiaomiPhone("+7 999 111 111","Xiaomi",150.8);
        phone1.receiveCall("Николай");
        phone1.infoD();
        System.out.println();


        SamsungPhone phone2 = new SamsungPhone("+7 999 222 222","Sumsung",177.3);
        phone2.receiveCall("Пётр");
        phone2.info();


    }
}