public class Main {
    public static void main(String[] args) {
        ApplePhone phone = new ApplePhone("+7 999 000 000", "Apple", 135.9);
        try {
            phone.receiveCall("Оля");
        } catch (NameException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        phone.info();
        System.out.println();


        XiaomiPhone phone1 = new XiaomiPhone("+7 999 111 111", "Xiaomi", 150.8);
        try {
            phone1.receiveCall("Николай");
        } catch (NameException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        phone1.infoD();
        System.out.println();


        SamsungPhone phone2 = new SamsungPhone("+7 999 222 222", "Sumsung", 177.3);
        try {
            phone2.receiveCall("Петр");
        } catch (NameException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        phone2.info();
    }
}