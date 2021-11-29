package com.jachs.spi;

import java.util.ServiceLoader;

import com.jachs.spi.interfaces.Mouse;
import com.jachs.spi.interfaces.People;

/**
 * 
 * @author zhanchaohan
 *
 */
public class Main {
	public static void main(String[] args) {
		ServiceLoader<Mouse> click = ServiceLoader.load(Mouse.class);
        for (Mouse s : click) {
           s.click();
        }
        System.out.println("--------------------------");
        ServiceLoader<People> skin = ServiceLoader.load(People.class);
        for (People s : skin) {
            s.skin();
        }
	}
}
