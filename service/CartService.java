package com.emusicstore.service;

import com.emusicstore.model.Cart;

/**
 * Created by suhasarudi on 06/25/2017.
 */
public interface CartService {

    Cart getCartById(int cartId);

    void update(Cart cart);
}
