
package sema01;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        double precio, pago, total;
        System.out.print("Ingrese el total a pagar: ");
        precio=k.nextDouble();
        total=precio-(precio*15/100);
        System.out.println("Con dsct. del 15% sería: "+total);
        System.out.print("Ingrese su monto de pago: ");
        pago=k.nextDouble();
        System.out.println("**************************************");
        if(pago<total){
            System.out.print("FALTA PAGAR: "+(total-pago));
        }
        if(pago==total){
            System.out.print("COMPRA PAGADA");
        }
        if(pago>total){
            System.out.print("SU VUELTO ES: "+(pago-total)+" ");
        }
    }
}
