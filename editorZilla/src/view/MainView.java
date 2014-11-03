package view;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.text.*;

import java.io.File;

/**
 *
 * @author Leg
 */
public class MainView extends JFrame {

    private JTextArea textArea = new JTextArea(50, 150);
    private int fontSize = 12;
    
    public MainView()
    {
        textArea.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
        JScrollPane textScroll = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        add(textScroll, BorderLayout.CENTER);
        
        //Différents éléments de la MenuBar
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("Menu 1");
        JMenu menu2 = new JMenu("Menu 2");
        JMenu menu3 = new JMenu("Menu 3");
        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);
        setJMenuBar(menuBar);
        
        //Éléments de la JToolBar, utiliser les AbstractAction
        JToolBar tool = new JToolBar();
        add(tool, BorderLayout.NORTH);
        tool.add(Open);
        tool.add(Save);
         
        JButton cut = tool.add(Cut);
        cut.setText(null);
        cut.setIcon(new ImageIcon("cut.gif"));
        
        JButton copy = tool.add(Copy);
        copy.setText(null);
        copy.setIcon(new ImageIcon("copy.gif"));
        
         JButton paste = tool.add(Paste);
        paste.setText(null);
        paste.setIcon(new ImageIcon("paste.gif"));
                
        //Set pour le GUI
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack(); //va ouvrir le GUI avec le (50,150) du JTextArea 
        setTitle("Prototype Text Editor");
        setVisible(true);
    }
    
    //On peut utiliser des Action de base du JTextArea
    ActionMap textAreaActionMap = textArea.getActionMap();
    Action Cut = textAreaActionMap.get(DefaultEditorKit.cutAction);
    Action Paste = textAreaActionMap.get(DefaultEditorKit.pasteAction);
    Action Copy = textAreaActionMap.get(DefaultEditorKit.copyAction);
    

    //On ouvre un fichier.
    Action Open = new AbstractAction("Open", new ImageIcon("open.gif")) {
        public void actionPerformed(ActionEvent e) {
        	
        	final JFileChooser fc = new JFileChooser();
        	int returnVal = fc.showOpenDialog(null);
        	 
        	 if (returnVal == fc.APPROVE_OPTION) {
                 File file = fc.getSelectedFile();
                JOptionPane.showMessageDialog(null, "Le nom du fichier est: " + file.getName() ) ;
             }
        }
    };
    
    Action Save = new AbstractAction("Save", new ImageIcon("save.gif")) {
        public void actionPerformed(ActionEvent e) {
            //action vide pour le prototype
        }
    };

    public static void main(String[] args) {
        new MainView();
    }

}
