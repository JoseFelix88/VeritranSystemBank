/**
 * 
 */
package com.veritran.system.single.bank.commons.dto;

import java.time.LocalDateTime;

/**
 * <p>Clase encargada de transferir los datos de una transferencia.</p>
 * 
 * @author Thaliana
 *
 * 9:19:06 a.�m. 2020
 */
public class DepositoDTO {

	private String cliente;
	
	private String cuentaOrigen;
	
	private String cuentaDestino;
	
	private Integer valorDeposito;
	
	private Integer valorSaldoTotal;
	
	private Integer valorSaldoActual;
	
	private LocalDateTime fechaOperacion;

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getCuentaOrigen() {
		return cuentaOrigen;
	}

	public void setCuentaOrigen(String cuentaOrigen) {
		this.cuentaOrigen = cuentaOrigen;
	}

	public String getCuentaDestino() {
		return cuentaDestino;
	}

	public void setCuentaDestino(String cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}

	public Integer getValorDeposito() {
		return valorDeposito;
	}

	public void setValorDeposito(Integer valorDeposito) {
		this.valorDeposito = valorDeposito;
	}

	public Integer getValorSaldoTotal() {
		return valorSaldoTotal;
	}

	public void setValorSaldoTotal(Integer valorSaldoTotal) {
		this.valorSaldoTotal = valorSaldoTotal;
	}

	public Integer getValorSaldoActual() {
		return valorSaldoActual;
	}

	public void setValorSaldoActual(Integer valorSaldoActual) {
		this.valorSaldoActual = valorSaldoActual;
	}

	public LocalDateTime getFechaOperacion() {
		return fechaOperacion;
	}

	public void setFechaOperacion(LocalDateTime fechaOperacion) {
		this.fechaOperacion = fechaOperacion;
	}

	@Override
	public String toString() {
		return "DepositoDTO [cliente=" + cliente + ", cuentaOrigen=" + cuentaOrigen + ", cuentaDestino=" + cuentaDestino
				+ ", valorDeposito=" + valorDeposito + ", valorSaldoTotal=" + valorSaldoTotal + ", valorSaldoActual="
				+ valorSaldoActual + ", fechaOperacion=" + fechaOperacion + "]";
	}

}
