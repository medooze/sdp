/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp;

/**
 *
 * @author Sergio
 */
public class MidAttribute implements Attribute {

    private String identificationTag;

    public MidAttribute() {
    }

    public MidAttribute(String identificationTag) {
        this.identificationTag = identificationTag;
    }
    
    @Override
    public MidAttribute clone() {
	    return new MidAttribute(identificationTag);
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
        return "mid";
    }

    @Override
    public String getValue() {
        return identificationTag;
    }

    public String getIdentificationTag() {
        return identificationTag;
    }

    public void setIdentificationTag(String identificationTag) {
        this.identificationTag = identificationTag;
    }

}
