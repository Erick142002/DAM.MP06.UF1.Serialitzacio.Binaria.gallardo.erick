package Gallardo.Erick.dam.mp05.uf1.p02.serialitzacio.binaria.app;

import Gallardo.Erick.dam.mp05.uf1.p02.serialitzacio.binaria.controllers.CotxeSerialitzacioController;

public class Main {

    public static void main(String[] args) {
        // Inicializa el controlador de serialización de coches
        CotxeSerialitzacioController cotxeSerialitzacioController = CotxeSerialitzacioController.getInstance();

        // Verifica que el objeto no sea null antes de llamar a los métodos
        if (cotxeSerialitzacioController != null) {
            cotxeSerialitzacioController.serialitzaUnCotxe();
            cotxeSerialitzacioController.deserialitzaCotxe();
            cotxeSerialitzacioController.serialitzaLlistaCotxes();
            cotxeSerialitzacioController.deserialitzacioLlistaCotxes();
        } else {
            System.out.println("El controlador de serialización de coches no se inicializó correctamente.");
        }
    }
}

