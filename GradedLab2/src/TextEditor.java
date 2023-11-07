//Github Link: https://github.com/rachitanand04/GradedLab2

import javax.swing.*;
import java.awt.*;

public class TextEditor {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Editor");
        GraphicsDevice graphicsDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        GraphicsConfiguration config = graphicsDevice.getDefaultConfiguration();
        frame.setSize(config.getBounds().getSize());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        menuBar(frame);
        sketchPad(frame);
        textEditor(frame);
        bottomBar(frame);

        frame.setVisible(true);
    }

    public static void menuBar(JFrame frame){
        JMenuBar menuBar = new JMenuBar();
        JMenu file= new JMenu("File");
        String[] fileItems = {"New Tab","New Window","Open","Save","Save As","Save All", "Page Setup","Print","Close Tab","Close Window","Exit"};
        for(String item:fileItems){
            JMenuItem menuItem = new JMenuItem(item);
            file.add(menuItem);
        }
        menuBar.add(file);

        JMenu edit = new JMenu("Edit");
        String[] editItems = {"Undo","Cut","Copy","Paste","Delete","Go To","Select All","Time/Date"};
        for(String item:editItems){
            JMenuItem menuItem = new JMenuItem(item);
            edit.add(menuItem);
        }
        menuBar.add(edit);

        JMenu review = new JMenu("Review");
        String[] reviewItems = {"Zoom","Status Bar","Word Wrap"};
        for(String item:reviewItems){
            if(item.equals("Zoom")){
                JMenu subMenu = new JMenu("Zoom");
                JMenuItem in,out,setDefault;
                in = new JMenuItem("Zoom In");
                subMenu.add(in);
                out = new JMenuItem("Zoom Out");
                subMenu.add(out);
                setDefault = new JMenuItem("Default");
                subMenu.add(setDefault);
                review.add(subMenu);
            }else {
                JMenuItem menuItem = new JMenuItem(item);
                review.add(menuItem);
            }
        }
        menuBar.add(review);
        
        JMenu help = new JMenu("Help");
        String[] helpItems = {"Help","About"};
        for(String item:helpItems){
            JMenuItem menuItem = new JMenuItem(item);
            help.add(menuItem);
        }
        menuBar.add(help);
        
        frame.setJMenuBar(menuBar);
    }

    public static void sketchPad(JFrame frame){
        JPanel toolBar = new JPanel();
        toolBar.setLayout(new FlowLayout());
        toolBar.add(new JButton("Rectangle"));
        toolBar.add(new JButton("Circle"));
        toolBar.add(new JButton("Line"));
        toolBar.add(new JButton("Triangle"));
        toolBar.add(new JButton("Pentagon"));
        toolBar.add(new JButton("Clear"));

        JPanel control = new JPanel();
        control.setLayout(new BorderLayout());
        control.add(new JLabel("Sketch Pad"),BorderLayout.NORTH);
        control.add(toolBar,BorderLayout.SOUTH);

        JPanel drawingPad = new JPanel();
        drawingPad.setBackground(Color.GRAY);

        JPanel sketchPad = new JPanel();
        sketchPad.setLayout(new BorderLayout());
        sketchPad.add(control,BorderLayout.NORTH);
        sketchPad.add(drawingPad,BorderLayout.CENTER);
        sketchPad.setBorder(BorderFactory.createLineBorder(Color.black));
        frame.add(sketchPad,BorderLayout.EAST);
    }
    public static void textEditor(JFrame frame){
        JPanel editor = new JPanel();
        editor.setLayout(new BorderLayout());
        editor.setBorder(BorderFactory.createLineBorder(Color.black));
        editor.add(toolBar(),BorderLayout.NORTH);
        JTextArea textBox = new JTextArea();
        textBox.setLineWrap(true);
        editor.add(textBox);
        frame.add(editor,BorderLayout.WEST);
    }

    public static JPanel toolBar(){
        JPanel toolBar = new JPanel();

        //ImageIcon icon = new ImageIcon("Images/Bold.png");
//        toolBar.add(new JButton("B"));
        toolBar.add(new JButton(new ImageIcon("Images/Bold.png")));
        toolBar.add(new JButton("Italic"));
        toolBar.add(new JButton("Underline"));
        toolBar.add(new JButton("StrikeThrough"));
        toolBar.add(new JButton("Left Aligned"));
        toolBar.add(new JButton("Center Aligned"));
        toolBar.add(new JButton("Right Aligned"));
        JComboBox<String> font = new JComboBox<>();
        GraphicsEnvironment e = GraphicsEnvironment
                .getLocalGraphicsEnvironment();
        String[] fontNames = e.getAvailableFontFamilyNames();
        for(int i = 0; i < fontNames.length; i++){
            font.addItem(fontNames[i]);
        }
        toolBar.add(font);
        JComboBox<Integer> size = new JComboBox<>();
        for(int i = 1; i <= 50; i++){
            size.addItem(i);
        }
        toolBar.add(size);
        JPanel util = new JPanel(new BorderLayout());
        util.add(toolBar,BorderLayout.NORTH);
        util.add(findAndReplace(),BorderLayout.CENTER);
        util.add(findAndReplaceButtons(),BorderLayout.SOUTH);
        return util;
    }

    public static JPanel findAndReplace(){
        JPanel findAndReplace = new JPanel();
        findAndReplace.setLayout(new GridLayout(4,1));
        findAndReplace.add(new JLabel("Find"));
        findAndReplace.add(new JTextField(10));
        findAndReplace.add(new JLabel("Replace"));
        findAndReplace.add(new JTextField(10));
        return findAndReplace;
    }

    public static JPanel findAndReplaceButtons(){
        JPanel buttons = new JPanel(new FlowLayout());
        buttons.add(new JButton("Find All"));
        buttons.add(new JButton("Find Next"));
        buttons.add(new JButton("Replace"));
        buttons.add(new JButton("Replace All"));
        return buttons;
    }

    public static void bottomBar(JFrame frame){
        JPanel bottomBar = new JPanel(new BorderLayout());
        JPanel count = new JPanel(new FlowLayout());
        count.add(new JLabel("Word Count: "));
        count.add(new JLabel("Character Count: "));
        bottomBar.add(count,BorderLayout.WEST);
        frame.add(bottomBar,BorderLayout.SOUTH);
    }
}

