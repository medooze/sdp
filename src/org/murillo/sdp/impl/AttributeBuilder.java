/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp.impl;

import org.murillo.abnf.Rule$attribute_field;
import org.murillo.abnf.Rule$mid_attr;
import org.murillo.abnf.Rule$group_attr;
import org.murillo.abnf.Rule$ssrc_attr;
import org.murillo.abnf.Rule$ssrc_group_attr;
import org.murillo.abnf.Rule$cname_attr;
import org.murillo.abnf.Rule$previous_ssrc_attr;
import org.murillo.abnf.Rule$rtpmap_attr;
import org.murillo.abnf.Rule$attribute;
import org.murillo.abnf.Rule$fmtp_attr;
import org.murillo.abnf.Rule$crypto_attribute;
import org.murillo.abnf.Rule$candidate_attribute;
import org.murillo.abnf.Rule$extmap_attribute;
import org.murillo.abnf.Rule$fingerprint_attribute;
import org.murillo.abnf.Rule$sctpmap_attr;
import org.murillo.sdp.Attribute;
import org.murillo.sdp.BaseAttribute;
import org.murillo.sdp.CNameAttribute;
import org.murillo.sdp.CandidateAttribute;
import org.murillo.sdp.CryptoAttribute;
import org.murillo.sdp.FormatAttribute;
import org.murillo.sdp.GroupAttribute;
import org.murillo.sdp.MidAttribute;
import org.murillo.sdp.PreviousSSRCAttribute;
import org.murillo.sdp.RTPMapAttribute;
import org.murillo.sdp.SSRCAttribute;
import org.murillo.sdp.SSRCGroupAttribute;
import org.murillo.sdp.ExtMapAttribute;
import org.murillo.sdp.FingerprintAttribute;
import org.murillo.sdp.SCTPMapAttribute;


/**
 *
 * @author Sergio
 */
class AttributeBuilder extends Builder {

    private Attribute attr;

    @Override
    public Object visit(Rule$attribute_field rule) {
        //Reset
        attr = null;
        //Generate
        super.visit(rule);
        //Return it
        return attr;
    }

    @Override
    public Object visit(Rule$mid_attr rule) {
        //Get builder
        MidAttributeBuilder builder = new MidAttributeBuilder();
        //build it
        attr = (MidAttribute)builder.visit(rule);
        //Return it
        return attr;
    }

    @Override
    public Object visit(Rule$group_attr rule) {
        //Get builder
        GroupAttributeBuilder builder = new GroupAttributeBuilder();
        //build it
        attr = (GroupAttribute)builder.visit(rule);
        //Return it
        return attr;
    }

    @Override
    public Object visit(Rule$ssrc_attr rule) {
        //Get builder
        SSRCAttributeBuilder builder = new SSRCAttributeBuilder();
        //build it
        attr = (SSRCAttribute)builder.visit(rule);
        //Return it
        return attr;
    }

    @Override
    public Object visit(Rule$rtpmap_attr rule) {
        //Get builder
        RTPMapAttributeBuilder builder = new RTPMapAttributeBuilder();
        //build it
        attr = (RTPMapAttribute)builder.visit(rule);
        //Return it
        return attr;
    }

    @Override
    public Object visit(Rule$fmtp_attr rule) {
        //Get builder
        FormatAttributeBuilder builder = new FormatAttributeBuilder();
        //build it
        attr = (FormatAttribute)builder.visit(rule);
        //Return it
        return attr;
    }

    @Override
    public Object visit(Rule$ssrc_group_attr rule) {
        //Get builder
        SSRCGroupAttributeBuilder builder = new SSRCGroupAttributeBuilder();
        //build it
        attr = (SSRCGroupAttribute)builder.visit(rule);
        //Return it
        return attr;
    }

    @Override
    public Object visit(Rule$cname_attr rule) {
        //Get builder
        CNameAttributeBuilder builder = new CNameAttributeBuilder();
        //build it
        attr = (CNameAttribute)builder.visit(rule);
        //Return it
        return attr;
    }

    @Override
    public Object visit(Rule$previous_ssrc_attr rule) {
        //Get builder
        PreviousSSRCAttributeBuilder builder = new PreviousSSRCAttributeBuilder();
        //build it
        attr = (PreviousSSRCAttribute)builder.visit(rule);
        //Return it
        return attr;
    }

    @Override
    public Object visit(Rule$attribute rule) {
        //Get builder
        BaseAttributeBuilder builder = new BaseAttributeBuilder();
        //build it
        attr = (BaseAttribute)builder.visit(rule);
        //Return it
        return attr;
    }

    @Override
    public Object visit(Rule$crypto_attribute rule) {
        //Get builder
        CryptoAttributeBuilder builder = new CryptoAttributeBuilder();
        //build it
        attr = (CryptoAttribute)builder.visit(rule);
        //Return it
        return attr;
    }

    @Override
    public Object visit(Rule$candidate_attribute rule) {
        //Get builder
        CandidateAttributeBuilder builder = new CandidateAttributeBuilder();
        //build it
        attr = (CandidateAttribute)builder.visit(rule);
        //Return it
        return attr;
    }
    
    @Override
    public Object visit(Rule$extmap_attribute rule) {
        //Get builder
        ExtMapAttributeBuilder builder = new ExtMapAttributeBuilder();
        //build it
        attr = (ExtMapAttribute)builder.visit(rule);
        //Return it
        return attr;
    }

    @Override
    public Object visit(Rule$fingerprint_attribute rule) {
	//Get builder
        FingerprintAttributeBuilder builder = new FingerprintAttributeBuilder();
        //build it
        attr = (FingerprintAttribute)builder.visit(rule);
        //Return it
        return attr;
    }
    
    @Override
    public Object visit(Rule$sctpmap_attr rule) {
	//Get builder
        SCTPMapAttributeBuilder builder = new SCTPMapAttributeBuilder();
        //build it
        attr = (SCTPMapAttribute)builder.visit(rule);
        //Return it
        return attr;
    }
}
