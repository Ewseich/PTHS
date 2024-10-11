import org.w3c.dom.ls.LSOutput;

public class SimpleAdder {
    int c = 0;
    long cl = 0;

    public int add(int a, int b) {
        if (a + b < 0 && a > 0 && b > 0) {
            c = Integer.MAX_VALUE;
        } else if (a + b > 0 && a < 0 && b < 0) {
            c = Integer.MIN_VALUE;
        } else {
            c = a + b;
        }
        System.out.println(c);
        return (c);

    }

    public long add(long a, long b) {
        if (a + b < 0 && a > 0 && b > 0) {
            cl = Long.MAX_VALUE;
        } else if (a + b > 0 && a < 0 && b < 0) {
            cl = Long.MIN_VALUE;
        } else {
            cl = a + b;
        }
        System.out.println(cl);
        return (cl);
    }

}
