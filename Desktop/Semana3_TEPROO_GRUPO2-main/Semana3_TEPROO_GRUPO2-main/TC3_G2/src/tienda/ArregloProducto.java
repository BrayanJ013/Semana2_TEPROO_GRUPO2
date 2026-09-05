package tienda;

import java.util.ArrayList;

public class ArregloProducto {
private ArrayList<Producto>prod;
public ArregloProducto() {
	prod=new ArrayList<Producto>();
	Adicionar(new Producto(1010, 20, 30.50, "Mando"));
	Adicionar(new Producto(1020, 15, 80, "Monitor"));
	Adicionar(new Producto(1030, 8, 100, "Consola"));
}
public void Adicionar(Producto p) {
	prod.add(p);
}
public int Tamaño() {
	return prod.size();
}
public Producto Obtener(int o) {
	return prod.get(o);
}
public Producto Buscar(int cod) {
	for (int i=0;i<Tamaño();i++) {
		if(Obtener(i).getCod()==cod)
			return Obtener(i);
	}
	return null;
}
public void EliminarProducto(Producto p) {
	prod.remove(p);
}
public double TotalInventario() {
	double suma=0;
	for(int i=0;i<Tamaño();i++) {
		suma+=Obtener(i).Importe();
	}
	return suma;
}
public boolean ModificarProducto(int cod, double nuevoPrecio, int nuevoStock) {
	Producto p = Buscar(cod);
	if (p != null) {
		p.setPre(nuevoPrecio);
		p.setStock(nuevoStock);
		return true;
	}
	return false;
}
}
