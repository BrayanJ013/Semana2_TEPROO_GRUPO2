package tienda;

public class Producto {
private int cod, stock;
private double pre;
private String des;
public Producto(int cod, int stock, double pre, String des) {
	this.cod = cod;
	this.stock = stock;
	this.pre = pre;
	this.des = des;
}
public int getCod() {
	return cod;
}
public void setCod(int cod) {
	this.cod = cod;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
public double getPre() {
	return pre;
}
public void setPre(double pre) {
	this.pre = pre;
}
public String getDes() {
	return des;
}
public void setDes(String des) {
	this.des = des;
}
public double Importe() {
	return pre*stock;
}
}
