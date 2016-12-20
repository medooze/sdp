/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.murillo.sdp.impl;

import java.util.ArrayList;
import org.murillo.abnf.*;
import org.murillo.abnf.precomp.ALPHA;
import org.murillo.abnf.precomp.ByteString;
import org.murillo.abnf.precomp.CRLF;
import org.murillo.abnf.precomp.Token;

/**
 *
 * @author Sergio
 */
class Builder implements Visitor {

	@Override
	public Object visit(Rule$URI rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$hier_part rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$URI_reference rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$absolute_URI rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$relative_ref rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$relative_part rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$scheme rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$authority rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$userinfo rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$host rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$IP_literal rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$IPvFuture rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$IPv6address rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$h16 rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$ls32 rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$IPv4address rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$dec_octet rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$reg_name rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$path rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$path_abempty rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$path_absolute rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$path_noscheme rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$path_rootless rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$path_empty rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$segment rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$segment_nz rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$segment_nz_nc rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$pchar rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$query rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$fragment rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$pct_encoded rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$unreserved rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$reserved rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$gen_delims rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$sub_delims rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$session_description rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$proto_version rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$origin_field rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$session_name_field rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$information_field rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$uri_field rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$email_fields rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$phone_fields rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$connection_field rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$bandwidth_fields rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$time_fields rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$zone_adjustments rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$key_field rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$attribute_fields rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$media_descriptions rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$media_field rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$username rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$sess_id rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$sess_version rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$nettype rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$addrtype rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$email_address rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$address_and_comment rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$dispname_and_address rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$phone_number rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$phone rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$connection_address rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$unicast_address rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$bwtype rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$bandwidth rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$start_time rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$stop_time rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$time rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$repeat_interval rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$typed_time rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$fixed_len_time_unit rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$key_type rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$base64 rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$base64_unit rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$base64_pad rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$base64_char rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$attribute rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$att_field rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$att_value rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$media rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$fmt rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$proto rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$port rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$IP4_multicast rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$m1 rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$IP6_multicast rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$ttl rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$FQDN rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$extn_addr rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$byte_string rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$non_ws_string rule) {
		return rule.toString();
	}

	@Override
	public Object visit(Rule$token rule) {
		return rule.toString();
	}

	@Override
	public Object visit(Rule$email_safe rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$integer rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$alpha_numeric rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$POS_DIGIT rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$decimal_uchar_1xx rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$decimal_uchar_2xx rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$decimal_uchar_25x rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$decimal_uchar rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$BIT rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$CHAR rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$CR rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$CTL rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$HEXDIG rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$HTAB rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$LF rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$LWSP rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$OCTET rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$SP rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$VCHAR rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$addr_spec rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$local_part rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$domain rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$domain_literal rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$dcontent rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$dtext rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$NO_WS_CTL rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$quoted_pair rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$text rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$FWS rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$CRLF rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$comment rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$ccontent rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$ctext rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$dot_atom rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$dot_atom_text rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$atext rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$ALPHA rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$DIGIT rule) {
		return Integer.parseInt((String) visitRules(rule.rules));
	}

	@Override
	public Object visit(Rule$quoted_string rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$DQUOTE rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$qcontent rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$qtext rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$obs_local_part rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$obs_domain rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$obs_FWS rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$obs_qp rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$obs_text rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$obs_char rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$CFWS rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$WSP rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$atom rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$word rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Terminal$StringValue value) {
		return value.toString();
	}

	@Override
	public Object visit(Terminal$NumericValue value) {
		return value.toString();
	}

	protected Object visitRules(ArrayList<Rule> rules) {
		//Check size
		if (rules.size() == 1) //Return value
		{
			return rules.get(0).accept(this);
		}
		ArrayList<Object> values = new ArrayList<Object>(rules.size());
		for (Rule rule : rules) {
			values.add(rule.accept(this));
		}
		return values;
	}

	@Override
	public Object visit(Rule$email_field rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$phone_field rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$bandwidth_field rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$time_field rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$repeat_field rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$attribute_field rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$mid_attr rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$identification_tag rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$group_attr rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$group_semantics rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$ssrc_attr rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$ssrc_id rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$ssrc_group_attr rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$ssrc_group_semantics rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$cname_attr rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$cname rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$previous_ssrc_attr rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$rtpmap_attr rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$name rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$rate rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$parameters rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$fmtp_attr rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$param_list rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$media_description rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$gen_attribute rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Token rule) {
		return rule.toString();
	}

	@Override
	public Object visit(CRLF rule) {
		return rule.toString();
	}

	@Override
	public Object visit(ALPHA rule) {
		return rule.toString();
	}

	@Override
	public Object visit(ByteString rule) {
		return rule.toString();
	}

	@Override
	public Object visit(Rule$time_repeat_field rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$prompt_key_type rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$clear_key_type rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$base64_key_type rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$uri_key_type rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$number_of_ports rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$crypto_attribute rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$tag rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$crypto_suite rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$key_params rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$key_param rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$key_method rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$key_method_ext rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$key_info rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$session_param rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$candidate_attribute rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$foundation rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$component_id rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$transport rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$transport_extension rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$priority rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$cand_type rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$candidate_types rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$rel_addr rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$rel_port rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$extension_att rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$extension_att_name rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$extension_att_value rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$ice_char rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$extmap_attribute rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$extension_identifier rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$extension_name rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$direction rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$extension_attributes rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$fingerprint_attribute rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$hash_func rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$fingerprint rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$sctpmap_attr rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$sctpmap_number rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$app rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$streams rule) {
		return visitRules(rule.rules);
	}

	@Override
	public Object visit(Rule$EQUALS rule) {
		return visitRules(rule.rules);
	}
}
