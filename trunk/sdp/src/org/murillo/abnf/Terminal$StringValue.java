/* -----------------------------------------------------------------------------
 * Terminal$StringValue.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.Parser 2.2
 * Produced : Mon Mar 23 16:37:55 CET 2015
 *
 * -----------------------------------------------------------------------------
 */

package org.murillo.abnf;

import java.util.ArrayList;

public class Terminal$StringValue extends Rule
{
  private Terminal$StringValue(String spelling, ArrayList<Rule> rules)
  {
    super(spelling, rules);
  }

  public static Terminal$StringValue parse(
    ParserContext context, 
    String regex)
  {
    context.push("StringValue", regex);

    boolean parsed = true;

    Terminal$StringValue stringValue = null;
    try
    {
      String value = 
        context.text.substring(
          context.index, 
          context.index + regex.length());

      if ((parsed = value.equalsIgnoreCase(regex)))
      {
        context.index += regex.length();
        stringValue = new Terminal$StringValue(value, null);
      }
    }
    catch (IndexOutOfBoundsException e) {parsed = false;}

    context.pop("StringValue", parsed);

    return stringValue;
  }

  public Object accept(Visitor visitor)
  {
    return visitor.visit(this);
  }
}
/* -----------------------------------------------------------------------------
 * eof
 * -----------------------------------------------------------------------------
 */
