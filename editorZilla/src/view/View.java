package view;

import java.io.File;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

import org.eclipse.emf.common.util.EList;

import controller.Controller;
import defaultname.Section;
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
    private boolean hasBeenSaved = true;
    DefaultMutableTreeNode lastNodeUsed;
    
    public View(Controller controller) {
    	this.controller = controller;
    	initComponents();      
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
        newFileButton = new javax.swing.JButton();
        quickSaveButton = new javax.swing.JButton();
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
        
        jTextArea.getDocument().addDocumentListener(new DocumentListener() {
			    	
			@Override
			public void removeUpdate(DocumentEvent arg0) {
				SectionComponent sectionComponent = (SectionComponent)lastNodeUsed.getUserObject();
				controller.saveText(sectionComponent.getId(), jTextArea.getText());
				hasBeenSaved = false;	

			}
			
			@Override
			public void insertUpdate(DocumentEvent arg0) {
	        	SectionComponent sectionComponent = (SectionComponent)lastNodeUsed.getUserObject();
	        	controller.saveText(sectionComponent.getId(), jTextArea.getText());
				hasBeenSaved = false;			

			}
			
			@Override
			public void changedUpdate(DocumentEvent arg0) {
				SectionComponent sectionComponent = (SectionComponent)lastNodeUsed.getUserObject();
				controller.saveText(sectionComponent.getId(), jTextArea.getText());
				hasBeenSaved = false;	

			}
		});

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
        
        newFileButton.setIcon(new javax.swing.ImageIcon("icon\\Document-Blank-icon.png")); // NOI18N
        newFileButton.setText("New");
        newFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	newFileButtonActionPerformed(evt);
            }
        });
        
        quickSaveButton.setIcon(new javax.swing.ImageIcon("icon\\Programming-Save-icon.png")); // NOI18N
        quickSaveButton.setText("Save");
        quickSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	quickSaveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jButtonPanelLayout = new javax.swing.GroupLayout(jButtonPanel);
        jButtonPanel.setLayout(jButtonPanelLayout);
        jButtonPanelLayout.setHorizontalGroup(
            jButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jButtonPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(quickSaveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newFileButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                	.addComponent(quickSaveButton)
                	.addComponent(newFileButton)
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
        
      //initialisation de la racine
        DefaultTreeModel model = (DefaultTreeModel) jTree.getModel();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        root.setUserObject(new DefaultMutableTreeNode(controller.createRoot()));
        model.reload(root);
        
    }// </editor-fold>           
    
    

    private void cutButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
    	jTextArea.replaceRange("", controller.moveText(), controller.moveText() + controller.pasteText().length());
    	jTextArea.replaceSelection(controller.pasteText()); 	
    	controller.removeTextSelected();
    }                                         

    private void copyButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String textSelected = jTextArea.getSelectedText();
        if(textSelected != null){
        	int startPosition = jTextArea.getSelectionStart();
            controller.copyText(textSelected, startPosition);
        }
        
    }                                          

    private void pasteButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        jTextArea.replaceSelection(controller.pasteText());
    }  
    
    private void newFileButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
    	if(!hasBeenSaved){
    		hasBeenSavedOption("newFile");
    	}else{
    		controller.createNewDocument();
            reloadJTreeValues(controller.getDocument().getRacine());
    	}
    } 
    
    private void quickSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        controller.quickSave();
        hasBeenSaved = true;
    }

    private void jTreeMouseClicked(java.awt.event.MouseEvent evt) {                                   
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
    
    private void reloadJTreeValues(SectionComponent racine){
    	DefaultTreeModel model = (DefaultTreeModel)jTree.getModel();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        root.removeAllChildren();
        root.setUserObject(new DefaultMutableTreeNode(controller.createRoot()));
    	
        SectionComposite racineComposite = (SectionComposite)racine;
        EList<SectionComponent> sectionComponentList = racineComposite.getSectionComponentList();
        for(int i = 0; i < sectionComponentList.size(); ++i){
        	SectionComposite section = (SectionComposite)sectionComponentList.get(i);
        	root.add(new DefaultMutableTreeNode(section));
        	
        	DefaultMutableTreeNode node = (DefaultMutableTreeNode)root.getChildAt(i);
        	EList<SectionComponent> subsectionComponentList = section.getSectionComponentList();
        	for(SectionComponent subsectionComponent : subsectionComponentList){
        		Section subsection = (Section)subsectionComponent;
        		node.add(new DefaultMutableTreeNode(subsection));
        	}
       	
        }      
        model.reload(root);
        jTextArea.setText("");
    }

    private void addSectionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                                   
    	DefaultTreeModel model = (DefaultTreeModel) jTree.getModel();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();      
        //maximum de 4 sections par document
        if(root.getChildCount() < 4){
        	String inputTitle = takeInputTitle();
        	root.add(new DefaultMutableTreeNode(controller.addSection(inputTitle, "")));
            model.reload(root); 
            hasBeenSaved = false;
        }
    }                                                  

    private void addSubsectionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                                      
    	TreeSelectionModel selectionModel = jTree.getSelectionModel();
        TreePath selectionPath = selectionModel.getSelectionPath();
        DefaultMutableTreeNode node = (DefaultMutableTreeNode)selectionPath.getLastPathComponent();
        DefaultTreeModel model = (DefaultTreeModel) jTree.getModel();
        //on ne peut ajouter une sous-section � une autre sous-section
        if(node.getUserObject().getClass().toString().contains("SectionComposite")){
        	SectionComposite section = (SectionComposite)node.getUserObject();
            String inputTitle = takeInputTitle();
            node.add(new DefaultMutableTreeNode(controller.addSubSection(section.getId(), inputTitle, "")));
            model.reload(node);
            hasBeenSaved = false;
        }
        
    }                                                     

    private void deleteSectionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                                         	
    	System.out.println("IMPL�MENTER LE DELETE");
    }                                                     

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                                	
    	if(!hasBeenSaved){
    		hasBeenSavedOption("openFile");
    	}else{
    		JFileChooser fileChooser = new JFileChooser("DossierDefaut");
    		FileNameExtensionFilter eZillaExtensionFiler = new FileNameExtensionFilter("eZilla file", "eZilla");
    		fileChooser.setFileFilter(eZillaExtensionFiler);
        	int returnVal = fileChooser.showOpenDialog(openMenuItem); 
        	File file = null;
        	if (returnVal == JFileChooser.APPROVE_OPTION) {
        	    file = fileChooser.getSelectedFile();
        	}        	
        	if(!file.getName().contains(".eZilla")){
        		JOptionPane.showMessageDialog(new JFrame(), "Select a .eZilla file!");   
        	}else{
        		controller.load(file.getAbsolutePath());
                reloadJTreeValues(controller.getDocument().getRacine());
                hasBeenSaved = true;      		
        	} 
    	}
    	
    }                                            

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                             
    	JFileChooser fileChooser = new JFileChooser("DossierDefaut");
		FileNameExtensionFilter eZillaExtensionFiler = new FileNameExtensionFilter("eZilla File", "eZilla");
		fileChooser.setFileFilter(eZillaExtensionFiler);
    	int retrival = fileChooser.showSaveDialog(saveMenuItem);
        if (retrival == JFileChooser.APPROVE_OPTION) {
        	String filePath = fileChooser.getSelectedFile().getAbsolutePath();
        	if(!filePath.contains(".eZilla")){
        		filePath = filePath + ".eZilla";
        	}
        	controller.save(filePath);
        	hasBeenSaved = true;
        }  	
    }                                            

    private void exportMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }  
    
    private void hasBeenSavedOption(String operation){
    	JFrame frame = new JFrame();
        String iconArray[] = { "Continue without saving", "Save and continue", "Cancel" };

        Object jOptionPaneSelection = JOptionPane.showOptionDialog(frame, "Do you want to save your last modifications?", "Select an Option",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, iconArray, iconArray[1]);
        switch(jOptionPaneSelection.toString()){
        	case "0": System.out.println("Continue without saving");
        			  doNextOpration(operation);
        	          break;
        	case "1": System.out.println("Save and continue");
				      controller.quickSave();
				      doNextOpration(operation);
        			  break; 
        	case "2": System.out.println("Cancel");
		      		  break;
        }
       
    }
    
    private void doNextOpration(String operation){   
    	if(operation.equals("newFile")){
    		controller.createNewDocument();
            reloadJTreeValues(controller.getDocument().getRacine());
            hasBeenSaved = true;
    	
    	}else if(operation.equals("openFile")){
    		JFileChooser fileChooser = new JFileChooser("DossierDefaut");
    		FileNameExtensionFilter eZillaExtensionFiler = new FileNameExtensionFilter("eZilla File", "eZilla");
    		fileChooser.setFileFilter(eZillaExtensionFiler);
    		int returnVal = fileChooser.showOpenDialog(openMenuItem); 
        	File file = null;
        	if (returnVal == JFileChooser.APPROVE_OPTION) {
        	    file = fileChooser.getSelectedFile();
        	} 
        	
        	if(!file.getName().contains(".eZilla")){
        		JOptionPane.showMessageDialog(new JFrame("Error!"), "Select a .eZilla file!"); 
        	}else{
        		controller.load(file.getAbsolutePath());
                reloadJTreeValues(controller.getDocument().getRacine());
                hasBeenSaved = true;      		
        	}        	            	
    	}
    }
    
    private String takeInputTitle(){
    	String inputTitle = JOptionPane.showInputDialog(null, "Choose a title for the section");
    	while(inputTitle.isEmpty()){
    		inputTitle = JOptionPane.showInputDialog(null, "The title can't be empty");
    	}
    	return inputTitle;
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
    private javax.swing.JButton newFileButton;
    private javax.swing.JButton quickSaveButton;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration                   
}
