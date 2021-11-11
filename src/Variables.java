public class Variables {
    public static void main(String[] args) {

        int myFirstNumber = 5;
        int mySecondNumber = 12;
        int myThirdNumber =6;

        System.out.println(myFirstNumber);

        myFirstNumber = 10 + 5;
        System.out.println(myFirstNumber);

        myFirstNumber = (10 + 5) + (2 * 10);
        System.out.println(myFirstNumber);

        int myTotal= myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);

        myThirdNumber=myFirstNumber*2;
        myTotal= myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);

        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);
    }
}
