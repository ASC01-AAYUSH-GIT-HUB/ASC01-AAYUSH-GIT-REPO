package org.demo.service;

import org.demo.entity.IdPassEntity;
import org.demo.repo.IdPassRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdPassServiceImpl implements IdPassService{
    private final IdPassRepo idPassRepo;
    @Autowired
    public IdPassServiceImpl(IdPassRepo idPassRepo){
        this.idPassRepo=idPassRepo;
    }

    @Override
    public String getVerification(IdPassEntity idPassEntity) {
        try{
            IdPassEntity id=idPassRepo.findById(idPassEntity.getLogin_id()).get();
            if(id.compare(idPassEntity)){
                return "you logged in now";
            }
            return "password is wrong";
        } catch (Exception e) {
            return "put a valid id";
        }
    }
}
