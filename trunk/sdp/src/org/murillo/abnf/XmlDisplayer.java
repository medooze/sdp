/* -----------------------------------------------------------------------------
 * XmlDisplayer.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.Parser 2.2
 * Produced : Thu Jan 17 00:30:49 CET 2013
 *
 * -----------------------------------------------------------------------------
 */

package org.murillo.abnf;

import java.util.ArrayList;

public class XmlDisplayer implements Visitor
{
  private boolean terminal = true;

  public Object visit(Rule$session_description rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<session-description>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</session-description>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$proto_version rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<proto-version>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</proto-version>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$origin_field rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<origin-field>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</origin-field>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$session_name_field rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<session-name-field>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</session-name-field>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$information_field rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<information-field>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</information-field>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$uri_field rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<uri-field>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</uri-field>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$email_fields rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<email-fields>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</email-fields>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$email_field rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<email-field>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</email-field>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$phone_fields rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<phone-fields>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</phone-fields>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$phone_field rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<phone-field>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</phone-field>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$connection_field rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<connection-field>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</connection-field>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$bandwidth_fields rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<bandwidth-fields>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</bandwidth-fields>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$bandwidth_field rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<bandwidth-field>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</bandwidth-field>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$time_fields rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<time-fields>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</time-fields>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$time_repeat_field rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<time-repeat-field>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</time-repeat-field>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$time_field rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<time-field>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</time-field>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$repeat_field rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<repeat-field>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</repeat-field>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$zone_adjustments rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<zone-adjustments>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</zone-adjustments>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$key_field rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<key-field>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</key-field>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$attribute_fields rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<attribute-fields>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</attribute-fields>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$attribute_field rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<attribute-field>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</attribute-field>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$gen_attribute rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<gen-attribute>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</gen-attribute>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$candidate_attribute rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<candidate-attribute>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</candidate-attribute>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$foundation rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<foundation>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</foundation>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$component_id rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<component-id>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</component-id>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$transport rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<transport>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</transport>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$transport_extension rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<transport-extension>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</transport-extension>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$priority rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<priority>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</priority>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$cand_type rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cand-type>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cand-type>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$candidate_types rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<candidate-types>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</candidate-types>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$rel_addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<rel-addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</rel-addr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$rel_port rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<rel-port>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</rel-port>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$extension_att rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<extension-att>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</extension-att>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$extension_att_name rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<extension-att-name>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</extension-att-name>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$extension_att_value rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<extension-att-value>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</extension-att-value>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$ice_char rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<ice-char>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</ice-char>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$crypto_attribute rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<crypto-attribute>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</crypto-attribute>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$tag rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<tag>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</tag>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$crypto_suite rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<crypto-suite>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</crypto-suite>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$key_params rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<key-params>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</key-params>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$key_param rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<key-param>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</key-param>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$key_method rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<key-method>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</key-method>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$key_method_ext rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<key-method-ext>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</key-method-ext>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$key_info rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<key-info>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</key-info>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$session_param rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<session-param>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</session-param>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$mid_attr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<mid-attr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</mid-attr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$identification_tag rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<identification-tag>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</identification-tag>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$group_attr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<group-attr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</group-attr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$group_semantics rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<group-semantics>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</group-semantics>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$ssrc_attr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<ssrc-attr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</ssrc-attr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$ssrc_id rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<ssrc-id>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</ssrc-id>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$ssrc_group_attr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<ssrc-group-attr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</ssrc-group-attr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$ssrc_group_semantics rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<ssrc-group-semantics>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</ssrc-group-semantics>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$cname_attr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cname-attr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cname-attr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$cname rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cname>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cname>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$previous_ssrc_attr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<previous-ssrc-attr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</previous-ssrc-attr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$rtpmap_attr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<rtpmap-attr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</rtpmap-attr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$name rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<name>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</name>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$rate rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<rate>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</rate>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$parameters rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<parameters>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</parameters>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$fmtp_attr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<fmtp-attr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</fmtp-attr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$param_list rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<param-list>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</param-list>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$media_descriptions rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<media-descriptions>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</media-descriptions>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$media_description rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<media-description>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</media-description>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$media_field rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<media-field>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</media-field>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$username rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<username>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</username>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$sess_id rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<sess-id>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</sess-id>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$sess_version rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<sess-version>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</sess-version>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$nettype rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<nettype>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</nettype>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$addrtype rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<addrtype>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</addrtype>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$email_address rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<email-address>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</email-address>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$address_and_comment rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<address-and-comment>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</address-and-comment>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$dispname_and_address rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dispname-and-address>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dispname-and-address>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$phone_number rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<phone-number>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</phone-number>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$phone rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<phone>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</phone>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$connection_address rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<connection-address>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</connection-address>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$unicast_address rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<unicast-address>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</unicast-address>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$bwtype rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<bwtype>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</bwtype>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$bandwidth rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<bandwidth>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</bandwidth>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$start_time rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<start-time>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</start-time>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$stop_time rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<stop-time>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</stop-time>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$time rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<time>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</time>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$repeat_interval rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<repeat-interval>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</repeat-interval>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$typed_time rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<typed-time>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</typed-time>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$fixed_len_time_unit rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<fixed-len-time-unit>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</fixed-len-time-unit>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$key_type rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<key-type>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</key-type>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$prompt_key_type rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<prompt-key-type>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</prompt-key-type>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$clear_key_type rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<clear-key-type>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</clear-key-type>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$base64_key_type rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<base64-key-type>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</base64-key-type>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$uri_key_type rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<uri-key-type>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</uri-key-type>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$base64 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<base64>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</base64>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$base64_unit rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<base64-unit>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</base64-unit>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$base64_pad rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<base64-pad>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</base64-pad>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$base64_char rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<base64-char>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</base64-char>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$attribute rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<attribute>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</attribute>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$att_field rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<att-field>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</att-field>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$att_value rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<att-value>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</att-value>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$media rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<media>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</media>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$fmt rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<fmt>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</fmt>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$proto rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<proto>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</proto>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$port rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<port>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</port>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$number_of_ports rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<number-of-ports>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</number-of-ports>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$IP4_multicast rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<IP4-multicast>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</IP4-multicast>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$m1 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<m1>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</m1>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$IP6_multicast rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<IP6-multicast>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</IP6-multicast>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$ttl rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<ttl>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</ttl>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$FQDN rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<FQDN>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</FQDN>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$IP4_address rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<IP4-address>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</IP4-address>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$b1 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<b1>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</b1>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$IP6_address rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<IP6-address>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</IP6-address>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$hexpart rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<hexpart>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</hexpart>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$hexseq rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<hexseq>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</hexseq>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$email_safe rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<email-safe>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</email-safe>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$URI rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<URI>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</URI>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$hier_part rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<hier-part>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</hier-part>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$URI_reference rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<URI-reference>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</URI-reference>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$absolute_URI rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<absolute-URI>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</absolute-URI>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$relative_ref rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<relative-ref>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</relative-ref>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$relative_part rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<relative-part>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</relative-part>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$scheme rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<scheme>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</scheme>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$authority rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<authority>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</authority>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$userinfo rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<userinfo>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</userinfo>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$host rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<host>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</host>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$IP_literal rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<IP-literal>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</IP-literal>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$IPvFuture rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<IPvFuture>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</IPvFuture>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$IPv6address rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<IPv6address>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</IPv6address>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$h16 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<h16>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</h16>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$HEXDIG4 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<HEXDIG4>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</HEXDIG4>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$ls32 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<ls32>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</ls32>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$IPv4address rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<IPv4address>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</IPv4address>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$dec_octet rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dec-octet>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dec-octet>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$reg_name rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<reg-name>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</reg-name>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$path rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<path>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</path>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$path_abempty rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<path-abempty>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</path-abempty>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$path_absolute rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<path-absolute>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</path-absolute>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$path_noscheme rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<path-noscheme>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</path-noscheme>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$path_rootless rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<path-rootless>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</path-rootless>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$path_empty rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<path-empty>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</path-empty>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$segment rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<segment>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</segment>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$segment_nz rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<segment-nz>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</segment-nz>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$segment_nz_nc rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<segment-nz-nc>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</segment-nz-nc>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$pchar rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<pchar>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</pchar>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$query rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<query>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</query>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$fragment rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<fragment>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</fragment>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$pct_encoded rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<pct-encoded>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</pct-encoded>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$unreserved rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<unreserved>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</unreserved>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$reserved rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<reserved>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</reserved>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$gen_delims rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<gen-delims>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</gen-delims>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$sub_delims rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<sub-delims>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</sub-delims>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$addr_spec rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<addr-spec>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</addr-spec>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$local_part rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<local-part>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</local-part>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$domain rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<domain>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</domain>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$domain_literal rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<domain-literal>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</domain-literal>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$dcontent rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dcontent>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dcontent>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$dtext rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dtext>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dtext>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$NO_WS_CTL rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<NO-WS-CTL>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</NO-WS-CTL>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$quoted_pair rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<quoted-pair>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</quoted-pair>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$text rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<text>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</text>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$FWS rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<FWS>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</FWS>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$comment rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<comment>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</comment>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$ccontent rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<ccontent>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</ccontent>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$ctext rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<ctext>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</ctext>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$dot_atom rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dot-atom>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dot-atom>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$dot_atom_text rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dot-atom-text>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dot-atom-text>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$atext rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<atext>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</atext>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$integer rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<integer>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</integer>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$alpha_numeric rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<alpha-numeric>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</alpha-numeric>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$decimal_uchar rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<decimal-uchar>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</decimal-uchar>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$decimal_uchar_1xx rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<decimal-uchar-1xx>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</decimal-uchar-1xx>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$decimal_uchar_2xx rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<decimal-uchar-2xx>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</decimal-uchar-2xx>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$decimal_uchar_25x rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<decimal-uchar-25x>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</decimal-uchar-25x>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$BIT rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<BIT>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</BIT>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$CHAR rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<CHAR>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</CHAR>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$CR rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<CR>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</CR>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$CTL rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<CTL>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</CTL>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$HEXDIG rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<HEXDIG>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</HEXDIG>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$HTAB rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<HTAB>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</HTAB>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$LF rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<LF>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</LF>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$LWSP rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<LWSP>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</LWSP>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$OCTET rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<OCTET>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</OCTET>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$SP rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<SP>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</SP>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$VCHAR rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<VCHAR>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</VCHAR>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$quoted_string rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<quoted-string>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</quoted-string>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$qcontent rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<qcontent>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</qcontent>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$qtext rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<qtext>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</qtext>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$obs_local_part rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<obs-local-part>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</obs-local-part>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$obs_domain rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<obs-domain>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</obs-domain>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$obs_FWS rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<obs-FWS>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</obs-FWS>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$obs_qp rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<obs-qp>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</obs-qp>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$obs_text rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<obs-text>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</obs-text>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$obs_char rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<obs-char>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</obs-char>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$CFWS rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<CFWS>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</CFWS>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$WSP rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<WSP>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</WSP>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$atom rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<atom>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</atom>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$word rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<word>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</word>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$hex4 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<hex4>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</hex4>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$extn_addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<extn-addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</extn-addr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$non_ws_string rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<non-ws-string>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</non-ws-string>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$byte_string rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<byte-string>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</byte-string>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$CRLF rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<CRLF>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</CRLF>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$token rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<token>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</token>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$ALPHA rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<ALPHA>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</ALPHA>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$DIGIT rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<DIGIT>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</DIGIT>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$POS_DIGIT rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<POS-DIGIT>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</POS-DIGIT>");
    terminal = false;
    return null;
  }

