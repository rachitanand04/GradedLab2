import javax.swing.*;
import java.awt.*;

class Main{
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}

class MyFrame extends JFrame {
    JPanel panel;
    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    JButton erp;
    JButton award;
    JButton board;
    JButton cct;
    JButton certificate;
    JButton survey;
    JButton doctoral;
    JButton fastrack;
    JButton hostel;
    JButton id;
    JButton cms;
    JButton ocj;
    JButton outbound;
    JButton attendanceR;
    JButton attendanceM;
    JButton clearance;
    JButton spc;
    JButton policy;
    JButton handbook;
    JButton research;
    JButton library;
    JButton mess;
    JButton help;
    JButton logo;
    JMenu menu;
    JMenuBar menuBar;
    JMenuItem logout;
    JMenuItem forgotP;
    JMenuItem changeP;
    JMenuItem helpDesk;
    JMenuItem how;
    JTextField searchF;
    JButton searchB;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);

        ImageIcon I1 = new ImageIcon("UniversityERP.png");
        ImageIcon I2 = new ImageIcon("Award.png");
        ImageIcon I3 = new ImageIcon("Blackboard.png");
        ImageIcon I4 = new ImageIcon("CCT.png");
        ImageIcon I5 = new ImageIcon("CertificateIssuance.png");
        ImageIcon I6 = new ImageIcon("CourseEvaluationSurvey.png");
        ImageIcon I7 = new ImageIcon("DoctoralPortal.png");
        ImageIcon I8 = new ImageIcon("Fastrack.png");
        ImageIcon I9 = new ImageIcon("HostelManagement.png");
        ImageIcon I10 = new ImageIcon("IDCardManagement.png");
        ImageIcon I11 = new ImageIcon("MobileAppCMS.png");
        ImageIcon I12 = new ImageIcon("OnCampusJob.png");
        ImageIcon I13 = new ImageIcon("StudentOutboundMobility.png");
        ImageIcon I14 = new ImageIcon("StudentAttendanceRecording.png");
        ImageIcon I15 = new ImageIcon("StudentAttendanceManagement.png");
        ImageIcon I16 = new ImageIcon("StudentClearance.png");
        ImageIcon I17 = new ImageIcon("StudentPaymentCenter.png");
        ImageIcon I18 = new ImageIcon("StudentPolicy.png");
        ImageIcon I19 = new ImageIcon("StudentHandbook.png");
        ImageIcon I20 = new ImageIcon("AcademicResearch.png");
        ImageIcon I21 = new ImageIcon("UniversityLibrary.png");
        ImageIcon I22 = new ImageIcon("MessMenu.png");
        ImageIcon I23 = new ImageIcon("NetIDHelp.png");
        ImageIcon I24 = new ImageIcon("Logo.png");
        ImageIcon I25 = new ImageIcon("searchlogo.png");


        erp = new JButton();
        erp.setIcon(I1);
        erp.setBorderPainted(false);
        award = new JButton();
        award.setIcon(I2);
        award.setBorderPainted(false);
        board = new JButton();
        board.setIcon(I3);
        board.setBorderPainted(false);
        cct = new JButton();
        cct.setIcon(I4);
        cct.setBorderPainted(false);
        certificate = new JButton();
        certificate.setIcon(I5);
        certificate.setBorderPainted(false);
        survey = new JButton();
        survey.setIcon(I6);
        survey.setBorderPainted(false);
        doctoral = new JButton();
        doctoral.setIcon(I7);
        doctoral.setBorderPainted(false);
        fastrack = new JButton();
        fastrack.setIcon(I8);
        fastrack.setBorderPainted(false);
        hostel = new JButton();
        hostel.setIcon(I9);
        hostel.setBorderPainted(false);
        id = new JButton();
        id.setIcon(I10);
        id.setBorderPainted(false);
        cms = new JButton();
        cms.setIcon(I11);
        cms.setBorderPainted(false);
        ocj = new JButton();
        ocj.setIcon(I12);
        ocj.setBorderPainted(false);
        outbound = new JButton();
        outbound.setIcon(I13);
        outbound.setBorderPainted(false);
        attendanceR = new JButton();
        attendanceR.setIcon(I14);
        attendanceR.setBorderPainted(false);
        attendanceM = new JButton();
        attendanceM.setIcon(I15);
        attendanceM.setBorderPainted(false);
        clearance = new JButton();
        clearance.setIcon(I16);
        clearance.setBorderPainted(false);
        spc = new JButton();
        spc.setIcon(I17);
        spc.setBorderPainted(false);
        policy = new JButton();
        policy.setIcon(I18);
        policy.setBorderPainted(false);
        handbook = new JButton();
        handbook.setIcon(I19);
        handbook.setBorderPainted(false);
        research = new JButton();
        research.setIcon(I20);
        research.setBorderPainted(false);
        library = new JButton();
        library.setIcon(I21);
        library.setBorderPainted(false);
        mess = new JButton();
        mess.setIcon(I22);
        mess.setBorderPainted(false);
        help = new JButton();
        help.setIcon(I23);
        help.setBorderPainted(false);
        logo = new JButton();
        logo.setIcon(I24);
        logo.setBorderPainted(false);
        searchB = new JButton();
        searchB.setIcon(I25);
        searchB.setBorderPainted(false);

        searchF = new JTextField(15);
        searchF.setText("Search");
        searchF.setForeground(Color.gray);


        menuBar =new JMenuBar();
        menuBar.setBorderPainted(false);
        // menuBar.setFocusable(false);
        // menuBar.setOpaque(false);
        menuBar.setBackground(new Color(0x005197));
        menu = new JMenu("Hi Shourey Agarwal");
        logout = new JMenuItem("Logout");
        forgotP = new JMenuItem("Forgot Password");
        changeP = new JMenuItem("Change/Reset Password");
        helpDesk = new JMenuItem("IT HelpDesk");
        how = new JMenuItem("How to login");

        menu.add(logout);
        menu.add(forgotP);
        menu.add(changeP);
        menu.add(helpDesk);
        menu.add(how);
        //menu.setBackground(new Color(0,81,151,255));
        menuBar.add(menu);
        menuBar.setVisible(true);




        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        //panel2.setAlignmentY(JPanel.CENTER_ALIGNMENT);
        panel2.add(erp);
        panel2.add(award);
        panel2.add(board);
        panel2.add(cct);
        panel2.add(certificate);
        panel2.add(survey);
        panel2.add(doctoral);
        panel2.add(fastrack);
        panel2.add(hostel);
        panel2.add(id);
        panel2.add(cms);
        panel2.add(ocj);
        panel2.add(outbound);
        panel2.add(attendanceR);
        panel2.add(attendanceM);
        panel2.add(clearance);
        panel2.add(spc);

        panel3 = new JPanel();
        panel3.setLayout(new GridLayout(1,6,0,0));
        panel3.setBackground(Color.black);
        //panel3.setAlignmentY(JPanel.BOTTOM_ALIGNMENT);
        panel3.add(policy);
        panel3.add(handbook);
        panel3.add(research);
        panel3.add(library);
        panel3.add(mess);
        panel3.add(help);

        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        //panel1.setAlignmentY(JPanel.TOP_ALIGNMENT);
        panel1.setBackground(new Color(0,81,151,255));
        panel1.add(logo,FlowLayout.LEFT);
        panel1.add(searchB,FlowLayout.CENTER);
        panel1.add(searchF,FlowLayout.CENTER);
        panel1.add(menuBar,FlowLayout.RIGHT);


        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(panel1,BorderLayout.NORTH);
        panel.add(panel2,BorderLayout.CENTER);
        panel.add(panel3,BorderLayout.SOUTH);

        this.add(panel);
        this.setVisible(true);

    }
}
