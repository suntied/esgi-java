package model;

public enum TimeType {
    SECOND("SECOND"),
    MIN("MINUTE"),
    HOUR("HOUR"),
    DAY("DAY"),
    MONTH("MONTH"),
    YEAR("YEAR");

    private String typeTime = "";

    TimeType(String typeTime) {
        this.typeTime = typeTime;
    }
}
