package farms;


/**
 * Interface to give a farm extra functionality on update, like earning extra income from supplemental operations.
 * The "Decorator" class from the Decorator pattern.
 * @author tfilewic
 */
public abstract class FarmDecorator implements Farm {
    
    //Reference to the base farm that is being decorated.
    private Farm decoratedFarm;
    
    public FarmDecorator(Farm farmToDecorate){
        decoratedFarm = farmToDecorate;
    }
    
    
    /**
     * Adds the additional income to the farm's base earnings.
     */
    @Override
    public boolean update(boolean isDay) {
        doExtra(isDay);
        return decoratedFarm.update(isDay);

    }
    
    /**
     * Earns extra income from supplemental operations.
     */
    protected abstract void doExtra(boolean isDay);
    
    
    @Override
    public void display() {
        // TODO Auto-generated method stub
        
    }




}
