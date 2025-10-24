package org.yourcompany.calculadora;
import java.text.DecimalFormat;

/**
 *
 * @author Posa el teu nom
 */


public class Calculadora {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.00");


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
        // System.out.println("Factorial de 5: " + calcularFactorial(5));
        // System.out.println("Factorial de 7: " + calcularFactorial(7));
        // System.out.println("Factorial de 10: " + calcularFactorial(10));

        // Exemples de crida per al mètode sumaQuadrats
        // System.out.println("Suma dels quadrats dels primers 3 números: " + sumaQuadrats(3));
        // System.out.println("Suma dels quadrats dels primers 5 números: " + sumaQuadrats(5));
        // System.out.println("Suma dels quadrats dels primers 7 números: " + sumaQuadrats(7));

        // Exemples de crida per al mètode calcularPotencia
        // System.out.println("2 elevat a la potència 3: " + calcularPotencia(2, 3));
        // System.out.println("5 elevat a la potència 4: " + calcularPotencia(5, 4));
        // System.out.println("3 elevat a la potència 5: " + calcularPotencia(3, 5));

       System.out.println("Precio entrada cine en fin de semana con Carnet Jove: "+df.format(precioEntradaCine(5, true, true))+"€");
        
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
        if (nombre<0) {comptador=nombre-1;}
        else {comptador=nombre+1;}
        while (comptador != 0) {
            if (nombre<0) {comptador++;}
            else {comptador--;}
            sumatori += comptador;
        }
        return sumatori;
    }

    /**
     * Retorna 
     * Funciona per a nombres positius i negatius.
     *
     * @param nombre Número més allunyat de 0 dels que sumarem
     * @return El sumatori dels nombres des de el {@code nombre} fins al 0
     */
    public static Double precioEntradaCine(double precioBase, boolean finDeSemana, boolean esJove) {
        double precioFinal, porcentajeAumentoCap=0.15, porcentajeDescuentoJove=0.15;
        precioFinal = precioBase;
        if (finDeSemana) { precioFinal += precioFinal * porcentajeAumentoCap; }
        if (esJove) {precioFinal -= precioFinal * porcentajeDescuentoJove; }
        return precioFinal;
    }
    
}