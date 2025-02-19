public class ChocolateBoilerWithSingleton {
    private ChocolateBoilerWithSingleton uniqueInstance;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoilerWithSingleton() {
        empty = true;
        boiled = false;
    }

    public ChocolateBoilerWithSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (ChocolateBoilerWithSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new ChocolateBoilerWithSingleton();
                }
            }
        }
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // 填充原料
        }
    }

    public void drain() {
        if (isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    private boolean isBoiled() {
        return boiled;
    }

    private boolean isEmpty() {
        return empty;
    }
}
