package org.corecode.service;

import org.corecode.model.Friend;

import java.util.List;

public interface ProductService {
    boolean addFriend(Friend friend);
    List<Friend> displayAllFriends();
    boolean updateFriend(Friend friend);
    boolean deleteFriend(String id);
}
