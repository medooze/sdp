/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp;

import java.util.ArrayList;

/**
 *
 * @author Sergio
 */
public class PreviousSSRCAttribute implements Attribute {

    private ArrayList<String> SSRCs;

    public PreviousSSRCAttribute() {
        SSRCs = new ArrayList<String>();
    }
    
    @Override
    public PreviousSSRCAttribute clone() {
	    //Clone
	    PreviousSSRCAttribute cloned =  new PreviousSSRCAttribute();
	    //For each ssrc
	    for(String ssrc : SSRCs)
		    //Add it
		    cloned.addSSRC(ssrc);
	    //REturn cloned
	    return cloned;
    }
  
    @Override
    public String toString() {
        //Get value
        String value = getValue();
        //Generic attr
        return "a="+ getField() + (value!=null ? ":" + value : "") + "\r\n";
    }

    @Override
    public String getField() {
        return "previous-ssrc";
    }

    @Override
    public String getValue() {
        String value = null;
        for (String SSRC : SSRCs)
            if (value==null)
                value = SSRC;
            else
                value += " " + SSRC;
        return value;
    }

    public void addSSRC(String SSRC) {
        SSRCs.add(SSRC);
    }

    public ArrayList<String> getSSRCs() {
        return SSRCs;
    }

    public void setSSRCs(ArrayList<String> SSRCs) {
        this.SSRCs = SSRCs;
    }

}