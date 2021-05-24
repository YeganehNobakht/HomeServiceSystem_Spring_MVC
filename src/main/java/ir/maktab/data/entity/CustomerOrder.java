package ir.maktab.data.entity;

import ir.maktab.data.entity.enums.OrderStatus;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class CustomerOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated
    private OrderStatus orderStatus;

    @ManyToOne
    @JoinColumn(name="category", nullable=false , foreignKey = @ForeignKey(name = "category_order_fk"))
    private ServiceCategory serviceCategory;

    @ManyToOne
    @JoinColumn(name="subcategory", nullable=false , foreignKey = @ForeignKey(name = "subcategory_order_fk"))
    private SubCategory subCategory;

    @Column(columnDefinition="varchar(100)")
    private String jobDescription;

    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date workDate;

    private Address address;

    @ManyToOne
    @JoinColumn(name="customer_order", nullable=false , foreignKey = @ForeignKey(name = "customer_order_fk"))
    private Customer customer;

    @OneToMany(orphanRemoval = true , cascade = CascadeType.PERSIST , mappedBy = "customerOrder")
    private List<Suggestion> suggestionList = new ArrayList<>();


    public Integer getId() {
        return id;
    }

    public CustomerOrder setId(Integer id) {
        this.id = id;
        return this;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public CustomerOrder setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public CustomerOrder setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
        return this;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public CustomerOrder setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
        return this;
    }

    public Date getWorkDate() {
        return workDate;
    }

    public CustomerOrder setWorkDate(Date deliveryDate) {
        this.workDate = deliveryDate;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public CustomerOrder setAddress(Address address) {
        this.address = address;
        return this;
    }

    public Customer getCustomer() {
        return customer;
    }

    public CustomerOrder setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }



    public ServiceCategory getServiceCategory() {
        return serviceCategory;
    }

    public CustomerOrder setServiceCategory(ServiceCategory serviceCategory) {
        this.serviceCategory = serviceCategory;
        return this;
    }

    public SubCategory getSubCategory() {
        return subCategory;
    }

    public CustomerOrder setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
        return this;
    }

    public List<Suggestion> getSuggestionList() {
        return suggestionList;
    }

    public CustomerOrder setSuggestionList(List<Suggestion> suggestionList) {
        this.suggestionList = suggestionList;
        return this;
    }
}