  public Object visit(Rule$DQUOTE rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<DQUOTE>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</DQUOTE>");
    terminal = false;
    return null;
  }

  public Object visit(org.murillo.abnf.precomp.Token rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<org.murillo.abnf.precomp.Token>");
    System.out.print(rule.spelling);
    System.out.print("</org.murillo.abnf.precomp.Token>");
    terminal = false;
    return null;
  }

  public Object visit(org.murillo.abnf.precomp.ByteString rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<org.murillo.abnf.precomp.ByteString>");
    System.out.print(rule.spelling);
    System.out.print("</org.murillo.abnf.precomp.ByteString>");
    terminal = false;
    return null;
  }

  public Object visit(org.murillo.abnf.precomp.CRLF rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<org.murillo.abnf.precomp.CRLF>");
    System.out.print(rule.spelling);
    System.out.print("</org.murillo.abnf.precomp.CRLF>");
    terminal = false;
    return null;
  }

  public Object visit(org.murillo.abnf.precomp.ALPHA rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<org.murillo.abnf.precomp.ALPHA>");
    System.out.print(rule.spelling);
    System.out.print("</org.murillo.abnf.precomp.ALPHA>");
    terminal = false;
    return null;
  }

  public Object visit(Terminal$StringValue value)
  {
    System.out.print(value.spelling);
    terminal = true;
    return null;
  }

  public Object visit(Terminal$NumericValue value)
  {
    System.out.print(value.spelling);
    terminal = true;
    return null;
  }

  private Boolean visitRules(ArrayList<Rule> rules)
  {
    for (Rule rule : rules)
      rule.accept(this);
    return null;
  }
}

/* -----------------------------------------------------------------------------
 * eof
 * -----------------------------------------------------------------------------
 */
