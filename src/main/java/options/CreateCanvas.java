package options;

import Exceptions.FeatureException;
import Exceptions.InvalidParamsException;
import java.util.Arrays;

/**
 * Created by jb on 12/11/17.
 */
public class CreateCanvas implements Feature {

  private static int MAX_WIDTH = 100;
  private static int MAX_HIGHT = 100;

  @Override
  public String About() {
    return "C w h\tShould create a new canvas of width w and height h.";
  }

  @Override
  public String getOption() {
    return "C";
  }

  @Override
  public void validate(String[] params) throws FeatureException {
    try {
      int w = Integer.parseInt(params[0]);
      int h = Integer.parseInt(params[1]);
      if ((w <= 0 || h <= 0) || (w > MAX_WIDTH || h > MAX_HIGHT)) {
        throw new InvalidParamsException("Values should be between 1 to 100");
      }
    } catch (NumberFormatException ex) {
      throw new InvalidParamsException("Invalid parameter");
    }
  }

  @Override
  public String[][] execute(String[][] canvas, String[] params) throws FeatureException {
    validate(params);
    int w = Integer.parseInt(params[0]) + 1;
    int h = Integer.parseInt(params[1]) + 1;
    canvas = getEmptyCanv(w, h);
    drawCanvasFrame(canvas, w, h);
    return canvas;
  }

  private String[][] getEmptyCanv(int x, int y) {
    String[][] tmpCan = new String[x][y];
    for (String[] tmpRow : tmpCan) {
      Arrays.fill(tmpRow, " ");
    }
    return tmpCan;
  }

  private void drawCanvasFrame(String[][] canvas, int w, int h) {
    for (int i = 0; i < w; i++) {
      canvas[0][i] = "-";
      canvas[h - 1][i] = "-";
    }
    for (int j = 1; j < h - 1; j++) {
      canvas[j][0] = "|";
      canvas[j][w - 1] = "|";
    }
  }
}
