package com.jachs.spi.impl;

import com.jachs.spi.interfaces.Mouse;

/***
 * 
 * @author zhanchaohan
 *
 */
public class XiaoMiMouse implements Mouse {

	@Override
	public void move() {
		System.out.println("小米鼠标移动");
	}

	@Override
	public void click() {
		System.out.println("小米鼠标点击");
	}

}
