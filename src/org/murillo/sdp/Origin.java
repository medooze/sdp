/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp;

/**
 *
 * @author Sergio
 */
public class Origin {
    
    private String username;
    private Long sessId;
    private Long sessVersion;
    private String nettype;
    private String addrtype;
    private String address;

    public Origin() {

    }

    public Origin(String username, Long sessId, Long sessVersion, String nettype, String addrtype, String address) {
        this.username = username;
        this.sessId = sessId;
        this.sessVersion = sessVersion;
        this.nettype = nettype;
        this.addrtype = addrtype;
        this.address = address;
    }

    @Override
    public Origin clone() {
	    return new Origin(username, sessId, sessVersion, nettype, addrtype, address);
    }
    
    @Override
    public String toString() {
        return "o=" + username + " " + sessId + " " + sessVersion + " " + nettype + " " + addrtype + " " + address + "\r\n";
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddrtype() {
        return addrtype;
    }

    public void setAddrtype(String addrtype) {
        this.addrtype = addrtype;
    }

    public String getNettype() {
        return nettype;
    }

    public void setNettype(String nettype) {
        this.nettype = nettype;
    }

    public Long getSessId() {
        return sessId;
    }

    public void setSessId(Long sessId) {
        this.sessId = sessId;
    }
    
    public void setSessId(Integer sessId) {
        this.sessId = sessId.longValue();
    }

    public Long getSessVersion() {
        return sessVersion;
    }

    public void setSessVersion(Long sessVersion) {
        this.sessVersion = sessVersion;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
