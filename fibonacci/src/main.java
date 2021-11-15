import java.util.Scanner;


public class main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el número de elementos a mostrar de la series: ");
        int limite = teclado.nextInt();
        teclado.close();

        for(int i = 0; i<limite; i++){
            System.out.print(Ejercicio.fibonacci(i) + ", ");
        }
        System.out.println(" ");

    }
}
