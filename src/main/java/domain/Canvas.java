package domain;

public class Canvas {

  private String[][] window;
  private int height;
  private int width;

  public Canvas(int h, int w) {
    height = h;
    width = w;
  }

  public String[][] getWindow() {
    return window;
  }

  public void setWindow(String[][] window) {
    this.window = window;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public void render(Point[] points, String pixel) {
    for (Point p : points) {
      window[p.getY() + 1][p.getX() + 1] = pixel;
    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < window.length; i++) {
      for (int j = 0; j < window[i].length; j++) {
        sb.append(String.format("%1s", window[i][j]));
      }
      sb.append("\n");
    }
    return sb.toString();
  }
}
