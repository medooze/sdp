/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp.impl;

import org.murillo.sdp.SessionName;
import org.murillo.abnf.Rule$session_name_field;

/**
 *
 * @author Sergio
 */
class SessionNameBuilder extends Builder {

    @Override
    public Object visit(Rule$session_name_field rule) {
        //Create object
        SessionName sessionName = new SessionName();
        //Get value
        String value = rule.rules.get(2).toString();
        //Set value
        sessionName.setName(value);
        //Return it
        return sessionName;
    }

}
