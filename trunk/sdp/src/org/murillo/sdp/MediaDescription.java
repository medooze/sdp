/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/**
 *
 * @author Sergio
 */
public class MediaDescription {

    private String media;
    private Integer port;
    private Integer numberOfPorts;
    private ArrayList<String> proto;
    private ArrayList<String> formats;
    private Information information;
    private ArrayList<Connection> connections;
    private ArrayList<Bandwidth> bandwidths;
    private ArrayList<Attribute> attributes;
    private Key key;

    public MediaDescription() {
        //Create arrays
        proto = new ArrayList<String>();
        formats = new ArrayList<String>();
        connections = new ArrayList<Connection>();
        bandwidths = new ArrayList<Bandwidth>();
        attributes = new ArrayList<Attribute>();
    }

    public MediaDescription(String media, Integer port, String proto) {
        //initialize
        this();
        //Set
        this.media = media;
        this.port = port;
        //tokenize proto
        StringTokenizer tokenizer = new StringTokenizer(proto, "/");
        //Tokenize
        while(tokenizer.hasMoreTokens())
            this.proto.add(tokenizer.nextToken());
    }
    
    public MediaDescription clone() {
		//Serialize protocol
		String value = "";
		boolean first = true;
		for (String p : proto)
		{
		    if (!first)
			value += "/";
		    else
			first = false;
		    value += p;
		}
		//Create new media
		MediaDescription cloned = new MediaDescription(media, port, value);
		//For each format
		for (String format : formats)
			//Add it
			cloned.addFormat(format);
		//For each connection
		for (Connection connection: connections)
			//Add it
			cloned.addConnection(connection.clone());
		//For each bandwidth
		for (Bandwidth bandwidth: bandwidths)
			//Add it
			cloned.addBandwidth(bandwidth.clone());
		//For each connection
		for (Attribute attribute: attributes)
			//Add it
			cloned.addAttribute(attribute.clone());
		
		//Return cloned one
		return cloned;
    }
	

    @Override
    public String toString() {
        //Create media line
        String value ="m=" + media + " " + port;
        if (numberOfPorts!=null)
            value += "/"+numberOfPorts;
        value +=" ";
        boolean first = true;
        for (String p : proto)
        {
            if (!first)
                value += "/";
            else
                first = false;
            value += p;
        }
        for (String f : formats)
            value += " " + f;
        value += "\r\n";
        //Rest of lines of media
        if (information!=null)
            value += information;
        for (Connection c : connections)
            value += c;
        for (Bandwidth b : bandwidths)
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

    public ArrayList<Bandwidth> getBandwidths() {
        return bandwidths;
    }

    public ArrayList<Connection> getConnections() {
        return connections;
    }

    public ArrayList<String> getFormats() {
        return formats;
    }

    public String getFormatString() {
        String value = "";
        for (String f : formats)
        {
            if (value.isEmpty())
                value += f;
            else
                value += " " + f;
        }
        return value;
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


    public void addFormat(String fmt) {
        formats.add(fmt);
    }

    public void addFormat(Integer fmt) {
        formats.add(fmt.toString());
    }

    public void setFormats(List<String> formats) {
        //Clean formas
        this.formats.clear();
        //Add all formats
        this.formats.addAll(formats);
    }

    public void addAttribute(Attribute attr) {
        attributes.add(attr);
    }

    public void addBandwidth(Bandwidth bandwidth) {
        bandwidths.add(bandwidth);
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

    public Map<String,String> getFormatParameters(int fmt) {
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
        for (Attribute attr : attributes )
        {
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

    public Attribute getAttribute(String key) {
        //For each attribute
        for (Attribute attr : attributes )
            //Check if the one searhced
            if (attr.getField().equalsIgnoreCase(key))
                //Found
                return attr;
        //Not found
        return null;
    }

    public ArrayList<Attribute> getAttributes(String key) {
	//Create list
	ArrayList<Attribute> attrs = new ArrayList<Attribute>();
        //For each attribute
        for (Attribute attr : attributes )
            //Check if the one searhced
            if (attr.getField().equalsIgnoreCase(key))
                //Found
                attrs.add(attr);
        //Not found
        return attrs;
    }

    public void addBandwidth(String type, Integer bandwidth) {
        addBandwidth(new Bandwidth(type,bandwidth));
    }

    public void addBandwidth(String type, String bandwidth) {
        addBandwidth(new Bandwidth(type,bandwidth));
    }

    public void addAttribute(String field) {
        //Add attribute
        addAttribute(new BaseAttribute(field));
    }

    public void addAttribute(String field, String value) {
        //Add attribute
        addAttribute(new BaseAttribute(field,value));
    }

    public void addAttribute(String field, Integer value) {
        //Add attribute
        addAttribute(new BaseAttribute(field,value));
    }

    public void addRTPMapAttribute(Integer format, String name, int rate) {
        addAttribute( new RTPMapAttribute(format, name, rate));
    }

    public void addRTPMapAttribute(Integer format, String name, int rate, String parameters) {
        addAttribute( new RTPMapAttribute(format, name, rate, parameters));
    }

    public void addFormatAttribute(Integer format, String parameters) {
        addAttribute(new FormatAttribute(format,parameters));
    }

    public void addCandidate(String fundation, Integer componentId, String transport, Integer priority, String address, Integer port, String type) {
        addAttribute(new CandidateAttribute(fundation, componentId, transport, priority, address, port, type));
    }
    public void setNumberOfPorts(Integer number) {
        numberOfPorts = number;
    }

    public Integer getNumberOfPorts() {
        return numberOfPorts;
    }

    public boolean hasAttribute(String key) {
        //For each attribute
        for (Attribute attr : attributes )
            //Check if the one searhced
            if (attr.getField().equalsIgnoreCase(key))
                //Found
                return true;
        //Not found
        return false;
    }

    public void removeAttribute(Attribute attr){
        //remove attribute
        attributes.remove(attr);
    }
}
