package it.epicode.gestione.prenotazioni;



import it.epicode.gestione.prenotazioni.entities.Utente;
import it.epicode.gestione.prenotazioni.entities.Prenotazione;
import it.epicode.gestione.prenotazioni.entities.Postazione;
import it.epicode.gestione.prenotazioni.entities.Edificio;
import it.epicode.gestione.prenotazioni.enums.Luoghi;
import it.epicode.gestione.prenotazioni.service.PrenotazioneService;
import it.epicode.gestione.prenotazioni.service.UtenteService;
import it.epicode.gestione.prenotazioni.service.PostazioneService;
import it.epicode.gestione.prenotazioni.service.EdificioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@PropertySource("application.properties")
@Component

public class Runner implements CommandLineRunner {
    @Autowired
    private EdificioService edificioService;

    @Autowired
    private PostazioneService postazioneService;

    @Autowired
    private UtenteService utenteService;

    @Autowired
    private PrenotazioneService prenotazioneService;

    static Logger logger = LoggerFactory.getLogger("logger1");


    @Override
    public void run(String... args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(GestionePrenotazioniApplication.class);

        Utente utente1 = new Utente();
        utente1.setUsername("Raffa");
        utente1.setNomeCompleto("Raffaella Carrà");
        utente1.setEmail("raffaella@Canta.com");

        Utente utente2 = new Utente();
        utente2.setUsername("L'imperatore");
        utente2.setNomeCompleto("Ronaldo");
        utente2.setEmail("IlFenomeno@1.com");

        Utente utente3 = new Utente();
        utente3.setUsername("Miky");
        utente3.setNomeCompleto("Topolino");
        utente3.setEmail("casa@topo.com");

        Utente utente4 = new Utente();
        utente4.setUsername("Superman");
        utente4.setNomeCompleto("Clark Kent");
        utente4.setEmail("superman@krypton.com");

        Utente utente5 = new Utente();
        utente5.setUsername("Batman");
        utente5.setNomeCompleto("Bruce Wayne");
        utente5.setEmail("batman@gotham.com");

        Utente utente6 = new Utente();
        utente6.setUsername("Spiderman");
        utente6.setNomeCompleto("Peter Parker");
        utente6.setEmail("spiderman@marvel.com");

        Utente utente7 = new Utente();
        utente7.setUsername("IronMan");
        utente7.setNomeCompleto("Tony Stark");
        utente7.setEmail("ironman@starkindustries.com");

        Utente utente8 = new Utente();
        utente8.setUsername("WonderWoman");
        utente8.setNomeCompleto("Diana Prince");
        utente8.setEmail("wonderwoman@amazon.com");

        Utente utente9 = new Utente();
        utente9.setUsername("Hulk");
        utente9.setNomeCompleto("Bruce Banner");
        utente9.setEmail("hulk@smash.com");

        Utente utente10 = new Utente();
        utente10.setUsername("Thor");
        utente10.setNomeCompleto("Thor Odinson");
        utente10.setEmail("thor@asgard.com");

        Utente utente11 = new Utente();
        utente11.setUsername("BlackWidow");
        utente11.setNomeCompleto("Natasha Romanoff");
        utente11.setEmail("blackwidow@shield.com");

        Utente utente12 = new Utente();
        utente12.setUsername("CaptainAmerica");
        utente12.setNomeCompleto("Steve Rogers");
        utente12.setEmail("captain@america.com");

        Utente utente13 = new Utente();
        utente13.setUsername("DoctorStrange");
        utente13.setNomeCompleto("Stephen Strange");
        utente13.setEmail("doctor@strange.com");

        Utente utente14 = new Utente();
        utente14.setUsername("AntMan");
        utente14.setNomeCompleto("Scott Lang");
        utente14.setEmail("antman@quantum.com");

        Utente utente15 = new Utente();
        utente15.setUsername("Wolverine");
        utente15.setNomeCompleto("Logan");
        utente15.setEmail("wolverine@xmen.com");



        Edificio edificio1 = new Edificio();
        edificio1.setCitta("New York");
        edificio1.setNome("Empire State Building");
        edificio1.setIndirizzo("Via dei sogni");

        Edificio edificio2 = new Edificio();
        edificio2.setCitta("Paris");
        edificio2.setNome("Eiffel Tower");
        edificio2.setIndirizzo("Champ de Mars, 5 Avenue Anatole");

        Edificio edificio3 = new Edificio();
        edificio3.setCitta("London");
        edificio3.setNome("Big Ben");
        edificio3.setIndirizzo("Westminster, London SW1A 0AA");

        Edificio edificio4 = new Edificio();
        edificio4.setCitta("Tokyo");
        edificio4.setNome("Tokyo Tower");
        edificio4.setIndirizzo("4 Chome-2-8 Shibakoen, Minato City");

        Edificio edificio5 = new Edificio();
        edificio5.setCitta("Sydney");
        edificio5.setNome("Sydney Opera House");
        edificio5.setIndirizzo("Bennelong Point, Sydney NSW 2000");


        Postazione postazione1 = new Postazione();

        postazione1.setLuoghi(Luoghi.OPENSPACE);
        postazione1.setNumMaxOccupanti(3);
        postazione1.setDescrizione("Sala open");
        postazione1.setEdificio(edificio1);

        Postazione postazione2 = new Postazione();

        postazione2.setLuoghi(Luoghi.SALA_RIUNIONI);
        postazione2.setNumMaxOccupanti(8);
        postazione2.setDescrizione("Riunione");
        postazione2.setEdificio(edificio1);

        Postazione postazione3 = new Postazione();
        postazione3.setLuoghi(Luoghi.PRIVATO);
        postazione3.setNumMaxOccupanti(1);
        postazione3.setDescrizione("Ufficio privato");
        postazione3.setEdificio(edificio2);

        Postazione postazione4 = new Postazione();
        postazione4.setLuoghi(Luoghi.OPENSPACE);
        postazione4.setNumMaxOccupanti(5);
        postazione4.setDescrizione("Sala open space");
        postazione4.setEdificio(edificio3);

        Postazione postazione5 = new Postazione();
        postazione5.setLuoghi(Luoghi.SALA_RIUNIONI);
        postazione5.setNumMaxOccupanti(10);
        postazione5.setDescrizione("Sala riunioni grande");
        postazione5.setEdificio(edificio4);

        Postazione postazione6 = new Postazione();
        postazione6.setLuoghi(Luoghi.PRIVATO);
        postazione6.setNumMaxOccupanti(2);
        postazione6.setDescrizione("Ufficio privato per due");
        postazione6.setEdificio(edificio5);


        edificioService.inserisciEdificio(edificio1);
        edificioService.inserisciEdificio(edificio2);
        edificioService.inserisciEdificio(edificio3);
        edificioService.inserisciEdificio(edificio4);
        edificioService.inserisciEdificio(edificio5);



        postazioneService.inserisciPostazione(postazione1);
        postazioneService.inserisciPostazione(postazione2);
        postazioneService.inserisciPostazione(postazione3);
        postazioneService.inserisciPostazione(postazione4);
        postazioneService.inserisciPostazione(postazione5);
        postazioneService.inserisciPostazione(postazione6);



        utenteService.inserisciUtente(utente1);
        utenteService.inserisciUtente(utente2);
        utenteService.inserisciUtente(utente3);
        utenteService.inserisciUtente(utente4);
        utenteService.inserisciUtente(utente5);
        utenteService.inserisciUtente(utente6);
        utenteService.inserisciUtente(utente7);
        utenteService.inserisciUtente(utente8);
        utenteService.inserisciUtente(utente9);
        utenteService.inserisciUtente(utente10);
        utenteService.inserisciUtente(utente11);
        utenteService.inserisciUtente(utente12);
        utenteService.inserisciUtente(utente13);
        utenteService.inserisciUtente(utente14);
        utenteService.inserisciUtente(utente15);





        try {
            Prenotazione prenotazione1 = new Prenotazione();
            prenotazione1.setPostazione(postazione1);
            prenotazione1.setDataPrenotata(LocalDate.now());
            prenotazione1.setUtente(utente9);
            prenotazioneService.inserisciPrenotazione(prenotazione1);

        } catch (PrenotazioneException e) {
            logger.error(e.getMessage());
        }

        try {
            Prenotazione prenotazione2 = new Prenotazione();
            prenotazione2.setPostazione(postazione1);
            prenotazione2.setDataPrenotata(LocalDate.now());
            prenotazione2.setUtente(utente11);
            prenotazioneService.inserisciPrenotazione(prenotazione2);
        } catch (PrenotazioneException e) {
            logger.error(e.getMessage());
        }

        try {
            Prenotazione prenotazione3 = new Prenotazione();
            prenotazione3.setPostazione(postazione2);
            prenotazione3.setDataPrenotata(LocalDate.now());
            prenotazione3.setUtente(utente2);
            prenotazioneService.inserisciPrenotazione(prenotazione3);
        } catch (PrenotazioneException e) {
            logger.error(e.getMessage());

        }

        try {
            Prenotazione prenotazione4 = new Prenotazione();
            prenotazione4.setPostazione(postazione2);
            prenotazione4.setDataPrenotata(LocalDate.of(2025,2,10));
            prenotazione4.setUtente(utente12);
            prenotazioneService.inserisciPrenotazione(prenotazione4);
        } catch (PrenotazioneException e) {
            logger.error(e.getMessage());

        }
        try {
            Prenotazione prenotazione5 = new Prenotazione();
            prenotazione5.setPostazione(postazione1);
            prenotazione5.setDataPrenotata(LocalDate.now());
            prenotazione5.setUtente(utente3);
            prenotazioneService.inserisciPrenotazione(prenotazione5);
        } catch (PrenotazioneException e) {
            logger.error(e.getMessage());
        }
        try {
            Prenotazione prenotazione6 = new Prenotazione();
            prenotazione6.setPostazione(postazione3);
            prenotazione6.setDataPrenotata(LocalDate.now());
            prenotazione6.setUtente(utente4); // Superman
            prenotazioneService.inserisciPrenotazione(prenotazione6);
        } catch (PrenotazioneException e) {
            logger.error(e.getMessage());
        }

        try {
            Prenotazione prenotazione7 = new Prenotazione();
            prenotazione7.setPostazione(postazione4);
            prenotazione7.setDataPrenotata(LocalDate.now().plusDays(1));
            prenotazione7.setUtente(utente5);
            prenotazioneService.inserisciPrenotazione(prenotazione7);
        } catch (PrenotazioneException e) {
            logger.error(e.getMessage());
        }

        try {
            Prenotazione prenotazione8 = new Prenotazione();
            prenotazione8.setPostazione(postazione5);
            prenotazione8.setDataPrenotata(LocalDate.now().plusDays(2));
            prenotazione8.setUtente(utente6);
            prenotazioneService.inserisciPrenotazione(prenotazione8);
        } catch (PrenotazioneException e) {
            logger.error(e.getMessage());
        }

        try {
            Prenotazione prenotazione9 = new Prenotazione();
            prenotazione9.setPostazione(postazione6);
            prenotazione9.setDataPrenotata(LocalDate.now().plusDays(3));
            prenotazione9.setUtente(utente13);
            prenotazioneService.inserisciPrenotazione(prenotazione9);
        } catch (PrenotazioneException e) {
            logger.error(e.getMessage());
        }

        try {
            Prenotazione prenotazione10 = new Prenotazione();
            prenotazione10.setPostazione(postazione3);
            prenotazione10.setDataPrenotata(LocalDate.now().plusDays(4));
            prenotazione10.setUtente(utente15);
            prenotazioneService.inserisciPrenotazione(prenotazione10);
        } catch (PrenotazioneException e) {
            logger.error(e.getMessage());
        }

        System.out.println(postazioneService.findByLuoghiECittaDiInteresse(Luoghi.OPENSPACE, "New York"));

    }
}