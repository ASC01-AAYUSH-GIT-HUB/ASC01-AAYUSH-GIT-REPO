package org.demo.controller;

import org.demo.entity.FriendEntity;
import org.demo.repository.FriendRepository;
import org.demo.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.util.List;

@RestController
@RequestMapping("/friends")
public class FriendController {
    private final FriendService friendService;
    @Autowired
    public FriendController(FriendService friendService){
        this.friendService=friendService;
    }

    @GetMapping("/goodfriend")
    List<FriendEntity> getAllFriend(){
        return friendService.getAllFriends();
    }

    @GetMapping("/friendID/{id}")
    FriendEntity getFriendById(@PathVariable Long id){
        return friendService.getFriendbyid(id);
    }
    @PostMapping("/addfriend")
    void addingFriend(@RequestBody FriendEntity friend){
        friendService.addFriend(friend);
    }


}
