package gpb.adminka.repository;

import gpb.adminka.model.Document;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class DocumentRepository {
    private HashMap<Integer, Document> docs = new HashMap<>();

    public DocumentRepository() {}


    public HashMap<Integer, Document> getDocs() {
        return docs;
    }

    public Document getDocs(Integer id) {
        return docs.get(id);
    }
    public Document put(Document document) {
        return docs.put(document.getId(), document);
    }

}