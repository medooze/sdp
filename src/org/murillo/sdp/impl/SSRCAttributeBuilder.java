/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp.impl;

import org.murillo.sdp.SSRCAttribute;
import org.murillo.abnf.Rule$ssrc_attr;
import org.murillo.abnf.Rule$ssrc_id;
import org.murillo.abnf.Rule$att_field;
import org.murillo.abnf.Rule$att_value;
/**
 *
 * @author Sergio
 */
class SSRCAttributeBuilder extends Builder {

    private SSRCAttribute ssrc;

    @Override
    public Object visit(Rule$ssrc_attr rule) {
        //New attr
        ssrc = new SSRCAttribute();
        //Generate it
        super.visit(rule);
        //Return it
        return ssrc;
    }

    @Override
    public Object visit(Rule$ssrc_id rule) {
        //Get type
        Long ssrcId = Long.parseLong(rule.toString());
        //Set type
        ssrc.setSSRC(ssrcId);
        //Return it
        return ssrcId;
    }
    
    @Override
    public Object visit(Rule$att_field rule) {
        //Get type
        String field = rule.toString();
        //Set type
        ssrc.setAttrField(field);
        //Return it
        return field;
    }

    @Override
    public Object visit(Rule$att_value rule) {
        //Get type
        String value = rule.toString();
        //Set type
        ssrc.setAttrValue(value);
        //Return it
        return value;
    }
}
