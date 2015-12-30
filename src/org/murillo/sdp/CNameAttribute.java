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

    private String cname;

    public CNameAttribute() {
    }

    public CNameAttribute(String cname) {
        this.cname = cname;
    }

    @Override
    public CNameAttribute clone() {
	    return new CNameAttribute(cname);
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
        return cname;
    }

    public String getCName() {
        return cname;
    }

    public void setCName(String CName) {
        this.cname = CName;
    }

}
