import javax.swing.*;

public class Ejercicio2 {

    public static void main(String[] args){

        int numeros;
        int suma = 0;

        do {
            numeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: \n0 para terminar "));

            suma = suma + numeros;
        }while (numeros != 0);

        JOptionPane.showMessageDialog(null, "La suma es: " + suma);
    }
}
