package utiles;

public enum Tipo {
	cliente("clientes.dat",true),articulo("articulos.dat",true),pedido("pedidos.dat",false),respaldo("respaldo.bak",false);
	private String ruta;
	private boolean lista;

	private Tipo(String ruta,boolean lista) {
		this.ruta = ruta;
		this.lista=lista;
	}

	public String getRuta() {
		return ruta;
	}

	public boolean isLista() {
		return lista;
	}
	
}
