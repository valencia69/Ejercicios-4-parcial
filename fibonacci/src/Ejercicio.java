public class Ejercicio {
    int n;

    public static int fibonacci(int n){
        if (n == 0 || n == 1){
            return n;  //caso base
        }else {
            //recursividad
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
