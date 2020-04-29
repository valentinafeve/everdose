package com.beans;

import java.util.List;

import javax.ejb.Remote;

import com.entities.Productfromsupplier;
import com.entities.Supplier;
import com.entities.Supplierorder;

@Remote
public interface SupplierServiceRemote {
	
	//CRUD tabla Supplier
		public List<Supplier> findSupplier(String name);
		 public String addSupplier(String name, String addres,String phone, String email,String uri);
		 public String updateSupplier(int id, String supplier_name,String address, String phone, String email, String uri);
		 public String deleteSupplier(String name, int supplierId);
		 public List<Supplier> getAllSuppliers();
		 
		 //CRUD tabla Productfromsupplier
		 public String addSupplierProduct(String name, String description,float price, String keywords,int supplierId);
		 public List<Productfromsupplier> findSupplierProduct(String name,int supplierProductId);
		 public String updateSupplierProduct( int id,String name, String description, float price, String keywords);
		 public String deleteSupplierProduct(int supplierProductId);
		 public List<Productfromsupplier> getAllSupplierProducts();
		 
		 //CRUD tabla Supplierorder
		 public List<Supplierorder> findSupplierOrder(int id);
		 public String addSupplierOrder(String productName, int supplierId,int productId, float productPrice,int amount);
		 public String updateSupplierOrder( int id,String productName, int supplierId, int productId, float productPrice, int amount, int payed);
		 public String deleteSupplierOrder( int supplierOrderId);
		 public List<Supplierorder> getAllSupplierOrders();
		 
		 //pagar al final del d�a todos los pedidos
		 public String paySuppliers();
		 
		 //se crea una orden y se env�a por correo al correo del proveedor
		 public String orderToSuppliers(String name,int amount);

}
