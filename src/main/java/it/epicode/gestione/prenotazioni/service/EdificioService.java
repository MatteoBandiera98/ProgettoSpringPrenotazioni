package it.epicode.gestione.prenotazioni.service;



import it.epicode.gestione.prenotazioni.entities.Edificio;
import it.epicode.gestione.prenotazioni.repositories.EdificioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EdificioService {

    @Autowired
    public EdificioRepository edificioRepository;

    public void inserisciEdificio(Edificio edificio){
        edificioRepository.save(edificio);
    }

    public Edificio getEdificioById(int id){
        return edificioRepository.findById(id).get();
    }

    public List<Edificio> getAllEdifici(){
        return edificioRepository.findAll();
    }

    public void eliminaEdificio(Edificio edificio){
        edificioRepository.delete(edificio);
    }
}