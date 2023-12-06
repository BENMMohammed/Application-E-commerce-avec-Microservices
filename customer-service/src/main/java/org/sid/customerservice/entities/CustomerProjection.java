package org.sid.customerservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullCustomer", types = Customer.class) // pour créer une projection de customer
public interface CustomerProjection {
    public Long getId();
    public String getName();
    public String getEmail();
}
