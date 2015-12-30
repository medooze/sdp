/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp;

/**
 *
 * @author Sergio
 */
public class ExtMapAttribute implements Attribute {
    Integer id;
    String direction;
    String name;
    String attributes;

    public ExtMapAttribute() {
    }

    public ExtMapAttribute(Integer id, String name) {
	this.id = id;
	this.name = name;
    }

    public ExtMapAttribute(Integer id, String direction, String name, String attributes) {
	this.id = id;
	this.direction = direction;
	this.name = name;
	this.attributes = attributes;
    }
    
    @Override
    public ExtMapAttribute clone() {
	    return new ExtMapAttribute(id, direction, name, attributes);
    }
  

    @Override
    public String getField() {
        return "extmap";
    }

    @Override
    public String getValue() {
        return id + (direction!=null ? "/" + direction : "") + " " + name + (attributes!=null ? " " + attributes : "");
    }

    @Override
    public String toString() {
        //Get value
        String value = getValue();
        //Generic attr
        return "a="+ getField() + (value!=null ? ":" + value : "") + "\r\n";
    }

    public String getDirection() {
	return direction;
    }

    public void setDirection(String direction) {
	this.direction = direction;
    }

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getAttributes() {
	return attributes;
    }

    public void setAttributes(String attributes) {
	this.attributes = attributes;
    }


}
