/*
 * JGraphXApp.java
 * This class creates and animates a given graph. This is makes testing more 
 *  conventient.
 */
package nathanbitikoferexercise5;

import com.mxgraph.layout.mxFastOrganicLayout;
import com.mxgraph.swing.util.mxMorphing;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

import com.mxgraph.layout.mxIGraphLayout;
import javax.swing.JApplet;
import org.jgrapht.ListenableGraph;
import org.jgrapht.ext.JGraphXAdapter;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.ListenableDirectedGraph;

import nathanbitikoferexercise5.GraphUtils.*;

import java.awt.Dimension;
import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxEvent;
import com.mxgraph.util.mxEventObject;
import com.mxgraph.util.mxEventSource.mxIEventListener;
import java.awt.BorderLayout;

import java.util.ArrayList;
import java.util.Stack;
public class JGraphXApp
    extends JApplet
{
    //-Attributes
    public static Dimension dimension = new Dimension(100, 100);
    private JGraphXAdapter<String, DefaultEdge> jgxAdapter;
    public ListenableGraph<String, DefaultEdge> g;
    mxGraph graph;
    ArrayList<Object> cells = new ArrayList<>();
    mxGraphComponent graphComponent;
    double zoomFactor = 1;
    
    //-Methods-
    @Override
    public void init()
    {
        // create a JGraphT graph
        g = new ListenableDirectedGraph<>(DefaultEdge.class);

        // create a visualization using JGraph, via an adapter
        jgxAdapter = new JGraphXAdapter<>(g);

        getContentPane().add(new mxGraphComponent(jgxAdapter));
        resize(dimension);

        // that's all there is to it!...
    }
    void setGraph(Graph nodeGraph)
    {
        getContentPane().removeAll();
        graph = new mxGraph();
        cells = new ArrayList<>();
        graphComponent = new mxGraphComponent(graph);
        
        
        
        getContentPane().add(graphComponent, BorderLayout.CENTER);
        Object parent = graph.getDefaultParent();
        graphComponent.zoomTo(zoomFactor, true);
        
        ArrayList<Object> nodeStack = new ArrayList<>();
        
        graph.getModel().beginUpdate();
        
        for (Node n : nodeGraph.nodeList)
        {
            cells.add(graph.insertVertex(parent, Integer.toString(n.ID), Integer.toString(n.ID), 100, 100, 30, 30));
            nodeStack.add(cells.get(cells.size()-1));
        }
        
        for (Node n : nodeGraph.nodeList)           
            for (Edge e : n.edges)
                graph.insertEdge(parent, null, Math.round(e.weight), nodeStack.get(n.ID), nodeStack.get(e.destination.ID));

        graph.getModel().endUpdate();
        
        graphComponent.setBounds(0, 0, dimension.width, dimension.height);
        morphGraph(graph, graphComponent);
    }
    private static void morphGraph(final mxGraph graph,
        mxGraphComponent graphComponent) {
        // define layout
        mxIGraphLayout layout = new mxFastOrganicLayout(graph);

        // layout using morphing
        graph.getModel().beginUpdate();
        try {
                layout.execute(graph.getDefaultParent());   
        } finally {
                mxMorphing morph = new mxMorphing(graphComponent, 20, 1.5, 20);

                morph.addListener(mxEvent.DONE, new mxIEventListener() {

                        @Override
                        public void invoke(Object arg0, mxEventObject arg1) {
                                graph.getModel().endUpdate();
                                // fitViewport();
                        }

                });
                morph.startAnimation();
        }

    }
    public void setZoomScale(double factor)
    {
        zoomFactor = factor;
        graphComponent.zoomTo(factor, true);
       // morphGraph(graph, graphComponent);
    }
    void colorGraph(Stack<Node> nodeStack) {
        for (Node n : nodeStack)
        {
            graph.setCellStyles(mxConstants.STYLE_FILLCOLOR, "red", new Object[]{cells.toArray()[n.ID]}); //changes the color to red
            graphComponent.refresh();
        }
    }
   
}
