package by.tsai2.ilya2.springhomework.bean;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Tour {
    private String nameTour;
    private String country;
    private String nameHotel;
    private int amountStarsHotel;
    private double price;
    private int amountDaysTour;
    private List<String> citiesToVisit;

    public Tour() {
    }

    public String getNameTour() {
        return nameTour;
    }

    public void setNameTour(String nameTour) {
        this.nameTour = nameTour;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNameHotel() {
        return nameHotel;
    }

    public void setNameHotel(String nameHotel) {
        this.nameHotel = nameHotel;
    }

    public int getAmountStarsHotel() {
        return amountStarsHotel;
    }

    public void setAmountStarsHotel(int amountStarsHotel) {
        this.amountStarsHotel = amountStarsHotel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmountDaysTour() {
        return amountDaysTour;
    }

    public void setAmountDaysTour(int amountDaysTour) {
        this.amountDaysTour = amountDaysTour;
    }

    public void setCitiesToVisit(List citiesToVisit) {
        this.citiesToVisit = citiesToVisit;
    }

    public List getCitiesToVisit() {
        return citiesToVisit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour = (Tour) o;
        return amountStarsHotel == tour.amountStarsHotel &&
                Double.compare(tour.price, price) == 0 &&
                amountDaysTour == tour.amountDaysTour &&
                Objects.equals(nameTour, tour.nameTour) &&
                Objects.equals(country, tour.country) &&
                Objects.equals(nameHotel, tour.nameHotel) &&
                Objects.equals(citiesToVisit, tour.citiesToVisit);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nameTour, country, nameHotel, amountStarsHotel, price, amountDaysTour, citiesToVisit);
    }

    public void showTour() {
        Iterator iter = citiesToVisit.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }


}
