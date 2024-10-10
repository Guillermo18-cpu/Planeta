import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Planeta planeta1= new Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, true);
        planeta1.Infoplaneta();

        System.out.println("");

        planeta1.Masaplaneta();
        
        System.out.println("");

        Planeta planeta2=new Planeta("Jupiter", 1,1.899E27 , 1.4313E15, 139820, 750000000, true);
        planeta2.Infoplaneta();
        
        System.out.println("");
        
        planeta2.Masaplaneta();



}

 }