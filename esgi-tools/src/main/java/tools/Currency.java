package tools;

public enum Currency {
    //Create all currency Euro etc
    EUR("€"),
    GBP("£"),
    USD("$");

    private String sign;

    Currency(String sign) {
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }
}
