public abstract class Phone<T> implements Callable<T>, Informable<T> {
    private String number;
    private String model;
    private double weight;
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void receiveCall(String name) throws NameException {
        if (name.length() < 4) {
            throw new NameException("Имя должно содержать не менее 4 символов");
        } else {
            System.out.println("Звонит " + name);}
    }
    public abstract void info();
}
/*Длина имени должна составлять не менее 4 символов*/