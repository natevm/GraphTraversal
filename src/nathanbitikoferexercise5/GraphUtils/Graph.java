package nathanbitikoferexercise5.GraphUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
/**
 * Graph.java
 * This class creates a network of nodes and edges, and contains some methods to 
 *  search the created graph.
 * @author nathan
 */
public class Graph {

    public ArrayList<Node> nodeList;
    Boolean directed;
    int numOfCurrentEdges = 0;
    
    /**
     * A Graph is a representation of a set of objects 
     * where some pairs of Nodes are connected by edges.
     * @param isDirected Should be true if the graph should be directed.
     */
    public Graph(Boolean isDirected)
    {
        directed = isDirected;
    }

    //-Generation Methods-
    /**
     * @param numberOfNodes The number of nodes to be generated.
     * @param chanceOfEdge The chance of an edge happening.
     */
    public void generateUnweightedGraph(int numberOfNodes, double chanceOfEdge)
    {
        nodeList = new ArrayList<>();
        
        //Add nodes to list
        for (int i = 0; i < numberOfNodes; i++)
            nodeList.add(new Node(i));
        
        //Generate random edges 
        int numEdgesToAdd = (int)(numberOfNodes*numberOfNodes * chanceOfEdge);
        while (numOfCurrentEdges < numEdgesToAdd)
            generateUniqueEdge(1);
    }
    /**
     * @param numberOfNodes The number of nodes to be generated.
     * @param chanceOfEdge The chance of an edge happening.
     * @param maxWeight The maximum number an edge weight can be.
     */
    public void generateWeightedGraph(int numberOfNodes, double chanceOfEdge, double maxWeight)
    {
        nodeList = new ArrayList<>();
        
        //add nodes to list
        for (int i = 0; i < numberOfNodes; i++)
            nodeList.add(new Node(i));
        
        //Generate random edges 
        int numEdgesToAdd = (int)(numberOfNodes*numberOfNodes * chanceOfEdge);
        while (numOfCurrentEdges < numEdgesToAdd)
            generateUniqueEdge(Math.random() * maxWeight);
    }
    public void generateUniqueEdge(double weight)
    {
        Node from, to;
        Edge edge;
        
        do 
        {
            from = nodeList.get((int)(Math.random() * nodeList.size()));
            to = nodeList.get((int)(Math.random() * nodeList.size()));
        }
        while(from.containsEdgeTo(to));
        
        from.addPath(new Edge(weight, to));
        numOfCurrentEdges++;
        if (directed == false && (!to.containsEdgeTo(from)))
        {    
            to.addPath(new Edge(weight, from));
            numOfCurrentEdges++;
        }
    }
    
    //-Searches-
    public Stack<Node> depthSearch()
    {
        Stack<Node> path = null;
        if (!nodeList.isEmpty())
        {
            //1: create current path and visited list.
            path = new Stack<>();
            ArrayList<Node> visitedList = new ArrayList<>();
            
            //2: create a current node and a search node. (could be replaced with any node to search from.)
            Node current = nodeList.get(0);
            path.add(nodeList.get(0));
            Node searchNode = new Node();
            
            //3: while the current node isn't the last node in the list of nodes (could be replaced with any node to search to)
            while (current != nodeList.get(nodeList.size()-1))
            {
                //1. Search through the edges of current.
                int index = 0;
                do {
                    if (current.edges.isEmpty())
                        break;
                    searchNode = current.edges.get(index).destination;
                    index++;
                } while (visitedList.contains(searchNode) && (index < current.edges.size()));
                
                //2. if the search node is still in the visited list
                if (visitedList.contains(searchNode)){    
                    if (path.isEmpty())
                        return null;
                    else
                        current = path.pop();
                }
                else
                {
                    //3. add that node to visited & path
                    visitedList.add(searchNode); 
                    path.add(searchNode); 
                    current = searchNode;
                }
            }
        }
        return path;
    }
    public Stack<Node> breadthSearch()
    {
        Queue<Node> path = null;
        if (!nodeList.isEmpty())
        {
            //1: create current path and visited list.
            path = new LinkedList<>();
            ArrayList<Node> visitedList = new ArrayList<>();
            
            //2: create a current node and a search node. (could be replaced with any node to search from.)
            Node current = nodeList.get(0);
            path.add(nodeList.get(0));
            Node searchNode = new Node();
            
            //3: while the current node isn't the last node in the list of nodes (could be replaced with any node to search to)
            while (current != nodeList.get(nodeList.size()-1))
            {
                //1. Search through the edges of current.
                int index = 0;
                do {
                    if (current.edges.isEmpty())
                        break;
                    searchNode = current.edges.get(index).destination;
                    index++;
                } while (visitedList.contains(searchNode) && (index < current.edges.size()));
                
                //2. if the search node is still in the visited list
                if (visitedList.contains(searchNode)){    
                    if (path.isEmpty())
                        return null;
                    else
                        current = path.poll();
                }
                else
                {
                    //3. add that node to visited & path
                    visitedList.add(searchNode); 
                    path.add(searchNode); 
                    current = searchNode;
                }
            }
        }
        Stack<Node> s= new Stack<>();
        while (path!= null && path.size() > 0)
        {
            s.push(path.poll());
        }
        return s;
    }
    public Stack<Node> dijkstraSearch()
    {
        //Initialize
        Node source = nodeList.get(0);
        Node target = nodeList.get(nodeList.size() - 1);
        source.minDistance = 0.;
        PriorityQueue<Node> nodeQueue = new PriorityQueue<>();
        nodeQueue.add(source);
        
        while (!nodeQueue.isEmpty())
        {
            Node currentNode = nodeQueue.poll();
            //explore each edge connected to the current node.
            for (Edge e : currentNode.edges)
            {
                Node currentEdgeNode = e.destination;
                double weight = e.weight;
                double currentDistance = currentNode.minDistance + weight;
                if (currentDistance < currentEdgeNode.minDistance) {
                    nodeQueue.remove(currentEdgeNode);
                    currentEdgeNode.minDistance = currentDistance;
                    currentEdgeNode.previous = currentNode;
                    nodeQueue.add(currentEdgeNode);
                }
            }
        }
        //construct a path stack.
        Stack<Node> path = new Stack<>();
        for (Node node = target; node != null; node = node.previous)
            path.add(node);
        return path;
    }
            
    @Override
    public String toString()
    {                                   
        char[][] nodeArray = new char[nodeList.size()][nodeList.size()]; //[ from ][ to ]
        
        //1:assume no edges
        for(char[] c : nodeArray)
            Arrays.fill(c, '0');
        
        //2:assign edges as necessary. 
        for (Node currentNode : nodeList) 
            for (Edge currentPath : currentNode.edges)
                nodeArray[currentNode.ID][currentPath.destination.ID] = '1';           
        
        //3:create string from node array.
        String string = "";
        for(char[] row : nodeArray)
        {    
            for(char character : row)
                string += character;
            string+="\n";
        }
        return string;
    }
}
