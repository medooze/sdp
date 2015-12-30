/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Sergio
 */
public class FormatAttribute implements Attribute {

    private Integer fmt;
    private LinkedHashMap<String,String> parameters;

    public FormatAttribute() {
	this.parameters = new LinkedHashMap<String,String>();
    }

    public FormatAttribute(Integer fmt) {
        this.fmt = fmt;
        this.parameters = new LinkedHashMap<String,String>();
    }

    public FormatAttribute(Integer fmt, String parameters) {
        this.fmt = fmt;
        this.parameters = new LinkedHashMap<String,String>();
	//Set them
	setParameters(parameters);
    }
    
    @Override
    public FormatAttribute clone() {
	    //Clone it
	    FormatAttribute cloned = new FormatAttribute(fmt);
	    //Add parameters
	    for (Map.Entry<String,String> parameter : parameters.entrySet())
		    //Add it to clone
		    cloned.addParameter(parameter.getKey(), parameter.getValue());
	    //Return cloned one
	    return cloned;
    }
  
    
    @Override
    public String getField() {
        return "fmtp";
    }

    @Override
    public String getValue() {
        String string  = "";
	//For each parameter
	for (Map.Entry<String,String> entry : parameters.entrySet())
	{
		//Add separator
	       if (string.isEmpty())
		   string += " " + entry.getKey();
	       else
		   string += "; " + entry.getKey();
	       //If got value
	       if (entry.getValue()!=null)
		       //Append it
		       string += "="+entry.getValue();
	}
	return  fmt + string;
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

    public Map<String,String> getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        //Split by ;
	for (String param : parameters.split(";"))
	{
		//Remove spaces, and split by =
		String[] vals =param.trim().split("=");
		//Add to map
		this.parameters.put(vals[0].trim(), vals.length>1?vals[1].trim():null);
	}
    }

    public void addParameter(String parameter) {
       
    }
    public void addParameter(String key,String val) {
        parameters.put(key, val);
    }
    public void addParameter(String key,Integer val) {
        addParameter(key,val.toString());
    }

    public boolean isEmpty() {
	return parameters!=null ? parameters.isEmpty() : true;
    }


}
