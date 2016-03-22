package com.example.root.energypay;

import java.util.Arrays;

/**
 * Created by root on 1/12/16.
 */
public class NavItems {

    //int[] iconID;
    public int imageId;
    public String title;

    public NavItems(){

    }

    public NavItems(int imageId, String title){


        this.imageId = imageId;
        this.title = title;
    }

  /*  public String[] getTitle() {
        return title;
    }

    public void setTitle(String[] title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "NavItems{" +
                "title=" + Arrays.toString(title) +
                '}';
    }*/
}
