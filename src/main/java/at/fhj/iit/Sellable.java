package at.fhj.iit;

/**
 * Interface if a drink is sellable
 * @author Philip Moser
 * @version 1.0
 * @since 25.05.2021
 */
public interface Sellable {
    public void setPricePerUnit(double price);
    public double getPricePerUnit();
    public Sale sell(Staff seller);

}
