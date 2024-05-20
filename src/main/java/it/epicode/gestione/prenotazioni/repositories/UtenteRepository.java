package it.epicode.gestione.prenotazioni.repositories;

import it.epicode.gestione.prenotazioni.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtenteRepository extends JpaRepository<Utente, Integer> {
}