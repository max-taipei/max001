/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.livehereandnow.max;

/**
 *
 * @author max
 */
public class Card {
    int 編號;

    public Card(int 編號, String 卡名, int 時代, int 類型) {
        this.編號 = 編號;
        this.卡名 = 卡名;
        this.時代 = 時代;
        this.類型 = 類型;
    }

    public Card() {
    }

    public int get編號() {
        return 編號;
    }

    public void set編號(int 編號) {
        this.編號 = 編號;
    }

    public String get卡名() {
        return 卡名;
    }

    public void set卡名(String 卡名) {
        this.卡名 = 卡名;
    }

    public int get時代() {
        return 時代;
    }

    public void set時代(int 時代) {
        this.時代 = 時代;
    }

    public int get類型() {
        return 類型;
    }

    public void set類型(int 類型) {
        this.類型 = 類型;
    }
    
    //String 卡名;
    String 卡名;
    int 時代;//時代的值可能為0.1.2.3分別代表A.I.II.III
    int 類型;//0=領袖,1=奇蹟.2=黃牌
    
    
}
