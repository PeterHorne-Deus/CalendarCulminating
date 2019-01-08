/*
 * Peter Horne-Deus
 * The is a program is a one month editable calendar
 * calendarCulminating.java
 * January 8, 2019
 */

package calendarCulminating;

import java.awt.Dimension;
import java.awt.Toolkit;




/**
 *
 * @author pehor9164
 */
public class calendarCulminating extends javax.swing.JFrame {

    /**
     * Creates new form calendarCulminating
     */
    
    //Public Variables
    String activities;
    
    public calendarCulminating() {
        initComponents();
        
        //Stack Overflow
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        firstJFrame.setSize(screenSize.width, screenSize.height);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstJFrame = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        firstActivitiesTxtArea = new javax.swing.JTextArea();
        firstUpdateBtn = new javax.swing.JButton();
        secondJFrame = new javax.swing.JFrame();
        thirdJFrame = new javax.swing.JFrame();
        fourthJFrame = new javax.swing.JFrame();
        fifthJFrame = new javax.swing.JFrame();
        sixthJFrame = new javax.swing.JFrame();
        seventhJFrame = new javax.swing.JFrame();
        eighthJFrame = new javax.swing.JFrame();
        ninthJFrame = new javax.swing.JFrame();
        tenthJFrame = new javax.swing.JFrame();
        eleventhJFrame = new javax.swing.JFrame();
        twelfthJFrame = new javax.swing.JFrame();
        thirteenthJFrame = new javax.swing.JFrame();
        fourteenthJFrame = new javax.swing.JFrame();
        fifteenthJFrame = new javax.swing.JFrame();
        sixteenthJFrame = new javax.swing.JFrame();
        seventeenthJFrame = new javax.swing.JFrame();
        eighteenthJFrame = new javax.swing.JFrame();
        nineteenthJFrame = new javax.swing.JFrame();
        twentiethJFrame = new javax.swing.JFrame();
        twentyFirstJFrame = new javax.swing.JFrame();
        twentySecondJFrame = new javax.swing.JFrame();
        twentyThirdJFrame = new javax.swing.JFrame();
        twentyFourthJFrame = new javax.swing.JFrame();
        twentyFifthJFrame = new javax.swing.JFrame();
        twentySixthJFrame = new javax.swing.JFrame();
        twentySeventhJFrame = new javax.swing.JFrame();
        twentyEighthJFrame = new javax.swing.JFrame();
        monthBackgroundPnl = new javax.swing.JPanel();
        firstScrollPane = new javax.swing.JScrollPane();
        firstTxtArea = new javax.swing.JTextArea();
        twentyFirstScrollPane = new javax.swing.JScrollPane();
        twentyFirstTxtArea = new javax.swing.JTextArea();
        secondScrollPane = new javax.swing.JScrollPane();
        secondTxtArea = new javax.swing.JTextArea();
        twentySecondScrollPane = new javax.swing.JScrollPane();
        twentySecondTxtArea = new javax.swing.JTextArea();
        twentyThirdScrollPane = new javax.swing.JScrollPane();
        twentyThirdTxtArea = new javax.swing.JTextArea();
        twentyEighthScrollPane = new javax.swing.JScrollPane();
        twentyEighthTxtArea = new javax.swing.JTextArea();
        twentyFourthScrollPane = new javax.swing.JScrollPane();
        twentyFourthTxtArea = new javax.swing.JTextArea();
        twentyFifthScrollPane = new javax.swing.JScrollPane();
        twentyFifthTxtArea = new javax.swing.JTextArea();
        twentySixthScrollPane = new javax.swing.JScrollPane();
        twentySixthTxtArea = new javax.swing.JTextArea();
        twentySeventhScrollPane = new javax.swing.JScrollPane();
        twentySeventhTxtArea = new javax.swing.JTextArea();
        fifteenthScrollPane = new javax.swing.JScrollPane();
        fifteenthTxtArea = new javax.swing.JTextArea();
        sixteenthScrollPane = new javax.swing.JScrollPane();
        sixteenthTxtArea = new javax.swing.JTextArea();
        seventeenthScrollPane = new javax.swing.JScrollPane();
        seventeenthTxtArea = new javax.swing.JTextArea();
        eighteenthScrollPane = new javax.swing.JScrollPane();
        eighteenthTxtArea = new javax.swing.JTextArea();
        nineteenthScrollPane = new javax.swing.JScrollPane();
        nineteenthTxtArea = new javax.swing.JTextArea();
        twentiethScrollPane = new javax.swing.JScrollPane();
        twentiethTxtArea = new javax.swing.JTextArea();
        eighthScrollPane = new javax.swing.JScrollPane();
        eighthTxtArea = new javax.swing.JTextArea();
        ninthScrollPane = new javax.swing.JScrollPane();
        ninthTxtArea = new javax.swing.JTextArea();
        tenthScrollPane = new javax.swing.JScrollPane();
        tenthTxtArea = new javax.swing.JTextArea();
        eleventhScrollPane = new javax.swing.JScrollPane();
        eleventhTxtArea = new javax.swing.JTextArea();
        twelfthScrollPane = new javax.swing.JScrollPane();
        twelfthTxtArea = new javax.swing.JTextArea();
        thirteenthScrollPane = new javax.swing.JScrollPane();
        thirteenthTxtArea = new javax.swing.JTextArea();
        fourteenthScrollPane = new javax.swing.JScrollPane();
        fourteenthTxtArea = new javax.swing.JTextArea();
        seventhScrollPane = new javax.swing.JScrollPane();
        seventhTxtArea = new javax.swing.JTextArea();
        fifthScrollPane = new javax.swing.JScrollPane();
        fifthTxtArea = new javax.swing.JTextArea();
        sixthScrollPane = new javax.swing.JScrollPane();
        sixthTxtArea = new javax.swing.JTextArea();
        fourthScrollPane = new javax.swing.JScrollPane();
        fourthTxtArea = new javax.swing.JTextArea();
        thirdScrollPane = new javax.swing.JScrollPane();
        thirdTxtArea = new javax.swing.JTextArea();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Sunday Febuary 1st, 2015");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel2.setText("Enter Your Schedule:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        firstActivitiesTxtArea.setColumns(20);
        firstActivitiesTxtArea.setRows(5);
        jScrollPane1.setViewportView(firstActivitiesTxtArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 180, 130));

