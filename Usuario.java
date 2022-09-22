import java.util.Scanner;
class Banco{
    String codigo;
}
class Cuenta extends Banco{
    String nombre, apellido;
    double monto;
}
class Usuario extends Cuenta{
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        Usuario persona=new Usuario();
        int op, ep;
        double deposito, retiro;
        System.out.println("Elija una opcion:");
        System.out.println("1. Crear cuenta nueva");
        System.out.println("2. Ingrear cuenta registrada\n");
        op=k.nextInt();
        if(op==1){
            System.out.println("Ingrese su nombre:");
            persona.nombre=k.next();
            System.out.println("Ingrese su apellido:");
            persona.apellido=k.next();
            persona.monto=0;
            persona.codigo="741258";
            System.out.println("SU CODIGO DE CUENTA ES: "+persona.codigo);
            System.out.println("SU MONTO ACTUAL ES: "+persona.monto+"\n");
            System.out.println("//////////////////////////////////////////////////////");
            System.out.println("Elija una operacion:");
            System.out.println("1. Deposito");
            System.out.println("2. Retiro");
            ep=k.nextInt();
            if(ep==1){
                System.out.print("Ingrese la cantidad que desea depositar: ");
                deposito=k.nextDouble();
                persona.monto=deposito+persona.monto;
                System.out.println("SU MONTO ACTUAL ES: "+persona.monto);
            }else{
                System.out.print("Ingrese la cantidad que desea retirar: ");
                retiro=k.nextDouble();
                if(retiro<persona.monto){
                    persona.monto=persona.monto-retiro;
                    System.out.println("SU MONTO ACTUAL ES: "+persona.monto);
                }else if(retiro==persona.monto){
                    persona.monto=persona.monto-retiro;
                    System.out.println("SU MONTO ACTUAL ES: "+persona.monto);
                }else{
                    System.out.println("SU MONTO ES INSUFICIENTE PARA RETIRAR");
                }
            }
        }else{
           System.out.println("Ingrese su cuenta bancaria (6 NUMEROS):");
           persona.codigo=k.next();
           persona.monto=1500;
           System.out.println("SU CODIGO DE CUENTA ES: "+persona.codigo);
           System.out.println("SU MONTO ACTUAL ES: "+persona.monto+"\n");
           System.out.println("//////////////////////////////////////////////////////");
           System.out.println("Elija una operacion:");
           System.out.println("1. Deposito");
           System.out.println("2. Retiro");
           ep=k.nextInt();
           if(ep==1){
                System.out.print("Ingrese la cantidad que desea depositar: ");
                deposito=k.nextDouble();
                persona.monto=deposito+persona.monto;
                System.out.println("SU MONTO ACTUAL ES: "+persona.monto);
            }else{
                System.out.print("Ingrese la cantidad que desea retirar: ");
                retiro=k.nextDouble();
                if(retiro<persona.monto){
                    persona.monto=persona.monto-retiro;
                    System.out.println("SU MONTO ACTUAL ES: "+persona.monto);
                }else if(retiro==persona.monto){
                    persona.monto=persona.monto-retiro;
                    System.out.println("SU MONTO ACTUAL ES: "+persona.monto);
                }else{
                    System.out.println("SU MONTO ES INSUFICIENTE PARA RETIRAR");
                }
            }
        }
    }  
}