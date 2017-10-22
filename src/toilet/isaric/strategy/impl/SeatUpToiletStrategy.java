package toilet.isaric.strategy.impl;

import toilet.isaric.strategy.ToiletStrategy;

/**
 * Created by isaric on 22.10.17..
 */
public class SeatUpToiletStrategy implements ToiletStrategy {

    private char state = 'U';

    @Override
    public int evaluate(String toilets, char initial) {
        char current = initial;
        int counter = 0;
        for (char character : toilets.toCharArray())
        {
            if (current == character && state == character) continue;
            if (current != character && state == character)
            {
                counter++;
                continue;
            }
            if (current != character && state != character) counter += 2;
        }
        return counter;
    }
}
