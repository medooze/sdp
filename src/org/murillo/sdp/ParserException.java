/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.murillo.sdp;

import java.util.Stack;

/**
 *
 * @author Sergio
 */
public class ParserException extends org.murillo.abnf.ParserException {

	public ParserException(String reason, String text, int index, Stack<String> ruleStack) {
		super(reason, text, index, ruleStack);
	}
}
