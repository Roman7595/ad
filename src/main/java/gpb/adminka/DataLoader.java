package gpb.adminka;

import gpb.adminka.model.Document;
import gpb.adminka.model.Carr;
import gpb.adminka.repository.DocumentRepository;
import gpb.adminka.repository.CarrRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.HashMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final CarrRepository carrRepository;
    private final DocumentRepository documentRepository;

    public DataLoader(CarrRepository carrRepository, DocumentRepository documentRepository) {
        this.carrRepository = carrRepository;
        this.documentRepository = documentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        HashMap<Integer, Carr> carr = new HashMap<>();
        carrRepository.put(new Carr(1, "rr222r22"));
        carrRepository.put( new Carr(2, "tt222y22"));


        documentRepository.put(new Document(1, "ab-a", LocalDate.of(1,1,1), LocalDate.of(2,2,2),1));
        documentRepository.put(new Document(2, "ab-a", LocalDate.of(1,1,1), LocalDate.of(2,2,2),2));
        documentRepository.put(new Document(3, "ab-a", LocalDate.of(1,1,1), LocalDate.of(2,2,2),1));
        documentRepository.put(new Document(4, "ab-a", LocalDate.of(1,1,1), LocalDate.of(2,2,2),1));
        documentRepository.put(new Document(5, "ab-a", LocalDate.of(1,1,1), LocalDate.of(2,2,2),2));
        documentRepository.put(new Document(6, "ab-a", LocalDate.of(1,1,1), LocalDate.of(2,2,2),1));
        documentRepository.put(new Document(7, "ab-a", LocalDate.of(1,1,1), LocalDate.of(2,2,2),1));
        documentRepository.put(new Document(8, "ab-a", LocalDate.of(1,1,1), LocalDate.of(2,2,2),2));
        documentRepository.put(new Document(9, "ab-a", LocalDate.of(1,1,1), LocalDate.of(2,2,2),1));


    }
}