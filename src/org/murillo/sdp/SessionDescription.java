/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.murillo.sdp;

import java.net.URI;
import java.util.ArrayList;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.murillo.abnf.ParserContext;
import org.murillo.abnf.Rule$session_description;
import org.murillo.sdp.impl.SessionDescriptionBuilder;
/**
 *
 * @author Sergio
 */
public class SessionDescription {

    static public SessionDescription Parse(byte[] body) throws IllegalArgumentException, ParserException
    {
        return Parse(new String(body));
    }
    
    static public SessionDescription Clone(SessionDescription sdp) {
	return sdp.clone();
    }
    
    static public SessionDescription Parse(String string) throws IllegalArgumentException, ParserException
    {
       ParserContext context = new ParserContext(string, false);

        Rule$session_description rule = Rule$session_description.parse(context);

        if (rule == null)
        {
            throw new ParserException(
                    "rule \"" + (String) context.getErrorStack().peek() + "\" failed",
                    context.text,
                    context.getErrorIndex(),
                    context.getErrorStack());
        }

        if (context.text.length() > context.index)
        {
            ParserException primaryError =
                    new ParserException(
                    "extra data found",
                    context.text,
                    context.index,
                    new Stack<String>());

            if (context.getErrorIndex() > context.index)
            {
                ParserException secondaryError =
                        new ParserException(
                        "rule \"" + (String) context.getErrorStack().peek() + "\" failed",
                        context.text,
                        context.getErrorIndex(),
                        context.getErrorStack());

                primaryError.initCause(secondaryError);
            }

            throw primaryError;
        }
        //Create builder
        SessionDescriptionBuilder buider = new SessionDescriptionBuilder();
        //And make it visit the object
        return (SessionDescription) buider.visit(rule);
    }

    private Integer version;
    private Origin origin;
    private URI uri;
    private SessionName sessionName;
    private Information information;
    private ArrayList<String> emails;
    private ArrayList<String> phones;
    private Connection connection;
    private ArrayList<Bandwidth> bandwidths;
    private ArrayList<Attribute> attributes;
    private Key key;
    private ArrayList<Time> times;
    private ArrayList<MediaDescription> medias;

    public SessionDescription() {
        //Set version
        version = 0;
        //Create arrays
        emails = new ArrayList<String>();
        phones = new ArrayList<String>();
        bandwidths = new ArrayList<Bandwidth>();
        attributes = new ArrayList<Attribute>();
        times = new ArrayList<Time>();
        medias = new ArrayList<MediaDescription>();
    }
    
    public String getA() {return "a";}

    @Override
    public SessionDescription clone() {
	//Create clone
	SessionDescription cloned = new SessionDescription();
	//Clone data
	cloned.setVersion(version);
	if (origin!=null)	cloned.setOrigin(origin.clone());
	if (sessionName!=null)	cloned.setSessionName(sessionName.clone());
	if (information!=null)	cloned.setInformation(information.clone());
	if (connection!=null)	cloned.setConnection(connection.clone());
	if (key!=null)		cloned.setKey(key.clone());
	//For each email
	for (String email: emails)
	    //Add it
	    cloned.addEmail(email);
	//For each phone
	for (String phone: phones)
	    //Add it
	    cloned.addPhone(phone);
	//For each bandwidth
	for (Bandwidth bandwidth: bandwidths)
		//Add it
		cloned.addBandwidth(bandwidth.clone());
	//For each connection
	for (Attribute attribute: attributes)
		//Add it
		cloned.addAttribute(attribute.clone());
	//For each connection
	for (Attribute attribute: attributes)
		//Add it
		cloned.addAttribute(attribute.clone());
	//For each time
	for (Time time: times)
		//Add it
		cloned.addTime(time.clone());
	//For each media
	for (MediaDescription media: medias)
		//Add it
		cloned.addMedia(media.clone());
	//return it
	return cloned;
    }
    
    @Override
    public String toString() {
        String sdp = "v="+version+"\r\n";
        sdp+=origin.toString();
        sdp+=sessionName.toString();
        if (uri!=null)
            sdp+="u="+uri.toString();
        for (String email:emails)
            sdp+="e="+email+"\r\n";
        for (String phone:phones)
            sdp+="p="+phone+"\r\n";
        if (connection!=null)
            sdp+=connection.toString();
        for (Time time:times)
            sdp+=time.toString();
        for (Attribute attr:attributes)
            sdp+=attr.toString();
        for (MediaDescription media:medias)
            sdp+=media.toString();
        return sdp;
    }

