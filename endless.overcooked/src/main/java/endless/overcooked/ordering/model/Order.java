package endless.overcooked.ordering.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;


@Entity(name = "Orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private Request request;
    private Unity unity;
    private Queue queue;

    private Customer customer;
    private Address address;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private LocalDateTime creation;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = true)
    private LocalDateTime cookcompleted;

    public Unity getUnity() {
        return this.unity;
    }

    public void setUnity(Unity unity) {
        this.unity = unity;
    }

    public Queue getQueue() {
        return this.queue;
    }

    public void setQueue(Queue queue) {
        this.queue = queue;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    public void setRequest(Request request) {
        this.request = request;
    }

    public Request getRequest() {
        return request;
    }

    public Customer getCustomer() {
        return customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setCookcompleted(LocalDateTime cookcompleted) {
        this.cookcompleted = cookcompleted;
    }

    public LocalDateTime getCookcompleted() {
        return cookcompleted;
    }

    public Address getAddress() {
        return address;
    }

}