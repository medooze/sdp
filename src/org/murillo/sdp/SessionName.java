/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp;

/**
 *
 * @author Sergio
 */
public class SessionName {

    private String name;
    
    public SessionName() {
    }

    public SessionName(String name) {
        this.name = name;
    }
    
    @Override
    public SessionName clone() {
	    return new SessionName(name);
    }

    @Override
    public String toString() {
        return "s=" + name + "\r\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
