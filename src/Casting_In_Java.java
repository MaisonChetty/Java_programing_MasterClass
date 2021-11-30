public class Casting_In_Java {
    public static void main(String[] args) {

        int myValue= 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value =" + myMinIntValue);
        System.out.println("Integer Maximum Value =" + myMaxIntValue);

        // Over flow
        System.out.println("Busted Max Value =" + (myMaxIntValue + 1));

        //Under flow
        System.out.println("Busted Min Value =" + (myMinIntValue - 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum Value =" + myMinByteValue);
        System.out.println("Byte Maximum Value =" + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum Value =" + myMinShortValue);
        System.out.println("Short Maximum Value =" + myMaxShortValue);

        long myLongValue = 100l;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long Minimum Value =" + myMinLongValue);
        System.out.println("Long Maximum Value =" + myMaxLongValue);

        long bigLongLiteralvalue =21474836474l;

        System.out.println(bigLongLiteralvalue);

        int myTotal = (myMinIntValue /2);

        //Casting (byte)
        byte myNewByteValue = (byte) (myMinByteValue /2);

        short myNewShortValue = (short) (myMinShortValue/2);

    }
}
