package Exceptions;

/**
 * Indicate invalid parameters provided by user
 */
public class InvalidParamsException extends FeatureException {

  public InvalidParamsException() {
    super();
  }

  public InvalidParamsException(String message) {
    super(message);
  }

  public InvalidParamsException(String message, Throwable cause) {
    super(message, cause);
  }

  public InvalidParamsException(Throwable cause) {
    super(cause);
  }

  protected InvalidParamsException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
