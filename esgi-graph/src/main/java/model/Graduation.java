package model;

public class Graduation {
    private TimeType timeType;
    private Integer time;

    public Graduation(TimeType timeType, Integer time) {
        this.timeType = timeType;
        this.time = time;
    }

    public TimeType getTimeType() {
        return timeType;
    }

    public void setTimeType(TimeType timeType) {
        this.timeType = timeType;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }
}
