package features;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import Exceptions.FeatureException;
import domain.Canvas;
import java.util.Arrays;
import org.junit.Test;

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

}
