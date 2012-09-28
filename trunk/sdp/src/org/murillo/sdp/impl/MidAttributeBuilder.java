/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp.impl;

import org.murillo.sdp.MidAttribute;
import org.murillo.abnf.Rule$mid_attr;
import org.murillo.abnf.Rule$identification_tag;
/**
 *
 * @author Sergio
 */
class MidAttributeBuilder extends Builder {
    private MidAttribute mid;

    @Override
    public Object visit(Rule$mid_attr rule) {
        //New attr
        mid = new MidAttribute();
        //Generate it
        super.visit(rule);
        //Return it
        return mid;
    }

    @Override
    public Object visit(Rule$identification_tag rule) {
        //Get type
        String tag = rule.toString();
        //Set type
        mid.setIdentificationTag(tag);
        //Return it
        return tag;
    }
}
