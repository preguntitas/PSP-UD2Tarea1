import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgramaRuntime {
    public static void main(String[] args){
        if (args.length > 0) {
            try {
                Process proceso = Runtime.getRuntime().exec(args);
                BufferedReader lector = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
                String linea;
                while ((linea = lector.readLine()) != null) { // mientras haya flujo de datos
                    System.out.println("Buffer: " + linea);
                }
                int codigoSalida = proceso.waitFor();
                // mostramos el codigo de salida
                System.out.println("El comando ha terminado por un código de " + codigoSalida);

            } catch (IOException e) {
                System.out.println("Error al ejecutar el comando: " + e.getMessage());
            } catch (InterruptedException e) {
                System.out.println("El proceso se ha interrumpido: " + e.getMessage());
            }
        }else{
            System.out.println("No se ha introducido ningún comando");
        }
    }
}