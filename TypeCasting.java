/*
Java Type Casting
        Type casting is when you assign a value of one primitive data type to another type.

        In Java, there are two types of casting:

        Widening Casting (automatically) - converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double

        Narrowing Casting (manually) - converting a larger type to a smaller size type
        double -> float -> long -> int -> char -> short -> byte
*/

public class TypeCasting {
    public static void main(String[] args) {
        // 1) Widening Casting (automatically)
        byte wb = 123;
        short ws = wb;
        int wi = ws;
        long wl = wi;
        float wf = wl;
        double wd = wf;
        System.out.println(wd);

        // 2) Narrowing Casting (manually)

        // double to float
        double nd = 10.5;
        float nf = (float) nd;

        // float to long
        long nl = (long) nf;

        // long to int
        int ni = (int) nl;

        // int to short
        short ns = (short) ni;

        // short to byte
        byte nb = (byte) ns;

        System.out.println("double nd: " + nd);
        System.out.println("float nf: " + nf);
        System.out.println("long nl: " + nl);
        System.out.println("int ni: " + ni);
        System.out.println("short ns: " + ns);
        System.out.println("byte nb: " + nb);
    }
}
