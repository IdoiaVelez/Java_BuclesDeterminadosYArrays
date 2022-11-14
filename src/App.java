public class App {
    public static void main(String[] args) throws Exception {

        /* For */
        /*
         * int i = 0;
         * for (i = 1; i <= 10; i++) {
         * System.out.println("Hola " + i);
         * }
         */

        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }

        int i = 0;
        while (i < numeros.length) {
            System.out.println("indice del array " + numeros[i]);
            i++;
        }

        i = 0;
        while (i < numeros.length) {
            if (numeros[i] % 2 != 0) {
                System.out.println("numero impar " + numeros[i]);
            }
            i++;
        }
        // Imprimir frutas par
        System.out.println("- Pares");

        String[] frutas = { "Melón", "Sandía", "Pera", "Limón", "Fresa" };
        int j;
        for (j = 1; j < frutas.length; j++) {
            if (j % 2 == 0) {
                System.out.println(frutas[j]);
            }
        }
        // Imprimir frutas impares
        System.out.println("- Impares");
        j = 0;
        while (j < frutas.length) {
            if (j % 2 != 0) {
                System.out.println(frutas[j]);
            }
            j++;
        }
        // Comparar fruta
        System.out.println("- Comparemos fruta");
        String[] frutas2 = { "Plátano", "Melocotón", "Sandía", "Naranja", "Fresa" };
        for (int z = 0; z < frutas.length; z++) {
            for (int l=0; l<frutas2.length; l++){
                if (frutas2[l] == frutas[z]) {
                    System.out.println(frutas[z]);
                }
            }
            } System.out.println("Arándanos");
            } 
        } 
        

    