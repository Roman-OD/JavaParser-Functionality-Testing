package Stock;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class StockController implements ActionListener {

//	private Quote model;
	
	private UserInterface view;
	
	JMenuItem  eMenu;
	JMenuItem cMenu;
	JMenuItem oMenu;
	JMenuItem sMenu;
	JFrame frames;
	int count = 0;
	
	public StockController(UserInterface v) {
//		model = m;
		view = v;
	}
	
	
	public void getJMenuItems(JMenuItem eMenuItem, JMenuItem cMenuItem, JMenuItem oMenuItem, JMenuItem sMenuItem, JFrame frame){
		
		eMenu = eMenuItem;
		cMenu = cMenuItem;
		oMenu = oMenuItem;
		sMenu = sMenuItem;
		frames = frame;
	}

	
	public void actionPerformed(ActionEvent e) {
		
		
			
		System.out.println("\n action detected!");
		
		System.out.println("\n analysing...");
			
			Object src = e.getSource();
////			
////			
			if (src == cMenu){
				System.out.println("create menu triggered");
				count++;
				createMenuActions newTab = new createMenuActions(cMenu, frames);
				newTab.createTabs();
//				
			}
			
			if (src == eMenu){
				System.out.println("exit menu triggered");
				
//				
			}
			
			if (src == oMenu){
				System.out.println("open menu triggered");
				
//				
			}
			
			if (src == sMenu){
				System.out.println("save menu triggered");
				
//				
			}
//				
//				
//				
//			
			
//			if(src == eMenu){
//				JFrame frame = new JFrame("Exit");
//				JButton Yes = new JButton("Yes");
//				JButton No = new JButton("No");
//				JLabel Sure = new JLabel("Are you sure you want to exit");
//				JPanel p1 = new JPanel();
//				
//				frame.getContentPane().add(p1);
//				frame.setSize(300, 200);
//				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//				frame.setLocationRelativeTo(null);
//				p1.add(Sure);
//				p1.add(Yes);
//				p1.add(No);
//				Sure.setBounds(20,20,20,20);
//				Yes.setBounds(200, 500, 80, 25);
//				frame.setVisible(true);
//				
//				
//				Yes.addActionListener(new ActionListener(){
//				
//				public void actionPerformed(ActionEvent e ) {
//					System.exit(0);	
//				}
//				});
//				
//				No.addActionListener(new ActionListener(){
//					
//				public void actionPerformed(ActionEvent e ) {
//						frame.dispose();	
//				}
//				});
				
//				}
		//
				
//				count++;
//				
//					switch (count){
//					
//					case 1 : 
//					jtp.addTab("Tab1", jp1);
//					jp1.setVisible(true);
//					System.out.println(count);	
//					
//					break;
//					
//					case 2 : 
//					jtp.addTab("Tab2", jp2);
//					jp2.setVisible(true);
//					System.out.println(count);
//					break;
//					
//					
//				}
				
			
			
			
//			model.setValues(view.getTicker());
			
		

	}

}
