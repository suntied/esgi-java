package model;

public class Graph {
    private Curve curve;
    private OptionGraph optionGraph;

    public Graph(Curve curve) {
        this.curve = curve;
        this.optionGraph = null;
    }

    public Graph(Curve curve, OptionGraph optionGraph) {
        this.curve = curve;
        this.optionGraph = optionGraph;
    }

    public Curve getCurve() {
        return curve;
    }

    public OptionGraph getOptionGraph() {
        return optionGraph;
    }

    public void setOptionGraph(OptionGraph optionGraph) {
        this.optionGraph = optionGraph;
    }
    //Todo getTendance method depending on OptionGraph
}
