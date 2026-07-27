import javax.swing.*;

public class Ejercicio5 {

    public static void main(String[] args){

        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menú\n" + "1. Saludar\n" + "2. Salir"));

            if (opcion == 1){
                JOptionPane.showMessageDialog(null, "HOLA!!");
            }
        }while (opcion != 2);

        JOptionPane.showMessageDialog(null, "Menu finalizado");
    }
}
