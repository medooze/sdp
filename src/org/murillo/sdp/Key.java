/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp;

/**
 *
 * @author Sergio
 */
public class Key {

    private String type;
    private String key;
    public Key() {
    }

    public Key(String type, String key) {
        this.type = type;
        this.key = key;
    }

    @Override 
    public Key clone() {
	    return new Key(type, key);
    }
    
    @Override
    public String toString() {
        return "k=" + (key!=null? key + " " : "" ) + type + "\r\n";
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
