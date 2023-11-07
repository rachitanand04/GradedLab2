import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class SNULinks {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SNULinks");
        GraphicsDevice graphicsDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        GraphicsConfiguration config = graphicsDevice.getDefaultConfiguration();
        frame.setSize(config.getBounds().getSize());
        frame.setLayout(new BorderLayout());

        topBar(frame);
        middleBar(frame);
        bottomBar(frame);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void bottomBar(JFrame frame){
        JPanel bottom = new JPanel(new GridLayout(1,6));
        String[] items = {"StudentPolicy","StudentHandBook","AcademicResearch","UniversityLibrary","MessMenu","NetIDHelp"};
        for(String item:items){
            ImageIcon icon = new ImageIcon("Images/"+item+".png");
            JButton button = new JButton(icon);
            button.setBackground(new Color(0,0,0));
            button.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
            bottom.add(button);
        }
        bottom.setBackground(Color.black);
        JPanel bottomBar = new JPanel(new BorderLayout());
        bottomBar.add(bottom,BorderLayout.NORTH);
        JPanel bottomText = new JPanel(new FlowLayout(FlowLayout.CENTER));
        bottomText.setBackground(Color.BLACK);
        bottom.setForeground(Color.white);
        bottomText.add(new JLabel("© 2023 - Shiv Nadar (Institution of Eminence Deemed to be University)."),BorderLayout.CENTER);
        bottomBar.add(bottomText,BorderLayout.SOUTH);
        frame.add(bottomBar,BorderLayout.SOUTH);
    }

    public static void middleBar(JFrame frame){
        JPanel middle = new JPanel();
        middle.setLayout(new GridLayout(3,6,10,10));


        String[] items = {"UniversityERP","Award","Blackboard","CCT","CertificateIssuance","CourseEvaluationSurvey","DoctoralPortal",
        "Fastrack","HostelManagement","IDCardManagement","MobileAppCMS","OnCampusJob","StudentOutboundMobility","StudentAttendanceRecording","StudentAttendanceManagement",
        "StudentClearance","StudentPaymentCenter"};
        for(String item:items){
            ImageIcon icon = new ImageIcon("Images/"+item+".png");
            JButton button = new JButton(icon);
            Dimension d = new Dimension(icon.getIconWidth(),icon.getIconHeight());
            button.setPreferredSize(d);
            middle.add(button);
        }
  //      JPanel middleBar = new JPanel(new BorderLayout());
        JPanel middleBar = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
        middleBar.add(middle,BorderLayout.NORTH);
        frame.add(middleBar,BorderLayout.CENTER);
    }

    public static void topBar(JFrame frame){
        JPanel searchPanel = new JPanel();
        searchPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
        searchPanel.setBackground(new Color(0x005197));

        ImageIcon icon = new ImageIcon("Images/Search.png");
        JButton searchButton = new JButton(icon);
        searchButton.setBackground(new Color(0x005197));
        searchButton.setBorderPainted(false);
        searchPanel.add(searchButton);
        Dimension d = new Dimension(icon.getIconWidth(),icon.getIconHeight());
        searchButton.setPreferredSize(d);


        JTextField searchField = new JTextField("Search", 20);
        searchField.setFont(new Font("Arial", Font.PLAIN, 14));
        searchField.setBorder(new LineBorder(Color.WHITE, 1));
        searchField.setPreferredSize(new Dimension(150, icon.getIconHeight()));
        searchField.setForeground(Color.BLACK);
        searchPanel.add(searchField);
        JPanel topBar = new JPanel();
        topBar.setLayout(new BorderLayout());
        ImageIcon logoIcon = new ImageIcon("Images/Logo.png");
        JLabel logo = new JLabel(logoIcon);
        topBar.setBackground(new Color(0x005197));
        topBar.add(logo,BorderLayout.WEST);
        topBar.add(searchPanel,BorderLayout.CENTER);

        JMenu menu = new JMenu("HI, RACHIT ANAND ▼");
        String[] menuItems = {"Logout","Forgot Password","Change/Reset Password","IT HelpDesk","How To Login?"};
        for(String item:menuItems){
            menu.add(new JMenuItem(item));
        }
        menu.setForeground(Color.WHITE);
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBorder(BorderFactory.createLineBorder(new Color(0x005197)));
        menuBar.setBackground(new Color(0x005197));
        menuBar.add(menu);
        topBar.add(menuBar,BorderLayout.EAST);
        frame.add(topBar,BorderLayout.NORTH);
    }

}
