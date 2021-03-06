/**
 * Mercancia.java
 * Ejercicio 5.
 * @author Javier Luque Rodríguez
 * De cada artículo se debe saber el código, la descripción, el precio de compra, el precio de 
 * venta y el stock (número de unidades).
 */
import java.text.DecimalFormat;

public class Mercancia {
	
  private String codigo;
  private String descripcion;
  private double precioCompra;
  private double precioVenta;
  private int stock;
  
  public Mercancia() {
    codigo = "LIBRE";
  }
  
  public String toString() {
    DecimalFormat df = new DecimalFormat("0.00");
    return "------------------------------------------\nCódigo: " + codigo + "\nDescripción: " 
    + descripcion + "\nPrecio de compra: " + df.format(precioCompra) + "\nPrecio de venta: " 
    + df.format(precioVenta) + "\nStock: " + stock + "\n------------------------------------------";
  }
  
  public String getCodigo() {
    return codigo;
  }
  
  public int getStock() {
    return stock;
  }
  
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }
  
  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }
  
  public void setPrecioCompra(double precioCompra) {
    this.precioCompra = precioCompra;
  }
  
  public void setPrecioVenta(double precioVenta) {
    this.precioVenta = precioVenta;
  }
  
  public void setStock(int stock) {
    this.stock = stock;
  }
}

