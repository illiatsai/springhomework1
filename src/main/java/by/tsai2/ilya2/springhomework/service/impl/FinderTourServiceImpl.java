package by.tsai2.ilya2.springhomework.service.impl;

import by.tsai2.ilya2.springhomework.bean.Tour;
import by.tsai2.ilya2.springhomework.dao.TourDao;
import by.tsai2.ilya2.springhomework.dao.impl.SQLTourDao;
import by.tsai2.ilya2.springhomework.service.FinderTourService;

import java.util.List;

public class FinderTourServiceImpl implements FinderTourService {

    private TourDao td;

    private static FinderTourService fts = new FinderTourServiceImpl();

    public FinderTourServiceImpl(TourDao tourDao) {
        td = tourDao;
    }

    private FinderTourServiceImpl() {

    }

    public static FinderTourService getInstance() {
        return fts;
    }


    public List<Tour> findTour() {
        return td.findTour();
    }


    public void setTd(TourDao td) {
        this.td = td;
    }

    public TourDao getTd() {
        return td;
    }
}
