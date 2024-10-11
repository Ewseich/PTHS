public class ThrowingAdder {
    public int add(int a, int b) {
        if (a > 0 && b > 0 && a + b < 0) {
            throw new ArithmeticException("int overflow");
        }
        else if (a < 0 && b < 0 && a + b > 0) {
            throw new ArithmeticException("int overflow");
        }
        else return a + b;
        // Чтобы бросить исключение можно написать
        // throw new ArithmeticException("int overflow");
    }

    public long add(long a, long b) {
        if (a > 0 && b > 0 && a + b < 0) {
            throw new ArithmeticException("int overflow");
        }
        else if (a < 0 && b < 0 && a + b > 0) {
            throw new ArithmeticException("int overflow");
        }
        else return a + b;
        // Чтобы бросить исключение можно написать
        // throw new ArithmeticException("long overflow");
    }
}

