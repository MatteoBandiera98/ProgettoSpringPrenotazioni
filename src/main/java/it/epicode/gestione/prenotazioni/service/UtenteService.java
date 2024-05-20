package it.epicode.gestione.prenotazioni.service;



import it.epicode.gestione.prenotazioni.entities.Utente;
import it.epicode.gestione.prenotazioni.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtenteService {
    @Autowired
    private UtenteRepository utenteRepository;

    public void inserisciUtente(Utente utente){
        utenteRepository.save(utente);
    }

    public Utente getUtenteById(int id){
        return utenteRepository.findById(id).get();
    }

    public List<Utente> getAllUtenti(){
        return utenteRepository.findAll();
    }

    public void eliminaUtente(Utente utente){
        utenteRepository.delete(utente);
    }

}
