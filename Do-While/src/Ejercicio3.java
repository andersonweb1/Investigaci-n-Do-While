import javax.swing.*;

public class Ejercicio3 {

    public static void main(String[] args){

        String clave;

        do {
            clave = JOptionPane.showInputDialog("Ingrese la contraseña: ");
        }while (!clave.equals("1234"));

        JOptionPane.showMessageDialog(null , "Contraseña correcta");
    }
}
