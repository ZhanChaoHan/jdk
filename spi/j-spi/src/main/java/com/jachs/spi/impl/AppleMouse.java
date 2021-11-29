package com.jachs.spi.impl;

import com.jachs.spi.interfaces.Mouse;

/***
 * 
 * @author zhanchaohan
 *
 */
public class AppleMouse implements Mouse{

	@Override
	public void move() {
		System.out.println("苹果鼠标移动");
	}

	@Override
	public void click() {
		System.out.println("苹果鼠标点击");
	}

}
