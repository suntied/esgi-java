package coindesk.model;


import java.time.LocalDate;

public class DataCurrency {
    private LocalDate time;
    private Long value;

    public DataCurrency(String time, Long value){
        LocalDate localDate = LocalDate.parse(time);
        this.time=localDate;
        this.value=value;
    }

    public DataCurrency(LocalDate time, Long value) {
        this.time = time;
        this.value = value;
    }

}
