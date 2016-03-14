package nathanbitikoferexercise5.GraphUtils;
import java.util.ArrayList;
/**
 * Node.java
 * This class creates a node that connects to graphs in the graph class.
 * @author nathan
 */
public class Node implements Comparable<Node> {
    //-Attribues-
    public ArrayList<Edge> edges = new ArrayList<>();
    public int ID;   
    public String name;
    Node previous;
    double minDistance = Double.POSITIVE_INFINITY;
    
    //-Methods-
    public Node ()
    {}
    public Node(int ID)
    {
        this.ID = ID;
    }
    public void addPath(Edge path)
    {
        edges.add(path);
    }
    public void removePath(Edge path)
    {
        edges.remove(path);
    }
    public Edge getPath(int nodeIndex)
    {
        for (Edge path : edges) {
            if (path.destination.ID == nodeIndex) {
                return path;
            }
        }
        return null;
    }
    public Edge getPath(String nodeName)
    {
        for (Edge path : edges) {
            if (path.destination.name.equals(nodeName)) {
                return path;
            }
        }
        return null;
    }
    public Boolean containsEdgeTo(Node to)
    {
        for (Edge edge : edges)
            if (edge.destination == to)
                return true;
        return false;
    }
    @Override
    public int compareTo(Node other)
    {
        return Double.compare(minDistance, other.minDistance);
    }
}