// Question 2

//import javax.swing.*;
//        import javax.swing.border.LineBorder;
//        import java.awt.*;
//
//public class SNULinks {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("SNULinks");
//        GraphicsDevice graphicsDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
//        GraphicsConfiguration config = graphicsDevice.getDefaultConfiguration();
//        frame.setSize(config.getBounds().getSize());
//        frame.setLayout(new BorderLayout());
//
//        topBar(frame);
//        middleBar(frame);
//        bottomBar(frame);
//
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//
//    public static void bottomBar(JFrame frame){
//        JPanel bottom = new JPanel(new GridLayout(1,6));
//        String[] items = {"StudentPolicy","StudentHandBook","AcademicResearch","UniversityLibrary","MessMenu","NetIDHelp"};
//        for(String item:items){
//            ImageIcon icon = new ImageIcon("Images/"+item+".png");
//            JButton button = new JButton(icon);
//            button.setBackground(new Color(0,0,0));
//            button.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
//            bottom.add(button);
//        }
//        bottom.setBackground(Color.black);
//        JPanel bottomBar = new JPanel(new BorderLayout());
//        bottomBar.add(bottom,BorderLayout.NORTH);
//        JPanel bottomText = new JPanel(new FlowLayout(FlowLayout.CENTER));
//        bottomText.setBackground(Color.BLACK);
//        bottom.setForeground(Color.white);
//        bottomText.add(new JLabel("© 2023 - Shiv Nadar (Institution of Eminence Deemed to be University)."),BorderLayout.CENTER);
//        bottomBar.add(bottomText,BorderLayout.SOUTH);
//        frame.add(bottomBar,BorderLayout.SOUTH);
//    }
//
//    public static void middleBar(JFrame frame){
//        JPanel middle = new JPanel();
//        middle.setLayout(new GridLayout(3,6,10,10));
//
//
//        String[] items = {"UniversityERP","Award","Blackboard","CCT","CertificateIssuance","CourseEvaluationSurvey","DoctoralPortal",
//                "Fastrack","HostelManagement","IDCardManagement","MobileAppCMS","OnCampusJob","StudentOutboundMobility","StudentAttendanceRecording","StudentAttendanceManagement",
//                "StudentClearance","StudentPaymentCenter"};
//        for(String item:items){
//            ImageIcon icon = new ImageIcon("Images/"+item+".png");
//            JButton button = new JButton(icon);
//            Dimension d = new Dimension(icon.getIconWidth(),icon.getIconHeight());
//            button.setPreferredSize(d);
//            button.setToolTipText(item);
//            middle.add(button);
//        }
//        //      JPanel middleBar = new JPanel(new BorderLayout());
//        JPanel middleBar = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
//        middleBar.add(middle,BorderLayout.NORTH);
//        frame.add(middleBar,BorderLayout.CENTER);
//    }
//
//    public static void topBar(JFrame frame){
//        JPanel searchPanel = new JPanel();
//        searchPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 25));
//        searchPanel.setBackground(new Color(0x005197));
//
//        ImageIcon icon = new ImageIcon("Images/Search.png");
//        JButton searchButton = new JButton(icon);
//        searchButton.setBackground(new Color(0x005197));
//        searchButton.setBorderPainted(false);
//        searchPanel.add(searchButton);
//        Dimension d = new Dimension(icon.getIconWidth(),icon.getIconHeight());
//        searchButton.setPreferredSize(d);
//
//
//        JTextField searchField = new JTextField("Search", 20);
//        searchField.setFont(new Font("Arial", Font.PLAIN, 14));
//        searchField.setBorder(new LineBorder(Color.WHITE, 1));
//        searchField.setPreferredSize(new Dimension(150, icon.getIconHeight()));
//        searchField.setForeground(Color.BLACK);
//        searchPanel.add(searchField);
//        JPanel topBar = new JPanel();
//        topBar.setLayout(new BorderLayout());
//        ImageIcon logoIcon = new ImageIcon("Images/Logo.png");
//        JLabel logo = new JLabel(logoIcon);
//        topBar.setBackground(new Color(0x005197));
//        topBar.add(logo,BorderLayout.WEST);
//        topBar.add(searchPanel,BorderLayout.CENTER);
//
//        JMenu menu = new JMenu("HI, RACHIT ANAND ▼");
//        String[] menuItems = {"Logout","ForgotPassword","ResetPassword","ITHelp","HowToLogin"};
//        for(String item:menuItems){
//            ImageIcon logoutIcon = new ImageIcon("Images/"+item+".png");
//            JMenuItem logout = new JMenuItem(logoutIcon);
//            logout.setBackground(Color.WHITE);
//            menu.add(logout);
//        }
//
//
//        menu.setBackground(Color.WHITE);
//        menu.setForeground(Color.WHITE);
//        JMenuBar menuBar = new JMenuBar();
//        menuBar.setBorder(BorderFactory.createLineBorder(new Color(0x005197)));
//        menuBar.setBackground(new Color(0x005197));
//        menuBar.add(menu);
//        topBar.add(menuBar,BorderLayout.EAST);
//        frame.add(topBar,BorderLayout.NORTH);
//    }
//}
