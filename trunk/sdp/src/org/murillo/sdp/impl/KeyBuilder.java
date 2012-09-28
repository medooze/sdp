/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp.impl;

import org.murillo.sdp.Key;
import org.murillo.abnf.Rule$key_field;
import org.murillo.abnf.Rule$clear_key_type;
import org.murillo.abnf.Rule$prompt_key_type;
import org.murillo.abnf.Rule$base64_key_type;
import org.murillo.abnf.Rule$uri_key_type;
/**
 *
 * @author Sergio
 */
class KeyBuilder extends Builder {

   private Key key;

    @Override
    public Object visit(Rule$key_field rule) {
        //New kwy
        key = new Key();
        //Generate it
        super.visit(rule);
        //Return it
        return key;
    }

    @Override
    public Object visit(Rule$prompt_key_type rule) {
        //Get type
        String type = rule.toString();
        //Set type
        key.setType(type);
        //Return it
        return type;
    }

    @Override
    public Object visit(Rule$clear_key_type rule) {
        //Get type and key
        String type = rule.rules.get(0).toString();
        String k = rule.rules.get(2).toString();
        //Set type
        key.setType(type);
        //Set type
        key.setKey(k);
        //Return it
        return rule.toString();
    }

    @Override
    public Object visit(Rule$base64_key_type rule) {
        //Get type and key
        String type = rule.rules.get(0).toString();
        String k = rule.rules.get(2).toString();
        //Set type
        key.setType(type);
        //Set type
        key.setKey(k);
        //Return it
        return rule.toString();
    }

    @Override
    public Object visit(Rule$uri_key_type rule) {
        //Get type and key
        String type = rule.rules.get(0).toString();
        String k = rule.rules.get(2).toString();
        //Set type
        key.setType(type);
        //Set type
        key.setKey(k);
        //Return it
        return rule.toString();
    }
    
}
