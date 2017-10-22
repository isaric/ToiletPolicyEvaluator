package toilet.isaric;

import kattis.Kattio;
import toilet.isaric.strategy.ToiletStrategy;
import toilet.isaric.strategy.impl.CategoricalImperativeToiletStrategy;
import toilet.isaric.strategy.impl.SeatDownToiletStrategy;
import toilet.isaric.strategy.impl.SeatUpToiletStrategy;

/**
 * Created by isaric on 22.10.17..
 */
public class PolicyEvaluator {

    private ToiletStrategy seatUp;

    private ToiletStrategy seatDown;

    private ToiletStrategy categoricalImperative;

    public PolicyEvaluator()
    {
        seatUp = new SeatUpToiletStrategy();
        seatDown = new SeatDownToiletStrategy();
        categoricalImperative = new CategoricalImperativeToiletStrategy();
    }

    public static void main(String[] args)
    {
        Kattio kattio = new Kattio(System.in);
        if (kattio.hasMoreTokens())
        {
            PolicyEvaluator policyEvaluator = new PolicyEvaluator();
            String toilets = kattio.getWord();
            policyEvaluator.evaluate(toilets);
        }

    }

    public void evaluate(String toilets)
    {
        if (toilets.length() > 1)
        {
           char initial = toilets.charAt(0);
           System.out.println(seatUp.evaluate(toilets,initial));
           System.out.println(seatDown.evaluate(toilets,initial));
           System.out.println(categoricalImperative.evaluate(toilets,initial));
        }
    }
}
