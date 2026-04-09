import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private final String fileName;

    public FileManager(String fileName) {
        this.fileName = fileName;
    }

    public void saveTodos(List<Todo> todos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Todo todo : todos) {
                writer.write(todo.toFileFormat());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println(AppMessages.FILE_SAVE_ERROR);
        }
    }

    public List<Todo> loadTodos() {
        List<Todo> todos = new ArrayList<>();
        File file = new File(fileName);

        if (!file.exists()) {
            return todos;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    todos.add(Todo.fromFileFormat(line));
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println(AppMessages.FILE_LOAD_ERROR);
        }

        return todos;
    }
}