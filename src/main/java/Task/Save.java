package Task;

import Task.Product.Product;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;

public class Save {
    public void saveInFile(Collection<Participant> collection, String path) {
        try (FileWriter fileWriter = new FileWriter(path, false)){
            collection.forEach(el -> {
                try {
                    fileWriter.write(el.toString() + "\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
