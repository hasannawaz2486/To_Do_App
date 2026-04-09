import java.util.ArrayList;
import java.util.List;

public class TodoController {

    private List<Todo> todos;
    private int nextId;
    private FileManager fileManager;

    public TodoController(FileManager fileManager) {
        this.fileManager = fileManager;
        this.todos = fileManager.loadTodos();
        this.nextId = generateNextId();
    }

    public boolean addTodo(String title) {
        if (title == null || title.trim().isEmpty()) {
            return false;
        }

        Todo todo = new Todo(nextId++, title.trim());
        todos.add(todo);
        save();
        return true;
    }

    public List<Todo> getAllTodos() {
        return new ArrayList<>(todos);
    }

    public boolean completeTodo(int id) {
        Todo todo = findTodoById(id);

        if (todo == null) {
            return false;
        }

        if (todo.isCompleted()) {
            return false;
        }

        todo.markCompleted();
        save();
        return true;
    }

    public boolean deleteTodo(int id) {
        Todo todo = findTodoById(id);

        if (todo == null) {
            return false;
        }

        todos.remove(todo);
        save();
        return true;
    }

    public boolean updateTodoTitle(int id, String newTitle) {
        Todo todo = findTodoById(id);

        if (todo == null || newTitle == null || newTitle.trim().isEmpty()) {
            return false;
        }

        todo.setTitle(newTitle.trim());
        save();
        return true;
    }

    public Todo findTodoById(int id) {
        for (Todo todo : todos) {
            if (todo.getId() == id) {
                return todo;
            }
        }
        return null;
    }

    private int generateNextId() {
        int maxId = 0;
        for (Todo todo : todos) {
            if (todo.getId() > maxId) {
                maxId = todo.getId();
            }
        }
        return maxId + 1;
    }

    private void save() {
        fileManager.saveTodos(todos);
    }
}