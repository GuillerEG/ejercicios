import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.print("Primer numero: ");
        double num1=k.nextDouble();
        System.out.print("Segundo numero: ");
        double num2=k.nextDouble();
        if(num1<num2){
            System.out.println(num2+" es mayor que "+num1);
        }else{
            System.out.println(num1+" es mayor que "+num2);
        }
    }  
}
