package org.corecode.repository;

import org.corecode.model.Friend;

import java.util.*;

public class ProductRepositoryImpl implements ProductRepository{

    static Map<String,Friend> friendChart=new HashMap<>();


    @Override
    public boolean addFriend(Friend friend) {
        int count=friendChart.size()+1;
        String fid=Integer.toString(count);
        String str="";
        for(int i = 0;i<3-fid.length() ; i++){
            str=str+"0";
        }
        fid="F"+str+fid;
        friend.setFriendId(fid);
        friendChart.put(fid,friend);
        return true;
    }

    @Override
    public List<Friend> displayallFriend() {
        List<Friend> friends=new ArrayList<>(friendChart.values());
        return friends;
    }

    @Override
    public boolean updateFriend(Friend friend) {
        throw new UnsupportedOperationException("Under development");
    }

    @Override
    public boolean deleteFriend(String id) {
        throw new UnsupportedOperationException("Under development");
    }
}
