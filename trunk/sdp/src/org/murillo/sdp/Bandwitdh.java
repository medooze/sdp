/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp;

/**
 *
 * @author Sergio
 */
public class Bandwitdh {

    private String type;
    private String bandwidth;

    public Bandwitdh() {
    }

    @Override
    public String toString() {
        return "b=" +  type + ":" + bandwidth + "\r\n";
    }

    public Bandwitdh(String type, String bandwidth) {
        this.type = type;
        this.bandwidth = bandwidth;
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
