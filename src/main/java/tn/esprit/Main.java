// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.addTask(new Task(1, "go to the gym", "go to the gym at 7pm", false));
        toDoList.addTask(new Task(2, "go to the supermarket", "go to the supermarket at 8pm", false));
        toDoList.addTask(new Task(3, "go to the cinema", "go to the cinema at 9pm", false));
        toDoList.addTask(new Task(4, "go to the restaurant", "go to the restaurant at 10pm", false));
        toDoList.addTask(new Task(5, "go to the pub", "go to the pub at 11pm", false));
        toDoList.addTask(new Task(6, "go to the club", "go to the club at 12pm", false));
        toDoList.addTask(new Task(7, "go to the bed", "go to the bed at 1am", false));
        toDoList.addTask(new Task(8, "go to the sleep", "go to the sleep at 2am", false));

        System.out.println(toDoList);

    }
}