package port;

import model.Graph;

import java.time.LocalDate;

public interface GraphRepository {
    Graph generateGraph(LocalDate time);
}
