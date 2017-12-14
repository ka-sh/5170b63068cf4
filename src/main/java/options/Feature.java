package options;

import Exceptions.FeatureException;

/**
 * Created  on 12/10/17.
 */
public interface Feature {

  /**
   * @return String explaining draw feature, and option used to activate it.
   */
  String About();

  /**
   * @return String representing option used to activate this feature
   */
  String getOption();

  /**
   * Validate features parameters
   *
   * @param params parameters used to activate this feature
   * @throws Exception if there is a problem with provided parameters
   */
  void validate(String[] params) throws Exception;

  /**
   * perform feature function
   *
   * @param canvas canvas matrix
   * @param params Array of parameters used
   * @throws if execute faced an issue during execution
   */
  String[][] execute(String[][] canvas, String[] params) throws FeatureException;
}
