package com.example.server.services;

import com.example.server.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    private List<User>store=new ArrayList<>();

    public UserService(){
        store.add(new User(UUID.randomUUID().toString(),"Darshika",
                "darshika@gmail.com","abc123"));
        store.add(new User(UUID.randomUUID().toString(),"Sashini",
                "shashini@gmail.com","abc234"));
        store.add(new User(UUID.randomUUID().toString(),"Rani",
                "rani@gmail.com","abc345"));
        store.add(new User(UUID.randomUUID().toString(),"Kamal",
                "kamalk@gmail.com","abc456"));
    }
    public List<User>getUsers(){
        return this.store;
    }
    public Optional<User> getUserByEmail(String email) {
        return store.stream()
                .filter(user -> user.getEmail().equals(email))
                .findFirst();
    }
}
