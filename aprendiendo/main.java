import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author yojan
 */

public class main {

    public static void main(String[] args) {
        String a, b, c;
        int d, op;
        Scanner sc = new Scanner(System.in);
        carros carro1 = new carros();
        do {
            System.out.println("ingrese la opcion:\n0. salir\n1.ingresar datos\n2.mostrar datos");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("ingrese el color");
                    a = sc.next();
                    System.out.println("ingrese la matricula");
                    b = sc.next();
                    System.out.println("ingrese tipo de motor");
                    c = sc.next();
                    System.out.println("ingrese el numero");
                    d = sc.nextInt();
                    carro1.setColor(a);
                    carro1.setMatricula(b);
                    carro1.setMotor(c);
                    carro1.setNumero(d);
                    break;
                case 2: System.out.println("color: "+carro1.getColor()+"\nMatricula: "+carro1.getMatricula()+"\nTipo de motor: "+carro1.getMotor()+"\nNumero: "+carro1.getNumero());
                    break;
            }
        } while (op != 0);
        /*System.out.println("ingrese la matricula del carro");
        carro1.matricula=sc.next();
        System.out.println("ingrese el tipo de motor");
        carro1.motor=sc.next();
        System.out.println("ingrese el color");
        carro1.color=sc.next();
        System.out.println("Matricula: " + carro1.matricula + "\nTipo de motor: " + carro1.motor + "\nColor: " + carro1.motor);*/
    }
}
