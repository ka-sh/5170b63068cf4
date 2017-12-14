package options;

import Exceptions.FeatureException;

public class BucketFill implements Feature {

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
  public String[][] execute(String[][] canvas, String[] params) throws FeatureException {
    return new String[][]{};
  }
}
