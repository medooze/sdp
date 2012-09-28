/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author Sergio
 */
public class MediaDescription {

    private String media;
    private Integer port;
    private ArrayList<String> proto;
    private ArrayList<Integer> formats;
    private Information information;
    private ArrayList<Connection> connections;
    private ArrayList<Bandwitdh> bandwitdhs;
    private ArrayList<Attribute> attributes;
    private Key key;

    public MediaDescription() {
        //Create arrays
        proto = new ArrayList<String>();
        formats = new ArrayList<Integer>();
        connections = new ArrayList<Connection>();
        bandwitdhs = new ArrayList<Bandwitdh>();
        attributes = new ArrayList<Attribute>();
    }

    public MediaDescription(String media, Integer port, String proto) {
        //initialize
        super();
        //Set
        this.media = media;
        this.port = port;
        //tokenize proto
        StringTokenizer tokenizer = new StringTokenizer(proto, "/");
        //Tokenize
        while(tokenizer.hasMoreTokens())
            this.proto.add(tokenizer.nextToken());
    }

    @Override
    public String toString() {
        //Create media line
        String value ="m=" + media + " " + port;
        boolean first = false;
        for (String p : proto)
        {
            if (!first)
                value += "/";
            else
                first = false;
            value += p;
        }
        for (Integer f : formats)
            value += " " + f;
        value += "\r\n";
        //Rest of lines of media
        if (information!=null)
            value += information;
        for (Connection c : connections)
            value += c;
        for (Bandwitdh b : bandwitdhs)
            value += b;
        if (key!=null)
            value += key;
        for (Attribute b : attributes)
            value += b;
        return value;
    }

    public ArrayList<Attribute> getAttributes() {
        return attributes;
    }

    public ArrayList<Bandwitdh> getBandwitdhs() {
        return bandwitdhs;
    }

    public ArrayList<Connection> getConnections() {
        return connections;
    }

    public ArrayList<Integer> getFormats() {
        return formats;
    }

    public Information getInformation() {
        return information;
    }

    public Key getKey() {
        return key;
    }

    public String getMedia() {
        return media;
    }

    public Integer getPort() {
        return port;
    }

    public ArrayList<String> getProto() {
        return proto;
    }

    public void addFormat(Integer fmt) {
        formats.add(fmt);
    }
    public void addAttribute(Attribute attr) {
        attributes.add(attr);
    }

    public void addBandwidth(Bandwitdh bandwidth) {
        bandwitdhs.add(bandwidth);
    }

    public void addConnection(Connection connection) {
        connections.add(connection);
    }

    public void setInformation(Information information) {
        this.information = information;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public void setProtoString(String proto) {
        //tokenize proto
        StringTokenizer tokenizer = new StringTokenizer(proto, "/");
        //Tokenize
        while(tokenizer.hasMoreTokens())
            this.proto.add(tokenizer.nextToken());
    }

    public String getProtoString() {
        String value = null;
        for (String p : proto)
        {
            if (value==null)
                value = p;
            else
                value += "/" + p;
        }
        return value;
    }

    public String getFormatParameters(int fmt) {
        //For each attribute
        for (Attribute attr : attributes ) {
            //Check if it is a format attribute
            if (attr instanceof FormatAttribute)
            {
                //Conver it
                FormatAttribute fmtp = (FormatAttribute) attr;
                //Check if if is the ftmp type
                if (fmtp.getFmt()==fmt)
                    //return format paraeters
                    return fmtp.getParameters();
            }
        }
        return null;
    }

    public RTPMapAttribute getRTPMap(int fmt) {
        //For each attribute
        for (Attribute attr : attributes ) {
            //Check if it is a format attribute
            if (attr instanceof RTPMapAttribute)
            {
                //Conver it
                RTPMapAttribute rtmp = (RTPMapAttribute) attr;
                //Check if if is the ftmp type
                if (rtmp.getFormat()==fmt)
                    //return format paraeters
                    return rtmp;
            }
        }
        return null;
    }
}
