package gpb.adminka.api.controller;

import gpb.adminka.model.Document;
import gpb.adminka.repository.DocumentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/docs")
public class DocumentController {

    private final DocumentRepository documentRepository;

    public DocumentController(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    @GetMapping
    public Map<Integer, Document> getAllDocs() {
        return documentRepository.getDocs();
    }


    @PostMapping
    public Document createDocs(@RequestBody Document document) {
        documentRepository.put(document);
        return document;
    }

    @GetMapping("/{id}")
    public Document getDocById(@PathVariable int id) {
        return documentRepository.getDocs(id);
    }


}