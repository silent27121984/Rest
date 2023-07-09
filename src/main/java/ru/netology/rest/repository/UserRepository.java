package ru.netology.rest.repository;

import org.springframework.stereotype.Repository;
import ru.netology.rest.Authorities;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> list = new ArrayList<>();
        Map<String, String> users = new ConcurrentHashMap<>();
        users.put("Sergey", "12345");
        users.put("Vasya", "67890");
        users.put("Victor", "1112131415");

        if (users.containsKey(user) && users.get(user).equals(password)){
            list.add(Authorities.WRITE);
            list.add(Authorities.READ);
            list.add(Authorities.DELETE);
        } else {
            return new ArrayList<>();
        }
        return list;
    }
}
