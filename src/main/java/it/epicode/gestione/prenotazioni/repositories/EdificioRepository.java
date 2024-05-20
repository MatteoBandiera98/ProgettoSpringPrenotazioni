package it.epicode.gestione.prenotazioni.repositories;



import it.epicode.gestione.prenotazioni.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EdificioRepository extends JpaRepository<Edificio,Integer> {

}