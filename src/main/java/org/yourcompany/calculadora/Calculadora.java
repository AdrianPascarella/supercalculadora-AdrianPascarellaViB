package org.yourcompany.calculadora;

/**
 *
 * @author Adrian Pascarella
 */


public class Calculadora {

    public static void main(String[] args) {


        // Exemples de crida per al mètode nombreDigits
        System.out.println("Nombre de dígits de 1234: " + nombreDigits(1234));
        System.out.println("Nombre de dígits de 56789: " + nombreDigits(56789));
        System.out.println("Nombre de dígits de -101010: " + nombreDigits(-101010));
        System.out.println("Nombre de dígits de 0: " + nombreDigits(0));

        // Exemples de crida per al mètode sumaPrimersNumeros
        System.out.println("Suma dels primers -5 números: " + sumaPrimersNumeros(-5));
        System.out.println("Suma dels primers 10 números: " + sumaPrimersNumeros(10));
        System.out.println("Suma dels primers 15 números: " + sumaPrimersNumeros(15));

        // Exemples de crida per al mètode calcularFactorial
        System.out.println("Factorial de 5: " + calcularFactorial(5));
        System.out.println("Factorial de -7: " + calcularFactorial(-7));
        System.out.println("Factorial de 10: " + calcularFactorial(10));

        // Exemples de crida per al mètode sumaQuadrats
        System.out.println("Suma dels quadrats dels primers -3 números: " + sumaQuadrats(-3));
        System.out.println("Suma dels quadrats dels primers 5 números: " + sumaQuadrats(5));
        System.out.println("Suma dels quadrats dels primers 7 números: " + sumaQuadrats(7));

        // Exemples de crida per al mètode calcularPotencia
        System.out.println("2 elevat a la potència 3: " + calcularPotencia(2, 3));
        System.out.println("5 elevat a la potència 4: " + calcularPotencia(5, 4));
        System.out.println("3 elevat a la potència 5: " + calcularPotencia(3, 5));
        
    }

    /**
     * Calcula el nombre de dígits d’un número enter.
     * Funciona tant per a nombres positius com negatius.
     * Si el nombre és 0, retorna 1.
     *
     * @param nombre Número del qual es vol saber el nombre de dígits
     * @return Quantitat de dígits que té {@code nombre}
     */
    public static int nombreDigits(int nombre) {
        if (nombre == 0) {
            return 1; // el 0 té un dígit
        }        
        int comptador = 0;
        while (nombre != 0) {
            nombre /= 10;
            comptador++;
        }
        return comptador;
    }

    /**
     * Retorna la suma dels primers n números positius o negatius.
     * Funciona per a nombres positius i negatius.
     *
     * @param nombre Número més allunyat de 0 dels que sumarem
     * @return El sumatori dels nombres des de el {@code nombre} fins al 0
     */
    public static int sumaPrimersNumeros(int nombre) {
        int comptador, sumatori = 0;
        boolean positiu;
        positiu = (nombre>=0) ? true:false;
        if (!positiu) {nombre*=-1;}
        comptador=nombre+1;
        while (comptador != 0) {
            comptador--;
            sumatori += comptador;
        }
        if (!positiu) {return sumatori*=-1;}
        return sumatori;
    }

    /**
     * Retorna el producte factorial del número.
     * Funciona per a nombres positius i negatius.
     *
     * @param nombre Número del que calcularem el producte factorial
     * @return La suma factorial del nombre {@code nombre}
     */
    public static int calcularFactorial(int nombre) {
        int actual, factorial;
        boolean positiu;
        positiu = (nombre>=0) ? true:false;
        if (!positiu) {nombre*=-1;}
        factorial=nombre;
        actual=nombre;
        while (actual != 1) {
            actual--;
            factorial*=actual;
        }
        if (!positiu) {
            return factorial*=-1;
        }
        return factorial;
    }

    /**
     * Retorna el sumatori dels quadrats dels n primers números.
     * Funciona per a nombres positius i negatius, el resultat sempre es positiu.
     *
     * @param nombre Número del que calcularem el sumatori de quadrats
     * @return El sumatori dels quadrats del nombre {@code nombre}
     */
    public static int sumaQuadrats(int nombre) {
        int comptador, sumatori = 0;
        boolean positiu;
        positiu = (nombre>=0) ? true:false;
        if (!positiu) {nombre*=-1;}
        comptador=nombre+1;
        while (comptador != 0) {
            comptador--;
            sumatori += comptador*comptador;
        }
        return sumatori;
    }

    /**
     * Retorna el resultat de elevar una base a un exponent.
     * Funciona per a nombres positius.
     *
     * @param base Número que serà multiplicat per si mateix
     * @param exponent Número de vegades que es repeteix la multiplicació
     * @return El producte final de elevar la base {@code base} a l'exponent {@code exponent}
     */
    public static int calcularPotencia(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        int resultado = base;
        for (int i = 1; i < exponent; i++) {
            int sumaParcial = 0;
            for (int j = 0; j < base; j++) {
                sumaParcial += resultado;
            }
            resultado = sumaParcial;
        }
        return resultado;
    }

}