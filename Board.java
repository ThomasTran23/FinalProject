import javax.swing.*;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.border.Border;

public class Board extends JFrame implements ActionListener {

    private final int WIDTH = 1500; // 400;
    private final int HEIGHT = 900; // 400;
    private JTextPane textArea;
    private String base;
    private int loopslot = 0;
    private String[] files;
    private Image[] allPics;
    private JPanel[][] cards = new JPanel[4][6];
    private ArrayList<Image> pics;
    private Timer timer;
    private JFrame frame;
    // private Image[] ePics;
    // private ImageFlip flip = new ImageFlip();

    private static final String imageBase = "./NPC_images/";

    public Board() {
        try {
            javax.swing.SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    createGUI();
                }
            });
        } catch (Exception e) {
            System.err.println("createGUI didn't successfully complete");
        }
        init();
    }

    public void init() {
        String curDir = System.getProperty("user.dir");

        base = curDir + "/" + imageBase;
        pics = new ArrayList<Image>();
        timer = new Timer(400, this);

        getAllImages();
    }

    public void createGUI() {
        setMaximumSize(new Dimension(WIDTH, HEIGHT));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(WIDTH, HEIGHT));
        Container contentPane = this.getContentPane();
        contentPane.setLayout(new GridBagLayout(6,5));
        // Color bColor = Color.green.darker();
        // contentPane.setBackground(bColor);

        // imagePanel = new ImagePanel();
        // int width = 415;
        // int height = 480;
        // imagePanel.setPreferredSize(new Dimension(width, height));
        // imagePanel.setMinimumSize(new Dimension(width, height));
        // imagePanel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        for (int i = 0; i < cards.length; i++) {
            for (int x = 0; x < cards[i].length; i++) {
                JPanel imagePanel = new JPanel();
                cards[i][x] = imagePanel;
                GridBagConstraints c = new GridBagConstraints();
                
                c.gridy = i>2?i-2:i;
                int y = x;
                if(y%2==1){
                    y+=1;
                }
                if(i>2){
                    y+=3;
                }
                c.gridx = y;
                c.gridheight = 
                c.gridwidth = 
                contentPane.add(imagePanel,c);
            }
        }

        

        // textArea = new JTextPane();
        // textArea.setEditable(false);
        // JScrollPane scroll = new JScrollPane(textArea);
        // scroll.setPreferredSize(new Dimension(width, height/2));
        // scroll.setSize(new Dimension(width, height/2));
        // textArea.setPreferredSize(new Dimension(width, height/2));
        // textArea.setSize(new Dimension(width, height/2));

        // c.fill = GridBagConstraints.HORIZONTAL;
        // c.gridwidth = 2;
        // c.gridx = 0;
        // c.gridy = 2;
        // c.ipady = 20;
        // contentPane.add(scroll, c);

        frame = new JFrame();

        frame.setLocation(0, HEIGHT / 2);
        frame.setVisible(true);

        // imagePanel.add(flip);

        setLocationRelativeTo(null);
        setVisible(true);
        // toFront();
        setAlwaysOnTop(true);
        setAlwaysOnTop(false);
    }

    protected Image createImage(String path, String description) {
        return new ImageIcon(path, description).getImage();
    }

    public void getAllImages() {
        File dir = new File(base);
        files = dir.list();
        allPics = new Image[files.length];
        for (int i = 0; i < files.length; i++) {
            // System.err.println(files[i]);
            allPics[i] = createImage(base + files[i], "");

        }
        // System.err.println(pics.size());
    }

    public void actionPerformed(ActionEvent e) {

    }
}
