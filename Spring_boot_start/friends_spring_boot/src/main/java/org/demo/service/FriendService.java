package org.demo.service;

import org.demo.entity.FriendEntity;

import java.util.List;

public interface FriendService {
    List<FriendEntity> getAllFriends();
    FriendEntity getFriendbyid(Long id);
    void addFriend(FriendEntity friend);
}
