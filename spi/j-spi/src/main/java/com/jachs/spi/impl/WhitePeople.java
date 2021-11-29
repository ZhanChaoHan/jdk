package com.jachs.spi.impl;

import com.jachs.spi.interfaces.People;

/**
 *
 * @author zhanchaohan
 *
 */
public class WhitePeople implements People {
    @Override
    public void skin() {
        System.out.println("白皮肤");
    }
}
