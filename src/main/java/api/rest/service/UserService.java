package api.rest.service;

import api.rest.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
