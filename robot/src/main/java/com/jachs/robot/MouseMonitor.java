package com.jachs.robot;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

/***
 * 
 * @author zhanchaohan
 *
 */
public class MouseMonitor extends JFrame{
	public MouseMonitor () {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		this.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				System.out.println("移动:"+e.getX()+"\t"+e.getY());
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				System.out.println("拖拽:"+e.getX()+"\t"+e.getY());
			}
		});
		setBackground(Color.black);
		setSize(screenSize);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        setVisible(true);
	}
}
