/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp.impl;

import org.murillo.sdp.BaseAttribute;
import org.murillo.abnf.Rule$attribute;
import org.murillo.abnf.Rule$att_field;
import org.murillo.abnf.Rule$att_value;
/**
 *
 * @author Sergio
 */
class BaseAttributeBuilder extends Builder {

    private BaseAttribute attr;

    @Override
    public Object visit(Rule$attribute rule) {
        //New attr
        attr = new BaseAttribute();
        //Generate it
        super.visit(rule);
        //Return it
        return attr;
    }

    @Override
    public Object visit(Rule$att_field rule) {
        //Get type
        String field = rule.toString();
        //Set type
        attr.setField(field);
        //Return it
        return field;
    }

    @Override
    public Object visit(Rule$att_value rule) {
        //Get type
        String value = rule.toString();
        //Set type
        attr.setValue(value);
        //Return it
        return value;
    }
}
