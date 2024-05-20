package it.epicode.gestione.prenotazioni.repositories;

import it.epicode.gestione.prenotazioni.entities.Postazione;
import it.epicode.gestione.prenotazioni.enums.Luoghi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostazioneRepository extends JpaRepository<Postazione,Integer> {


    @Query("select p from Postazione p where p.luoghi = :luoghi and p.edificio.citta = :citta")
    public List<Postazione> findByLuoghiAndCittaDiInteresse(Luoghi luoghi, String citta);
}