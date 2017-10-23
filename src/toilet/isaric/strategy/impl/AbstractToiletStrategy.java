package toilet.isaric.strategy.impl;

import toilet.isaric.strategy.ToiletStrategy;

/**
 * Created by isaric on 22.10.17..
 */
public abstract class AbstractToiletStrategy implements ToiletStrategy {

  private char state;

  @Override
  public int evaluate(String toilets, char initial) {
    char current = initial;
    int counter = 0;
    toilets = toilets.substring(1);
    for (char character : toilets.toCharArray()) {
      if (current == character && state != character) {
        counter++;
      } else if (current != character && state == character) {
        counter++;
      } else if (current != character && state != character) {
        counter += 2;
      }
      current = state;
    }
    return counter;
  }

  protected void setState(char state) {
    this.state = state;
  }
}
