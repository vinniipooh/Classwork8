package Three;

/**
 * Created by Александр on 21.04.2017.
 */
public class ExpertDocumentWorker extends ProDocumentWorker {
    void openDocument(){
        System.out.println("Документ открыт.");
    }
    void editDocument(){
        System.out.println("Документ отредактирован.");
    }
    void saveDocument(){
        System.out.println("Документ сохранён в новом формате.");
    }
}
