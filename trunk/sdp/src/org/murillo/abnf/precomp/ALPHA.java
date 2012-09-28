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

import org.murillo.abnf.ParserContext;
import org.murillo.abnf.Rule;
import org.murillo.abnf.Visitor;

final public class ALPHA extends Rule {

    private ALPHA(String value) {
        super(value, null);
    }

    public static Rule parse(ParserContext context) {

        context.push("ALPHA");

        ALPHA alpha = null;
        boolean parsed = false;

        try
        {
            //Get char
            char c = context.text.charAt(context.index);
            //ALPHA = %x41-5A / %x61-7A
            if ((c>=0x41 && c<=0x5A) || (c>=0x61 && c<=0x7A))
            {
                //Parserd
                parsed = true;
                //Create token
                alpha = new ALPHA(Character.toString(c));
                //Increase index
                context.index++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        context.pop("ALPHA", parsed);

        return alpha;
    }

    @Override
    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
   
}
