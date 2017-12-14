package features;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import Exceptions.FeatureException;
import domain.Canvas;
import org.junit.Test;

public class TestCreateCanvas {

  @Test
  public void testCreateCanvas_Rosy() throws Exception {
    Canvas canvas = new CreateCanvas().execute(null, new String[]{"3", "3"});
    displayCavas(canvas.getWindow());
    assertNotNull(canvas.getWindow());
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

  public void displayCavas(String[][] canvas) {
    for (int i = 0; i < canvas.length; i++) {
      for (int j = 0; j < canvas[i].length; j++) {
        System.out.format("%1s", canvas[i][j]);
      }
      System.out.println();
    }
  }

}
