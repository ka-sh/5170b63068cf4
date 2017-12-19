package features;

import Exceptions.FeatureException;
import domain.Canvas;
import domain.Point;
import java.util.Arrays;
import java.util.stream.IntStream;

public class DrawLine implements Feature {

  final int START_POINT = 0;
  final int FINISH_POINT = 1;

  @Override
  public String About() {
    return null;
  }

  @Override
  public String getOption() {
    return null;
  }

  @Override
  public void validate(String[] params) throws Exception {

  }

  @Override
  public Canvas execute(Canvas canvas, String[] params) throws FeatureException {
    Point[] points = getPoint(params);
    Arrays.sort(points);
    int length = getLinePointsCount(points);
    int[] xs = calculateValueArray(points[START_POINT].getX(), points[FINISH_POINT].getX(), length);
    int[] ys = calculateValueArray(points[START_POINT].getY(), points[FINISH_POINT].getY(), length);
    Point[] lineCoordinate = new Point[length];
    for (int i = 0; i < length; i++) {
      lineCoordinate[i] = new Point(xs[i], ys[i]);
    }
    canvas.render(lineCoordinate, "x");
    return canvas;
  }

  private int[] calculateValueArray(int start, int end, int length) {
    int[] values = new int[length];
    if (start == end) {
      Arrays.fill(values, start);
      return values;
    } else {
      return IntStream.rangeClosed(start, length).toArray();
    }
  }

  /**
   * Return length of array that will represent line points
   */
  private int getLinePointsCount(Point[] points) {
    int xDiff = (points[FINISH_POINT].getX() - points[START_POINT].getX());
    int yDiff = (points[FINISH_POINT].getY() - points[START_POINT].getY());
    if (xDiff == yDiff) {
      return (xDiff + 1);
    } else {
      return xDiff == 0 ? (yDiff + 1) : (xDiff + 1);
    }
  }

  private Point[] getPoint(String[] params) {
    return new Point[]{
        new Point(Integer.parseInt(params[0]), Integer.parseInt(params[1])),
        new Point(Integer.parseInt(params[2]), Integer.parseInt(params[3]))
    };
  }

  private int getCoordinatesArrayLength(Point[] points) {
    return 0;
  }
}
