/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritran.system.single.bank.commons.util;

import java.text.NumberFormat;

/**
 * <p>Formatea el número parametrizado.</p>
 * 
 * 
 */


public class CambiaFormatoNumero {

	public static String numerico(String texto) {

		NumberFormat[] nfa = new NumberFormat[1];
		nfa[0] = NumberFormat.getInstance();
		String respuesta = "";

		for (NumberFormat nf : nfa) {
			respuesta = nf.format(Double.parseDouble(texto));
		}
		return respuesta;
	}

	public static String numerico(int numero) {

		NumberFormat[] nfa = new NumberFormat[1];
		nfa[0] = NumberFormat.getInstance();
		String respuesta = "";

		for (NumberFormat nf : nfa) {
			respuesta = nf.format(numero);
		}
		return respuesta;
	}

	public static String numerico(double numero) {

		NumberFormat[] nfa = new NumberFormat[1];
		nfa[0] = NumberFormat.getInstance();
		String respuesta = "";

		for (NumberFormat nf : nfa) {
			respuesta = nf.format(numero);
		}

		return respuesta;

	}

}

