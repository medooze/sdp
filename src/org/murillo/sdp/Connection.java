/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp;

/**
 *
 * @author Sergio
 */
public class Connection {

    private String netType;
    private String addrType;
    private String address;

    public Connection() {
    }

    public Connection(String netType, String addrType, String address) {
        this.netType = netType;
        this.addrType = addrType;
        this.address = address;
    }

    @Override
    public Connection clone() {
	    return new Connection(netType, addrType, address);
    }
    
    @Override
    public String toString() {
        return "c=" + netType + " " + addrType + " " + address + "\r\n";
    }

    public String getAddrType() {
        return addrType;
    }

    public void setAddrType(String addrType) {
        this.addrType = addrType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNetType() {
        return netType;
    }

    public void setNetType(String netType) {
        this.netType = netType;
    }
}
