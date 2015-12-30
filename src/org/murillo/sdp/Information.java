/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp;

/**
 *
 * @author Sergio
 */
public class Information {

    private String text;
    
    public Information() {
    }

    public Information(String text) {
        this.text = text;
    }

    @Override
    public Information clone() {
	    return new Information(text);
    }
	 
    @Override
    public String toString() {
        return "i=" + text + "\r\n";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
