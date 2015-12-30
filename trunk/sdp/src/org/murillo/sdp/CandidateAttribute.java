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
public class CandidateAttribute implements Attribute {



    public static class Extension {
        public String name;
        public String value;

        public Extension() {
        }

        public Extension(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    private String fundation;
    private Integer componentId;
    private String transport;
    private Integer priority;
    private String address;
    private Integer port;
    private String type;
    private String relAddr;
    private Integer relPort;
    private ArrayList<Extension> extensions;

    public CandidateAttribute() {
        extensions = new ArrayList<Extension>();
    }

    public CandidateAttribute(String fundation, Integer componentId, String transport, Integer priority, String address, Integer port, String type) {
        this.fundation = fundation;
        this.componentId = componentId;
        this.transport = transport;
        this.priority = priority;
        this.address = address;
        this.port = port;
        this.type = type;
        extensions = new ArrayList<Extension>();
    }
    
    @Override
    public CandidateAttribute clone() {
	    return new CandidateAttribute(fundation, componentId, transport, priority, address, port, type);
    }
  

    @Override
    public String getField() {
        return "candidate";
    }

    @Override
    public String getValue() {
        String value = fundation + " " + componentId + " " + transport + " " + priority + " " + address + " " + port + " typ " + type;
        if (relAddr!=null)
            value += " raddr " + relAddr;
        if (relPort!=null)
            value += " rport " + relPort;
        for (Extension ext : extensions)
            value += " " + ext.name + " " + ext.value;
        return value;
    }

    @Override
    public String toString() {
        //Get value
        String value = getValue();
        //Generic attr
        return "a="+ getField() + (value!=null ? ":" + value : "") + "\r\n";
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getComponentId() {
        return componentId;
    }

    public void setComponentId(Integer componentId) {
        this.componentId = componentId;
    }

    public ArrayList<Extension> getExtensions() {
        return extensions;
    }

    public void setExtensions(ArrayList<Extension> extensions) {
        this.extensions = extensions;
    }

    public String getFundation() {
        return fundation;
    }

    public void setFundation(String fundation) {
        this.fundation = fundation;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getRelAddr() {
        return relAddr;
    }

    public void setRelAddr(String relAddr) {
        this.relAddr = relAddr;
    }

    public Integer getRelPort() {
        return relPort;
    }

    public void setRelPort(Integer relPort) {
        this.relPort = relPort;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void addExtension(String name,String value) {
        extensions.add( new Extension(name, value));
    }

    public void addExtension(Extension extension) {
        extensions.add(extension);
    }
}
