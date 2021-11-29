package com.jachs.spi.impl;

import com.jachs.spi.interfaces.People;

/**
 *
 * @author zhanchaohan
 *
 */
public class BlackPeople implements People {
    @Override
    public void skin() {
        System.out.println("黑皮肤");
    }
}
