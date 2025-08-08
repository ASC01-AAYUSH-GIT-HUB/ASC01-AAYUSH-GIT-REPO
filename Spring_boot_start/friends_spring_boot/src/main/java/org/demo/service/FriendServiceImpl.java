package org.demo.service;

import org.demo.entity.FriendEntity;
import org.demo.repository.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FriendServiceImpl implements FriendService {
    private final FriendRepository friendRepository;
    @Autowired
    public FriendServiceImpl(FriendRepository friendRepository){
        this.friendRepository=friendRepository;
    }
    @Override
    public List<FriendEntity> getAllFriends() {
        System.err.println("Database value is returned");
        return this.friendRepository.findAll();
    }

    @Override
    public FriendEntity getFriendbyid(Long id) {
        System.err.println("Getting particular friend");
        return  this.friendRepository.getById(id);
    }

    @Override
    public void addFriend(FriendEntity friend) {
        System.err.println("friend is going to added");
        this.friendRepository.save(friend);
    }
}
