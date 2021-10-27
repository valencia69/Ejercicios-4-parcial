public class ejercicios {
    /*
    vector ={2,9,6,7,6,3,4,3}
    */

    private static int maximoVector(int[] vector, int[] indice, int maximo) {

        if (indice == vector.length - 1) { //base
            if (vector[indice] > maximo) {
                maximo = vector[indice];
            }

        } else // llamada
        {
            if (vector[indice] > maximo) {
                maximo = vector[indice];
            }

            maximo = maximoVector(vector, indice + 1, maximo)
        }

        return maximo;


    }

    /*
   metodo axuliar

    */
    public static int maximoVector(int vector) {
        return maximoVector(vector, indice:0, maximo:0);
    }

}


















