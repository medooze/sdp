/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp.impl;

import org.murillo.sdp.PreviousSSRCAttribute;
import  org.murillo.abnf.Rule$previous_ssrc_attr;
import  org.murillo.abnf.Rule$ssrc_id;

/**
 *
 * @author Sergio
 */
class PreviousSSRCAttributeBuilder extends Builder {

    private PreviousSSRCAttribute previous;

    @Override
    public Object visit(Rule$previous_ssrc_attr rule) {
        //New attr
        previous = new PreviousSSRCAttribute();
        //Generate it
        super.visit(rule);
        //Return it
        return previous;
    }

    @Override
    public Object visit(Rule$ssrc_id rule) {
        //Get value
        String ssrc = rule.toString();
        //Set value
        previous.addSSRC(ssrc);
        //Return it
        return ssrc;
    }
}
