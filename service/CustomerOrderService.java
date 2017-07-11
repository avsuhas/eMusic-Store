package com.emusicstore.service;

import com.emusicstore.model.CustomerOrder;

/**
 * Created by suhasarudi on 06/25/2017.
 */
public interface CustomerOrderService {

    void addCustomerOrder(CustomerOrder customerOrder);

    double getCustomerOrderGrandTotal(int cartId);
}
