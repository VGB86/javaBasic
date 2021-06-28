package inyecciondependencia;

import java.util.Stack;

public class Empresa {
    Stack <String> listaMensajes = new Stack<>();
    Envio envio;
    
    public Empresa() {
    }
    
    public void enviarTodaLaLista(Stack listaMensajes) {
        listaMensajes.empty();
        System.out.println("Mensajes entregados, no hay nada en la pila");
    }
    
    public void envioNormal(String pMensaje) {
        
        if (listaMensajes.size() >= 10) {
            enviarTodaLaLista(listaMensajes);
            System.out.println("Ya hay 10 envios");
        } else {
            listaMensajes.push(pMensaje);
            System.out.println("Añadimos a la bandeja de salida");
        }
        
    }
    
    public void envioUrgente(String mensaje) {
        listaMensajes.push(mensaje);
        System.out.println("Mensaje urgente recibido");
        enviarTodaLaLista(listaMensajes);
    }
    
    public void prepararEnvio(ListaMensajes listaMensajes) {
        envio.enviarMensaje(listaMensajes);
    }

    public void setEnvio(Envio envio) {
        this.envio = envio;
    }
}
