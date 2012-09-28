/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.murillo.sdp;

import java.net.URI;
import java.util.ArrayList;
import java.util.Stack;
import org.murillo.abnf.ParserContext;
import org.murillo.abnf.ParserException;
import org.murillo.abnf.Rule$session_description;
import org.murillo.sdp.impl.SessionDescriptionBuilder;
/**
 *
 * @author Sergio
 */
public class SessionDescription {

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
    private ArrayList<Bandwitdh> bandwidths;
    private ArrayList<Attribute> attributes;
    private Key key;
    private ArrayList<Time> times;
    private ArrayList<MediaDescription> medias;

    public SessionDescription() {
        //Create arrays
        emails = new ArrayList<String>();
        phones = new ArrayList<String>();
        bandwidths = new ArrayList<Bandwitdh>();
        attributes = new ArrayList<Attribute>();
        times = new ArrayList<Time>();
        medias = new ArrayList<MediaDescription>();
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

    public void addBandwidth(Bandwitdh bandwith) {
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


}

