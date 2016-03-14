package nathanbitikoferexercise5.GraphUtils;

/**
 *
 * @author nathan
 */
public class Edge {
    //-Attributes-
    public double weight;
    public Node destination;
    
    //-Methods-
    public Edge(double weight, Node destination)
    {
        this.weight = weight;
        this.destination = destination;
    }
}
