/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp;

/**
 *
 * @author Sergio
 */
public class CNameAttribute implements Attribute {

    private String CName;

    public CNameAttribute() {
    }

    public CNameAttribute(String CName) {
        this.CName = CName;
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
        return "cname";
    }

    @Override
    public String getValue() {
        return CName;
    }

    public String getCName() {
        return CName;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }

}
