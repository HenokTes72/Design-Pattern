/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern3;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

/**
 *
 * @author User
 */
public class DesignPattern3 {
    
    public static void main(String[] args) {

        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(); 
            }
        });
    }
    
    public static void createAndShowGUI() {

        JFrame f = new JFrame("Swing Paint Demo");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new MyPanel());
        f.pack();
        f.setVisible(true);
        
    }
}

class MyPanel extends JPanel implements ActionListener{
    static Map<Node, Person> hashMap;
    static Graphics graphics;
    
    Person ceo;
    private Person currentPerson;
    private JMenuItem addAssistant = new JMenuItem("Add Assistant");
    private JMenuItem addManager = new JMenuItem("Add Manager");
    private JMenuItem getSalary = new JMenuItem("Get Salary");
    private JPopupMenu menuPopup = new JPopupMenu();

    public MyPanel() {
        String name = JOptionPane.showInputDialog(null, "Enter CEO ", TOOL_TIP_TEXT_KEY, HEIGHT);
        double salary = Double.valueOf(JOptionPane.showInputDialog(null, "Enter salary", TOOL_TIP_TEXT_KEY, HEIGHT));
        ceo = new Manager(name, salary);
        hashMap = new HashMap();
        
        menuPopup.add(addAssistant);
        menuPopup.add(addManager);
        menuPopup.add(getSalary);

        
        addAssistant.addActionListener(this);
        getSalary.addActionListener(this);
        addManager.addActionListener(this);
        
        this.addMouseListener(mouseListener);
        this.setComponentPopupMenu(menuPopup);
    }
    
    MouseListener mouseListener = new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
            //check if it is right click
            if(e.getButton() == MouseEvent.BUTTON3){
                currentPerson = getPersonByLocation(new Node(e.getX(), e.getY()));
            }
            
        }
    };
    
    public boolean doesSelectPerson(int pLeft, int pTop, int cLeft, int cTop) {
        if(cLeft>pLeft && cLeft < pLeft+50){
            if(cTop>pTop && cTop < pTop+50){
                return true;
            }
        }
        return false;
    }
    
    public Person getPersonByLocation(Node point) {
        Set<Node> nodes = hashMap.keySet();
        int left, top;
        boolean isPerson;
        for(Node n: nodes) {
            left = n.getLeft();
            top = n.getTop();
            isPerson = doesSelectPerson(left, top, point.left, point.top);
            if(isPerson){
                return hashMap.get(n);
            }
        }
        return null;
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        if(currentPerson == null) {
            JOptionPane.showMessageDialog(null,"Please select a person","check selection",JOptionPane.ERROR_MESSAGE);
            return;
        }
        JMenuItem menu = (JMenuItem)event.getSource();
        if (menu == addAssistant || menu == addManager) {
            if(currentPerson instanceof Normal) {
                JOptionPane.showMessageDialog(null,currentPerson.getName()+ " can't add a child","check selection",JOptionPane.ERROR_MESSAGE);
            }
            else{
                String name = JOptionPane.showInputDialog(null, "Enter name", TOOL_TIP_TEXT_KEY, HEIGHT);
                double salary = Double.valueOf(JOptionPane.showInputDialog(null, "Enter salary", TOOL_TIP_TEXT_KEY, HEIGHT));
                
//                handleAddAssistant(menu, )
                if(menu == addManager) {
                    currentPerson.addAssistant(new Manager(name, salary));
                }
                else {
                    currentPerson.addAssistant(new Normal(name, salary));
                }
                repaint();
            }
	} else if (menu == getSalary) {
            JOptionPane.showMessageDialog(null,currentPerson.getName()+" Salary ="+currentPerson.getSalary());
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(1300,500);
    }
    
    public static void drawNode(int left, int top, String title) {
        graphics.drawString(title,left+8,top+30);
        graphics.drawRoundRect(left, top, 50, 50, 50, 50);
    }
    
    public static void drawLine(int x1, int y1, int x2, int y2){
        graphics.drawLine(x1+25, y1+50, x2+25, y2);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        graphics = g;

        drawChilds(ceo, 658, 30, 450);
        // Draw Text
    }  
    
    public static void drawChilds(Person p,int left, int top, int level) {  
        hashMap.put(new Node(left, top), p);
        drawNode(left, top, p.getName());
        if(p instanceof Manager) {
            int myTop = top + 100;
            int myLeft = left - level;
            for(Person assistant: p.getAssistants()) {
                drawChilds(assistant, myLeft, myTop, level/3);
                drawLine(left,top, myLeft, myTop);
                myLeft+=level;
            }
        }
    }
}
