package Three;

/**
 * Created by Александр on 21.04.2017.
 */
public class ProDocumentWorker extends DocumentWorker {
    void openDocument(){
        System.out.println("Документ открыт.");
    }
    void editDocument(){
        System.out.println("Документ отредактирован.");
    }
    void saveDocument(){
        System.out.println("Документ сохранён в старом формате, сохранение в остальных форматах доступно в версии Эксперт");
    }
}
