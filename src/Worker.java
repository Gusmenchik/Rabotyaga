class Worker {
    private final Main.OnTaskDoneListener doneCallback;
    private final Main.OnTaskErrorListener errorCallback;

    public Worker(Main.OnTaskDoneListener doneCallback, Main.OnTaskErrorListener errorCallback) {
        this.doneCallback = doneCallback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("Error in task " + i);
            } else {
                doneCallback.onDone("Task " + i + " is done");
            }
        }
    }
}
