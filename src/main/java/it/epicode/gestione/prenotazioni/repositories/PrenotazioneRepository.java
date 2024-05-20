package it.epicode.gestione.prenotazioni.repositories;



import it.epicode.gestione.prenotazioni.entities.Postazione;
import it.epicode.gestione.prenotazioni.entities.Prenotazione;
import it.epicode.gestione.prenotazioni.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione,Integer> {

    public List<Prenotazione> findByDataPrenotataAndPostazione(LocalDate data, Postazione postazione);



    public List<Prenotazione> findByDataPrenotataAndUtente(LocalDate data, Utente utente);



}