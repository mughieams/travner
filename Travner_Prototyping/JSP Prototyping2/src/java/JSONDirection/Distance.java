package Model;

/***********************************************************************
 * Module:  Distance.java
 * Author:  Fadhil
 * Purpose: Defines the Class Distance
 ***********************************************************************/

import java.util.*;

public class Distance {
    private String text;
    private Integer value;

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return the value
     */
    public Integer getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Integer value) {
        this.value = value;
    }

}