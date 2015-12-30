/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp;

/**
 *
 * @author Sergio
 */
public class Bandwidth {

    private String type;
    private String bandwidth;

    public Bandwidth() {
    }

    @Override
    public String toString() {
        return "b=" +  type + ":" + bandwidth + "\r\n";
    }

    public Bandwidth(String type, String bandwidth) {
        this.type = type;
        this.bandwidth = bandwidth;
    }

    public Bandwidth(String type, Integer bandwidth) {
        this.type = type;
        this.bandwidth = bandwidth.toString();
    }
    
    @Override
    public Bandwidth clone() {
	    //Return cloned one
	    return new Bandwidth(type, bandwidth);
    }


    public String getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
