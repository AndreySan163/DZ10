public class SamsungPhone<T> extends Phone<T>{
    public SamsungPhone(String number, String model, double weight) {
        super(number, model, weight);
    }
    public void info(){
        System.out.printf("Phone: number = %s\nmodel = %s\nweight = %s\n", this.getNumber(), this.getModel(), this.getWeight());
    }
}