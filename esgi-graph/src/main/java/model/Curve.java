package model;

import coindesk.model.CoinDesk;

import java.util.List;

public class Curve {
    private List<CoinDesk> listOfPoint;
    public Curve(List<CoinDesk> listOfPoint) {
        this.listOfPoint = listOfPoint;
    }

    public List<CoinDesk> getListOfPoint() {
        return listOfPoint;
    }
}
