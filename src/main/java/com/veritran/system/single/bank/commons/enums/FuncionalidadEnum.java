package com.veritran.system.single.bank.commons.enums;

public enum FuncionalidadEnum {

	ADICIONAR_SALDO("ADICIÓN DE NUEVO SALDO", "+", ""), 
	RETIRO_SALDO("RETIRO DE SALDO", "-", ""),
	TRANSFERENCIA_SALDO("TRANSFERENCIA DE SALDO", "-", "+");

	String tituloFuncionalida;
	String operadorOrigen;
	String operadorDestino;

	private FuncionalidadEnum(String tituloFuncionalida, String operadorOrigen, String operadorDestino) {
		this.tituloFuncionalida = tituloFuncionalida;
		this.operadorOrigen = operadorOrigen;
		this.operadorDestino = operadorDestino;
	}

	public String getTituloFuncionalida() {
		return tituloFuncionalida;
	}

	public void setTituloFuncionalida(String tituloFuncionalida) {
		this.tituloFuncionalida = tituloFuncionalida;
	}

	public String getOperadorOrigen() {
		return operadorOrigen;
	}

	public void setOperadorOrigen(String operadorOrigen) {
		this.operadorOrigen = operadorOrigen;
	}

	public String getOperadorDestino() {
		return operadorDestino;
	}

	public void setOperadorDestino(String operadorDestino) {
		this.operadorDestino = operadorDestino;
	}

}