    public ArrayList<Attribute> getAttributes() {
        return attributes;
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

    public void setAttributes(ArrayList<Attribute> attributes) {
        this.attributes = attributes;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public ArrayList<String> getEmails() {
        return emails;
    }

    public void setEmails(ArrayList<String> emails) {
        this.emails = emails;
    }

    public Information getInformation() {
        return information;
    }

    public void setInformation(Information information) {
        this.information = information;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public ArrayList<MediaDescription> getMedias() {
        return medias;
    }

    public void setMedias(ArrayList<MediaDescription> medias) {
        this.medias = medias;
    }

    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public ArrayList<String> getPhones() {
        return phones;
    }

    public void setPhones(ArrayList<String> phones) {
        this.phones = phones;
    }

    public SessionName getSessionName() {
        return sessionName;
    }
    
    public void setSessionName(String sessionName) {
        this.sessionName = new SessionName(sessionName);
    }

    public void setSessionName(SessionName sessionName) {
        this.sessionName = sessionName;
    }

    public ArrayList<Time> getTimes() {
        return times;
    }

    public void setTimes(ArrayList<Time> times) {
        this.times = times;
    }

    public URI getUri() {
        return uri;
    }

    public void setUri(URI uri) {
        this.uri = uri;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public void addEmail(String email) {
        emails.add(email);
    }

    public void addPhone(String email) {
        emails.add(email);
    }
    
    public void addBandwidth(String type, Integer bandwidth) {
        addBandwidth(new Bandwidth(type,bandwidth));
    }

    public void addBandwidth(String type, String bandwidth) {
        addBandwidth(new Bandwidth(type,bandwidth));
    }

    public void addBandwidth(Bandwidth bandwith) {
        bandwidths.add(bandwith);
    }

    public void addMedia(MediaDescription media) {
        medias.add(media);
    }

    public void addTime(Time time) {
        times.add(time);
    }

    public void addAttribute(Attribute attr) {
        attributes.add(attr);
    }

    public ArrayList<Bandwidth> getBandwidths() {
        return bandwidths;
    }

    public void setOrigin(String username, Long sessId, Long sessVersion, String nettype, String addrtype, String address) {
        setOrigin(new Origin(username, sessId, sessVersion, nettype, addrtype, address));
    }
    
    public void setOrigin(String username, Integer sessId, Long sessVersion, String nettype, String addrtype, String address) {
        setOrigin(new Origin(username, sessId.longValue(), sessVersion, nettype, addrtype, address));
    }
    
    public void setOrigin(String username, Integer sessId, Integer sessVersion, String nettype, String addrtype, String address) {
        setOrigin(new Origin(username, sessId.longValue(), sessVersion.longValue(), nettype, addrtype, address));
    }

    public void setConnection(String netType, String addrType, String address) {
        setConnection(new Connection(netType, addrType, address));
    }

    public void addTime(int start, int stop) {
        addTime( new Time(start, stop));
    }

    public void addAttribute(String attr) {
        addAttribute( new BaseAttribute(attr));
    }

    public void addAttribute(String attr, String value) {
        addAttribute( new BaseAttribute(attr,value));
    }

  static public void main(String[] args)
  {
	  SessionDescription sdp = new SessionDescription();
	  Origin origin = new Origin("-", 0L, 0L, "IN", "IP4", "127.0.0.1");
	  sdp.setOrigin(origin);
	  sdp.setSessionName("test");
	  sdp.addMedia(new MediaDescription("aduio", 0, "UDP/AVP"));
	  SessionDescription cloned = sdp.clone();
	  System.out.println(sdp.toString());
	  System.out.println(cloned.toString());
	  
	  origin.setSessId(1);
	  System.out.println(sdp.toString());
	  System.out.println(cloned.toString());
	  
	    try {
		    sdp = SessionDescription.Parse("v=0\r\n" +
			"o=- 3803220250780278427 2 IN IP4 127.0.0.1\r\n" +
			"s=-\r\n" +
			"t=0 0\r\n" +
			"a=msid-semantic: WMS\r\n" +
			"m=application 50895 DTLS/SCTP 5000\r\n" +
			"a=sctpmap:5000 webrtc-datachannel 1024\r\n");
		    
		    MediaDescription datachannel = sdp.getMedias().get(0);
		    SCTPMapAttribute sctpmap = (SCTPMapAttribute)datachannel.getAttributes("sctpmap").get(0);
		    System.out.println(sctpmap.toString());
	    } catch (IllegalArgumentException ex) {
		    Logger.getLogger(SessionDescription.class.getName()).log(Level.SEVERE, null, ex);
	    } catch (ParserException ex) {
		    Logger.getLogger(SessionDescription.class.getName()).log(Level.SEVERE, null, ex);
	    }
  }
}

