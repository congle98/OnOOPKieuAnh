package Test;
import Material.*;

import java.time.LocalDate;
import java.time.Month;

public class test {
    public static void main(String[] args) {

        CrispyFlour crispyFlour1 =
                new CrispyFlour("01","bot1",LocalDate.of(2021, Month.JANUARY,20),5000,5);
        CrispyFlour crispyFlour2 =
                new CrispyFlour("02","bot2",LocalDate.of(2020, Month.NOVEMBER,20),3000,10);
        CrispyFlour crispyFlour3 =
                new CrispyFlour("03","bot3",LocalDate.of(2021, Month.NOVEMBER,20),8000,12);
        CrispyFlour crispyFlour4 =
                new CrispyFlour("04","bot4",LocalDate.of(2020, Month.DECEMBER,20),6000,15);
        CrispyFlour crispyFlour5 =
                new CrispyFlour("05","bot5",LocalDate.of(2021, Month.JANUARY,20),4000,8);
        Meat meat1 =
                new Meat("11","thit1",LocalDate.of(2020, Month.DECEMBER,20),5000,5);
        Meat meat2 =
                new Meat("11","thit1",LocalDate.of(2020, Month.NOVEMBER,20),4000,6);
        Meat meat3 =
                new Meat("11","thit1",LocalDate.of(2020, Month.OCTOBER,20),6000,2);
        Meat meat4 =
                new Meat("11","thit1",LocalDate.of(2021, Month.JANUARY,20),7000,8);
        Meat meat5 =
                new Meat("11","thit1",LocalDate.of(2020, Month.AUGUST,20),1000,10);
    }
}
