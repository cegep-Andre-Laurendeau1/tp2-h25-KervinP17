package ca.cal.tp2.service;

import ca.cal.tp2.modele.Document;
import ca.cal.tp2.repository.DocumentRepository;

public class DocumentService {

    private final DocumentRepository documentRepository;

    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    public void createDocument(String titre, int nombreExemplaires) {
        documentRepository.save(new Document(titre, nombreExemplaires));
    }
}
