package it.epicode.gestione.prenotazioni.service;



import it.epicode.gestione.prenotazioni.entities.Postazione;
import it.epicode.gestione.prenotazioni.enums.Luoghi;
import it.epicode.gestione.prenotazioni.repositories.PostazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostazioneService {

    @Autowired
    private PostazioneRepository postazioneRepository;


    public void inserisciPostazione(Postazione postazione){
        postazioneRepository.save(postazione);
    }

    public Postazione getPostazioneById(int id){
        return postazioneRepository.findById(id).get();
    }

    public List<Postazione> getAllPostazioni(){
        return postazioneRepository.findAll();
    }

    public void eliminaPostazione(Postazione postazione){
        postazioneRepository.delete(postazione);
    }



    public List<Postazione> findByLuoghiECittaDiInteresse(Luoghi luoghi, String citta){
        return postazioneRepository.findByLuoghiAndCittaDiInteresse(luoghi,citta);

    }


}
