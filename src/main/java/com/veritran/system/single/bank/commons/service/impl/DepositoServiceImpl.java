/**
 * 
 */
package com.veritran.system.single.bank.commons.service.impl;

import java.time.LocalDateTime;

import com.veritran.system.single.bank.commons.dto.DepositoDTO;
import com.veritran.system.single.bank.commons.service.DepositoService;

/**
 * @author Thaliana
 *
 * 10:09:11 p. m. 2020
 */
public class DepositoServiceImpl implements DepositoService {

	
	
	public DepositoDTO agregarDeposito(DepositoDTO depositoDto) {
		try {
			Integer totalSaldoCuenta = depositoDto.getValorSaldoActual() + depositoDto.getValorDeposito();
			depositoDto.setFechaOperacion(LocalDateTime.now());
			depositoDto.setValorSaldoActual(totalSaldoCuenta);
			return depositoDto;
		} catch (Exception e) {
			System.out.println("El test de agregar deposito presenta el siguiente error: {}" + e);
			return null;
		}
	}

	public DepositoDTO retirarDeposito(DepositoDTO depositoDto) {
		try {
			Integer totalSaldoCuenta = depositoDto.getValorSaldoActual() - depositoDto.getValorDeposito();
			depositoDto.setFechaOperacion(LocalDateTime.now());
			depositoDto.setValorSaldoActual(totalSaldoCuenta);
			return depositoDto;
		} catch (Exception e) {
			System.out.println("El test de retiro presenta el siguiente error: {}" + e);
			return null;
		}

	}

	public DepositoDTO transferenciaDeposito(DepositoDTO depositoDto) {
		try {
			Integer totalSaldoCuenta = depositoDto.getValorSaldoActual() - depositoDto.getValorDeposito();
			depositoDto.setFechaOperacion(LocalDateTime.now());
			depositoDto.setValorSaldoActual(totalSaldoCuenta);
			return depositoDto;
		} catch (Exception e) {
			System.out.println("El test de transferencia presenta el siguiente error: " + e);
			return null;
		}
	}


}
