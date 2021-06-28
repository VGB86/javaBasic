/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inyecciondependencia;

public class InyeccionDependencia {

    public static void main(String[] args) {
        Empresa acme = new Empresa();
        ServicioPostal carta = new ServicioPostal();
        ServicioElectronico mail = new ServicioElectronico();

        acme.setEnvio(mail);
        acme.setEnvio(carta);

        String mensaje = "Lorem fistrum la caidita ese pedazo de de la pradera se calle ustée.";

        //acme.envioUrgente(mensaje);

        for (int i = 0; i <= 10; i++) {
            acme.envioNormal(mensaje);
        }
    }

}
