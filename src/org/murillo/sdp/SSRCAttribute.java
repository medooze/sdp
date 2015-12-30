/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp;

/**
 *
 * @author Sergio
 */
public class SSRCAttribute implements Attribute {

    private Long SSRC;
    private String attrField;
    private String attrValue;

    public SSRCAttribute() {
    }

    public SSRCAttribute(Long SSRC, String attrField, String attrValue) {
        this.SSRC = SSRC;
        this.attrField = attrField;
        this.attrValue = attrValue;
    }
    
    @Override
    public SSRCAttribute clone() {
	    return new SSRCAttribute(SSRC, attrField, attrValue);
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
        return "ssrc";
    }

    @Override
    public String getValue() {
        return SSRC + " " + attrField + (attrValue!=null ? ":" + attrValue: "");
    }

    public Long getSSRC() {
        return SSRC;
    }

    public void setSSRC(Long SSRC) {
        this.SSRC = SSRC;
    }

    public String getAttrField() {
        return attrField;
    }

    public void setAttrField(String attrField) {
        this.attrField = attrField;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

    


}
