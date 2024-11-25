package com.hexa.QuitQ.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="Cart")
public class Cart {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long cart_id;
    private float total_price;
    private int total_quantity;

    @OneToOne
    @JoinColumn(name = "customer_id", unique = true, nullable = false)
    private Customer customers;

    @OneToMany(mappedBy = "cart",cascade = CascadeType.ALL)
    private List<CartItem> cartItems;  

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(Long cart_id, float total_price, Customer customers, List<CartItem> cartItems) {
		super();
		this.cart_id = cart_id;
		this.total_price = total_price;
		this.customers = customers;
		this.cartItems = cartItems;
	}

	public int getTotal_quantity() {
		return total_quantity;
	}

	public void setTotal_quantity(int total_quantity) {
		this.total_quantity = total_quantity;
	}
	
	public Long getCart_id() {
		return cart_id;
	}

	public void setCart_id(Long cart_id) {
		this.cart_id = cart_id;
	}

	public float getTotal_price() {
		return total_price;
	}

	public void setTotal_price(float total_price) {
		this.total_price = total_price;
	}

	public Customer getCustomers() {
		return customers;
	}

	public void setCustomers(Customer customers) {
		this.customers = customers;
	}

	public List<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}

	

    
	}