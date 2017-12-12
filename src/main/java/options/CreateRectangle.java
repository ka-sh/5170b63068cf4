package options;

/**
 * Created by jb on 12/11/17.
 */
public class CreateRectangle extends Feature {
    public String About() {
        return "R x1 y1 x2 y2   Should create a new rectangle, whose upper left corner is (x1,y1) and\n" +
                "                lower right corner is (x2,y2). Horizontal and vertical lines will be drawn\n" +
                "                using the 'x' character.";
    }

    public String getOption() {
        return null;
    }

    public void validate(String[] params) throws Exception {

    }

    public void execute(String[][] canvas, String[] params) throws Exception {

    }
}
