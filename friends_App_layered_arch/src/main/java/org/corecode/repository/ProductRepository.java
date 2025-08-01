package org.corecode.repository;

import org.corecode.model.Friend;

import java.util.List;

public interface ProductRepository {
    boolean addFriend(Friend friend);
    List<Friend> displayallFriend();
    boolean updateFriend(Friend friend);
    boolean deleteFriend(String id);


}
