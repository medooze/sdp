/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp.impl;
import org.murillo.abnf.Rule$group_attr;
import org.murillo.abnf.Rule$identification_tag;
import org.murillo.abnf.Rule$group_semantics;
import org.murillo.sdp.GroupAttribute;
/**
 *
 * @author Sergio
 */
class GroupAttributeBuilder extends Builder {

    private GroupAttribute group;

     @Override
    public Object visit(Rule$group_attr rule) {
        //New attr
        group = new GroupAttribute();
        //Generate it
        super.visit(rule);
        //Return it
        return group;
    }

    @Override
    public Object visit(Rule$identification_tag rule) {
        //Get type
        String tag = rule.toString();
        //Set type
        group.addTag(tag);
        //Return it
        return tag;
    }
    @Override
    public Object visit(Rule$group_semantics rule) {
        //Get type
        String semantics = rule.toString();
        //Set type
        group.setSemantics(semantics);
        //Return it
        return semantics;
    }
}
