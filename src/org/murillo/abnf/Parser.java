/* -----------------------------------------------------------------------------
 * Parser.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.Parser 2.2
 * Produced : Tue Oct 08 15:39:13 CEST 2013
 *
 * -----------------------------------------------------------------------------
 */

package org.murillo.abnf;

import java.util.Stack;
import java.util.Properties;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.IOException;

public class Parser
{
  private Parser() {}

  static public void main(String[] args)
  {
    Properties arguments = new Properties();
    String error = "";
    boolean ok = args.length > 0;

    if (ok)
    {
      arguments.setProperty("Trace", "Off");
      arguments.setProperty("Rule", "session-description");

      for (int i = 0; i < args.length; i++)
      {
        if (args[i].equals("-trace"))
          arguments.setProperty("Trace", "On");
        else if (args[i].equals("-visitor"))
          arguments.setProperty("Visitor", args[++i]);
        else if (args[i].equals("-file"))
          arguments.setProperty("File", args[++i]);
        else if (args[i].equals("-string"))
          arguments.setProperty("String", args[++i]);
        else if (args[i].equals("-rule"))
          arguments.setProperty("Rule", args[++i]);
        else
        {
          error = "unknown argument: " + args[i];
          ok = false;
        }
      }
    }

    if (ok)
    {
      if (arguments.getProperty("File") == null &&
          arguments.getProperty("String") == null)
      {
        error = "insufficient arguments: -file or -string required";
        ok = false;
      }
    }

    if (!ok)
    {
      System.out.println("error: " + error);
      System.out.println("usage: Parser [-rule rulename] [-trace] <-file file | -string string> [-visitor visitor]");
    }
    else
    {
      try
      {
        Rule rule = null;

        if (arguments.getProperty("File") != null)
        {
          rule = 
            parse(
              arguments.getProperty("Rule"), 
              new File(arguments.getProperty("File")), 
              arguments.getProperty("Trace").equals("On"));
        }
        else if (arguments.getProperty("String") != null)
        {
          rule = 
            parse(
              arguments.getProperty("Rule"), 
              arguments.getProperty("String"), 
              arguments.getProperty("Trace").equals("On"));
        }

        if (arguments.getProperty("Visitor") != null)
        {
          Visitor visitor = 
            (Visitor)Class.forName(arguments.getProperty("Visitor")).newInstance();
          rule.accept(visitor);
        }
      }
      catch (IllegalArgumentException e)
      {
        System.out.println("argument error: " + e.getMessage());
      }
      catch (IOException e)
      {
        System.out.println("io error: " + e.getMessage());
      }
      catch (ParserException e)
      {
        System.out.println("parser error: " + e.getMessage());
      }
      catch (ClassNotFoundException e)
      {
        System.out.println("visitor error: class not found - " + e.getMessage());
      }
      catch (IllegalAccessException e)
      {
        System.out.println("visitor error: illegal access - " + e.getMessage());
      }
      catch (InstantiationException e)
      {
        System.out.println("visitor error: instantiation failure - " + e.getMessage());
      }
    }
  }

  static public Rule parse(String rulename, String string)
  throws IllegalArgumentException,
         ParserException
  {
    return parse(rulename, string, false);
  }

  static public Rule parse(String rulename, InputStream in)
  throws IllegalArgumentException,
         IOException,
         ParserException
  {
    return parse(rulename, in, false);
  }

  static public Rule parse(String rulename, File file)
  throws IllegalArgumentException,
         IOException,
         ParserException
  {
    return parse(rulename, file, false);
  }

