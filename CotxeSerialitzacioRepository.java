package Gallardo.Erick.dam.mp05.uf1.p02.serialitzacio.binaria.model.repository;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Gallardo.Erick.dam.mp05.uf1.p02.serialitzacio.binaria.model.domain.Cotxe;

public class CotxeSerialitzacioRepository {

    private CotxeSerialitzacioRepository() {}

    public static CotxeSerialitzacioRepository getInstance() {
		return null;
        // Implementación del patrón Singleton
    }

    public void serialitzaCotxe(Cotxe cotxe) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cotxe.ser"))) {
            oos.writeObject(cotxe);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Cotxe deserialitzaCotxe() {
        Cotxe cotxe = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cotxe.ser"))) {
            cotxe = (Cotxe) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return cotxe;
    }
}
