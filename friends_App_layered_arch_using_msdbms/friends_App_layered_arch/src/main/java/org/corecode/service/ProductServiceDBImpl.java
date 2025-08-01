package org.corecode.service;

import org.corecode.model.Friend;
import org.corecode.repository.ProductRepository;
import org.corecode.repository.ProductRepositoryDBImpl;
import org.corecode.repository.ProductRepositoryDBImplMsSQL;

import java.util.List;
import java.util.Objects;

public class ProductServiceDBImpl implements ProductService{
    ProductRepository productRepository=new ProductRepositoryDBImplMsSQL();
    @Override
    public boolean addFriend(Friend friend) {
        if(Objects.equals(friend.getFirstName(), "") ||friend.getAge()<18){
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
        if (friend.getAge()>18 & !Objects.equals(friend.getFirstName(),"")){
            return productRepository.updateFriend(friend);
        }
        return false;
    }

    @Override
    public boolean deleteFriend(String id) {
        return productRepository.deleteFriend(id);
    }
}
