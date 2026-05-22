public class Edge {
    private Vertex source;
    private Vertex destination;

    public Edge(Vertex source, Vertex destination) {
        this.source = source;
        this.destination = destination;
    }

    public Vertex getSource() {
        return this.source;
    }

    public Vertex getDestination() {
        return this.destination;
    }

    public String toString() {
        int var10000 = this.source.getId();
        return var10000 + " -> " + this.destination.getId();
    }
}
