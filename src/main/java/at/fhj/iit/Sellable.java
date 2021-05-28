package at.fhj.iit;

public interface Sellable {
    public void setPricePerUnit(double price);
    public double getPricePerUnit();
    public Sale sell(Staff seller);

}
