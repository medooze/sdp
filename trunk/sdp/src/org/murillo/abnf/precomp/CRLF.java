/* -----------------------------------------------------------------------------
 * Rule$CRLF.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.Parser 2.2
 * Produced : Thu Aug 16 23:27:55 CEST 2012
 *
 * -----------------------------------------------------------------------------
 */
package org.murillo.abnf.precomp;

import java.util.ArrayList;
import org.murillo.abnf.ParserContext;
import org.murillo.abnf.Rule;
import org.murillo.abnf.Visitor;

final public class CRLF extends Rule {

    private CRLF(String spelling, ArrayList<Rule> rules) {
        super(spelling, rules);
    }

    public static Rule parse(ParserContext context) {
        context.push("CRLF");

        boolean parsed = true;

        CRLF stringValue = null;
        try {
            String value =
                    context.text.substring(
                    context.index,
                    context.index + 2);

            if ((parsed = value.equalsIgnoreCase("\r\n"))) {
                context.index += 2;
                stringValue = new CRLF(value, null);
            }
        } catch (IndexOutOfBoundsException e) {
            parsed = false;
        }

        context.pop("CRLF", parsed);

        return stringValue;
    }
    
    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
