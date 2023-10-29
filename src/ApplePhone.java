class ApplePhone extends Phone {
    public ApplePhone(String model, long number, int weight) {
        super(model, number, weight);
    }

    // Реализация метода info() для ApplePhone
    @Override
    public void info() {
        System.out.printf("Модель телефона: %s \nНомер: %d \nВес(в граммах): %d\n", this.getModel(), this.getNumber(), this.getWeight());
    }
}
