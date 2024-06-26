package farm;

import asset.Cow;
import asset.Herd;

/**
 * A farm that owns and milks cattle. 
 * A "Concrete Product" in the Factory pattern.
 * @author tfilewic
 */
public class DairyFarm extends BasicFarm {
    

    /**
     * Constuctor.
     */
    public DairyFarm() {
        super();
        Herd herd = new Herd();
        herd.setAnimalCost(250);
        asset = herd;
        farmType = FarmType.DAIRY;
        final int minimumSize = 10;
        int count = 0;
        while (count < minimumSize) {
            herd.addAnimal(new Cow());
            count++;
        }
    }



}
