import java.util.Arrays;
import java.util.Locale;

public class loop {
    public static void main(String[] args){
        double num1=15;
        double num2=19;


        //for the similarities of a while loop
        while (num1<=num2){
            System.out.println(num1);
            num1+=1;
        }

        System.out.println();

        double num3=15;
        double num4=19;

        do {
            System.out.println(num3);
            num3+=1;
        } while (num3<=num4);

        System.out.println();

        double num5=15;
        double num6=19;

        for(int i=0;num5<=num6;i++){
            System.out.println(num5);
            num5+=1;
        }


        //for the similarities of a do while loop
        System.out.println();
        String hi="Hello World";
        int i=0;
        String[] splhi=hi.split("");
        //Do While Loop
        do {
            System.out.println(splhi[i]);
            i++;
        }while (i< splhi.length);

        System.out.println();

        //While Loop
        i=0;
        while (i< splhi.length){
            System.out.println(splhi[i]);
            i++;
        }

        System.out.println();

        //For loop
        for (int l=0;l< splhi.length;l++){
            System.out.println(splhi[l]);
        }

        //for the similarities of a for loop
        System.out.println();
        String[] zoo={
                "lion",
                "tiger",
                "elephant",
                "zebra",
                "monkey"
        };
        for (int j = 0; j < zoo.length; j++) {
            String animal=zoo[j];
            System.out.println(animal);
        }


        //while loop
        System.out.println();
        int o=0;
        while (o< zoo.length){
            String animal=zoo[o];
            System.out.println(animal);
            o++;
        }


        //do while
        System.out.println();
        o=0;
        do {
            String animal=zoo[o];
            System.out.println(animal);
            o++;
        }while (o< zoo.length);
    }
}
