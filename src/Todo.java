public class Todo {

    private int id;
    private String title;
    private boolean completed;

    public Todo(int id, String title, boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    public Todo(int id, String title) {
        this(id, title, false);
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void markCompleted() {
        this.completed = true;
    }

    public void markPending() {
        this.completed = false;
    }

    public String toFileFormat() {
        return id + "," + title + "," + completed;
    }

    public static Todo fromFileFormat(String line) {
        String[] parts = line.split(",", 3);
        int id = Integer.parseInt(parts[0]);
        String title = parts[1];
        boolean completed = Boolean.parseBoolean(parts[2]);
        return new Todo(id, title, completed);
    }

    @Override
    public String toString() {
        return id + ". " + title + " [" + (completed ? "Done" : "Pending") + "]";
    }
}