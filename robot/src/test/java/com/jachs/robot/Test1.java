package com.jachs.robot;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.junit.Test;

/***
 * 
 * @author zhanchaohan
 *
 */
public class Test1 {
	
	@Test
	public void test1() throws AWTException {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println("屏幕宽"+screenSize.getWidth());
		System.out.println("屏幕高"+screenSize.getHeight());
		Robot robot=new Robot();
		
		robot.mouseMove(50, 50);//将鼠标指针移动到给定屏幕坐标。
	}
	@Test
	public void test() throws AWTException {
		Robot robot=new Robot();
		
		robot.mouseMove(500, 300);
		
		robot.keyPress(KeyEvent.VK_A);//按下给定的键。
		robot.keyRelease(KeyEvent.VK_A);//释放给定的键。
	}
	@Test
	public void test2() throws AWTException {
		Robot robot=new Robot();
		
		
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);//按下一个或多个鼠标按钮
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);//释放一个或多个鼠标按钮。
	}
}
