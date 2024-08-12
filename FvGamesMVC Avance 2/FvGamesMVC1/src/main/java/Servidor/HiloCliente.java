package Servidor;

import java.io.*;
import java.net.Socket;

public class HiloCliente implements Runnable {
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;

    public HiloCliente(Socket socket) {
        this.socket = socket;
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            String mensaje;
            while ((mensaje = in.readLine()) != null) {
                // Procesar mensajes del cliente
                System.out.println("Mensaje recibido: " + mensaje);
                // Enviar respuesta
                out.println("Mensaje recibido");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
