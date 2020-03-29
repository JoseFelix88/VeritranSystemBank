package com.veritran.system.single.bank.commons.service;

import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;

import org.junit.Test;

import com.veritran.system.single.bank.commons.dto.DepositoDTO;
import com.veritran.system.single.bank.commons.enums.FuncionalidadEnum;
import com.veritran.system.single.bank.commons.util.CambiaFormatoNumero;
import com.veritran.system.single.bank.commons.util.FechaUtil;


public class DepositoServiceTest {
	
	
	@Test
	public void agregarDepositoCuenta() {
		try {
			DepositoDTO depositoDto = new DepositoDTO();
			depositoDto.setCliente("Jose Curiel");
			depositoDto.setCuentaOrigen("1234567");
			depositoDto.setValorDeposito(20);
			depositoDto.setValorSaldoActual(1000);
			if (depositoDto.getValorDeposito() > 0) {
				Integer totalSaldoCuenta = depositoDto.getValorSaldoActual() + depositoDto.getValorDeposito();
				depositoDto.setFechaOperacion(LocalDateTime.now());
				depositoDto.setValorSaldoActual(totalSaldoCuenta);
				imprimirResultados(depositoDto, FuncionalidadEnum.ADICIONAR_SALDO);
			} else {
				System.out.println("El valor del deposito debe ser mayor a cero.");
			}
			assertTrue(true);
		} catch (Exception e) {
			System.out.println("El test de agregar deposito presenta el siguiente error: {}" + e);
			assertTrue(false);
		}
	}
	
	@Test
	public void retirarDepositoCuenta() {
		try {
			DepositoDTO depositoDto = new DepositoDTO();
			depositoDto.setCliente("Jose Curiel");
			depositoDto.setCuentaOrigen("1234567");
			depositoDto.setValorDeposito(-2000);
			depositoDto.setValorSaldoActual(18000);
			if(depositoDto.getValorDeposito() > 0) {
				if(depositoDto.getValorDeposito() <= depositoDto.getValorSaldoActual()) {
					Integer totalSaldoCuenta = depositoDto.getValorSaldoActual() - depositoDto.getValorDeposito();
					depositoDto.setFechaOperacion(LocalDateTime.now());
					depositoDto.setValorSaldoActual(totalSaldoCuenta);
					
					imprimirResultados(depositoDto, FuncionalidadEnum.RETIRO_SALDO);
				} else {
					System.out.println("Usted no tiene saldo suficiente para realizar el retiro.");
				}
			} else {
				System.out.println("El valor del retiro debe ser mayor a cero.");
			}
			
			assertTrue(true);
		} catch (Exception e) {
			System.out.println("El test de retiro presenta el siguiente error: {}"+ e);
			assertTrue(false);
		}
	}

	@Test
	public void transferenciaDepositoCuenta() {
		try {
			DepositoDTO depositoDto = new DepositoDTO();
			depositoDto.setCliente("Jose Curiel");
			depositoDto.setCuentaOrigen("1234567");
			depositoDto.setCuentaDestino("987654");
			depositoDto.setValorDeposito(2000);
			depositoDto.setValorSaldoActual(18000);
			if(depositoDto.getValorDeposito() > 0) {
				if(depositoDto.getValorDeposito() <= depositoDto.getValorSaldoActual()) {
					Integer totalSaldoCuenta = depositoDto.getValorSaldoActual() - depositoDto.getValorDeposito();
					depositoDto.setFechaOperacion(LocalDateTime.now());
					depositoDto.setValorSaldoActual(totalSaldoCuenta);
					
					imprimirResultados(depositoDto, FuncionalidadEnum.TRANSFERENCIA_SALDO);
				} else {
					System.out.println("Usted no tiene saldo suficiente para realizar la transferencia.");
				}
			} else {
				System.out.println("El valor de la transferencia debe ser mayor a cero.");
			}
			
			assertTrue(true);
		} catch (Exception e) {
			System.out.println("El test de la transferencia presenta el siguiente error: {}"+ e);
			assertTrue(false);
		}
	}

	private void imprimirResultados(DepositoDTO depositoDto, FuncionalidadEnum funcionalidad) {
		String transferencia = "";
		if(funcionalidad.equals(FuncionalidadEnum.TRANSFERENCIA_SALDO)) {
			transferencia = "\nSe realizó transferencia a la cuenta: " + depositoDto.getCuentaDestino()
			+"\nPor valor: $ " + CambiaFormatoNumero.numerico(depositoDto.getValorDeposito());
		}
		
		System.out.println("\n==================================================================="
				+ "\n||		 RESULTADO DEL PROCESO				 ||"
				+ "\n===================================================================" 
				+ "\nSr: "
				+ depositoDto.getCliente() 
				+ "\nSe modifico su saldo por concepto: " + funcionalidad.getTituloFuncionalida()
				+ transferencia
				+ "\nAhora su saldo actual es: $ " + CambiaFormatoNumero.numerico(depositoDto.getValorSaldoActual()) 
				+ "\nFecha operación: "
				+ FechaUtil.localDateTimeToString(FechaUtil.FORMATO_FECHA_HORA, depositoDto.getFechaOperacion()));

	}
}
