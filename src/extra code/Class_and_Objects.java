import javax.swing.*;
import java.util.Locale;

public class Class_and_Objects {
    public static void main(String arg[]){
        Objects_and_Class animal1=new Objects_and_Class();
        animal1.name= JOptionPane.showInputDialog("Enter you weird creatures name");
        String type= "is it a?\n";
        type+="Herbi\n";
        type+="Carni\n";
        type+="Omni";
        animal1.Type=JOptionPane.showInputDialog(type);
        animal1.choose();
        System.out.println(animal1.name+ " is a "+animal1.Type);

    }
}
