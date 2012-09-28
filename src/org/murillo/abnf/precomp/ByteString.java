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

final public class ByteString extends Rule {

    private ByteString(String token) {
        super(token, null);
    }

    public static Rule parse(ParserContext context) {

        context.push("Token");

        ByteString token = null;
        boolean parsed = false;

        //Get data
        int len = context.text.length();
        int i = context.index;

        //Check
        while(i<len)
        {
            //Get char
            char c = context.text.charAt(i);
            //1*(%x01-09/%x0B-0C/%x0E-FF);
            if ((c>=0x01 && c<=0x09) || (c>=0x0B && c<=0x0C) || (c>=0x0E && c<=0xFF))
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
            token = new ByteString(context.text.substring(context.index, i));
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
