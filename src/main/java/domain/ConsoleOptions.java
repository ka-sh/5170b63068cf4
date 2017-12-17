package domain;

public enum ConsoleOptions {
    CREATE_CANVAS("C"),
    CREATE_LINE("L"),
    CREATE_RECTANGLE("R"),
    BUCKET_FILL("B");

    private String option;

    ConsoleOptions(String option) {
    }


    private void option(String option) {
        this.option = option;
    }
}
