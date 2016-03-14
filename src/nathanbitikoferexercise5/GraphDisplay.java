package nathanbitikoferexercise5;
import java.awt.Dimension;
import java.util.Stack;
import nathanbitikoferexercise5.GraphUtils.*;

public class GraphDisplay extends javax.swing.JFrame {
    JGraphXApp jGraphXApp = new JGraphXApp();
    
    Graph graph;
    public GraphDisplay() {
        
        initComponents(); 
        jGraphXApp.dimension = new Dimension(jGraphPanel.getWidth(), jGraphPanel.getHeight());
        
        
        

        //this.add(jGraphXApp);
        //this.getContentPane().add(jGraphXApp);
        
        //jGraphPane.add(jGraphXApp);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUnweightedUndirected = new javax.swing.JButton();
        btnWeightedUndirected = new javax.swing.JButton();
        btnUnweightedDirected = new javax.swing.JButton();
        btnWeightedDirected = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jGraphPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane = new javax.swing.JTextPane();
        jSlider = new javax.swing.JSlider();
        btnDijkstra = new javax.swing.JButton();
        btnBreadthSearch = new javax.swing.JButton();
        btnDepthSearch = new javax.swing.JButton();
        txtOutput = new javax.swing.JLabel();
        spnrNumNodes = new javax.swing.JSpinner();
        spnrProbEdge = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnUnweightedUndirected.setText("Unweighted, Undirected");
        btnUnweightedUndirected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnweightedUndirectedActionPerformed(evt);
            }
        });

        btnWeightedUndirected.setText("Weighted, Undirected");
        btnWeightedUndirected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWeightedUndirectedActionPerformed(evt);
            }
        });

        btnUnweightedDirected.setText("Unweighed, Directed");
        btnUnweightedDirected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnweightedDirectedActionPerformed(evt);
            }
        });

        btnWeightedDirected.setText("Weighted, Directed");
        btnWeightedDirected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWeightedDirectedActionPerformed(evt);
            }
        });

        jTabbedPane1.setToolTipText("");

        javax.swing.GroupLayout jGraphPanelLayout = new javax.swing.GroupLayout(jGraphPanel);
        jGraphPanel.setLayout(jGraphPanelLayout);
        jGraphPanelLayout.setHorizontalGroup(
            jGraphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
        );
        jGraphPanelLayout.setVerticalGroup(
            jGraphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Fancy Graphics", jGraphPanel);

        jTextPane.setFont(new java.awt.Font("Courier", 0, 13)); // NOI18N
        jScrollPane1.setViewportView(jTextPane);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Text Graphics", jPanel1);

        jSlider.setMaximum(200);
        jSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderStateChanged(evt);
            }
        });
        jSlider.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jSliderCaretPositionChanged(evt);
            }
        });

        btnDijkstra.setText("Dijkstra's Algorithm");
        btnDijkstra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDijkstraActionPerformed(evt);
            }
        });

        btnBreadthSearch.setText("Breadth First");
        btnBreadthSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBreadthSearchActionPerformed(evt);
            }
        });

        btnDepthSearch.setText("Depth First");
        btnDepthSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepthSearchActionPerformed(evt);
            }
        });

        spnrNumNodes.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(10), Integer.valueOf(1), null, Integer.valueOf(1)));
        spnrNumNodes.setToolTipText("Number Of Nodes");

        spnrProbEdge.setModel(new javax.swing.SpinnerNumberModel(0.3d, 0.0d, 1.0d, 0.05d));
        spnrProbEdge.setToolTipText("Probability of edge");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(spnrNumNodes, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnrProbEdge))
                    .addComponent(btnUnweightedUndirected, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnWeightedUndirected, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUnweightedDirected, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnWeightedDirected, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDijkstra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBreadthSearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDepthSearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(209, Short.MAX_VALUE)
                    .addComponent(txtOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(609, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spnrNumNodes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnrProbEdge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTabbedPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnUnweightedUndirected, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnWeightedUndirected, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUnweightedDirected, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnWeightedDirected, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnBreadthSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDepthSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDijkstra, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(txtOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(581, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUnweightedUndirectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnweightedUndirectedActionPerformed
        graph = new Graph(false);
        graph.generateUnweightedGraph((int)spnrNumNodes.getValue(),(double)spnrProbEdge.getValue());  
        jTextPane.setText(graph.toString());
                jGraphXApp.init();
                jGraphXApp.setGraph(graph);
        jGraphPanel.add(jGraphXApp);
    }//GEN-LAST:event_btnUnweightedUndirectedActionPerformed

    private void jSliderCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jSliderCaretPositionChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jSliderCaretPositionChanged

    private void jSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderStateChanged
        // TODO add your handling code here:
        jGraphXApp.setZoomScale(jSlider.getValue()/100.0);
    }//GEN-LAST:event_jSliderStateChanged

    private void btnWeightedUndirectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWeightedUndirectedActionPerformed
        graph = new Graph(false);
        graph.generateWeightedGraph((int)spnrNumNodes.getValue(),(double)spnrProbEdge.getValue(),100);  
        jTextPane.setText(graph.toString());
                jGraphXApp.init();
                jGraphXApp.setGraph(graph);
        jGraphPanel.add(jGraphXApp);
    }//GEN-LAST:event_btnWeightedUndirectedActionPerformed

    private void btnUnweightedDirectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnweightedDirectedActionPerformed
        graph = new Graph(true);
        graph.generateUnweightedGraph((int)spnrNumNodes.getValue(),(double)spnrProbEdge.getValue());  
        jTextPane.setText(graph.toString());
                jGraphXApp.init();
                jGraphXApp.setGraph(graph);
        jGraphPanel.add(jGraphXApp);
    }//GEN-LAST:event_btnUnweightedDirectedActionPerformed

    private void btnWeightedDirectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWeightedDirectedActionPerformed
        graph = new Graph(true);
        graph.generateWeightedGraph((int)spnrNumNodes.getValue(),(double)spnrProbEdge.getValue(),100);  
        jTextPane.setText(graph.toString());
        jGraphXApp.init();
        jGraphXApp.setGraph(graph);
        jGraphPanel.add(jGraphXApp);
    }//GEN-LAST:event_btnWeightedDirectedActionPerformed

    private void btnDijkstraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDijkstraActionPerformed
        if (graph!=null)
        {
            Stack<Node> n = graph.dijkstraSearch();
            if (n == null || n.isEmpty())
            {
                txtOutput.setText("Impossible to search.");
            }
            else
            {
                jGraphXApp.colorGraph(n);
                txtOutput.setText("Success!");
            }
        }
        else
            txtOutput.setText("Graph is empty!");
    }//GEN-LAST:event_btnDijkstraActionPerformed

    private void btnBreadthSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBreadthSearchActionPerformed
       if (graph!=null)
        {
            Stack<Node> n = graph.breadthSearch();
            if (n == null || n.isEmpty())
            {
                txtOutput.setText("Impossible to search.");
            }
            else
            {
                jGraphXApp.colorGraph(n);
                txtOutput.setText("Success!");
            }
        }
        else
            txtOutput.setText("Graph is empty!");
    }//GEN-LAST:event_btnBreadthSearchActionPerformed

    private void btnDepthSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepthSearchActionPerformed
        
        if (graph!=null)
        {
            Stack<Node> n = graph.depthSearch();
            if (n == null || n.isEmpty())
            {
                txtOutput.setText("Impossible to search.");
            }
            else
            {
                jGraphXApp.colorGraph(n);
                txtOutput.setText("Success!");
            }
        }
        else
            txtOutput.setText("Graph is empty!");
    }//GEN-LAST:event_btnDepthSearchActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GraphDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraphDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraphDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraphDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraphDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBreadthSearch;
    private javax.swing.JButton btnDepthSearch;
    private javax.swing.JButton btnDijkstra;
    private javax.swing.JButton btnUnweightedDirected;
    private javax.swing.JButton btnUnweightedUndirected;
    private javax.swing.JButton btnWeightedDirected;
    private javax.swing.JButton btnWeightedUndirected;
    private javax.swing.JPanel jGraphPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextPane jTextPane;
    private javax.swing.JSpinner spnrNumNodes;
    private javax.swing.JSpinner spnrProbEdge;
    private javax.swing.JLabel txtOutput;
    // End of variables declaration//GEN-END:variables
}


