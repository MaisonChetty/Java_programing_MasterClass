public class Primitive_Types_Challenge {
    public static void main(String[] args) {

        byte byteValue = 127;
        short shortValue = 310;
        int intValue = 1000;

        long longTotal = 50000l + 10l *
                (byteValue + shortValue + intValue);

        System.out.println(longTotal);

        short shortTotal = (short) (50000 + 10 *
                (byteValue + shortValue + intValue));

        System.out.println(shortTotal);

    }
}