        firstUpdateBtn.setText("Update");
        firstUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstUpdateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(firstUpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        javax.swing.GroupLayout firstJFrameLayout = new javax.swing.GroupLayout(firstJFrame.getContentPane());
        firstJFrame.getContentPane().setLayout(firstJFrameLayout);
        firstJFrameLayout.setHorizontalGroup(
            firstJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        firstJFrameLayout.setVerticalGroup(
            firstJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout secondJFrameLayout = new javax.swing.GroupLayout(secondJFrame.getContentPane());
        secondJFrame.getContentPane().setLayout(secondJFrameLayout);
        secondJFrameLayout.setHorizontalGroup(
            secondJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        secondJFrameLayout.setVerticalGroup(
            secondJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout thirdJFrameLayout = new javax.swing.GroupLayout(thirdJFrame.getContentPane());
        thirdJFrame.getContentPane().setLayout(thirdJFrameLayout);
        thirdJFrameLayout.setHorizontalGroup(
            thirdJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        thirdJFrameLayout.setVerticalGroup(
            thirdJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fourthJFrameLayout = new javax.swing.GroupLayout(fourthJFrame.getContentPane());
        fourthJFrame.getContentPane().setLayout(fourthJFrameLayout);
        fourthJFrameLayout.setHorizontalGroup(
            fourthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        fourthJFrameLayout.setVerticalGroup(
            fourthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fifthJFrameLayout = new javax.swing.GroupLayout(fifthJFrame.getContentPane());
        fifthJFrame.getContentPane().setLayout(fifthJFrameLayout);
        fifthJFrameLayout.setHorizontalGroup(
            fifthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        fifthJFrameLayout.setVerticalGroup(
            fifthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout sixthJFrameLayout = new javax.swing.GroupLayout(sixthJFrame.getContentPane());
        sixthJFrame.getContentPane().setLayout(sixthJFrameLayout);
        sixthJFrameLayout.setHorizontalGroup(
            sixthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        sixthJFrameLayout.setVerticalGroup(
            sixthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout seventhJFrameLayout = new javax.swing.GroupLayout(seventhJFrame.getContentPane());
        seventhJFrame.getContentPane().setLayout(seventhJFrameLayout);
        seventhJFrameLayout.setHorizontalGroup(
            seventhJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        seventhJFrameLayout.setVerticalGroup(
            seventhJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout eighthJFrameLayout = new javax.swing.GroupLayout(eighthJFrame.getContentPane());
        eighthJFrame.getContentPane().setLayout(eighthJFrameLayout);
        eighthJFrameLayout.setHorizontalGroup(
            eighthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        eighthJFrameLayout.setVerticalGroup(
            eighthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ninthJFrameLayout = new javax.swing.GroupLayout(ninthJFrame.getContentPane());
        ninthJFrame.getContentPane().setLayout(ninthJFrameLayout);
        ninthJFrameLayout.setHorizontalGroup(
            ninthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        ninthJFrameLayout.setVerticalGroup(
            ninthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout tenthJFrameLayout = new javax.swing.GroupLayout(tenthJFrame.getContentPane());
        tenthJFrame.getContentPane().setLayout(tenthJFrameLayout);
        tenthJFrameLayout.setHorizontalGroup(
            tenthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        tenthJFrameLayout.setVerticalGroup(
            tenthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout eleventhJFrameLayout = new javax.swing.GroupLayout(eleventhJFrame.getContentPane());
        eleventhJFrame.getContentPane().setLayout(eleventhJFrameLayout);
        eleventhJFrameLayout.setHorizontalGroup(
            eleventhJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        eleventhJFrameLayout.setVerticalGroup(
            eleventhJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout twelfthJFrameLayout = new javax.swing.GroupLayout(twelfthJFrame.getContentPane());
        twelfthJFrame.getContentPane().setLayout(twelfthJFrameLayout);
        twelfthJFrameLayout.setHorizontalGroup(
            twelfthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        twelfthJFrameLayout.setVerticalGroup(
            twelfthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout thirteenthJFrameLayout = new javax.swing.GroupLayout(thirteenthJFrame.getContentPane());
        thirteenthJFrame.getContentPane().setLayout(thirteenthJFrameLayout);
        thirteenthJFrameLayout.setHorizontalGroup(
            thirteenthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        thirteenthJFrameLayout.setVerticalGroup(
            thirteenthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fourteenthJFrameLayout = new javax.swing.GroupLayout(fourteenthJFrame.getContentPane());
        fourteenthJFrame.getContentPane().setLayout(fourteenthJFrameLayout);
        fourteenthJFrameLayout.setHorizontalGroup(
            fourteenthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        fourteenthJFrameLayout.setVerticalGroup(
            fourteenthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fifteenthJFrameLayout = new javax.swing.GroupLayout(fifteenthJFrame.getContentPane());
        fifteenthJFrame.getContentPane().setLayout(fifteenthJFrameLayout);
        fifteenthJFrameLayout.setHorizontalGroup(
            fifteenthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        fifteenthJFrameLayout.setVerticalGroup(
            fifteenthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout sixteenthJFrameLayout = new javax.swing.GroupLayout(sixteenthJFrame.getContentPane());
        sixteenthJFrame.getContentPane().setLayout(sixteenthJFrameLayout);
        sixteenthJFrameLayout.setHorizontalGroup(
            sixteenthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        sixteenthJFrameLayout.setVerticalGroup(
            sixteenthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout seventeenthJFrameLayout = new javax.swing.GroupLayout(seventeenthJFrame.getContentPane());
        seventeenthJFrame.getContentPane().setLayout(seventeenthJFrameLayout);
        seventeenthJFrameLayout.setHorizontalGroup(
            seventeenthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        seventeenthJFrameLayout.setVerticalGroup(
            seventeenthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout eighteenthJFrameLayout = new javax.swing.GroupLayout(eighteenthJFrame.getContentPane());
        eighteenthJFrame.getContentPane().setLayout(eighteenthJFrameLayout);
        eighteenthJFrameLayout.setHorizontalGroup(
            eighteenthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        eighteenthJFrameLayout.setVerticalGroup(
            eighteenthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout nineteenthJFrameLayout = new javax.swing.GroupLayout(nineteenthJFrame.getContentPane());
        nineteenthJFrame.getContentPane().setLayout(nineteenthJFrameLayout);
        nineteenthJFrameLayout.setHorizontalGroup(
            nineteenthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        nineteenthJFrameLayout.setVerticalGroup(
            nineteenthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout twentiethJFrameLayout = new javax.swing.GroupLayout(twentiethJFrame.getContentPane());
        twentiethJFrame.getContentPane().setLayout(twentiethJFrameLayout);
        twentiethJFrameLayout.setHorizontalGroup(
            twentiethJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        twentiethJFrameLayout.setVerticalGroup(
            twentiethJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout twentyFirstJFrameLayout = new javax.swing.GroupLayout(twentyFirstJFrame.getContentPane());
        twentyFirstJFrame.getContentPane().setLayout(twentyFirstJFrameLayout);
        twentyFirstJFrameLayout.setHorizontalGroup(
            twentyFirstJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        twentyFirstJFrameLayout.setVerticalGroup(
            twentyFirstJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout twentySecondJFrameLayout = new javax.swing.GroupLayout(twentySecondJFrame.getContentPane());
        twentySecondJFrame.getContentPane().setLayout(twentySecondJFrameLayout);
        twentySecondJFrameLayout.setHorizontalGroup(
            twentySecondJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        twentySecondJFrameLayout.setVerticalGroup(
            twentySecondJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout twentyThirdJFrameLayout = new javax.swing.GroupLayout(twentyThirdJFrame.getContentPane());
        twentyThirdJFrame.getContentPane().setLayout(twentyThirdJFrameLayout);
        twentyThirdJFrameLayout.setHorizontalGroup(
            twentyThirdJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        twentyThirdJFrameLayout.setVerticalGroup(
            twentyThirdJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout twentyFourthJFrameLayout = new javax.swing.GroupLayout(twentyFourthJFrame.getContentPane());
        twentyFourthJFrame.getContentPane().setLayout(twentyFourthJFrameLayout);
        twentyFourthJFrameLayout.setHorizontalGroup(
            twentyFourthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        twentyFourthJFrameLayout.setVerticalGroup(
            twentyFourthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout twentyFifthJFrameLayout = new javax.swing.GroupLayout(twentyFifthJFrame.getContentPane());
        twentyFifthJFrame.getContentPane().setLayout(twentyFifthJFrameLayout);
        twentyFifthJFrameLayout.setHorizontalGroup(
            twentyFifthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        twentyFifthJFrameLayout.setVerticalGroup(
            twentyFifthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout twentySixthJFrameLayout = new javax.swing.GroupLayout(twentySixthJFrame.getContentPane());
        twentySixthJFrame.getContentPane().setLayout(twentySixthJFrameLayout);
        twentySixthJFrameLayout.setHorizontalGroup(
            twentySixthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        twentySixthJFrameLayout.setVerticalGroup(
            twentySixthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout twentySeventhJFrameLayout = new javax.swing.GroupLayout(twentySeventhJFrame.getContentPane());
        twentySeventhJFrame.getContentPane().setLayout(twentySeventhJFrameLayout);
        twentySeventhJFrameLayout.setHorizontalGroup(
            twentySeventhJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        twentySeventhJFrameLayout.setVerticalGroup(
            twentySeventhJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout twentyEighthJFrameLayout = new javax.swing.GroupLayout(twentyEighthJFrame.getContentPane());
        twentyEighthJFrame.getContentPane().setLayout(twentyEighthJFrameLayout);
        twentyEighthJFrameLayout.setHorizontalGroup(
            twentyEighthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        twentyEighthJFrameLayout.setVerticalGroup(
            twentyEighthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        monthBackgroundPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        firstTxtArea.setColumns(20);
        firstTxtArea.setRows(5);
        firstTxtArea.setText("1st");
        firstTxtArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firstTxtAreaMouseClicked(evt);
            }
        });
        firstScrollPane.setViewportView(firstTxtArea);

        monthBackgroundPnl.add(firstScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 80));

        twentyFirstTxtArea.setColumns(20);
        twentyFirstTxtArea.setRows(5);
        twentyFirstTxtArea.setText("21st");
        twentyFirstScrollPane.setViewportView(twentyFirstTxtArea);

        monthBackgroundPnl.add(twentyFirstScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 160, 190, 80));

        secondTxtArea.setColumns(20);
        secondTxtArea.setRows(5);
        secondTxtArea.setText("2nd");
        secondScrollPane.setViewportView(secondTxtArea);

        monthBackgroundPnl.add(secondScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 190, 80));

        twentySecondTxtArea.setColumns(20);
        twentySecondTxtArea.setRows(5);
        twentySecondTxtArea.setText("22nd");
        twentySecondScrollPane.setViewportView(twentySecondTxtArea);

        monthBackgroundPnl.add(twentySecondScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 190, 80));

        twentyThirdTxtArea.setColumns(20);
        twentyThirdTxtArea.setRows(5);
        twentyThirdTxtArea.setText("23rd");
        twentyThirdScrollPane.setViewportView(twentyThirdTxtArea);

        monthBackgroundPnl.add(twentyThirdScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 190, 80));

        twentyEighthTxtArea.setColumns(20);
        twentyEighthTxtArea.setRows(5);
        twentyEighthTxtArea.setText("28th");
        twentyEighthScrollPane.setViewportView(twentyEighthTxtArea);

        monthBackgroundPnl.add(twentyEighthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 240, 190, 80));

        twentyFourthTxtArea.setColumns(20);
        twentyFourthTxtArea.setRows(5);
        twentyFourthTxtArea.setText("24th");
        twentyFourthScrollPane.setViewportView(twentyFourthTxtArea);

        monthBackgroundPnl.add(twentyFourthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 190, 80));

        twentyFifthTxtArea.setColumns(20);
        twentyFifthTxtArea.setRows(5);
        twentyFifthTxtArea.setText("25th");
        twentyFifthScrollPane.setViewportView(twentyFifthTxtArea);

        monthBackgroundPnl.add(twentyFifthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 190, 80));

        twentySixthTxtArea.setColumns(20);
        twentySixthTxtArea.setRows(5);
        twentySixthTxtArea.setText("26th");
        twentySixthScrollPane.setViewportView(twentySixthTxtArea);

        monthBackgroundPnl.add(twentySixthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, 190, 80));

        twentySeventhTxtArea.setColumns(20);
        twentySeventhTxtArea.setRows(5);
        twentySeventhTxtArea.setText("27th");
        twentySeventhScrollPane.setViewportView(twentySeventhTxtArea);

        monthBackgroundPnl.add(twentySeventhScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 240, 190, 80));

        fifteenthTxtArea.setColumns(20);
        fifteenthTxtArea.setRows(5);
        fifteenthTxtArea.setText("15th");
        fifteenthScrollPane.setViewportView(fifteenthTxtArea);

        monthBackgroundPnl.add(fifteenthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 190, 80));

        sixteenthTxtArea.setColumns(20);
        sixteenthTxtArea.setRows(5);
        sixteenthTxtArea.setText("16th");
        sixteenthScrollPane.setViewportView(sixteenthTxtArea);

        monthBackgroundPnl.add(sixteenthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 190, 80));

        seventeenthTxtArea.setColumns(20);
        seventeenthTxtArea.setRows(5);
        seventeenthTxtArea.setText("17th");
        seventeenthScrollPane.setViewportView(seventeenthTxtArea);

        monthBackgroundPnl.add(seventeenthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 190, 80));

        eighteenthTxtArea.setColumns(20);
        eighteenthTxtArea.setRows(5);
        eighteenthTxtArea.setText("18th");
        eighteenthScrollPane.setViewportView(eighteenthTxtArea);

        monthBackgroundPnl.add(eighteenthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 190, 80));

        nineteenthTxtArea.setColumns(20);
        nineteenthTxtArea.setRows(5);
        nineteenthTxtArea.setText("19th");
        nineteenthScrollPane.setViewportView(nineteenthTxtArea);

        monthBackgroundPnl.add(nineteenthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, 190, 80));

        twentiethTxtArea.setColumns(20);
        twentiethTxtArea.setRows(5);
        twentiethTxtArea.setText("20th");
        twentiethScrollPane.setViewportView(twentiethTxtArea);

        monthBackgroundPnl.add(twentiethScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 160, 190, 80));

        eighthTxtArea.setColumns(20);
        eighthTxtArea.setRows(5);
        eighthTxtArea.setText("8th");
        eighthScrollPane.setViewportView(eighthTxtArea);

        monthBackgroundPnl.add(eighthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 190, 80));

        ninthTxtArea.setColumns(20);
        ninthTxtArea.setRows(5);
        ninthTxtArea.setText("9th");
        ninthScrollPane.setViewportView(ninthTxtArea);

        monthBackgroundPnl.add(ninthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 190, 80));

        tenthTxtArea.setColumns(20);
        tenthTxtArea.setRows(5);
        tenthTxtArea.setText("10th");
        tenthScrollPane.setViewportView(tenthTxtArea);

        monthBackgroundPnl.add(tenthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 190, 80));

        eleventhTxtArea.setColumns(20);
        eleventhTxtArea.setRows(5);
        eleventhTxtArea.setText("11th");
        eleventhScrollPane.setViewportView(eleventhTxtArea);

        monthBackgroundPnl.add(eleventhScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 190, 80));

        twelfthTxtArea.setColumns(20);
        twelfthTxtArea.setRows(5);
        twelfthTxtArea.setText("12th");
        twelfthScrollPane.setViewportView(twelfthTxtArea);

        monthBackgroundPnl.add(twelfthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 80, 190, 80));

        thirteenthTxtArea.setColumns(20);
        thirteenthTxtArea.setRows(5);
        thirteenthTxtArea.setText("13th");
        thirteenthScrollPane.setViewportView(thirteenthTxtArea);

        monthBackgroundPnl.add(thirteenthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 80, 190, 80));

        fourteenthTxtArea.setColumns(20);
        fourteenthTxtArea.setRows(5);
        fourteenthTxtArea.setText("14th");
        fourteenthScrollPane.setViewportView(fourteenthTxtArea);

        monthBackgroundPnl.add(fourteenthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 80, 190, 80));

        seventhTxtArea.setColumns(20);
        seventhTxtArea.setRows(5);
        seventhTxtArea.setText("7th");
        seventhScrollPane.setViewportView(seventhTxtArea);

        monthBackgroundPnl.add(seventhScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 0, 190, 80));

        fifthTxtArea.setColumns(20);
        fifthTxtArea.setRows(5);
        fifthTxtArea.setText("5th");
        fifthScrollPane.setViewportView(fifthTxtArea);

        monthBackgroundPnl.add(fifthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 190, 80));

        sixthTxtArea.setColumns(20);
        sixthTxtArea.setRows(5);
        sixthTxtArea.setText("6th");
        sixthScrollPane.setViewportView(sixthTxtArea);

        monthBackgroundPnl.add(sixthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, 190, 80));

        fourthTxtArea.setColumns(20);
        fourthTxtArea.setRows(5);
        fourthTxtArea.setText("4th");
        fourthScrollPane.setViewportView(fourthTxtArea);

        monthBackgroundPnl.add(fourthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 190, 80));

        thirdTxtArea.setColumns(20);
        thirdTxtArea.setRows(5);
        thirdTxtArea.setText("3rd");
        thirdScrollPane.setViewportView(thirdTxtArea);

        monthBackgroundPnl.add(thirdScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 190, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(monthBackgroundPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(monthBackgroundPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstTxtAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstTxtAreaMouseClicked
        //Displaying and resizing the chosen date
        firstJFrame.show();
        
        //Came From Stack Overflow
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        firstJFrame.setSize(screenSize.width, screenSize.height);
        
        
        hide();
        
        
    }//GEN-LAST:event_firstTxtAreaMouseClicked

    private void firstUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstUpdateBtnActionPerformed
        activities = firstActivitiesTxtArea.getText();
        firstTxtArea.setText("1st \n" + activities);
        show();
    }//GEN-LAST:event_firstUpdateBtnActionPerformed

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
            java.util.logging.Logger.getLogger(calendarCulminating.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calendarCulminating.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calendarCulminating.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calendarCulminating.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calendarCulminating().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame eighteenthJFrame;
    private javax.swing.JScrollPane eighteenthScrollPane;
    private javax.swing.JTextArea eighteenthTxtArea;
    private javax.swing.JFrame eighthJFrame;
    private javax.swing.JScrollPane eighthScrollPane;
    private javax.swing.JTextArea eighthTxtArea;
    private javax.swing.JFrame eleventhJFrame;
    private javax.swing.JScrollPane eleventhScrollPane;
    private javax.swing.JTextArea eleventhTxtArea;
    private javax.swing.JFrame fifteenthJFrame;
    private javax.swing.JScrollPane fifteenthScrollPane;
    private javax.swing.JTextArea fifteenthTxtArea;
    private javax.swing.JFrame fifthJFrame;
    private javax.swing.JScrollPane fifthScrollPane;
    private javax.swing.JTextArea fifthTxtArea;
    private javax.swing.JTextArea firstActivitiesTxtArea;
    private javax.swing.JFrame firstJFrame;
    private javax.swing.JScrollPane firstScrollPane;
    private javax.swing.JTextArea firstTxtArea;
    private javax.swing.JButton firstUpdateBtn;
    private javax.swing.JFrame fourteenthJFrame;
    private javax.swing.JScrollPane fourteenthScrollPane;
    private javax.swing.JTextArea fourteenthTxtArea;
    private javax.swing.JFrame fourthJFrame;
    private javax.swing.JScrollPane fourthScrollPane;
    private javax.swing.JTextArea fourthTxtArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel monthBackgroundPnl;
    private javax.swing.JFrame nineteenthJFrame;
    private javax.swing.JScrollPane nineteenthScrollPane;
    private javax.swing.JTextArea nineteenthTxtArea;
    private javax.swing.JFrame ninthJFrame;
    private javax.swing.JScrollPane ninthScrollPane;
    private javax.swing.JTextArea ninthTxtArea;
    private javax.swing.JFrame secondJFrame;
    private javax.swing.JScrollPane secondScrollPane;
    private javax.swing.JTextArea secondTxtArea;
    private javax.swing.JFrame seventeenthJFrame;
    private javax.swing.JScrollPane seventeenthScrollPane;
    private javax.swing.JTextArea seventeenthTxtArea;
    private javax.swing.JFrame seventhJFrame;
    private javax.swing.JScrollPane seventhScrollPane;
    private javax.swing.JTextArea seventhTxtArea;
    private javax.swing.JFrame sixteenthJFrame;
    private javax.swing.JScrollPane sixteenthScrollPane;
    private javax.swing.JTextArea sixteenthTxtArea;
    private javax.swing.JFrame sixthJFrame;
    private javax.swing.JScrollPane sixthScrollPane;
    private javax.swing.JTextArea sixthTxtArea;
    private javax.swing.JFrame tenthJFrame;
    private javax.swing.JScrollPane tenthScrollPane;
    private javax.swing.JTextArea tenthTxtArea;
    private javax.swing.JFrame thirdJFrame;
    private javax.swing.JScrollPane thirdScrollPane;
    private javax.swing.JTextArea thirdTxtArea;
    private javax.swing.JFrame thirteenthJFrame;
    private javax.swing.JScrollPane thirteenthScrollPane;
    private javax.swing.JTextArea thirteenthTxtArea;
    private javax.swing.JFrame twelfthJFrame;
    private javax.swing.JScrollPane twelfthScrollPane;
    private javax.swing.JTextArea twelfthTxtArea;
    private javax.swing.JFrame twentiethJFrame;
    private javax.swing.JScrollPane twentiethScrollPane;
    private javax.swing.JTextArea twentiethTxtArea;
    private javax.swing.JFrame twentyEighthJFrame;
    private javax.swing.JScrollPane twentyEighthScrollPane;
    private javax.swing.JTextArea twentyEighthTxtArea;
    private javax.swing.JFrame twentyFifthJFrame;
    private javax.swing.JScrollPane twentyFifthScrollPane;
    private javax.swing.JTextArea twentyFifthTxtArea;
    private javax.swing.JFrame twentyFirstJFrame;
    private javax.swing.JScrollPane twentyFirstScrollPane;
    private javax.swing.JTextArea twentyFirstTxtArea;
    private javax.swing.JFrame twentyFourthJFrame;
    private javax.swing.JScrollPane twentyFourthScrollPane;
    private javax.swing.JTextArea twentyFourthTxtArea;
    private javax.swing.JFrame twentySecondJFrame;
    private javax.swing.JScrollPane twentySecondScrollPane;
    private javax.swing.JTextArea twentySecondTxtArea;
    private javax.swing.JFrame twentySeventhJFrame;
    private javax.swing.JScrollPane twentySeventhScrollPane;
    private javax.swing.JTextArea twentySeventhTxtArea;
    private javax.swing.JFrame twentySixthJFrame;
    private javax.swing.JScrollPane twentySixthScrollPane;
    private javax.swing.JTextArea twentySixthTxtArea;
    private javax.swing.JFrame twentyThirdJFrame;
    private javax.swing.JScrollPane twentyThirdScrollPane;
    private javax.swing.JTextArea twentyThirdTxtArea;
    // End of variables declaration//GEN-END:variables

    
}
