/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp;

/**
 *
 * @author Sergio
 */
public class BaseAttribute implements Attribute {
    private String field;
    private String value;

    public BaseAttribute() {

    }

    public BaseAttribute(String field) {
        this.field = field;
    }

    public BaseAttribute(String field, String value) {
        this.field = field;
        this.value = value;
    }

    public BaseAttribute(String field, Integer value) {
        this.field = field;
        this.value = value.toString();
    }

    @Override
    public BaseAttribute clone() {
	    return new BaseAttribute(field, value);
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
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
