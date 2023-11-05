public class ApplePhone<T> extends Phone<T>{
    public ApplePhone(String number, String model, double weight) {
        super(number, model, weight);
    }
    public void info(){
        System.out.printf("Phone: number = %s\nmodel = %s\nweight = %s\n", this.getNumber(), this.getModel(), this.getWeight());
    }
}

