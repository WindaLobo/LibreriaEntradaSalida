public class Main {

    public static void main(String[] args) throws Exception {
        LibreriaEntradSalida obx = new LibreriaEntradSalida();
        boolean isDK_ventana = false;
        boolean isDK_consola= false;

        /*isDK_ventana= com.dam.io.EstradaSalida.salida(" Hola ",com.dam.io.EstradaSalida.SALIDA_WINDOW);
        if(!isDK_ventana)System.out.println("Error");
        isDK_consola= com.dam.io.EstradaSalida.salida(" Hola " , com.dam.io.EstradaSalida.SALIDA_CONSOLA);
        if(!isDK_consola)System.out.println("Error");*/

        String nombre = LibreriaEntradSalida.entradaString("Cual es tu nombre?",LibreriaEntradSalida.CONSOLA);
        if(nombre == null){
            LibreriaEntradSalida.salida("Error", LibreriaEntradSalida.CONSOLA);
        }
        else{
            LibreriaEntradSalida.salida(nombre,LibreriaEntradSalida.CONSOLA);


        }


        Integer   numero = LibreriaEntradSalida.recibeInt("Introduce tu edad?",LibreriaEntradSalida.CONSOLA);
        if(numero == null){
            LibreriaEntradSalida.salida("Error",LibreriaEntradSalida.CONSOLA);
        }
        else{
            LibreriaEntradSalida.salida(numero.toString(),LibreriaEntradSalida.CONSOLA);

        }





    }

    }