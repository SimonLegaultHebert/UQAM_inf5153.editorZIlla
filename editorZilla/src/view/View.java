package view;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

import controller.Controller;
import defaultname.SectionComponent;
import defaultname.SectionComposite;

/**
 *
 * @author Leg
 */
public class View extends javax.swing.JFrame {
 
	private Controller controller;
    private final int LEFT_CLICK = 1;
    private final int RIGHT_CLICK = 3;
    private DefaultMutableTreeNode lastNodeUsed; //va servir pour sauvegarder le texte dans les sections et sous-sections
    
    public View(Controller controller) {
        initComponents();
        this.controller = controller;       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jTreePopupMenu = new javax.swing.JPopupMenu();
        addSectionMenuItem = new javax.swing.JMenuItem();
        addSubsectionMenuItem = new javax.swing.JMenuItem();
        deleteSectionMenuItem = new javax.swing.JMenuItem();
        jTreePanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        jTextAreaPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jButtonPanel = new javax.swing.JPanel();
        cutButton = new javax.swing.JButton();
        pasteButton = new javax.swing.JButton();
        copyButton = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        exportMenuItem = new javax.swing.JMenuItem();

        addSectionMenuItem.setText("add Section");
        addSectionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSectionMenuItemActionPerformed(evt);
            }
        });
        jTreePopupMenu.add(addSectionMenuItem);

        addSubsectionMenuItem.setText("add Subsection");
        addSubsectionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSubsectionMenuItemActionPerformed(evt);
            }
        });
        jTreePopupMenu.add(addSubsectionMenuItem);

        deleteSectionMenuItem.setText("delete");
        deleteSectionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSectionMenuItemActionPerformed(evt);
            }
        });
        jTreePopupMenu.add(deleteSectionMenuItem);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTreeMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTree);

        javax.swing.GroupLayout jTreePanelLayout = new javax.swing.GroupLayout(jTreePanel);
        jTreePanel.setLayout(jTreePanelLayout);
        jTreePanelLayout.setHorizontalGroup(
            jTreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTreePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );
        jTreePanelLayout.setVerticalGroup(
            jTreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTreePanelLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jScrollPane3.setViewportView(jTextArea);

        javax.swing.GroupLayout jTextAreaPanelLayout = new javax.swing.GroupLayout(jTextAreaPanel);
        jTextAreaPanel.setLayout(jTextAreaPanelLayout);
        jTextAreaPanelLayout.setHorizontalGroup(
            jTextAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTextAreaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
                .addContainerGap())
        );
        jTextAreaPanelLayout.setVerticalGroup(
            jTextAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTextAreaPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        cutButton.setIcon(new javax.swing.ImageIcon("icon\\Editing-Cut-Filled-icon.png")); // NOI18N
        cutButton.setText("Cut");
        cutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutButtonActionPerformed(evt);
            }
        });

        pasteButton.setIcon(new javax.swing.ImageIcon("icon\\Editing-Paste-icon.png")); // NOI18N
        pasteButton.setText("Paste");
        pasteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteButtonActionPerformed(evt);
            }
        });

        copyButton.setIcon(new javax.swing.ImageIcon("icon\\copy-icon.png")); // NOI18N
        copyButton.setText("Copy");
        copyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jButtonPanelLayout = new javax.swing.GroupLayout(jButtonPanel);
        jButtonPanel.setLayout(jButtonPanelLayout);
        jButtonPanelLayout.setHorizontalGroup(
            jButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jButtonPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(copyButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pasteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cutButton)
                .addContainerGap())
        );
        jButtonPanelLayout.setVerticalGroup(
            jButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jButtonPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cutButton)
                    .addComponent(pasteButton)
                    .addComponent(copyButton))
                .addContainerGap())
        );

        fileMenu.setText("File");

        openMenuItem.setText("Open ");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        saveMenuItem.setText("Save ");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        exportMenuItem.setText("Export ");
        exportMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exportMenuItem);

        jMenuBar.add(fileMenu);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTreePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextAreaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTreePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextAreaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void cutButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void copyButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void pasteButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTreeMouseClicked(java.awt.event.MouseEvent evt) {                                   
    	//on save le texte du dernier node utilis� dans le tree
    	if(lastNodeUsed != null){
    		if(!lastNodeUsed.getUserObject().getClass().toString().equals("class java.lang.String")){
    			SectionComponent sectionComponent = (SectionComponent)lastNodeUsed.getUserObject();
    			controller.saveText(sectionComponent.getId(), jTextArea.getText());
    		}
    	}
    	TreeSelectionModel selectionModel = jTree.getSelectionModel();
    	TreePath selectionPath = selectionModel.getSelectionPath();
    	DefaultMutableTreeNode node = (DefaultMutableTreeNode)selectionPath.getLastPathComponent();
    	
    	lastNodeUsed = node;
    	
        if(evt.getButton() == LEFT_CLICK){
             
            try{
            	SectionComponent sectionComponent = (SectionComponent)node.getUserObject();
            	String currentText = controller.getContent(sectionComponent.getId());
            	jTextArea.setText(currentText);
            	
            }catch(Exception e){
            	System.out.println("Petit bug � fix, le root va devoir �tre un SectionComposite et non une String");
            }        
        	
        }else if(evt.getButton() == RIGHT_CLICK){
        
        	jTreePopupMenu.show(this, evt.getX(), evt.getY());
        	
        }
    }                                  

    private void addSectionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                                   
    	DefaultTreeModel model = (DefaultTreeModel) jTree.getModel();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        root.add(new DefaultMutableTreeNode(controller.addSection()));
        model.reload(root); 
    }                                                  

    private void addSubsectionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                                      
    	TreeSelectionModel selectionModel = jTree.getSelectionModel();
        TreePath selectionPath = selectionModel.getSelectionPath();
        DefaultMutableTreeNode node = (DefaultMutableTreeNode)selectionPath.getLastPathComponent();
        DefaultTreeModel model = (DefaultTreeModel) jTree.getModel();
        SectionComposite section = (SectionComposite)node.getUserObject();

        node.add(new DefaultMutableTreeNode(controller.addSubSection(section.getId())));
        model.reload(node);
    }                                                     

    private void deleteSectionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        System.out.println("IMPL�MENTER LE DELETE");
    }                                                     

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                             
        controller.load("DossierDefaut/Document par d�faut");
    }                                            

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                             
        controller.save();
    }                                            

    private void exportMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new View().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify                     
    private javax.swing.JMenuItem addSectionMenuItem;
    private javax.swing.JMenuItem addSubsectionMenuItem;
    private javax.swing.JButton copyButton;
    private javax.swing.JButton cutButton;
    private javax.swing.JMenuItem deleteSectionMenuItem;
    private javax.swing.JMenuItem exportMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JPanel jButtonPanel;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JPanel jTextAreaPanel;
    private javax.swing.JTree jTree;
    private javax.swing.JPanel jTreePanel;
    private javax.swing.JPopupMenu jTreePopupMenu;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JButton pasteButton;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration                   
}
