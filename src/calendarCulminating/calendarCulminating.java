/*
 * Peter Horne-Deus
 * The is a program is a one month editable calendar
 * calendarCulminating.java
 * January 8, 2019
 */

package calendarCulminating;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;



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
    
    //Stack overflow
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    
    
    
    public calendarCulminating() {
        initComponents();
        
        //Stack Overflow
        setSize(screenSize.width, screenSize.height);
        
        //Setting error labels to be hidden
        errorLbl1.setVisible(false);
        errorLbl2.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        monthJFrame = new javax.swing.JFrame();
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
        titleLbl = new javax.swing.JLabel();
        febuaryLbl = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();
        saturdayLbl = new javax.swing.JLabel();
        sundayLbl = new javax.swing.JLabel();
        mondayLbl = new javax.swing.JLabel();
        tuesdayLbl = new javax.swing.JLabel();
        wednesdayLbl = new javax.swing.JLabel();
        thrusdayLbl = new javax.swing.JLabel();
        fridayLbl = new javax.swing.JLabel();
        firstJFrame = new javax.swing.JFrame();
        backgroundPanel = new javax.swing.JPanel();
        dateLbl = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        endTimeTxtFeild = new javax.swing.JTextField();
        activityLbl = new javax.swing.JLabel();
        endTimeLbl = new javax.swing.JLabel();
        activivityTxtFeild = new javax.swing.JTextField();
        startTimeLbl = new javax.swing.JLabel();
        startTimeTxtFeild = new javax.swing.JTextField();
        endAmPmCombBox = new javax.swing.JComboBox();
        startAmPmCombBox = new javax.swing.JComboBox();
        errorLbl1 = new javax.swing.JLabel();
        errorLbl2 = new javax.swing.JLabel();
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
        signInBackgroundPnl = new javax.swing.JPanel();
        signUpLbl = new javax.swing.JLabel();
        signInPasswordTxtFeild = new javax.swing.JTextField();
        signUpReEnterPasswordLbl = new javax.swing.JLabel();
        signUpUsernameLbl = new javax.swing.JLabel();
        signUpReEnterPasswordTxtFeild = new javax.swing.JTextField();
        signInLbl = new javax.swing.JLabel();
        signInUsernameLbl = new javax.swing.JLabel();
        signInUsernameTxtFeild = new javax.swing.JTextField();
        signUpUsernameTxtFeild = new javax.swing.JTextField();
        signUpPasswordTxtFeild = new javax.swing.JTextField();
        signInPasswordLbl = new javax.swing.JLabel();
        signUpPasswordLbl = new javax.swing.JLabel();
        createAccountBtn = new javax.swing.JButton();
        signInBtn = new javax.swing.JButton();

        monthBackgroundPnl.setBackground(new java.awt.Color(204, 255, 255));
        monthBackgroundPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        firstTxtArea.setEditable(false);
        firstTxtArea.setColumns(20);
        firstTxtArea.setRows(5);
        firstTxtArea.setText("1st");
        firstTxtArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firstTxtAreaMouseClicked(evt);
            }
        });
        firstScrollPane.setViewportView(firstTxtArea);

        monthBackgroundPnl.add(firstScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 190, 80));

        twentyFirstTxtArea.setEditable(false);
        twentyFirstTxtArea.setColumns(20);
        twentyFirstTxtArea.setRows(5);
        twentyFirstTxtArea.setText("21st");
        twentyFirstScrollPane.setViewportView(twentyFirstTxtArea);

        monthBackgroundPnl.add(twentyFirstScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 310, 190, 80));

        secondTxtArea.setEditable(false);
        secondTxtArea.setColumns(20);
        secondTxtArea.setRows(5);
        secondTxtArea.setText("2nd");
        secondScrollPane.setViewportView(secondTxtArea);

        monthBackgroundPnl.add(secondScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 190, 80));

        twentySecondTxtArea.setEditable(false);
        twentySecondTxtArea.setColumns(20);
        twentySecondTxtArea.setRows(5);
        twentySecondTxtArea.setText("22nd");
        twentySecondScrollPane.setViewportView(twentySecondTxtArea);

        monthBackgroundPnl.add(twentySecondScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 190, 80));

        twentyThirdTxtArea.setEditable(false);
        twentyThirdTxtArea.setColumns(20);
        twentyThirdTxtArea.setRows(5);
        twentyThirdTxtArea.setText("23rd");
        twentyThirdScrollPane.setViewportView(twentyThirdTxtArea);

        monthBackgroundPnl.add(twentyThirdScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 190, 80));

        twentyEighthTxtArea.setEditable(false);
        twentyEighthTxtArea.setColumns(20);
        twentyEighthTxtArea.setRows(5);
        twentyEighthTxtArea.setText("28th");
        twentyEighthScrollPane.setViewportView(twentyEighthTxtArea);

        monthBackgroundPnl.add(twentyEighthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 390, 190, 80));

        twentyFourthTxtArea.setEditable(false);
        twentyFourthTxtArea.setColumns(20);
        twentyFourthTxtArea.setRows(5);
        twentyFourthTxtArea.setText("24th");
        twentyFourthScrollPane.setViewportView(twentyFourthTxtArea);

        monthBackgroundPnl.add(twentyFourthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 190, 80));

        twentyFifthTxtArea.setEditable(false);
        twentyFifthTxtArea.setColumns(20);
        twentyFifthTxtArea.setRows(5);
        twentyFifthTxtArea.setText("25th");
        twentyFifthScrollPane.setViewportView(twentyFifthTxtArea);

        monthBackgroundPnl.add(twentyFifthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 190, 80));

        twentySixthTxtArea.setEditable(false);
        twentySixthTxtArea.setColumns(20);
        twentySixthTxtArea.setRows(5);
        twentySixthTxtArea.setText("26th");
        twentySixthScrollPane.setViewportView(twentySixthTxtArea);

        monthBackgroundPnl.add(twentySixthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 390, 190, 80));

        twentySeventhTxtArea.setEditable(false);
        twentySeventhTxtArea.setColumns(20);
        twentySeventhTxtArea.setRows(5);
        twentySeventhTxtArea.setText("27th");
        twentySeventhScrollPane.setViewportView(twentySeventhTxtArea);

        monthBackgroundPnl.add(twentySeventhScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 390, 190, 80));

        fifteenthTxtArea.setEditable(false);
        fifteenthTxtArea.setColumns(20);
        fifteenthTxtArea.setRows(5);
        fifteenthTxtArea.setText("15th");
        fifteenthScrollPane.setViewportView(fifteenthTxtArea);

        monthBackgroundPnl.add(fifteenthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 190, 80));

        sixteenthTxtArea.setEditable(false);
        sixteenthTxtArea.setColumns(20);
        sixteenthTxtArea.setRows(5);
        sixteenthTxtArea.setText("16th");
        sixteenthScrollPane.setViewportView(sixteenthTxtArea);

        monthBackgroundPnl.add(sixteenthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 190, 80));

        seventeenthTxtArea.setEditable(false);
        seventeenthTxtArea.setColumns(20);
        seventeenthTxtArea.setRows(5);
        seventeenthTxtArea.setText("17th");
        seventeenthScrollPane.setViewportView(seventeenthTxtArea);

        monthBackgroundPnl.add(seventeenthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 190, 80));

        eighteenthTxtArea.setEditable(false);
        eighteenthTxtArea.setColumns(20);
        eighteenthTxtArea.setRows(5);
        eighteenthTxtArea.setText("18th");
        eighteenthScrollPane.setViewportView(eighteenthTxtArea);

        monthBackgroundPnl.add(eighteenthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 190, 80));

        nineteenthTxtArea.setEditable(false);
        nineteenthTxtArea.setColumns(20);
        nineteenthTxtArea.setRows(5);
        nineteenthTxtArea.setText("19th");
        nineteenthScrollPane.setViewportView(nineteenthTxtArea);

        monthBackgroundPnl.add(nineteenthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 310, 190, 80));

        twentiethTxtArea.setEditable(false);
        twentiethTxtArea.setColumns(20);
        twentiethTxtArea.setRows(5);
        twentiethTxtArea.setText("20th");
        twentiethScrollPane.setViewportView(twentiethTxtArea);

        monthBackgroundPnl.add(twentiethScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 310, 190, 80));

        eighthTxtArea.setEditable(false);
        eighthTxtArea.setColumns(20);
        eighthTxtArea.setRows(5);
        eighthTxtArea.setText("8th");
        eighthScrollPane.setViewportView(eighthTxtArea);

        monthBackgroundPnl.add(eighthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 190, 80));

        ninthTxtArea.setEditable(false);
        ninthTxtArea.setColumns(20);
        ninthTxtArea.setRows(5);
        ninthTxtArea.setText("9th");
        ninthScrollPane.setViewportView(ninthTxtArea);

        monthBackgroundPnl.add(ninthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 190, 80));

        tenthTxtArea.setEditable(false);
        tenthTxtArea.setColumns(20);
        tenthTxtArea.setRows(5);
        tenthTxtArea.setText("10th");
        tenthScrollPane.setViewportView(tenthTxtArea);

        monthBackgroundPnl.add(tenthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 190, 80));

        eleventhTxtArea.setEditable(false);
        eleventhTxtArea.setColumns(20);
        eleventhTxtArea.setRows(5);
        eleventhTxtArea.setText("11th");
        eleventhScrollPane.setViewportView(eleventhTxtArea);

        monthBackgroundPnl.add(eleventhScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 190, 80));

        twelfthTxtArea.setEditable(false);
        twelfthTxtArea.setColumns(20);
        twelfthTxtArea.setRows(5);
        twelfthTxtArea.setText("12th");
        twelfthScrollPane.setViewportView(twelfthTxtArea);

        monthBackgroundPnl.add(twelfthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, 190, 80));

        thirteenthTxtArea.setEditable(false);
        thirteenthTxtArea.setColumns(20);
        thirteenthTxtArea.setRows(5);
        thirteenthTxtArea.setText("13th");
        thirteenthScrollPane.setViewportView(thirteenthTxtArea);

        monthBackgroundPnl.add(thirteenthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 230, 190, 80));

        fourteenthTxtArea.setEditable(false);
        fourteenthTxtArea.setColumns(20);
        fourteenthTxtArea.setRows(5);
        fourteenthTxtArea.setText("14th");
        fourteenthScrollPane.setViewportView(fourteenthTxtArea);

        monthBackgroundPnl.add(fourteenthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 230, 190, 80));

        seventhTxtArea.setEditable(false);
        seventhTxtArea.setColumns(20);
        seventhTxtArea.setRows(5);
        seventhTxtArea.setText("7th");
        seventhScrollPane.setViewportView(seventhTxtArea);

        monthBackgroundPnl.add(seventhScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 150, 190, 80));

        fifthTxtArea.setEditable(false);
        fifthTxtArea.setColumns(20);
        fifthTxtArea.setRows(5);
        fifthTxtArea.setText("5th");
        fifthScrollPane.setViewportView(fifthTxtArea);

        monthBackgroundPnl.add(fifthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, 190, 80));

        sixthTxtArea.setEditable(false);
        sixthTxtArea.setColumns(20);
        sixthTxtArea.setRows(5);
        sixthTxtArea.setText("6th");
        sixthScrollPane.setViewportView(sixthTxtArea);

        monthBackgroundPnl.add(sixthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 150, 190, 80));

        fourthTxtArea.setEditable(false);
        fourthTxtArea.setColumns(20);
        fourthTxtArea.setRows(5);
        fourthTxtArea.setText("4th");
        fourthScrollPane.setViewportView(fourthTxtArea);

        monthBackgroundPnl.add(fourthScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 190, 80));

        thirdTxtArea.setEditable(false);
        thirdTxtArea.setColumns(20);
        thirdTxtArea.setRows(5);
        thirdTxtArea.setText("3rd");
        thirdScrollPane.setViewportView(thirdTxtArea);

        monthBackgroundPnl.add(thirdScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 190, 80));

        titleLbl.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        titleLbl.setText("Username's Calendar");
        monthBackgroundPnl.add(titleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        febuaryLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        febuaryLbl.setText("Date: Febuary, 2015");
        monthBackgroundPnl.add(febuaryLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, -1));

        exitBtn.setBackground(new java.awt.Color(51, 255, 255));
        exitBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        monthBackgroundPnl.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        saturdayLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        saturdayLbl.setText("Saturday");
        monthBackgroundPnl.add(saturdayLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 110, -1, -1));

        sundayLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sundayLbl.setText("Sunday");
        monthBackgroundPnl.add(sundayLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        mondayLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mondayLbl.setText("Monday");
        monthBackgroundPnl.add(mondayLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        tuesdayLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tuesdayLbl.setText("Tuesday");
        monthBackgroundPnl.add(tuesdayLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        wednesdayLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        wednesdayLbl.setText("Wednesday");
        monthBackgroundPnl.add(wednesdayLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, -1, -1));

        thrusdayLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        thrusdayLbl.setText("Thursday");
        monthBackgroundPnl.add(thrusdayLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 110, -1, -1));

        fridayLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fridayLbl.setText("Friday");
        monthBackgroundPnl.add(fridayLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 110, -1, -1));

        javax.swing.GroupLayout monthJFrameLayout = new javax.swing.GroupLayout(monthJFrame.getContentPane());
        monthJFrame.getContentPane().setLayout(monthJFrameLayout);
        monthJFrameLayout.setHorizontalGroup(
            monthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(monthBackgroundPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 1363, Short.MAX_VALUE)
        );
        monthJFrameLayout.setVerticalGroup(
            monthJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(monthBackgroundPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dateLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dateLbl.setText("Sunday Febuary 1st, 2015");
        backgroundPanel.add(dateLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        backgroundPanel.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));
        backgroundPanel.add(endTimeTxtFeild, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 160, -1));

        activityLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        activityLbl.setText("Activity:");
        backgroundPanel.add(activityLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        endTimeLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        endTimeLbl.setText("End Time:");
        backgroundPanel.add(endTimeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));
        backgroundPanel.add(activivityTxtFeild, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 160, -1));

        startTimeLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        startTimeLbl.setText("Start Time:");
        backgroundPanel.add(startTimeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));
        backgroundPanel.add(startTimeTxtFeild, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 160, -1));

        endAmPmCombBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AM", "PM" }));
        backgroundPanel.add(endAmPmCombBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        startAmPmCombBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AM", "PM" }));
        backgroundPanel.add(startAmPmCombBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        errorLbl1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        errorLbl1.setForeground(new java.awt.Color(255, 0, 0));
        errorLbl1.setText("Time Error Must be an INT and in the twelve hour clock");
        backgroundPanel.add(errorLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        errorLbl2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        errorLbl2.setForeground(new java.awt.Color(255, 0, 0));
        errorLbl2.setText("Make sure your start time is later then your end time");
        backgroundPanel.add(errorLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        javax.swing.GroupLayout firstJFrameLayout = new javax.swing.GroupLayout(firstJFrame.getContentPane());
        firstJFrame.getContentPane().setLayout(firstJFrameLayout);
        firstJFrameLayout.setHorizontalGroup(
            firstJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
        );
        firstJFrameLayout.setVerticalGroup(
            firstJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        signInBackgroundPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signUpLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        signUpLbl.setText("Sign Up:");
        signInBackgroundPnl.add(signUpLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));
        signInBackgroundPnl.add(signInPasswordTxtFeild, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 170, 30));

        signUpReEnterPasswordLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        signUpReEnterPasswordLbl.setText("Re-enter Password:");
        signInBackgroundPnl.add(signUpReEnterPasswordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, 20));

        signUpUsernameLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        signUpUsernameLbl.setText("Username:");
        signInBackgroundPnl.add(signUpUsernameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));
        signInBackgroundPnl.add(signUpReEnterPasswordTxtFeild, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 170, 30));

        signInLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        signInLbl.setText("Sign In:");
        signInBackgroundPnl.add(signInLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        signInUsernameLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        signInUsernameLbl.setText("Username:");
        signInBackgroundPnl.add(signInUsernameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));
        signInBackgroundPnl.add(signInUsernameTxtFeild, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 170, 30));
        signInBackgroundPnl.add(signUpUsernameTxtFeild, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 170, 30));
        signInBackgroundPnl.add(signUpPasswordTxtFeild, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 170, 30));

        signInPasswordLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        signInPasswordLbl.setText("Password:");
        signInBackgroundPnl.add(signInPasswordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        signUpPasswordLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        signUpPasswordLbl.setText("Password:");
        signInBackgroundPnl.add(signUpPasswordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        createAccountBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        createAccountBtn.setText("Create Account");
        signInBackgroundPnl.add(createAccountBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        signInBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        signInBtn.setText("Sign In");
        signInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInBtnActionPerformed(evt);
            }
        });
        signInBackgroundPnl.add(signInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1330, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(393, 393, 393)
                    .addComponent(signInBackgroundPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(393, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(signInBackgroundPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(2, 2, 2)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * The first day text area is clicked and sends the user to a new form where they can edit the first days events
     * @param evt 
     */
    private void firstTxtAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstTxtAreaMouseClicked
        //Displaying and resizing the chosen date
        firstJFrame.show();
        
        //Came From Stack Overflow
        firstJFrame.setSize(screenSize.width, screenSize.height);
        
        //Hiding the month page so it looks cleaner
        monthJFrame.hide();
    }//GEN-LAST:event_firstTxtAreaMouseClicked

    /**
     * Button on the first day that updates the calendar
     * @param evt 
     */
    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        //Variables
        String startTimeAmPm = (String)startAmPmCombBox.getSelectedItem();
        String endTimeAmPm = (String)endAmPmCombBox.getSelectedItem();
        String startTime = startTimeTxtFeild.getText();
        String endTime = endTimeTxtFeild.getText();
        int errorStart = 0;
        int errorEnd = 0;
        int errorTiming = 0;
        
        //Sending to a method to check if the start time is valid
        errorStart = startTime(startTime);
        errorEnd = endTime(endTime);
        errorTiming = checkTimes(startTime,endTime,startTimeAmPm,endTimeAmPm);
        
        //If there is an error this shows the error label
        if (errorStart == 1 || errorEnd == 1){
           errorLbl1.setVisible(true); 
        }
        else if(errorTiming == 1){
            errorLbl2.setVisible(true);
        }
        //Hiding the day and showing the month only if there are no errors
        else if (errorStart != 1 || errorEnd != 1 || errorTiming != 1){
            monthJFrame.show();
            firstJFrame.hide();
            errorLbl1.setVisible(false);
            errorLbl2.setVisible(false);
        }
                
    }//GEN-LAST:event_updateBtnActionPerformed

    /**
     * The Sign in button that initiates the sign in algorithm
     * @param evt 
     */
    private void signInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInBtnActionPerformed
        //Hiding the main sign in screen
        hide();
        
        //Displaying and resizing the chosen date
        monthJFrame.show();
        
        //Came From Stack Overflow
        monthJFrame.setSize(screenSize.width, screenSize.height);
        
        //Colouring exit button
        exitBtn.setBackground(Color.black);
    }//GEN-LAST:event_signInBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed
    
    /**
     * This method checks the start time of the event to see if it is a usable time
     * @param startTime
     * @return error
     */
    public int startTime(String startTime){
        //Varaibles and arrays
        char startTimeCheck;
        int error = 0;
        char colon = ':';
        //Arrays
        int[] checkStart = new int[4];
        int[] minute = new int[2];
        
        //General try statment to send to a catch to catch errors in user input
        try{
            if(startTime.length() > 5){
                
                errorLbl1.setVisible(true);
                error = 1;
                throw new NumberFormatException();
            }
            else{               
                //Setting the user entered start time to an array
                for (int i = 0; i < 4; i ++){
                    startTimeCheck = startTime.charAt(i);
                    checkStart[i] = (int)startTimeCheck - 48 ;

                    
                    //checking that the time is not a bunch of letters
                    if(checkStart[i] > 10 || checkStart[i] < 0){
                        //Output Error
                        errorLbl1.setVisible(true);
                        error = 1;
                        throw new NumberFormatException();
                    }
                }
                //Checking if the first number is a 1
                if(checkStart[0] == 1){
                    //If the number is a one I want to check if the second one is a colon or another number
                    if (checkStart[1] == 10){
                       
                        //If the number is a colon then I must check a different posisition to check the minute time 
                        minute[0] = startTime.charAt(2) -48;
                        minute[1] = startTime.charAt(3) - 48;
                        //Making sure the user entered a colon
                        if(startTime.charAt(1) != colon){
                            error = 1;
                            errorLbl1.setVisible(true);

                            throw new Exception ("Must be a time in the twelve hour clock");
                        }
                    }
                    else {
                        
                        //If the second number is not a colon then I must check to make sure it is a time that is useable
                        if (checkStart[1] == 0 ||checkStart[1] == 1 ||checkStart[1] == 2){
                            
                            //Setting the appropriate minute check
                            minute[0] = startTime.charAt(3) -48;
                            minute[1] = startTime.charAt(4) - 48;

                            //Making sure the user entered a colon
                            if(startTime.charAt(2) != colon){
                                error = 1;
                                errorLbl1.setVisible(true);

                                throw new Exception ("Must be a time in the twelve hour clock");
                            }

                        }
                        else{
                            //Setting error label to be shown
                            errorLbl1.setVisible(true);
                            error = 1;

                            throw new Exception ("Must be a time in the twelve hour clock");
                        }
                    }
                }
                //Checking if the first digit of the minutes can be used or not
                if(minute[0] > 5 || minute[0] < 0 || minute[1] < 0){
                    errorLbl1.setVisible(true);
                    error = 1;

                    throw new Exception ("Must be a time in the twelve hour clock");
                }
            }
        }
        catch (NumberFormatException nfe){
            System.err.println("You must use Ints");
            System.err.println("Exception: " + nfe);
            error = 1;
            }
        catch (Exception e){
            System.err.println("Must be a time in the twelve hour clock");
            System.err.println("The time must look something like this: 12:00, 12:31");
            System.err.println("Exception: " + e);
            error = 1;
            }
        return error;
    }
    
    /**
     * This is a method to check that the end time entered is a valid time
     * @param endTime
     * @return error
     */
    public int endTime (String endTime){
        //Varaibles and arrays
        char endTimeCheck;
        int error = 0;
        char colon = ':';
        //Arrays
        int[] checkEnd = new int[4];
        int[] minute = new int[2];
        
        //General try statment to send to a catch to catch errors in user input
        try{
            if(endTime.length() > 5){
                
                errorLbl1.setVisible(true);
                error = 1;
                throw new NumberFormatException();
            }
            else{               
                //Setting the user entered start time to an array
                for (int i = 0; i < 4; i ++){
                    endTimeCheck = endTime.charAt(i);
                    checkEnd[i] = (int)endTimeCheck - 48 ;

                    
                    //checking that the time is not a bunch of letters
                    if(checkEnd[i] > 10 || checkEnd[i] < 0){
                        //Output Error
                        errorLbl1.setVisible(true);
                        error = 1;
                        throw new NumberFormatException();
                    }
                }
                //Checking if the first number is a 1
                if(checkEnd[0] == 1){
                    //If the number is a one I want to check if the second one is a colon or another number
                    if (checkEnd[1] == 10){
                       
                        //If the number is a colon then I must check a different posisition to check the minute time 
                        minute[0] = endTime.charAt(2) -48;
                        minute[1] = endTime.charAt(3) - 48;
                        //Making sure the user entered a colon
                        if(endTime.charAt(1) != colon){
                            error = 1;
                            errorLbl1.setVisible(true);

                            throw new Exception ("Must be a time in the twelve hour clock");
                        }
                    }
                    else {
                        //If the second number is not a colon then I must check to make sure it is a time that is useable
                        if (checkEnd[1] == 0 ||checkEnd[1] == 1 ||checkEnd[1] == 2){
                            
                            
                            //Setting the appropriate minute check
                            minute[0] = endTime.charAt(3) -48;
                            minute[1] = endTime.charAt(4) - 48;

                            //Making sure the user entered a colon
                            if(endTime.charAt(2) != colon){
                                error = 1;
                                errorLbl1.setVisible(true);

                                throw new Exception ("Must be a time in the twelve hour clock");
                        }

                        }
                        //Sending an error if the time is not in the twelve hour clock
                        else{
                            //Setting error label to be shown
                            errorLbl1.setVisible(true);
                            error = 1;

                            throw new Exception ("Must be a time in the twelve hour clock");
                        }
                    }
                }
                //Checking if the first digit of the minutes can be used or not
                if(minute[0] > 5 || minute[0] < 0 || minute[1] < 0){
                    errorLbl1.setVisible(true);
                    error = 1;

                    throw new Exception ("Must be a time in the twelve hour clock");
                }
            }
        }
        catch (NumberFormatException nfe){
            System.err.println("You must use Ints");
            System.err.println("Exception: " + nfe);
            error = 1;
            }
        catch (Exception e){
            System.err.println("Must be a time in the twelve hour clock");
            System.err.println("The time must look something like this: 12:00, 12:31");
            System.err.println("Exception: " + e);
            error = 1;
            }
        return error;
    }
    
    public int checkTimes(String startTime, String endTime, String startTimeAmPm, String endTimeAmPm){
        //Variables
        int error = 0;
        int startMinute;
        int endMinute;
        int startHour = 0;
        int endHour = 0;
        
        //Arrays
        int[] start = new int[5];
        int[] end = new int[5];
        int[] startMinutes = new int[2];
        int[] endMinutes = new int[2];
        
        try{
            for (int i = 0 ; i < startTime.length(); i ++){
                    start[i] = (int)startTime.charAt(i) - 48;
                    
            }
            for (int i = 0 ; i < endTime.length(); i ++){
                    end[i] = (int)endTime.charAt(i) - 48;
                    
            }
            
            if(startTime.length() == 4){
                startMinutes[0] = start[2] + 1;
                startMinutes[1] = start[3] + 1;
                
                endMinutes[0] = end[2] + 1;
                endMinutes[1] = end[3] + 1;
                
                startHour = start[0];
                endHour = end[0];
            }
            else if(startTime.length() == 5){
                startMinutes[0] = start[3] + 1;
                startMinutes[1] = start[4] + 1;
                
                endMinutes[0] = end[3] + 1;
                endMinutes[1] = end[4] + 1;  
                
                startHour = 10 + start[1];
                endHour = 10 + end[1];
            }
            
            endMinute = endMinutes[0] + endMinutes[1];
            startMinute = startMinutes[0] + startMinutes[1];
            
            if (startTimeAmPm == "PM" && endTimeAmPm == "AM"){
                error = 1;
            }
            
            if(startHour > endHour && startTimeAmPm == "AM" && endTimeAmPm == "AM" || startTimeAmPm == "PM" && endTimeAmPm == "PM" ){
                error = 1;
            }
            
            if(startHour == endHour){
                if (startMinute > endMinute){
                    error = 1;
                } 
            }
            if (startTimeAmPm == "AM" && endTimeAmPm == "PM"){
                error = 0;
            }
        }
        catch (NumberFormatException nfe){
            System.err.println("You must use Ints");
            System.err.println("Exception: " + nfe);
            error = 1;
            }
        catch (Exception e){
            System.err.println("Must be a time in the twelve hour clock");
            System.err.println("The time must look something like this: 12:00, 12:31");
            System.err.println("Exception: " + e);
            error = 1;
            }
        
        return error;
    }
    
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
    private javax.swing.JLabel activityLbl;
    private javax.swing.JTextField activivityTxtFeild;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton createAccountBtn;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JFrame eighteenthJFrame;
    private javax.swing.JScrollPane eighteenthScrollPane;
    private javax.swing.JTextArea eighteenthTxtArea;
    private javax.swing.JFrame eighthJFrame;
    private javax.swing.JScrollPane eighthScrollPane;
    private javax.swing.JTextArea eighthTxtArea;
    private javax.swing.JFrame eleventhJFrame;
    private javax.swing.JScrollPane eleventhScrollPane;
    private javax.swing.JTextArea eleventhTxtArea;
    private javax.swing.JComboBox endAmPmCombBox;
    private javax.swing.JLabel endTimeLbl;
    private javax.swing.JTextField endTimeTxtFeild;
    private javax.swing.JLabel errorLbl1;
    private javax.swing.JLabel errorLbl2;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel febuaryLbl;
    private javax.swing.JFrame fifteenthJFrame;
    private javax.swing.JScrollPane fifteenthScrollPane;
    private javax.swing.JTextArea fifteenthTxtArea;
    private javax.swing.JFrame fifthJFrame;
    private javax.swing.JScrollPane fifthScrollPane;
    private javax.swing.JTextArea fifthTxtArea;
    private javax.swing.JFrame firstJFrame;
    private javax.swing.JScrollPane firstScrollPane;
    private javax.swing.JTextArea firstTxtArea;
    private javax.swing.JFrame fourteenthJFrame;
    private javax.swing.JScrollPane fourteenthScrollPane;
    private javax.swing.JTextArea fourteenthTxtArea;
    private javax.swing.JFrame fourthJFrame;
    private javax.swing.JScrollPane fourthScrollPane;
    private javax.swing.JTextArea fourthTxtArea;
    private javax.swing.JLabel fridayLbl;
    private javax.swing.JLabel mondayLbl;
    private javax.swing.JPanel monthBackgroundPnl;
    private javax.swing.JFrame monthJFrame;
    private javax.swing.JFrame nineteenthJFrame;
    private javax.swing.JScrollPane nineteenthScrollPane;
    private javax.swing.JTextArea nineteenthTxtArea;
    private javax.swing.JFrame ninthJFrame;
    private javax.swing.JScrollPane ninthScrollPane;
    private javax.swing.JTextArea ninthTxtArea;
    private javax.swing.JLabel saturdayLbl;
    private javax.swing.JFrame secondJFrame;
    private javax.swing.JScrollPane secondScrollPane;
    private javax.swing.JTextArea secondTxtArea;
    private javax.swing.JFrame seventeenthJFrame;
    private javax.swing.JScrollPane seventeenthScrollPane;
    private javax.swing.JTextArea seventeenthTxtArea;
    private javax.swing.JFrame seventhJFrame;
    private javax.swing.JScrollPane seventhScrollPane;
    private javax.swing.JTextArea seventhTxtArea;
    private javax.swing.JPanel signInBackgroundPnl;
    private javax.swing.JButton signInBtn;
    private javax.swing.JLabel signInLbl;
    private javax.swing.JLabel signInPasswordLbl;
    private javax.swing.JTextField signInPasswordTxtFeild;
    private javax.swing.JLabel signInUsernameLbl;
    private javax.swing.JTextField signInUsernameTxtFeild;
    private javax.swing.JLabel signUpLbl;
    private javax.swing.JLabel signUpPasswordLbl;
    private javax.swing.JTextField signUpPasswordTxtFeild;
    private javax.swing.JLabel signUpReEnterPasswordLbl;
    private javax.swing.JTextField signUpReEnterPasswordTxtFeild;
    private javax.swing.JLabel signUpUsernameLbl;
    private javax.swing.JTextField signUpUsernameTxtFeild;
    private javax.swing.JFrame sixteenthJFrame;
    private javax.swing.JScrollPane sixteenthScrollPane;
    private javax.swing.JTextArea sixteenthTxtArea;
    private javax.swing.JFrame sixthJFrame;
    private javax.swing.JScrollPane sixthScrollPane;
    private javax.swing.JTextArea sixthTxtArea;
    private javax.swing.JComboBox startAmPmCombBox;
    private javax.swing.JLabel startTimeLbl;
    private javax.swing.JTextField startTimeTxtFeild;
    private javax.swing.JLabel sundayLbl;
    private javax.swing.JFrame tenthJFrame;
    private javax.swing.JScrollPane tenthScrollPane;
    private javax.swing.JTextArea tenthTxtArea;
    private javax.swing.JFrame thirdJFrame;
    private javax.swing.JScrollPane thirdScrollPane;
    private javax.swing.JTextArea thirdTxtArea;
    private javax.swing.JFrame thirteenthJFrame;
    private javax.swing.JScrollPane thirteenthScrollPane;
    private javax.swing.JTextArea thirteenthTxtArea;
    private javax.swing.JLabel thrusdayLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel tuesdayLbl;
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
    private javax.swing.JButton updateBtn;
    private javax.swing.JLabel wednesdayLbl;
    // End of variables declaration//GEN-END:variables

    
}
