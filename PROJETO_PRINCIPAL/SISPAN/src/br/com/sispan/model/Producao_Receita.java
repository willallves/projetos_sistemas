package br.com.sispan.model;

import javax.persistence.Column;

import br.com.sispan.interfaces.Bean;

public class Producao_Receita implements Bean{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name="ReceitaID", nullable = false)
	private Integer receiraId;
	@Column(name="Producao_Id", nullable = false)
	private Integer producao_Id;
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
	public Integer getReceiraId() {
		return receiraId;
	}
	public void setReceiraId(Integer receiraId) {
		this.receiraId = receiraId;
	}
	public Integer getProducao_Id() {
		return producao_Id;
	}
	public void setProducao_Id(Integer producao_Id) {
		this.producao_Id = producao_Id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
