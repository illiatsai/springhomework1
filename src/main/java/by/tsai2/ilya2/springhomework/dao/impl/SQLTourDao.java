package by.tsai2.ilya2.springhomework.dao.impl;

import by.tsai2.ilya2.springhomework.bean.Tour;
import by.tsai2.ilya2.springhomework.dao.TourDao;

import java.util.ArrayList;
import java.util.List;

public class SQLTourDao implements TourDao {
    List<Tour> listOfTours = new ArrayList<Tour>();

    public List<Tour> findTour() {
        return listOfTours;
    }
}
