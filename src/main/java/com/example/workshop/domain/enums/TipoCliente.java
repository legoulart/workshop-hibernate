package com.example.workshop.domain.enums;

public enum TipoCliente {
	PESSOAFISICA(0),
	PESSOAJURIDICA(1);
	
	private final int value;
	
	private TipoCliente(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
