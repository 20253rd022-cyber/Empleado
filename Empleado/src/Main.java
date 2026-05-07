import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);


        System. out .println("Ingresa tu nombre ");
        String nombre = sc.nextLine();

        System.out.println("Ingresa Las horas trabajadas");
        int horas = sc.nextInt();

        System.out.println(" Ingresa el pago por hora");
        double pagoHora = sc.nextDouble();

        double salarioBruto = horas * pagoHora;
        double isr = salarioBruto * 0.10;
        double salarioFinal = salarioBruto - isr;

        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Salario Bruto: " + salarioBruto);
        System.out.println("ISR (10%): " + isr);
        System.out.println("Salario final: " + salarioFinal);

        if (salarioFinal > 12000){
            System.out.println("Empleado con ingresos altos");
        }else {
            System.out.println("Empleado con ingresos normales ");
        }

    }
}
