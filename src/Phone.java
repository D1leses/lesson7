public abstract class Phone {
    private String model;
    private long number;
    private int weight;

    public static void receiveCall(String callerName){
            System.out.printf("Звонит: %s", callerName);
    }
    public Phone(String model, long number, int weight) {
        this.model = model;
        this.number = number;
        this.weight = weight;
    }
    public abstract void info();
    public String getModel() {
        return model;
    }
    public long getNumber() {
        return number;
    }
    public int getWeight () {
        return weight;
    }
        }