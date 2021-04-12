package Material;

import java.time.LocalDate;

public class Meat extends Material{
    private double weight;

    public Meat(double weight) {
        this.weight = weight;
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }
    public Meat() {

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getAmount(){
        return  weight*getCost();
    }
    public LocalDate getExpiryDate(){
        return getManufacturingDate().plusDays(7);
    }
    public double getDifference(){
        return getAmount()-getRealMoney();
    };
    public double getRealMoney() {
        if (getExpiryDate().isAfter(LocalDate.now().plusDays(5))) {
            return getAmount()-(0.3*getAmount());
        }
        else if(getExpiryDate().isAfter(LocalDate.now().plusDays(3))){
            return getAmount()-(0.5*getAmount());
        }
        else {
            return getAmount()-(0.1*getAmount());
        }
    }
}
