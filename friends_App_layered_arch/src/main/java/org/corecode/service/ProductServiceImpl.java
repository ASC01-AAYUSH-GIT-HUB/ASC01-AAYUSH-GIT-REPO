package org.corecode.service;

import org.corecode.model.Friend;
import org.corecode.repository.ProductRepository;
import org.corecode.repository.ProductRepositoryImpl;

import java.util.Collections;
import java.util.List;

public class ProductServiceImpl implements ProductService{
    ProductRepository productRepository=new ProductRepositoryImpl();
    @Override
    public boolean addFriend(Friend friend) {
        if(friend.getFirstName()==""||friend.getAge()<18){
            System.err.println("First Name can't be empty AND Age should be 18+");
            return false;
        }else {
            return productRepository.addFriend(friend);
        }
    }

    @Override
    public List<Friend> displayAllFriends() {
        return productRepository.displayallFriend();
    }

    @Override
    public boolean updateFriend(Friend friend) {
        throw new UnsupportedOperationException("Under Development");
    }

    @Override
    public boolean deleteFriend(String id) {
        throw new UnsupportedOperationException("Under Development");
    }
}
