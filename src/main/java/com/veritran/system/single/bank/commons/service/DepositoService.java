package com.veritran.system.single.bank.commons.service;

import com.veritran.system.single.bank.commons.dto.DepositoDTO;

/**
 *<p>Interfaz encargada de la funcionalidad transaccional de los depositos.</p>
 *
 * @author Thaliana
 *
 * 6:07:11 p. m. 2020
 */
public interface DepositoService {

	/** 
	 * <p>Metodo <b>agregarDeposito</b> encargado de adicionar saldo a una cuenta.</p>
	 * 
	 */
	public DepositoDTO agregarDeposito(DepositoDTO depositoDto);
	
	/** 
	 * <p>Metodo <b>retirarDeposito</b> encargado de gestionar los retiros de diero
	 * para una cuenta en especifico.</p>
	 * 
	 */
	public DepositoDTO retirarDeposito(DepositoDTO depositoDto);
	
	/** 
	 * <p>Metodo <b>retirarDeposito</b> encargado de gestionar las transferencias de saldo
	 * para una cuenta en especifico.</p>
	 * 
	 */
	public DepositoDTO transferenciaDeposito(DepositoDTO depositoDto);
	
	
}
