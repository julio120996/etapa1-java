import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();
        int edad = scanner.nextInt();

        if(edad >= 18){
            System.out.println("Hola " + nombre + ", eres mayor de edad." + "y el proximo año cumplire: " + (edad + 1));
        } else {
            System.out.println("Hola " + nombre + ", eres mayor de edad." + "y el proximo año cumplire: " + (edad + 1));

        }
    }
}
