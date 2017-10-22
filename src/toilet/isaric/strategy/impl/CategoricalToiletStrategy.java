package toilet.isaric.strategy.impl;

import toilet.isaric.strategy.ToiletStrategy;

/**
 * Created by isaric on 22.10.17..
 */
public class CategoricalToiletStrategy implements ToiletStrategy {

    @Override
    public int evaluate(String toilets, char initial) {
        char current = initial;
        int counter = 0;
        toilets = toilets.substring(1);
        for (char character : toilets.toCharArray())
        {
            if (character != current) counter++;
            current = character;
        }
        return counter;
    }
}
