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
public class GroupAttribute implements Attribute {

    private String semantics;
    private ArrayList<String> tags;
    
    public GroupAttribute(){
        tags = new ArrayList<String>();
    }
    
    public GroupAttribute(String semantics){
	this.semantics = semantics;
        tags = new ArrayList<String>();
    }
    
    @Override
    public GroupAttribute clone() {
	    //Clone
	    GroupAttribute cloned = new GroupAttribute(semantics);
	    //Clone data
	    for(String tag: tags)
		    //Add tag
		    cloned.addTag(tag);
	    //Return it
	    return cloned;
    }
  
    @Override
    public String getField() {
        return "group";
    }

    @Override
    public String getValue() {
        String value = semantics;
        for (String tag : tags)
            value += " " + tag;
        return value;
    }

    @Override
    public String toString() {
        //Get value
        String value = getValue();
        //Generic attr
        return "a="+ getField() + (value!=null ? ":" + value : "") + "\r\n";
    }


    public String getSemantics() {
        return semantics;
    }

    public void setSemantics(String semantics) {
        this.semantics = semantics;
    }

    public void addTag(String tag) {
        tags.add(tag);
    }

}