public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener taskDoneListener = System.out::println;
        OnTaskErrorListener taskErrorListener = System.err::println;

        Worker worker = new Worker(taskDoneListener, taskErrorListener);
        worker.start();
    }
}
