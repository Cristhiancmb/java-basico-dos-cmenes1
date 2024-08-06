
/*public class Main {
    public static void main(String[] args) {
        int suma = 0;
        int numero = 1;

        if (numero <= 10) {
            suma += numero;
            numero++;
        }
        if (numero <= 10) {
            suma += numero;
            numero++;
        }
        if (numero <= 10) {
            suma += numero;
            numero++;
        }
        if (numero <= 10) {
            suma += numero;
            numero++;
        }
        if (numero <= 10) {
            suma += numero;
            numero++;
        }
        if (numero <= 10) {
            suma += numero;
            numero++;
        }
        if (numero <= 10) {
            suma += numero;
            numero++;
        }
        if (numero <= 10) {
            suma += numero;
            numero++;
        }
        if (numero <= 10) {
            suma += numero;
            numero++;
        }
        if (numero <= 10) {
            suma += numero;
        }

        System.out.println("La sumatoria es: " + suma);
    }
} */

// usando for
/*public class Main {
    public static void main(String[] args) {
        int suma = 0;

        for (int i = 1; i <= 10; i++) {
            suma += i;
        }

        System.out.println("La sumatoria es: " + suma);
    }
} */

//usando while
public class Main {
    public static void main(String[] args) {
        int suma = 0;
        int numero = 1;
        
        while (numero <= 10) {
            suma += numero;
            numero++;
        }

        System.out.println("La sumatoria es: " + suma);
    }
}