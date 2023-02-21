import java.util.Scanner;
import javax.swing.JOptionPane;

public class LibreriaEntradSalida {

    public static final int CONSOLA = 1;
    public static final int WINDOW = 2;

    /**
     * salida de consola o ventana;
     *
     * @param mensaje cadena que queremos introducir;
     * @param opcion  dispositivo de salida ventana (SALIDA_CONSOLA) o consola (SALIDA_WINDOW);
     * @return si es true Y si no false;
     * @return creamos un metodo que recibe un string devuelve un string
     * @return creamos un metodo que recibe un entero y devuelve un entero
     */
    public static void salida(String mensaje, int opcion) {
        switch (opcion) {
            case CONSOLA:
                System.out.println(mensaje);
                break;
            case WINDOW:
                JOptionPane.showMessageDialog(null, mensaje);
                break;
        }
    }

    public static String entradaString(String comentario, int opcion) {
        switch (opcion) {
            case WINDOW:
                return JOptionPane.showInputDialog(comentario);
            case CONSOLA:
                Scanner entrada = new Scanner(System.in);
                System.out.println(comentario);
                return entrada.nextLine();

        }
        return null;
    }

    public static Integer recibeInt(String comentario, int opcion) throws Exception {
        try {
            switch (opcion) {
                case WINDOW:
                    return Integer.parseInt(JOptionPane.showInputDialog(comentario));
                case CONSOLA:
                    Scanner entrada = new Scanner(System.in);
                    System.out.println(comentario);
                    return entrada.nextInt();
            }
        } catch (Exception ex) {
            throw new Exception("Formato no valido");
        }
        return null;
    }

    public static Float recibefloat(String comentario, int opcion) throws Exception {
        try {
            switch (opcion) {
                case WINDOW:
                    return Float.parseFloat(JOptionPane.showInputDialog(comentario));
                case CONSOLA:
                    Scanner entrada = new Scanner(System.in);
                    System.out.println(comentario);
                    return entrada.nextFloat();
            }
        } catch (Exception ex) {
            throw new Exception("Formato no valido");
        }
        return null;
    }
}
