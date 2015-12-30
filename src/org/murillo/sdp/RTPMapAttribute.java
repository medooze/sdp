/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp;

/**
 *
 * @author Sergio
 */
public class RTPMapAttribute implements Attribute {

    private Integer format;
    private String name;
    private Integer rate;
    private String parameters;

    public RTPMapAttribute() {
    }

    public RTPMapAttribute(Integer format, String name, Integer rate, String parameters) {
        this.format = format;
        this.name = name;
        this.rate = rate;
        this.parameters = parameters;
    }

    public RTPMapAttribute(Integer format, String name, Integer rate) {
        this.format = format;
        this.name = name;
        this.rate = rate;
    }
    
    @Override
    public RTPMapAttribute clone() {
	 return new RTPMapAttribute(format, name, rate, parameters);
    }
    
    @Override
    public String getField() {
        return "rtpmap";
    }

    @Override
    public String getValue() {
        return format.toString() + " " + name + "/" + rate + (parameters!=null ? "/" + parameters : "" );
    }

    @Override
    public String toString() {
        //Get value
        String value = getValue();
        //Generic attr
        return "a="+ getField() + (value!=null ? ":" + value : "") + "\r\n";
    }

    public Integer getFormat() {
        return format;
    }

    public void setFormat(Integer format) {
        this.format = format;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }
}
