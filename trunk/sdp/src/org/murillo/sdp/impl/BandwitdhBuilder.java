/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp.impl;
import  org.murillo.sdp.Bandwidth;
import  org.murillo.abnf.Rule$bandwidth;
import  org.murillo.abnf.Rule$bandwidth_field;
import  org.murillo.abnf.Rule$bwtype;

/**
 *
 * @author Sergio
 */
class BandwitdhBuilder extends Builder {

    private Bandwidth bandwidth;

    @Override
    public Object visit(Rule$bandwidth_field rule) {
        //Create object
        bandwidth = new Bandwidth();
        //Generate
        visitRules(rule.rules);
        //Return it
        return bandwidth;
    }


    @Override
    public Object visit(Rule$bandwidth rule) {
        //Generate
        String b = rule.toString();
        //Set it
        bandwidth.setBandwidth(b);
        //Return it
        return b;
    }

    @Override
    public Object visit(Rule$bwtype rule) {
        //Generate
        String type = rule.toString();
        //Set
        bandwidth.setType(type);;
        //Return it
        return type;
    }
}
