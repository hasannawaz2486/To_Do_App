import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileManager fileManager = new FileManager("tasks.txt");
        TodoController controller = new TodoController(fileManager);

        while (true) {
            showMenu();
            int choice = readInt(scanner, AppMessages.ENTER_CHOICE);

            switch (choice) {
                case 1:
                    System.out.print(AppMessages.ENTER_TITLE);
                    String title = scanner.nextLine();

                    if (controller.addTodo(title)) {
                        System.out.println(AppMessages.TASK_ADDED);
                    } else {
                        System.out.println(AppMessages.EMPTY_TASK);
                    }
                    break;

                case 2:
                    showTodos(controller.getAllTodos());
                    break;

                case 3:
                    int completeId = readInt(scanner, AppMessages.ENTER_ID_COMPLETE);
                    Todo todoToComplete = controller.findTodoById(completeId);

                    if (todoToComplete == null) {
                        System.out.println(AppMessages.TASK_NOT_FOUND);
                    } else if (todoToComplete.isCompleted()) {
                        System.out.println(AppMessages.TASK_ALREADY_COMPLETED);
                    } else {
                        controller.completeTodo(completeId);
                        System.out.println(AppMessages.TASK_COMPLETED);
                    }
                    break;

                case 4:
                    int deleteId = readInt(scanner, AppMessages.ENTER_ID_DELETE);

                    if (controller.deleteTodo(deleteId)) {
                        System.out.println(AppMessages.TASK_DELETED);
                    } else {
                        System.out.println(AppMessages.TASK_NOT_FOUND);
                    }
                    break;

                case 5:
                    int updateId = readInt(scanner, AppMessages.ENTER_ID_UPDATE);
                    System.out.print(AppMessages.ENTER_NEW_TITLE);
                    String newTitle = scanner.nextLine();

                    if (controller.updateTodoTitle(updateId, newTitle)) {
                        System.out.println(AppMessages.TASK_UPDATED);
                    } else {
                        System.out.println(AppMessages.TASK_NOT_FOUND);
                    }
                    break;

                case 6:
                    System.out.println(AppMessages.EXIT_MESSAGE);
                    scanner.close();
                    return;

                default:
                    System.out.println(AppMessages.INVALID_NUMBER);
            }
        }
    }

    private static void showMenu() {
        System.out.println(AppMessages.APP_HEADER);
        System.out.println(AppMessages.MENU);
    }

    private static int readInt(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(AppMessages.INVALID_NUMBER);
            }
        }
    }

    private static void showTodos(List<Todo> todos) {
        if (todos.isEmpty()) {
            System.out.println(AppMessages.NO_TASKS);
            return;
        }

        System.out.println("\n--- Todo List ---");
        for (Todo todo : todos) {
            System.out.println(todo);
        }
    }
}