
public class AppMessages {

    public static final String APP_HEADER = "\n===== TODO APP =====";
    public static final String MENU =
            "1. Add Task\n" +
                    "2. Show All Tasks\n" +
                    "3. Complete Task\n" +
                    "4. Delete Task\n" +
                    "5. Update Task Title\n" +
                    "6. Exit";

    public static final String ENTER_CHOICE = "Enter your choice: ";
    public static final String ENTER_TITLE = "Enter task title: ";
    public static final String ENTER_ID_COMPLETE = "Enter task id to mark complete: ";
    public static final String ENTER_ID_DELETE = "Enter task id to delete: ";
    public static final String ENTER_ID_UPDATE = "Enter task id to update: ";
    public static final String ENTER_NEW_TITLE = "Enter new task title: ";

    public static final String TASK_ADDED = "Task added successfully.";
    public static final String TASK_DELETED = "Task deleted successfully.";
    public static final String TASK_COMPLETED = "Task marked as completed.";
    public static final String TASK_ALREADY_COMPLETED = "Task is already completed.";
    public static final String TASK_UPDATED = "Task updated successfully.";
    public static final String TASK_NOT_FOUND = "Task not found.";
    public static final String EMPTY_TASK = "Task title cannot be empty.";
    public static final String INVALID_NUMBER = "Invalid input. Please enter a valid number.";
    public static final String NO_TASKS = "No tasks found.";
    public static final String EXIT_MESSAGE = "Exiting Todo App. Goodbye!";
    public static final String FILE_SAVE_ERROR = "Could not save tasks to file.";
    public static final String FILE_LOAD_ERROR = "Could not load tasks from file.";

    private AppMessages() {
    }
}