/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wvulaunchpad3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultTreeSelectionModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

/**
 *
 * @author callie
 */
public class main extends javax.swing.JFrame {
    String dataPath = "/home/data/Volumes/";
    String savedSetDirectory = "/home/calvr/savedsets/";
    /**
     * Creates new form main
     */
    public main() {
        this.setTitle("WVU LaunchPad");
        initComponents();
        loadProperties();
        getAndSetTree();
        refreshSavedSetList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        volumeTree = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        savedSetList = new javax.swing.JList();
        saveButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        launchButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loadButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        PropertiesSubMenu = new javax.swing.JMenu();
        DataPathMenu = new javax.swing.JMenuItem();
        SavedSetPathMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        volumeTree.setSelectionModel(null);
        jScrollPane1.setViewportView(volumeTree);

        savedSetList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        savedSetList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(savedSetList);

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        launchButton.setText("Launch");
        launchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                launchButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Set Repository");

        jLabel2.setText("Saved Sets");

        loadButton.setText("Load");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        FileMenu.setText("File");

        PropertiesSubMenu.setText("Properties");

        DataPathMenu.setText("Edit Data Path..");
        DataPathMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataPathMenuActionPerformed(evt);
            }
        });
        PropertiesSubMenu.add(DataPathMenu);

        SavedSetPathMenu.setText("Edit Saved Set Path..");
        SavedSetPathMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavedSetPathMenuActionPerformed(evt);
            }
        });
        PropertiesSubMenu.add(SavedSetPathMenu);

        FileMenu.add(PropertiesSubMenu);

        jMenuBar1.add(FileMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(launchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(loadButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(saveButton)
                    .addComponent(removeButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(launchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(loadButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
     * Creates a Set of cells based on the currently selected tree nodes.
     */
    private void launchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_launchButtonActionPerformed
        Set set = createSetFromSelection(volumeTree.getSelectionPaths());
        try {
            new XMLWriter(set).write();
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_launchButtonActionPerformed
/*
 * Creates and saves a .xml config file based on the currently selected tree nodes.
 * The .xml file is saved to the specified save file directory.
 */
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String saveName = JOptionPane.showInputDialog("Name Your Set");
        String xmlFile = savedSetDirectory + saveName + ".xml";
        Set set = createSetFromSelection(volumeTree.getSelectionPaths());
        try {
            new XMLWriter(set).write(xmlFile);
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultListModel dlm = (DefaultListModel) savedSetList.getModel();
        dlm.addElement(saveName + ".xml");
    }//GEN-LAST:event_saveButtonActionPerformed
/*
 * Copies the saved .xml file into the default runtime config file.
 */
    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        String setPath = savedSetDirectory + savedSetList.getSelectedValue();       
        try {
            new XMLWriter().copyOver(setPath);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loadButtonActionPerformed
/*
 * Removes a saved set from the list and deletes its .xml file from the system.
 */
    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
       String selectedSet = (String) savedSetList.getSelectedValue(); 
       new File(savedSetDirectory + selectedSet).delete();
       savedSetList.removeAll();
       refreshSavedSetList();
    }//GEN-LAST:event_removeButtonActionPerformed
/*
 * Displays the current data path and allows it to be changed.
 */
    private void DataPathMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataPathMenuActionPerformed
        String dataPath = JOptionPane.showInputDialog("Edit Data Path", dataPath);
    }//GEN-LAST:event_DataPathMenuActionPerformed

    private void SavedSetPathMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavedSetPathMenuActionPerformed
        String dataPath = JOptionPane.showInputDialog("Edit Saved Set Path", savedSetDirectory);
    }//GEN-LAST:event_SavedSetPathMenuActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem DataPathMenu;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JMenu PropertiesSubMenu;
    private javax.swing.JMenuItem SavedSetPathMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton launchButton;
    private javax.swing.JButton loadButton;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JList savedSetList;
    private javax.swing.JTree volumeTree;
    // End of variables declaration//GEN-END:variables

    /*
     * Initializes global property variables based on the properties file.
     */
    private void loadProperties(){
        Properties config = null;
        try {
            config = new Properties();
            config.load(main.class.getClassLoader().getResourceAsStream("config.properties"));
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        dataPath = config.getProperty("dataPath");
        savedSetDirectory = config.getProperty("savedSetDirectory");
    }
    
    /*
     * Creates a tree and populates it with the
     * file structure of the specified data path.
     */
    private void getAndSetTree() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(new File("/home/data/"));
        recursivePopulate(root, new CellDirectory(dataPath));
        DefaultTreeModel model = new DefaultTreeModel(root);
        volumeTree.setModel(model);
        volumeTree.setSelectionModel(new DefaultTreeSelectionModel());
        volumeTree.getSelectionModel().setSelectionMode(TreeSelectionModel.DISCONTIGUOUS_TREE_SELECTION);
    }
    /*
    * Recursively crawls through a directory and adds each file and folder as a
    * node in the tree.
    */
    private void recursivePopulate(DefaultMutableTreeNode parent, CellDirectory f) {
        DefaultMutableTreeNode cell = new DefaultMutableTreeNode(f);
        //System.out.println(cell.getUserObject());
        
        parent.add(cell); //If we only want directories, put this line inside subsequent if statement

        if (f.isDirectory()) {
          
            File[] subFiles = f.listFiles();

            //---Recurse through all sub directories/files
            for (int i = 0; i < subFiles.length; i++) {
                recursivePopulate(cell, (new CellDirectory(subFiles[i])));
            }
        }
    }
    /*
     * Creates a Set of cells based on the selected nodes.
     */
    private Set createSetFromSelection(TreePath[] selectionPaths) {
        File[] cellDirectories = new File[selectionPaths.length];
        for (int i = 0; i < cellDirectories.length; i++) {
            DefaultMutableTreeNode selectedNode = new DefaultMutableTreeNode(selectionPaths[i].getLastPathComponent());
            String parentPath = "";
            for (int j = 0; j < selectionPaths[i].getPathCount(); j++) {
                parentPath = parentPath + "/" + selectionPaths[i].getPathComponent(j);
            }
            String directoryPath = parentPath + "/";
            cellDirectories[i] = new File(directoryPath);
        }
        Set set = null;
        try {
            System.out.println(cellDirectories);
            set = new Set(cellDirectories);
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return set;
    }
    /*
     * Refreshes the list of saved sets in order to display recent changes.
     */
    private void refreshSavedSetList() {
        File folder = new File(savedSetDirectory);
        File[] listOfFiles = folder.listFiles();
        DefaultListModel dlm = new DefaultListModel();
        for (int i = 0; i < listOfFiles.length; i++) {
            dlm.addElement(listOfFiles[i].getName());
        }
        savedSetList.setModel(dlm);
        savedSetList.validate();
    }
}