  static private Rule parse(String rulename, String string, boolean trace)
  throws IllegalArgumentException,
         ParserException
  {
    if (rulename == null)
      throw new IllegalArgumentException("null rulename");
    if (string == null)
      throw new IllegalArgumentException("null string");

    ParserContext context = new ParserContext(string, trace);

    Rule rule = null;
    if (rulename.equalsIgnoreCase("session-description")) rule = Rule$session_description.parse(context);
    else if (rulename.equalsIgnoreCase("proto-version")) rule = Rule$proto_version.parse(context);
    else if (rulename.equalsIgnoreCase("origin-field")) rule = Rule$origin_field.parse(context);
    else if (rulename.equalsIgnoreCase("session-name-field")) rule = Rule$session_name_field.parse(context);
    else if (rulename.equalsIgnoreCase("information-field")) rule = Rule$information_field.parse(context);
    else if (rulename.equalsIgnoreCase("uri-field")) rule = Rule$uri_field.parse(context);
    else if (rulename.equalsIgnoreCase("email-fields")) rule = Rule$email_fields.parse(context);
    else if (rulename.equalsIgnoreCase("email-field")) rule = Rule$email_field.parse(context);
    else if (rulename.equalsIgnoreCase("phone-fields")) rule = Rule$phone_fields.parse(context);
    else if (rulename.equalsIgnoreCase("phone-field")) rule = Rule$phone_field.parse(context);
    else if (rulename.equalsIgnoreCase("connection-field")) rule = Rule$connection_field.parse(context);
    else if (rulename.equalsIgnoreCase("bandwidth-fields")) rule = Rule$bandwidth_fields.parse(context);
    else if (rulename.equalsIgnoreCase("bandwidth-field")) rule = Rule$bandwidth_field.parse(context);
    else if (rulename.equalsIgnoreCase("time-fields")) rule = Rule$time_fields.parse(context);
    else if (rulename.equalsIgnoreCase("time-repeat-field")) rule = Rule$time_repeat_field.parse(context);
    else if (rulename.equalsIgnoreCase("time-field")) rule = Rule$time_field.parse(context);
    else if (rulename.equalsIgnoreCase("repeat-field")) rule = Rule$repeat_field.parse(context);
    else if (rulename.equalsIgnoreCase("zone-adjustments")) rule = Rule$zone_adjustments.parse(context);
    else if (rulename.equalsIgnoreCase("key-field")) rule = Rule$key_field.parse(context);
    else if (rulename.equalsIgnoreCase("attribute-fields")) rule = Rule$attribute_fields.parse(context);
    else if (rulename.equalsIgnoreCase("attribute-field")) rule = Rule$attribute_field.parse(context);
    else if (rulename.equalsIgnoreCase("gen-attribute")) rule = Rule$gen_attribute.parse(context);
    else if (rulename.equalsIgnoreCase("fingerprint-attribute")) rule = Rule$fingerprint_attribute.parse(context);
    else if (rulename.equalsIgnoreCase("hash-func")) rule = Rule$hash_func.parse(context);
    else if (rulename.equalsIgnoreCase("fingerprint")) rule = Rule$fingerprint.parse(context);
    else if (rulename.equalsIgnoreCase("extmap-attribute")) rule = Rule$extmap_attribute.parse(context);
    else if (rulename.equalsIgnoreCase("extension-identifier")) rule = Rule$extension_identifier.parse(context);
    else if (rulename.equalsIgnoreCase("extension-name")) rule = Rule$extension_name.parse(context);
    else if (rulename.equalsIgnoreCase("direction")) rule = Rule$direction.parse(context);
    else if (rulename.equalsIgnoreCase("extension-attributes")) rule = Rule$extension_attributes.parse(context);
    else if (rulename.equalsIgnoreCase("candidate-attribute")) rule = Rule$candidate_attribute.parse(context);
    else if (rulename.equalsIgnoreCase("foundation")) rule = Rule$foundation.parse(context);
    else if (rulename.equalsIgnoreCase("component-id")) rule = Rule$component_id.parse(context);
    else if (rulename.equalsIgnoreCase("transport")) rule = Rule$transport.parse(context);
    else if (rulename.equalsIgnoreCase("transport-extension")) rule = Rule$transport_extension.parse(context);
    else if (rulename.equalsIgnoreCase("priority")) rule = Rule$priority.parse(context);
    else if (rulename.equalsIgnoreCase("cand-type")) rule = Rule$cand_type.parse(context);
    else if (rulename.equalsIgnoreCase("candidate-types")) rule = Rule$candidate_types.parse(context);
    else if (rulename.equalsIgnoreCase("rel-addr")) rule = Rule$rel_addr.parse(context);
    else if (rulename.equalsIgnoreCase("rel-port")) rule = Rule$rel_port.parse(context);
    else if (rulename.equalsIgnoreCase("extension-att")) rule = Rule$extension_att.parse(context);
    else if (rulename.equalsIgnoreCase("extension-att-name")) rule = Rule$extension_att_name.parse(context);
    else if (rulename.equalsIgnoreCase("extension-att-value")) rule = Rule$extension_att_value.parse(context);
    else if (rulename.equalsIgnoreCase("ice-char")) rule = Rule$ice_char.parse(context);
    else if (rulename.equalsIgnoreCase("crypto-attribute")) rule = Rule$crypto_attribute.parse(context);
    else if (rulename.equalsIgnoreCase("tag")) rule = Rule$tag.parse(context);
    else if (rulename.equalsIgnoreCase("crypto-suite")) rule = Rule$crypto_suite.parse(context);
    else if (rulename.equalsIgnoreCase("key-params")) rule = Rule$key_params.parse(context);
    else if (rulename.equalsIgnoreCase("key-param")) rule = Rule$key_param.parse(context);
    else if (rulename.equalsIgnoreCase("key-method")) rule = Rule$key_method.parse(context);
    else if (rulename.equalsIgnoreCase("key-method-ext")) rule = Rule$key_method_ext.parse(context);
    else if (rulename.equalsIgnoreCase("key-info")) rule = Rule$key_info.parse(context);
    else if (rulename.equalsIgnoreCase("session-param")) rule = Rule$session_param.parse(context);
    else if (rulename.equalsIgnoreCase("mid-attr")) rule = Rule$mid_attr.parse(context);
    else if (rulename.equalsIgnoreCase("identification-tag")) rule = Rule$identification_tag.parse(context);
    else if (rulename.equalsIgnoreCase("group-attr")) rule = Rule$group_attr.parse(context);
    else if (rulename.equalsIgnoreCase("group-semantics")) rule = Rule$group_semantics.parse(context);
    else if (rulename.equalsIgnoreCase("ssrc-attr")) rule = Rule$ssrc_attr.parse(context);
    else if (rulename.equalsIgnoreCase("ssrc-id")) rule = Rule$ssrc_id.parse(context);
    else if (rulename.equalsIgnoreCase("ssrc-group-attr")) rule = Rule$ssrc_group_attr.parse(context);
    else if (rulename.equalsIgnoreCase("ssrc-group-semantics")) rule = Rule$ssrc_group_semantics.parse(context);
    else if (rulename.equalsIgnoreCase("cname-attr")) rule = Rule$cname_attr.parse(context);
    else if (rulename.equalsIgnoreCase("cname")) rule = Rule$cname.parse(context);
    else if (rulename.equalsIgnoreCase("previous-ssrc-attr")) rule = Rule$previous_ssrc_attr.parse(context);
    else if (rulename.equalsIgnoreCase("rtpmap-attr")) rule = Rule$rtpmap_attr.parse(context);
    else if (rulename.equalsIgnoreCase("name")) rule = Rule$name.parse(context);
    else if (rulename.equalsIgnoreCase("rate")) rule = Rule$rate.parse(context);
    else if (rulename.equalsIgnoreCase("parameters")) rule = Rule$parameters.parse(context);
    else if (rulename.equalsIgnoreCase("fmtp-attr")) rule = Rule$fmtp_attr.parse(context);
    else if (rulename.equalsIgnoreCase("param-list")) rule = Rule$param_list.parse(context);
    else if (rulename.equalsIgnoreCase("media-descriptions")) rule = Rule$media_descriptions.parse(context);
    else if (rulename.equalsIgnoreCase("media-description")) rule = Rule$media_description.parse(context);
    else if (rulename.equalsIgnoreCase("media-field")) rule = Rule$media_field.parse(context);
    else if (rulename.equalsIgnoreCase("username")) rule = Rule$username.parse(context);
    else if (rulename.equalsIgnoreCase("sess-id")) rule = Rule$sess_id.parse(context);
    else if (rulename.equalsIgnoreCase("sess-version")) rule = Rule$sess_version.parse(context);
    else if (rulename.equalsIgnoreCase("nettype")) rule = Rule$nettype.parse(context);
    else if (rulename.equalsIgnoreCase("addrtype")) rule = Rule$addrtype.parse(context);
    else if (rulename.equalsIgnoreCase("email-address")) rule = Rule$email_address.parse(context);
    else if (rulename.equalsIgnoreCase("address-and-comment")) rule = Rule$address_and_comment.parse(context);
    else if (rulename.equalsIgnoreCase("dispname-and-address")) rule = Rule$dispname_and_address.parse(context);
    else if (rulename.equalsIgnoreCase("phone-number")) rule = Rule$phone_number.parse(context);
    else if (rulename.equalsIgnoreCase("phone")) rule = Rule$phone.parse(context);
    else if (rulename.equalsIgnoreCase("connection-address")) rule = Rule$connection_address.parse(context);
    else if (rulename.equalsIgnoreCase("unicast-address")) rule = Rule$unicast_address.parse(context);
    else if (rulename.equalsIgnoreCase("bwtype")) rule = Rule$bwtype.parse(context);
    else if (rulename.equalsIgnoreCase("bandwidth")) rule = Rule$bandwidth.parse(context);
    else if (rulename.equalsIgnoreCase("start-time")) rule = Rule$start_time.parse(context);
    else if (rulename.equalsIgnoreCase("stop-time")) rule = Rule$stop_time.parse(context);
    else if (rulename.equalsIgnoreCase("time")) rule = Rule$time.parse(context);
    else if (rulename.equalsIgnoreCase("repeat-interval")) rule = Rule$repeat_interval.parse(context);
    else if (rulename.equalsIgnoreCase("typed-time")) rule = Rule$typed_time.parse(context);
    else if (rulename.equalsIgnoreCase("fixed-len-time-unit")) rule = Rule$fixed_len_time_unit.parse(context);
    else if (rulename.equalsIgnoreCase("key-type")) rule = Rule$key_type.parse(context);
    else if (rulename.equalsIgnoreCase("prompt-key-type")) rule = Rule$prompt_key_type.parse(context);
    else if (rulename.equalsIgnoreCase("clear-key-type")) rule = Rule$clear_key_type.parse(context);
    else if (rulename.equalsIgnoreCase("base64-key-type")) rule = Rule$base64_key_type.parse(context);
    else if (rulename.equalsIgnoreCase("uri-key-type")) rule = Rule$uri_key_type.parse(context);
    else if (rulename.equalsIgnoreCase("base64")) rule = Rule$base64.parse(context);
    else if (rulename.equalsIgnoreCase("base64-unit")) rule = Rule$base64_unit.parse(context);
    else if (rulename.equalsIgnoreCase("base64-pad")) rule = Rule$base64_pad.parse(context);
    else if (rulename.equalsIgnoreCase("base64-char")) rule = Rule$base64_char.parse(context);
    else if (rulename.equalsIgnoreCase("attribute")) rule = Rule$attribute.parse(context);
    else if (rulename.equalsIgnoreCase("att-field")) rule = Rule$att_field.parse(context);
    else if (rulename.equalsIgnoreCase("att-value")) rule = Rule$att_value.parse(context);
    else if (rulename.equalsIgnoreCase("media")) rule = Rule$media.parse(context);
    else if (rulename.equalsIgnoreCase("fmt")) rule = Rule$fmt.parse(context);
    else if (rulename.equalsIgnoreCase("proto")) rule = Rule$proto.parse(context);
    else if (rulename.equalsIgnoreCase("port")) rule = Rule$port.parse(context);
    else if (rulename.equalsIgnoreCase("number-of-ports")) rule = Rule$number_of_ports.parse(context);
    else if (rulename.equalsIgnoreCase("IP4-multicast")) rule = Rule$IP4_multicast.parse(context);
    else if (rulename.equalsIgnoreCase("m1")) rule = Rule$m1.parse(context);
    else if (rulename.equalsIgnoreCase("IP6-multicast")) rule = Rule$IP6_multicast.parse(context);
    else if (rulename.equalsIgnoreCase("ttl")) rule = Rule$ttl.parse(context);
    else if (rulename.equalsIgnoreCase("FQDN")) rule = Rule$FQDN.parse(context);
    else if (rulename.equalsIgnoreCase("IP4-address")) rule = Rule$IP4_address.parse(context);
    else if (rulename.equalsIgnoreCase("b1")) rule = Rule$b1.parse(context);
    else if (rulename.equalsIgnoreCase("IP6-address")) rule = Rule$IP6_address.parse(context);
    else if (rulename.equalsIgnoreCase("hexpart")) rule = Rule$hexpart.parse(context);
    else if (rulename.equalsIgnoreCase("hexseq")) rule = Rule$hexseq.parse(context);
    else if (rulename.equalsIgnoreCase("email-safe")) rule = Rule$email_safe.parse(context);
    else if (rulename.equalsIgnoreCase("URI")) rule = Rule$URI.parse(context);
    else if (rulename.equalsIgnoreCase("hier-part")) rule = Rule$hier_part.parse(context);
    else if (rulename.equalsIgnoreCase("URI-reference")) rule = Rule$URI_reference.parse(context);
    else if (rulename.equalsIgnoreCase("absolute-URI")) rule = Rule$absolute_URI.parse(context);
    else if (rulename.equalsIgnoreCase("relative-ref")) rule = Rule$relative_ref.parse(context);
    else if (rulename.equalsIgnoreCase("relative-part")) rule = Rule$relative_part.parse(context);
    else if (rulename.equalsIgnoreCase("scheme")) rule = Rule$scheme.parse(context);
    else if (rulename.equalsIgnoreCase("authority")) rule = Rule$authority.parse(context);
    else if (rulename.equalsIgnoreCase("userinfo")) rule = Rule$userinfo.parse(context);
    else if (rulename.equalsIgnoreCase("host")) rule = Rule$host.parse(context);
    else if (rulename.equalsIgnoreCase("IP-literal")) rule = Rule$IP_literal.parse(context);
    else if (rulename.equalsIgnoreCase("IPvFuture")) rule = Rule$IPvFuture.parse(context);
    else if (rulename.equalsIgnoreCase("IPv6address")) rule = Rule$IPv6address.parse(context);
    else if (rulename.equalsIgnoreCase("h16")) rule = Rule$h16.parse(context);
    else if (rulename.equalsIgnoreCase("HEXDIG4")) rule = Rule$HEXDIG4.parse(context);
    else if (rulename.equalsIgnoreCase("ls32")) rule = Rule$ls32.parse(context);
    else if (rulename.equalsIgnoreCase("IPv4address")) rule = Rule$IPv4address.parse(context);
    else if (rulename.equalsIgnoreCase("dec-octet")) rule = Rule$dec_octet.parse(context);
    else if (rulename.equalsIgnoreCase("reg-name")) rule = Rule$reg_name.parse(context);
    else if (rulename.equalsIgnoreCase("path")) rule = Rule$path.parse(context);
    else if (rulename.equalsIgnoreCase("path-abempty")) rule = Rule$path_abempty.parse(context);
    else if (rulename.equalsIgnoreCase("path-absolute")) rule = Rule$path_absolute.parse(context);
    else if (rulename.equalsIgnoreCase("path-noscheme")) rule = Rule$path_noscheme.parse(context);
    else if (rulename.equalsIgnoreCase("path-rootless")) rule = Rule$path_rootless.parse(context);
    else if (rulename.equalsIgnoreCase("path-empty")) rule = Rule$path_empty.parse(context);
    else if (rulename.equalsIgnoreCase("segment")) rule = Rule$segment.parse(context);
    else if (rulename.equalsIgnoreCase("segment-nz")) rule = Rule$segment_nz.parse(context);
    else if (rulename.equalsIgnoreCase("segment-nz-nc")) rule = Rule$segment_nz_nc.parse(context);
    else if (rulename.equalsIgnoreCase("pchar")) rule = Rule$pchar.parse(context);
    else if (rulename.equalsIgnoreCase("query")) rule = Rule$query.parse(context);
    else if (rulename.equalsIgnoreCase("fragment")) rule = Rule$fragment.parse(context);
    else if (rulename.equalsIgnoreCase("pct-encoded")) rule = Rule$pct_encoded.parse(context);
    else if (rulename.equalsIgnoreCase("unreserved")) rule = Rule$unreserved.parse(context);
    else if (rulename.equalsIgnoreCase("reserved")) rule = Rule$reserved.parse(context);
    else if (rulename.equalsIgnoreCase("gen-delims")) rule = Rule$gen_delims.parse(context);
    else if (rulename.equalsIgnoreCase("sub-delims")) rule = Rule$sub_delims.parse(context);
    else if (rulename.equalsIgnoreCase("addr-spec")) rule = Rule$addr_spec.parse(context);
    else if (rulename.equalsIgnoreCase("local-part")) rule = Rule$local_part.parse(context);
    else if (rulename.equalsIgnoreCase("domain")) rule = Rule$domain.parse(context);
    else if (rulename.equalsIgnoreCase("domain-literal")) rule = Rule$domain_literal.parse(context);
    else if (rulename.equalsIgnoreCase("dcontent")) rule = Rule$dcontent.parse(context);
    else if (rulename.equalsIgnoreCase("dtext")) rule = Rule$dtext.parse(context);
    else if (rulename.equalsIgnoreCase("NO-WS-CTL")) rule = Rule$NO_WS_CTL.parse(context);
    else if (rulename.equalsIgnoreCase("quoted-pair")) rule = Rule$quoted_pair.parse(context);
    else if (rulename.equalsIgnoreCase("text")) rule = Rule$text.parse(context);
    else if (rulename.equalsIgnoreCase("FWS")) rule = Rule$FWS.parse(context);
    else if (rulename.equalsIgnoreCase("comment")) rule = Rule$comment.parse(context);
    else if (rulename.equalsIgnoreCase("ccontent")) rule = Rule$ccontent.parse(context);
    else if (rulename.equalsIgnoreCase("ctext")) rule = Rule$ctext.parse(context);
    else if (rulename.equalsIgnoreCase("dot-atom")) rule = Rule$dot_atom.parse(context);
    else if (rulename.equalsIgnoreCase("dot-atom-text")) rule = Rule$dot_atom_text.parse(context);
    else if (rulename.equalsIgnoreCase("atext")) rule = Rule$atext.parse(context);
    else if (rulename.equalsIgnoreCase("integer")) rule = Rule$integer.parse(context);
    else if (rulename.equalsIgnoreCase("alpha-numeric")) rule = Rule$alpha_numeric.parse(context);
    else if (rulename.equalsIgnoreCase("decimal-uchar")) rule = Rule$decimal_uchar.parse(context);
    else if (rulename.equalsIgnoreCase("decimal-uchar-1xx")) rule = Rule$decimal_uchar_1xx.parse(context);
    else if (rulename.equalsIgnoreCase("decimal-uchar-2xx")) rule = Rule$decimal_uchar_2xx.parse(context);
    else if (rulename.equalsIgnoreCase("decimal-uchar-25x")) rule = Rule$decimal_uchar_25x.parse(context);
    else if (rulename.equalsIgnoreCase("BIT")) rule = Rule$BIT.parse(context);
    else if (rulename.equalsIgnoreCase("CHAR")) rule = Rule$CHAR.parse(context);
    else if (rulename.equalsIgnoreCase("CR")) rule = Rule$CR.parse(context);
    else if (rulename.equalsIgnoreCase("CTL")) rule = Rule$CTL.parse(context);
    else if (rulename.equalsIgnoreCase("HEXDIG")) rule = Rule$HEXDIG.parse(context);
    else if (rulename.equalsIgnoreCase("HTAB")) rule = Rule$HTAB.parse(context);
    else if (rulename.equalsIgnoreCase("LF")) rule = Rule$LF.parse(context);
    else if (rulename.equalsIgnoreCase("LWSP")) rule = Rule$LWSP.parse(context);
    else if (rulename.equalsIgnoreCase("OCTET")) rule = Rule$OCTET.parse(context);
    else if (rulename.equalsIgnoreCase("SP")) rule = Rule$SP.parse(context);
    else if (rulename.equalsIgnoreCase("VCHAR")) rule = Rule$VCHAR.parse(context);
    else if (rulename.equalsIgnoreCase("quoted-string")) rule = Rule$quoted_string.parse(context);
    else if (rulename.equalsIgnoreCase("qcontent")) rule = Rule$qcontent.parse(context);
    else if (rulename.equalsIgnoreCase("qtext")) rule = Rule$qtext.parse(context);
    else if (rulename.equalsIgnoreCase("obs-local-part")) rule = Rule$obs_local_part.parse(context);
    else if (rulename.equalsIgnoreCase("obs-domain")) rule = Rule$obs_domain.parse(context);
    else if (rulename.equalsIgnoreCase("obs-FWS")) rule = Rule$obs_FWS.parse(context);
    else if (rulename.equalsIgnoreCase("obs-qp")) rule = Rule$obs_qp.parse(context);
    else if (rulename.equalsIgnoreCase("obs-text")) rule = Rule$obs_text.parse(context);
    else if (rulename.equalsIgnoreCase("obs-char")) rule = Rule$obs_char.parse(context);
    else if (rulename.equalsIgnoreCase("CFWS")) rule = Rule$CFWS.parse(context);
    else if (rulename.equalsIgnoreCase("WSP")) rule = Rule$WSP.parse(context);
    else if (rulename.equalsIgnoreCase("atom")) rule = Rule$atom.parse(context);
    else if (rulename.equalsIgnoreCase("word")) rule = Rule$word.parse(context);
    else if (rulename.equalsIgnoreCase("hex4")) rule = Rule$hex4.parse(context);
    else if (rulename.equalsIgnoreCase("extn-addr")) rule = Rule$extn_addr.parse(context);
    else if (rulename.equalsIgnoreCase("non-ws-string")) rule = Rule$non_ws_string.parse(context);
    else if (rulename.equalsIgnoreCase("byte-string")) rule = Rule$byte_string.parse(context);
    else if (rulename.equalsIgnoreCase("CRLF")) rule = Rule$CRLF.parse(context);
    else if (rulename.equalsIgnoreCase("token")) rule = Rule$token.parse(context);
    else if (rulename.equalsIgnoreCase("ALPHA")) rule = Rule$ALPHA.parse(context);
    else if (rulename.equalsIgnoreCase("DIGIT")) rule = Rule$DIGIT.parse(context);
    else if (rulename.equalsIgnoreCase("POS-DIGIT")) rule = Rule$POS_DIGIT.parse(context);
    else if (rulename.equalsIgnoreCase("DQUOTE")) rule = Rule$DQUOTE.parse(context);
    else throw new IllegalArgumentException("unknown rule");

    if (rule == null)
    {
      throw new ParserException(
        "rule \"" + (String)context.getErrorStack().peek() + "\" failed",
        context.text,
        context.getErrorIndex(),
        context.getErrorStack());
    }

    if (context.text.length() > context.index)
    {
      ParserException primaryError = 
        new ParserException(
          "extra data found",
          context.text,
          context.index,
          new Stack<String>());

      if (context.getErrorIndex() > context.index)
      {
        ParserException secondaryError = 
          new ParserException(
            "rule \"" + (String)context.getErrorStack().peek() + "\" failed",
            context.text,
            context.getErrorIndex(),
            context.getErrorStack());

        primaryError.initCause(secondaryError);
      }

      throw primaryError;
    }

    return rule;
  }

  static private Rule parse(String rulename, InputStream in, boolean trace)
  throws IllegalArgumentException,
         IOException,
         ParserException
  {
    if (rulename == null)
      throw new IllegalArgumentException("null rulename");
    if (in == null)
      throw new IllegalArgumentException("null input stream");

    int ch = 0;
    StringBuffer out = new StringBuffer();
    while ((ch = in.read()) != -1)
      out.append((char)ch);

    return parse(rulename, out.toString(), trace);
  }

  static private Rule parse(String rulename, File file, boolean trace)
  throws IllegalArgumentException,
         IOException,
         ParserException
  {
    if (rulename == null)
      throw new IllegalArgumentException("null rulename");
    if (file == null)
      throw new IllegalArgumentException("null file");

    BufferedReader in = new BufferedReader(new FileReader(file));
    int ch = 0;
    StringBuffer out = new StringBuffer();
    while ((ch = in.read()) != -1)
      out.append((char)ch);

    in.close();

    return parse(rulename, out.toString(), trace);
  }
}

/* -----------------------------------------------------------------------------
 * eof
 * -----------------------------------------------------------------------------
 */
