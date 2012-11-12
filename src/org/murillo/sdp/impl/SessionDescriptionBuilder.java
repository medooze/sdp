/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.murillo.sdp.impl;

import java.net.URI;
import java.net.URISyntaxException;
import org.murillo.abnf.Rule$bandwidth_field;
import org.murillo.abnf.Rule$connection_field;
import org.murillo.abnf.Rule$information_field;
import org.murillo.abnf.Rule$key_field;
import org.murillo.abnf.Rule$session_description;
import org.murillo.abnf.Rule$media_description;
import org.murillo.abnf.Rule$origin_field;
import org.murillo.abnf.Rule$phone_field;
import org.murillo.abnf.Rule$attribute_field;
import org.murillo.abnf.Rule$time_repeat_field;
import org.murillo.abnf.Rule$proto_version;
import org.murillo.abnf.Rule$session_name_field;
import org.murillo.abnf.Rule$email_field;
import org.murillo.abnf.Rule$uri_field;
import org.murillo.abnf.Rule$DIGIT;
import org.murillo.sdp.Attribute;
import org.murillo.sdp.Bandwidth;
import org.murillo.sdp.Connection;
import org.murillo.sdp.Information;
import org.murillo.sdp.Key;
import org.murillo.sdp.MediaDescription;
import org.murillo.sdp.SessionDescription;
import org.murillo.sdp.SessionName;
import org.murillo.sdp.Origin;
import org.murillo.sdp.Time;
/**
 *
 * @author Sergio
 */
public class SessionDescriptionBuilder  extends Builder {

    private SessionDescription sdp = null;

   @Override
    public Object visit(Rule$session_description rule) {
       //Create object
       sdp = new SessionDescription();
       //Parse all the rules
       visitRules(rule.rules);
       //Return it
       return sdp;
    }

    @Override
    public Object visit(Rule$proto_version rule) {
       //Parse digit
       Integer version = (Integer)super.visit((Rule$DIGIT)rule.rules.get(2));
       //Set it
       sdp.setVersion(version);
       //Return it
       return version;
    }

    @Override
    public Object visit(Rule$origin_field rule) {
        //Create new origin object
        OriginBuilder builder = new OriginBuilder();
        //Get origin
        Origin origin = (Origin) builder.visit(rule);
        //Generate
        sdp.setOrigin(origin);
        //Return it
        return origin;
    }

    @Override
    public Object visit(Rule$session_name_field rule) {
        //Create builder
        SessionNameBuilder builder = new SessionNameBuilder();
        //Generate
        SessionName name = (SessionName)builder.visit(rule);
        //Add
        sdp.setSessionName(name);
        //Return it
        return name;
    }

    @Override
    public Object visit(Rule$information_field rule) {
        //Create new session name
        InformationBuilder builder = new InformationBuilder();
        //Generate
        Information info = (Information) builder.visit(rule);
        //Set it
        sdp.setInformation(info);
        //Return it
        return info;
    }

    @Override
    public Object visit(Rule$attribute_field rule) {
        //Create new session name
        AttributeBuilder builder = new AttributeBuilder();
        //Generate
        Attribute attr = (Attribute) builder.visit(rule);
        //Set it
        sdp.addAttribute(attr);
        //Return it
        return attr;
    }

    @Override
    public Object visit(Rule$uri_field rule) {
        URI uri = null;
        //Check size
        if (rule.rules.isEmpty())
            //Noting
            return null;
        try {
            //Generate
            uri = new URI(rule.rules.get(2).toString());
            //Set it
            sdp.setUri(uri);
        } catch (URISyntaxException ex) {
        }
        //Return it
        return uri;
    }

    @Override
    public Object visit(Rule$email_field rule) {
        //Parse it
        String email = rule.rules.get(2).toString();
        //Add it
        sdp.addEmail(email);
        //return it
        return email;
    }

    @Override
    public Object visit(Rule$phone_field rule) {
        //Parse it
        String phone = rule.rules.get(2).toString();
        //Add it
        sdp.addPhone(phone);
        //return it
        return phone;
    }

    @Override
    public Object visit(Rule$connection_field rule) {
        //Create builder
        ConnectionBuilder builder = new ConnectionBuilder();
        //Parse it
        Connection connection = (Connection)builder.visit(rule);
        //Set it
        sdp.setConnection(connection);
        //Return connection
        return connection;
    }

    @Override
    public Object visit(Rule$bandwidth_field rule) {
        //Create builder
        BandwitdhBuilder builder = new BandwitdhBuilder();
        //Generate it
        Bandwidth bandwith = (Bandwidth)builder.visit(rule);
        //Add it
        sdp.addBandwidth(bandwith);
        //Return it
        return bandwith;
    }

    @Override
    public Object visit(Rule$time_repeat_field rule) {
        //Create builder
        TimeBuilder builder = new TimeBuilder();
        //Generate it
        Time time = (Time)builder.visit(rule);
        //Add it
        sdp.addTime(time);
        //Return it
        return time;
    }

    @Override
    public Object visit(Rule$key_field rule) {
        //Create builder
        KeyBuilder builder = new KeyBuilder();
        //Generate it
        Key key = (Key)builder.visit(rule);
        //Add it
        sdp.setKey(key);
        //Return it
        return key;
    }

    @Override
    public Object visit(Rule$media_description rule) {
        //Create builder
        MediaDescriptionBuilder builder = new MediaDescriptionBuilder();
        //Generate it
        MediaDescription media = (MediaDescription)builder.visit(rule);
        //Add to medias
        sdp.addMedia(media);
        //Return it
        return media;
    }
}

