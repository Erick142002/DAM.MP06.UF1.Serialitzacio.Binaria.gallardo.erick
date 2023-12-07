package Gallardo.Erick.dam.mp05.uf1.p02.serialitzacio.binaria.model.service;

import Gallardo.Erick.dam.mp05.uf1.p02.serialitzacio.binaria.model.domain.Cotxe;

public class CotxeSerialitzacioService {

    private static final CotxeSerialitzacioService CotxeSerialitzacioRepository = null;

	private CotxeSerialitzacioService() {}

    public CotxeSerialitzacioService getInstance() {
		return null;
        // Implementación del patrón Singleton
    }

    public void serialitzaCotxe(Cotxe cotxe) {
        CotxeSerialitzacioRepository.getInstance().serialitzaCotxe(cotxe);
    }

    public Cotxe deserialitzaCotxe() {
        return CotxeSerialitzacioRepository.getInstance().deserialitzaCotxe();
    }
}
