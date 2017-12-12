package options;

/**
 * Created by jb on 12/11/17.
 */
public class CreateCanvas implements Feature {
    public String About() {
        return "C w h\tShould create a new canvas of width w and height h.";
    }

    public String getOption() {
        return "C";
    }

    public void validate(String[] params) throws Exception {

    }

    public void execute(String[][] canvas, String[] params) {

    }
}
