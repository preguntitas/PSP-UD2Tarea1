import java.io.IOException;

public class ProcesoNotepad {
    public static void main(String[] args) {
        try {
        Process notepad = new ProcessBuilder("notepad.exe").start();
        while(notepad.isAlive()){
            //Entra si esta vivo
            System.out.println("Está vivo!");
            Thread.sleep(3000);
            }
        } catch (IOException e) {
            System.out.println("Error al ejecutar el proceso: " + e.getMessage());
        } catch(InterruptedException e) {
            System.out.println("EL proceso se ha interrumpido: " + e.getMessage());
        }
        //Ya no está vivo
        System.out.println("Ya no está vivo");
    }
}
