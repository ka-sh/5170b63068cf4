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
}
