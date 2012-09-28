/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp.impl;

import org.murillo.abnf.Rule$rtpmap_attr;
import org.murillo.abnf.Rule$fmt;
import org.murillo.abnf.Rule$name;
import org.murillo.abnf.Rule$rate;
import org.murillo.abnf.Rule$parameters;
import org.murillo.sdp.RTPMapAttribute;

/**
 *
 * @author Sergio
 */
public class RTPMapAttributeBuilder extends Builder {
    private RTPMapAttribute attr;

    @Override
    public Object visit(Rule$rtpmap_attr rule) {
        //New attr
        attr = new RTPMapAttribute();
        //Generate it
        super.visit(rule);
        //Return it
        return attr;
    }

    @Override
    public Object visit(Rule$fmt rule) {
        //Get type
        Integer fmt = Integer.parseInt(rule.toString());
        //Set type
        attr.setFormat(fmt);
        //Return it
        return fmt;
    }

    @Override
    public Object visit(Rule$name rule) {
        //Get type
        String name = rule.toString();
        //Set type
        attr.setName(name);
        //Return it
        return name;
    }

    @Override
    public Object visit(Rule$rate rule) {
        //Get type
        Integer rate = Integer.parseInt(rule.toString());
        //Set type
        attr.setRate(rate);
        //Return it
        return rate;
    }

    @Override
    public Object visit(Rule$parameters rule) {
        //Get type
        String parameters = rule.toString();
        //Set type
        attr.setParameters(parameters);
        //Return it
        return parameters;
    }
}
