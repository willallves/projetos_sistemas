package br.com.sispan.controller;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import br.com.sispan.interfaces.Bean;
import br.com.sispan.model.Cliente;

@ViewScoped
@ManagedBean
public class ClienteMB extends GenericMB {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3293363169350986859L;
	private Cliente cliente = new Cliente();
	private List<Cliente> listaClientes = new ArrayList();

	public Cliente getClientes() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	protected Bean getBean() {
		return getClientes();
	}

	@Override
	protected void setBean(Bean b) {
		setCliente((Cliente)b);
	}
	
	@Override
	public void setLista(List lista) {
		System.out.println("Setando lista: ");
		this.listaClientes = new ArrayList<Cliente>(lista);
		
	}	
	
	public List<Cliente> getListaClientes(){
		return listaClientes;
	}
	
	public void setListaClientes(List<Cliente> listaClientes){
		this.listaClientes = listaClientes;
	}
	
}