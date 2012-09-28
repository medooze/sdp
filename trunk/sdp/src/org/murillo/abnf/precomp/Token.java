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

final public class Token extends Rule {

    private Token(String token) {
        super(token, null);
    }

    public static Rule parse(ParserContext context) {

        context.push("Token");

        Token token = null;
        boolean parsed = false;

        //Get data
        int len = context.text.length();
        int i = context.index;

        //Check
        while(i<len)
        {
            //Get char
            char c = context.text.charAt(i);
            //token-char = %x21 / %x23-27 / %x2A-2B / %x2D-2E / %x30-39 / %x41-5A / %x5E-7E
            if (c==0x21 || (c>=0x23 && c<=0x27) || (c>=0x2A && c<=0x2B) || (c>=0x2D && c<=0x2E)  || (c>=0x30 && c<=0x39) || (c>=0x41 && c<=0x5A) || (c>=0x5E && c<=0x7E))
                //Next
                i++;
            else
                break;
        }

        //Check
        if (i>context.index)
        {
            //Parserd
            parsed = true;
            //Create token
            token = new Token(context.text.substring(context.index, i));
            //Increase index
            context.index = i;
        }

        context.pop("Token", parsed);

        return token;
    }

    @Override
    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }
   
}
