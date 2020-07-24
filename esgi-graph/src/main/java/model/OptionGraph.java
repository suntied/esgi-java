package model;

import java.time.LocalDate;


public class OptionGraph {

    private LocalDate begin;
    private LocalDate end;
    private Double botThreshold;
    private Double topThreshold;
    private Graduation graduation;

    public OptionGraph(LocalDate begin, LocalDate end, Double botThreshold, Double topThreshold, Graduation graduation) {
        this.begin = begin;
        this.end = end;
        this.botThreshold = botThreshold;
        this.topThreshold = topThreshold;
        this.graduation = graduation;
    }

    public LocalDate getBegin() {
        return begin;
    }

    public void setBegin(LocalDate begin) {
        this.begin = begin;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public Double getBotThreshold() {
        return botThreshold;
    }

    public void setBotThreshold(Double botThreshold) {
        this.botThreshold = botThreshold;
    }

    public Double getTopThreshold() {
        return topThreshold;
    }

    public void setTopThreshold(Double topThreshold) {
        this.topThreshold = topThreshold;
    }

    public Graduation getGraduation() {
        return graduation;
    }
}
