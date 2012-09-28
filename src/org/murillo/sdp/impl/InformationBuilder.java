/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp.impl;

import org.murillo.sdp.Information;
import org.murillo.abnf.Rule$information_field;
/**
 *
 * @author Sergio
 */
class InformationBuilder extends Builder  {

   
    @Override
    public Object visit(Rule$information_field rule) {
        //Create new session name
        Information info = new Information();
        //visit it
        String text = rule.rules.get(2).toString();
        //Set it
        info.setText(text);
        //Return it
        return info;
    }
}
