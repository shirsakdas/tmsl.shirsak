package tmsl.shirsak;

class ExampleOfConstructor {
    int value;

    public ExampleOfConstructor(int x) {
        value = x;
    }

    public ExampleOfConstructor() {
        value = 0;
    }
}

class Main {
    public static void main(String args[]) {
        ExampleOfConstructor t = new ExampleOfConstructor(5);
        changevalue(t);
        System.out.println(t.value);

    }

    public static void changevalue(ExampleOfConstructor t) {
        t.value = 10;
    }
}