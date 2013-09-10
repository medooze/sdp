/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp;

/**
 *
 * @author Sergio
 */
public class FormatAttribute implements Attribute {

    private Integer fmt;
    private String parameters;

    public FormatAttribute() {
    }

    public FormatAttribute(Integer fmt) {
        this.fmt = fmt;
        this.parameters = null;
    }

    public FormatAttribute(Integer fmt, String parameters) {
        this.fmt = fmt;
        this.parameters = parameters;
    }
    
    @Override
    public String getField() {
        return "fmtp";
    }

    @Override
    public String getValue() {
        return fmt + " " + parameters;
    }

    @Override
    public String toString() {
        //Get value
        String value = getValue();
        //Generic attr
        return "a="+ getField() + (value!=null ? ":" + value : "") + "\r\n";
    }

    public Integer getFmt() {
        return fmt;
    }

    public void setFmt(Integer fmt) {
        this.fmt = fmt;
    }

    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    public void addParameter(String parameter) {
        //Check if no parameters
        if (parameters!=null && !parameters.isEmpty())
            //append separator
            parameters += "; " + parameter;
        else
            //Set it
            parameters = parameter;
    }
    public void addParameter(String key,String val) {
        addParameter(key+"="+val);
    }
    public void addParameter(String key,Integer val) {
        addParameter(key,val.toString());
    }
}
