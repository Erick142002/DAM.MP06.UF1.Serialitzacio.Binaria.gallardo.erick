package Gallardo.Erick.dam.mp05.uf1.p02.serialitzacio.binaria.controllers;

import Gallardo.Erick.dam.mp05.uf1.p02.serialitzacio.binaria.model.domain.Cotxe;

public class CotxeSerialitzacioController {

    private static final CotxeSerialitzacioController CotxeSerialitzacioService = null;

	private CotxeSerialitzacioController() {}

    public static CotxeSerialitzacioController getInstance() {
		return null;
        // Implementación del patrón Singleton
    }

    public void serialitzaCotxe(Cotxe cotxe) {
        CotxeSerialitzacioController.getInstance().serialitzaCotxe(cotxe);
    }

    public Cotxe deserialitzaCotxe() {
        return CotxeSerialitzacioController.getInstance().deserialitzaCotxe();
    }

	public void serialitzaUnCotxe() {
		// TODO Auto-generated method stub
		
	}

	public void serialitzaLlistaCotxes() {
		// TODO Auto-generated method stub
		
	}

	public void deserialitzacioLlistaCotxes() {
		// TODO Auto-generated method stub
		
	}

	public static CotxeSerialitzacioController getCotxeserialitzacioservice() {
		return CotxeSerialitzacioService;
	}
}