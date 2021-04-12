package Material;

import java.time.LocalDate;

public class CrispyFlour extends Material {
    private int quantity;

    public CrispyFlour(int quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }
    public CrispyFlour(){

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getAmount(){
        return  quantity*getCost();
    }
    public LocalDate getExpiryDate(){
        return getManufacturingDate().plusYears(1);
    }
    public double getDifference(){
        return getAmount()-getRealMoney();
    };
    public double getRealMoney() {
        if (getExpiryDate().isAfter(LocalDate.now().plusMonths(4))) {
            return getAmount()-(0.2*getAmount());
        }
        else if(getExpiryDate().isAfter(LocalDate.now().plusMonths(2))){
            return getAmount()-(0.4*getAmount());
        }
        else {
            return getAmount()-(0.05*getAmount());
        }
    }
}
