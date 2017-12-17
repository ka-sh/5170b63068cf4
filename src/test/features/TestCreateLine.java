package features;

import domain.Canvas;
import org.junit.Test;

public class TestCreateLine {
    @Test
    public void rosy() throws Exception {
        Canvas canvas = new CreateCanvas().execute(null, new String[]{"3", "3"});
        new DrawLine().execute(canvas, new String[]{"0", "0", "2", "0"});
        System.out.println(canvas.toString());
    }

}
