class XiaomiPhone extends Phone {

    public XiaomiPhone(String model, long number, int weight) {
        super(model, number, weight);
    }
    @Override
    public void info() {
        System.out.printf("Модель телефона: %s \nНомер: %d \nВес(в граммах): %d\n", this.getModel(), this.getNumber(), this.getWeight());
    }
}