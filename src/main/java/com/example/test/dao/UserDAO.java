package com.example.test.dao;

import com.example.test.model.UserModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDAO {

    private static int USER_COUNT;
    private List<UserModel> user;
    {
        user = new ArrayList<>();

        user.add(new UserModel(++USER_COUNT,"Иванова Е.А.",21, 5,"Администратор"));
        user.add(new UserModel(++USER_COUNT,"Кочегаров С.П.",18, 4,"Наблюдатель"));
        user.add(new UserModel(++USER_COUNT,"Токарев Ж.В.",20, 2,"Пользователь"));
        user.add(new UserModel(++USER_COUNT,"Рыжов А.С.",19, 7,"Подписчик"));
    }

    public List<UserModel> index(){

        return user;
    }

    public UserModel show(int id){
        return user.stream().filter(userModel -> userModel.getId() == id).findAny().orElse(null);
    }

    public void save(UserModel teach){
        teach.setId(++USER_COUNT);
        user.add(teach);
    }

    public void update(int id, UserModel userModel){
        UserModel updateUser = show(id);
        updateUser.setFio(userModel.getFio());
        updateUser.setAge(userModel.getAge());
        updateUser.setWorkExperience(userModel.getWorkExperience());
        updateUser.setType(userModel.getType());
    }


    public void delete(int id){
        user.removeIf(p-> p.getId() == id);
    }

}
