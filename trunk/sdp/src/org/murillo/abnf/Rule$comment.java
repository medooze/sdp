/* -----------------------------------------------------------------------------
 * Rule$comment.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.Parser 2.2
 * Produced : Thu Jan 17 00:30:49 CET 2013
 *
 * -----------------------------------------------------------------------------
 */

package org.murillo.abnf;

import java.util.ArrayList;

final public class Rule$comment extends Rule
{
  private Rule$comment(String spelling, ArrayList<Rule> rules)
  {
    super(spelling, rules);
  }

  public Object accept(Visitor visitor)
  {
    return visitor.visit(this);
  }

  public static Rule$comment parse(ParserContext context)
  {
    context.push("comment");

    boolean parsed = true;
    int s0 = context.index;
    ArrayList<Rule> e0 = new ArrayList<Rule>();
    Rule rule;

    parsed = false;
    if (!parsed)
    {
      {
        ArrayList<Rule> e1 = new ArrayList<Rule>();
        int s1 = context.index;
        parsed = true;
        if (parsed)
        {
          boolean f1 = true;
          int c1 = 0;
          for (int i1 = 0; i1 < 1 && f1; i1++)
          {
            rule = Terminal$StringValue.parse(context, "(");
            if ((f1 = rule != null))
            {
              e1.add(rule);
              c1++;
            }
          }
          parsed = c1 == 1;
        }
        if (parsed)
        {
          boolean f1 = true;
          int c1 = 0;
          for (int i1 = 0; f1; i1++)
          {
            int g1 = context.index;
            parsed = false;
            if (!parsed)
            {
              {
                ArrayList<Rule> e2 = new ArrayList<Rule>();
                int s2 = context.index;
                parsed = true;
                if (parsed)
                {
                  boolean f2 = true;
                  int c2 = 0;
                  for (int i2 = 0; i2 < 1 && f2; i2++)
                  {
                    int g2 = context.index;
                    parsed = false;
                    if (!parsed)
                    {
                      {
                        ArrayList<Rule> e3 = new ArrayList<Rule>();
                        int s3 = context.index;
                        parsed = true;
                        if (parsed)
                        {
                          boolean f3 = true;
                          int c3 = 0;
                          for (int i3 = 0; i3 < 1 && f3; i3++)
                          {
                            rule = Rule$FWS.parse(context);
                            if ((f3 = rule != null))
                            {
                              e3.add(rule);
                              c3++;
                            }
                          }
                          parsed = c3 == 1;
                        }
                        if (parsed)
                          e2.addAll(e3);
                        else
                          context.index = s3;
                      }
                    }
                    if (context.index > g2) c2++;
                    f2 = c2 > i2;
                  }
                  parsed = true;
                }
                if (parsed)
                {
                  boolean f2 = true;
                  int c2 = 0;
                  for (int i2 = 0; i2 < 1 && f2; i2++)
                  {
                    rule = Rule$ccontent.parse(context);
                    if ((f2 = rule != null))
                    {
                      e2.add(rule);
                      c2++;
                    }
                  }
                  parsed = c2 == 1;
                }
                if (parsed)
                  e1.addAll(e2);
                else
                  context.index = s2;
              }
            }
            if (context.index > g1) c1++;
            f1 = c1 > i1;
          }
          parsed = true;
        }
        if (parsed)
        {
          boolean f1 = true;
          int c1 = 0;
          for (int i1 = 0; i1 < 1 && f1; i1++)
          {
            int g1 = context.index;
            parsed = false;
            if (!parsed)
            {
              {
                ArrayList<Rule> e2 = new ArrayList<Rule>();
                int s2 = context.index;
                parsed = true;
                if (parsed)
                {
                  boolean f2 = true;
                  int c2 = 0;
                  for (int i2 = 0; i2 < 1 && f2; i2++)
                  {
                    rule = Rule$FWS.parse(context);
                    if ((f2 = rule != null))
                    {
                      e2.add(rule);
                      c2++;
                    }
                  }
                  parsed = c2 == 1;
                }
                if (parsed)
                  e1.addAll(e2);
                else
                  context.index = s2;
              }
            }
            if (context.index > g1) c1++;
            f1 = c1 > i1;
          }
          parsed = true;
        }
        if (parsed)
        {
          boolean f1 = true;
          int c1 = 0;
          for (int i1 = 0; i1 < 1 && f1; i1++)
          {
            rule = Terminal$StringValue.parse(context, ")");
            if ((f1 = rule != null))
            {
              e1.add(rule);
              c1++;
            }
          }
          parsed = c1 == 1;
        }
        if (parsed)
          e0.addAll(e1);
        else
          context.index = s1;
      }
    }

    rule = null;
    if (parsed)
      rule = new Rule$comment(context.text.substring(s0, context.index), e0);
    else
      context.index = s0;

    context.pop("comment", parsed);

    return (Rule$comment)rule;
  }
}

/* -----------------------------------------------------------------------------
 * eof
 * -----------------------------------------------------------------------------
 */
