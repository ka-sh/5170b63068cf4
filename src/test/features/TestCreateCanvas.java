package features;

import Exceptions.FeatureException;
import domain.Canvas;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class TestCreateCanvas {

    @Test
    public void testCreateCanvas_Rosy() throws Exception {
        Canvas canvas = new CreateCanvas().execute(null, new String[]{"3", "3"});
        System.out.println(canvas.toString());
        assertNotNull(canvas.getWindow());
        System.out.println(Arrays.toString(canvas.getWindow()[0]));
    }

    @Test(expected = FeatureException.class)
    public void testCreateCanvas_nullParams() throws Exception {

        new CreateCanvas().execute(null, new String[]{null, null});
        fail("Invalid parameter");
    }

    @Test(expected = FeatureException.class)
    public void testCreateCanvas_valuesExceedMaxMin() throws Exception {
        new CreateCanvas().execute(null, new String[]{"200", "10"});
        fail("Values should be between 1 to 100");
    }

//    public void displayCavas(String[][] canvas) {
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < canvas.length; i++) {
//            for (int j = 0; j < canvas[i].length; j++) {
//                sb.append(String.format("%1s", canvas[i][j]));
//            }
//            sb.append("\n");
//        }
//        System.out.println(sb);
//    }

}
