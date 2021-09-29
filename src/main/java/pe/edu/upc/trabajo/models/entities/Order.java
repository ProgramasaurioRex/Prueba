package pe.edu.upc.trabajo.models.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id", columnDefinition = "NUMERIC(4)")
	private Integer id;
	
	@Column(name = "date_order")
	@Temporal(TemporalType.DATE)
	private Date dateOrder;
	
	@ManyToOne
	@JoinColumn(name = "user_wholesaler_id", nullable = false)
	private User wholesaler;
	
	@ManyToOne
	@JoinColumn(name = "user_producer_id", nullable = false)
	private User producer;
	
	@ManyToOne
	@JoinColumn(name = "payment_id", nullable = false)
	private Payment payment; 
	
	@OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
	private List<OrderDetail> orderDetails;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateOrder() {
		return dateOrder;
	}

	public void setDateOrder(Date dateOrder) {
		this.dateOrder = dateOrder;
	}

	public User getWholesaler() {
		return wholesaler;
	}

	public void setWholesaler(User wholesaler) {
		this.wholesaler = wholesaler;
	}

	public User getProducer() {
		return producer;
	}

	public void setProducer(User producer) {
		this.producer = producer;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

}
