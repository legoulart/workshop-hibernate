package com.example.workshop.domain.enums;

public enum EstadoPagamento {
	PENDENTE(0),
	QUITADO(1),
	CANCELADO(2);
	
	private final int value;
	
	private EstadoPagamento(int value){
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}