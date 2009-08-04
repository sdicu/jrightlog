
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;

/**
 *
 * @author sebastien roux
 * @mail roux.sebastien@gmail.com
 *
 */
public class GUI extends javax.swing.JFrame {

    private static final String FILESEPARATOR = ";";

    /* Set system default look&feel */
    public static void setNativeLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Error setting native LAF: " + e);
        }
    }
    private static Component frame;

    /** Creates new form GUI */
    public GUI() {
        setNativeLookAndFeel();

        //Set the frame icon to an image loaded from a file.
        setIconImage(Toolkit.getDefaultToolkit().getImage(
                GUI.class.getResource("img/misc.png")));

 /*       Frame fa = new Frame("Frame Hiding");
        fa.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                Frame frame = (Frame) e.getSource();
                frame.setVisible(false);
            }
        });*/

        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        radDateISO = new javax.swing.JRadioButton();
        radDateUS = new javax.swing.JRadioButton();
        radDateEur = new javax.swing.JRadioButton();
        radDateDefault = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtInputFilePath = new javax.swing.JTextField();
        butonSelectInputFile = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtOutputFilePath = new javax.swing.JTextField();
        butonSelectOuputFile = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtFilter = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        chkZip = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        chkHeader = new javax.swing.JCheckBox();
        chkCategories = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        txtDelimiter = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jButton4.setText("jButton4");
        jButton4.setName("jButton4"); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JRightLog");
        setResizable(false);

        jButton3.setText("Execute");
        jButton3.setName("buttonExecute"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                execute(evt);
            }
        });

        jButton5.setText("Quit");
        jButton5.setName("buttonQuit"); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quit(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Date format"));
        jPanel1.setName("panDate"); // NOI18N

        buttonGroup1.add(radDateISO);
        radDateISO.setText("ISO 8601 (YYYY-MM-DD)");
        radDateISO.setToolTipText("International date format (ISO 8601)");
        radDateISO.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        radDateISO.setName("radDateISO"); // NOI18N

        buttonGroup1.add(radDateUS);
        radDateUS.setText("US (MM/DD/YYYY)");
        radDateUS.setToolTipText("US date format");
        radDateUS.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        radDateUS.setName("radDateUS"); // NOI18N

        buttonGroup1.add(radDateEur);
        radDateEur.setText("European (DD/MM/YYYY)");
        radDateEur.setToolTipText("European date format");
        radDateEur.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        radDateEur.setName("radDateEur"); // NOI18N

        buttonGroup1.add(radDateDefault);
        radDateDefault.setSelected(true);
        radDateDefault.setText("Default");
        radDateDefault.setToolTipText("Essbase default date format");
        radDateDefault.setName("radDateDefault"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(radDateEur, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radDateUS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radDateISO, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radDateDefault, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(radDateDefault, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radDateISO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radDateUS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radDateEur)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Source and target"));
        jPanel2.setName("panFiles"); // NOI18N

        jLabel1.setText("Input file(s)");
        jLabel1.setName("labSourceFile"); // NOI18N

        txtInputFilePath.setToolTipText("Select Essbase server or application logs"); // NOI18N
        txtInputFilePath.setName("txtInputFilePath"); // NOI18N
        txtInputFilePath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputFilePathActionPerformed(evt);
            }
        });

        butonSelectInputFile.setText("...");
        butonSelectInputFile.setName("buttonSelectInputFile"); // NOI18N
        butonSelectInputFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonSelectInputFileActionPerformed(evt);
            }
        });

        jLabel2.setText("Target file");
        jLabel2.setName("labTargeFile"); // NOI18N

        txtOutputFilePath.setToolTipText("Specify output file"); // NOI18N
        txtOutputFilePath.setName("txtOutputFilePath"); // NOI18N

        butonSelectOuputFile.setText("...");
        butonSelectOuputFile.setName("buttonSelectOuputFile"); // NOI18N
        butonSelectOuputFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonSelectOuputFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtOutputFilePath, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(txtInputFilePath, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(butonSelectOuputFile)
                            .addComponent(butonSelectInputFile, 0, 0, Short.MAX_VALUE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInputFilePath)
                    .addComponent(butonSelectInputFile, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOutputFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butonSelectOuputFile, 0, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtering"));
        jPanel4.setName("panFilter"); // NOI18N

        jLabel3.setText("Filter string (case sensitive)");
        jLabel3.setName("labFilter"); // NOI18N

        txtFilter.setToolTipText("Specify a filter string");
        txtFilter.setName("txtFilter"); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFilter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Compression"));
        jPanel5.setEnabled(false);
        jPanel5.setName("jPanel5"); // NOI18N

        chkZip.setText("Zip output");
        chkZip.setToolTipText("Specify compression of output");
        chkZip.setEnabled(false);
        chkZip.setName("chkZip"); // NOI18N
        chkZip.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkZipItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chkZip, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(chkZip, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Content"));
        jPanel6.setEnabled(false);
        jPanel6.setName("jPanel6"); // NOI18N

        chkHeader.setText("Header");
        chkHeader.setToolTipText("Insert headers on top of output file");
        chkHeader.setName("chkHeader"); // NOI18N
        chkHeader.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkHeaderItemStateChanged(evt);
            }
        });

        chkCategories.setText("Categories");
        chkCategories.setToolTipText("Insert message categories");
        chkCategories.setName("chkCategories"); // NOI18N
        chkCategories.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkCategoriesItemStateChanged(evt);
            }
        });

        jLabel4.setText("Delimiter");
        jLabel4.setName("labSeparator"); // NOI18N

        txtDelimiter.setText(Reconstruct.getOutputDelimiter());
        txtDelimiter.setToolTipText("Specify an output delimiter (type \"\\t\" or \"tab\" for tabulation delimiter)");
        txtDelimiter.setName("txtSeparator"); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chkCategories, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(chkHeader)
                    .addComponent(txtDelimiter))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(chkHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkCategories)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDelimiter, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        jMenuBar1.setName("Menu"); // NOI18N

        jMenu1.setText("File");
        jMenu1.setName("jMenu1"); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Exit");
        jMenuItem1.setName("jMenuItem1"); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFileExit(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Options");
        jMenu3.setName("jMenu3"); // NOI18N

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Save current configuration");
        jMenuItem3.setName("jMenuItem3"); // NOI18N
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOptionsSaveConfig(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Load saved configuration");
        jMenuItem4.setName("jMenuItem4"); // NOI18N
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOptionsLoadConfig(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Help");
        jMenu2.setName("jMenu2"); // NOI18N

        jMenuItem2.setText("About");
        jMenuItem2.setName("jMenuItem2"); // NOI18N
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHelpAbout(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5))
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton3)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butonSelectInputFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonSelectInputFileActionPerformed

        String path = null;
        //Create a file chooser
        if (!txtInputFilePath.getText().toString().isEmpty()) {
            path = txtInputFilePath.getText().toString();
        }
        final JFileChooser fileChooser = new JFileChooser(path);
        fileChooser.setMultiSelectionEnabled(true);
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Essbase server and application logs (*.LOG)", "LOG"));

        int returnVal = fileChooser.showOpenDialog(null);

        String filePath = "";

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File selectedFiles[] = fileChooser.getSelectedFiles();

            for (int i = 0; i < selectedFiles.length; i++) {
                if (i == (selectedFiles.length - 1)) {
                    filePath = filePath + selectedFiles[i].toString();
                } else {
                    filePath = filePath + selectedFiles[i].toString() + FILESEPARATOR;
                }
            }
            txtInputFilePath.setText(filePath);
        }
}//GEN-LAST:event_butonSelectInputFileActionPerformed

    @SuppressWarnings("static-access")
    private void execute(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_execute
        Reconstruct reconstruct = new Reconstruct();

        // Set input files
        if (txtInputFilePath.getText().toString().isEmpty()) {
            //custom title, warning icon
            JOptionPane.showMessageDialog(frame,
                    "Please specify input file(s)",
                    "Input directory",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            String[] strInputFile = txtInputFilePath.getText().toString().split(FILESEPARATOR);
            File[] fInputFile = new File[strInputFile.length];
            for (int counter = 0; counter < strInputFile.length; counter++) {
                if (new File(strInputFile[counter].toString()).exists() == false || !new File(strInputFile[counter]).isFile()) {

                    JOptionPane.showMessageDialog(frame,
                            strInputFile[counter].toString() + ": specified file is not a file or does not exist!",
                            "Input file(s)",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                } else {
                    fInputFile[counter] = new File(strInputFile[counter].toString());
                }
            }

            reconstruct.setInputFile(fInputFile);
        }

        // Set output directory
        if (txtOutputFilePath.getText().toString().isEmpty()) {
            //custom title, warning icon
            JOptionPane.showMessageDialog(frame,
                    "Please specify an output file",
                    "Output file",
                    JOptionPane.WARNING_MESSAGE);
            return;

        } else {
            reconstruct.setOutputFile(txtOutputFilePath.getText().toString());
        }

        // Set filter string
        reconstruct.setFilter(txtFilter.getText().toString());

        // Set delimiter
        reconstruct.setOutputDelimiter(txtDelimiter.getText().toString());

        // Date format
        if (radDateDefault.isSelected()) {
            reconstruct.setDateFormat("default");
        } else if (radDateISO.isSelected()) {
            reconstruct.setDateFormat("iso");
        } else if (radDateEur.isSelected()) {
            reconstruct.setDateFormat("eur");
        } else if (radDateUS.isSelected()) {
            reconstruct.setDateFormat("us");
        } else {
            //custom title, warning icon
            JOptionPane.showMessageDialog(frame,
                    "No date format specified",
                    "Date format",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Headers
        if (chkHeader.isSelected()) {
            reconstruct.setHeader(true);
        }

        // Categories
        if (chkCategories.isSelected()) {
            reconstruct.setCategories(true);
        }

        // Compression
        /*if (chkZip.isSelected()) {
        reconstruct.setZipOption(true);
        }*/

        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        reconstruct.go();
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_execute

    private void quit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quit
        System.exit(0);
    }//GEN-LAST:event_quit

    private void butonSelectOuputFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonSelectOuputFileActionPerformed

        //Create a file saver
        final JFileChooser fileSaver = new JFileChooser();
        fileSaver.setFileSelectionMode(JFileChooser.SAVE_DIALOG);

        int returnVal = fileSaver.showSaveDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File outputFile = fileSaver.getSelectedFile();
            txtOutputFilePath.setText(outputFile.toString());
        }
    }//GEN-LAST:event_butonSelectOuputFileActionPerformed

    private void menuFileExit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFileExit
        System.exit(0);
}//GEN-LAST:event_menuFileExit

    private void menuHelpAbout(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHelpAbout
        About about = new About(this, rootPaneCheckingEnabled);
        about.setVisible(true);
}//GEN-LAST:event_menuHelpAbout

    @SuppressWarnings("static-access")
    private void menuOptionsSaveConfig(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOptionsSaveConfig
        Config cfg = new Config();
        Reconstruct reconstruct = new Reconstruct();

        String[] strInputFile = txtInputFilePath.getText().toString().split(FILESEPARATOR);
        File[] fInputFile = new File[strInputFile.length];
        for (int counter = 0; counter < strInputFile.length; counter++) {
            if (new File(strInputFile[counter].toString()).exists() == false || !new File(strInputFile[counter]).isFile()) {

                JOptionPane.showMessageDialog(frame,
                        strInputFile[counter].toString() + ": specified file is not a file or does not exist!",
                        "Input file(s)",
                        JOptionPane.WARNING_MESSAGE);
                return;
            } else {
                fInputFile[counter] = new File(strInputFile[counter].toString());
            }
        }
        reconstruct.setInputFile(fInputFile);

        reconstruct.setOutputFile(txtOutputFilePath.getText().toString());
        reconstruct.setFilter(txtFilter.getText().toString());
        reconstruct.setOutputDelimiter(txtDelimiter.getText().toString());

        // Date format
        if (radDateDefault.isSelected()) {
            reconstruct.setDateFormat("default");
        } else if (radDateISO.isSelected()) {
            reconstruct.setDateFormat("iso");
        } else if (radDateEur.isSelected()) {
            reconstruct.setDateFormat("eur");
        } else if (radDateUS.isSelected()) {
            reconstruct.setDateFormat("us");
        }

        // Header
        if (chkHeader.isSelected()) {
            reconstruct.setHeader(true);
        } else {
            reconstruct.setHeader(false);
        }

        // Categories
        if (chkCategories.isSelected()) {
            reconstruct.setCategories(true);
        } else {
            reconstruct.setCategories(false);
        }

        // Compression
        /*if (chkZip.isSelected()) {
        reconstruct.setZipOption(true);
        } else {
        reconstruct.setZipOption(false);
        }*/

        cfg.setConfig();
    }//GEN-LAST:event_menuOptionsSaveConfig

    @SuppressWarnings("static-access")
    private void menuOptionsLoadConfig(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOptionsLoadConfig
        Reconstruct reconstruct = new Reconstruct();
        Config cfg = new Config();

        cfg.getConfig();

        txtInputFilePath.setText(reconstruct.getInputFile(""));
        txtOutputFilePath.setText(reconstruct.getOutputFile().toString());
        txtFilter.setText(reconstruct.getFilter().toString());
        txtDelimiter.setText(reconstruct.getOutputDelimiter().toString());

        // Date format
        if (reconstruct.getDateFormat().equals("default")) {
            radDateDefault.setSelected(true);
        } else if (reconstruct.getDateFormat().equals("iso")) {
            radDateISO.setSelected(true);
        } else if (reconstruct.getDateFormat().equals("eur")) {
            radDateEur.setSelected(true);
        } else if (reconstruct.getDateFormat().equals("us")) {
            radDateUS.setSelected(true);
        }

        chkHeader.setSelected(reconstruct.getHeader());
        chkCategories.setSelected(reconstruct.getCategories());
        //chkZip.setSelected(reconstruct.getZipOption());
    }//GEN-LAST:event_menuOptionsLoadConfig

    @SuppressWarnings("static-access")
    private void chkZipItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkZipItemStateChanged
        //Reconstruct reconstruct = new Reconstruct();

        /*if (evt.getStateChange() == evt.DESELECTED) {
        reconstruct.setZipOption(false);
        } else {
        reconstruct.setZipOption(true);
        }*/
    }//GEN-LAST:event_chkZipItemStateChanged

    @SuppressWarnings("static-access")
    private void chkHeaderItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkHeaderItemStateChanged
        Reconstruct reconstruct = new Reconstruct();

        if (evt.getStateChange() == evt.DESELECTED) {
            reconstruct.setHeader(false);
        } else {
            reconstruct.setHeader(true);
        }
    }//GEN-LAST:event_chkHeaderItemStateChanged

    @SuppressWarnings("static-access")
    private void chkCategoriesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkCategoriesItemStateChanged
        Reconstruct reconstruct = new Reconstruct();

        if (evt.getStateChange() == evt.DESELECTED) {
            reconstruct.setCategories(false);
        } else {
            reconstruct.setCategories(true);
        }
    }//GEN-LAST:event_chkCategoriesItemStateChanged

    private void txtInputFilePathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputFilePathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputFilePathActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void go() {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @SuppressWarnings("static-access")
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butonSelectInputFile;
    private javax.swing.JButton butonSelectOuputFile;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JCheckBox chkCategories;
    private javax.swing.JCheckBox chkHeader;
    private javax.swing.JCheckBox chkZip;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton radDateDefault;
    private javax.swing.JRadioButton radDateEur;
    private javax.swing.JRadioButton radDateISO;
    private javax.swing.JRadioButton radDateUS;
    private javax.swing.JTextField txtDelimiter;
    private javax.swing.JTextField txtFilter;
    private javax.swing.JTextField txtInputFilePath;
    private javax.swing.JTextField txtOutputFilePath;
    // End of variables declaration//GEN-END:variables
}
