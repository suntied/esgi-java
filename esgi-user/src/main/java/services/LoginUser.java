package services;

import entity.User;
import services.exception.NotAllowedException;
import services.port.PasswordEncoder;
import services.port.UserRepository;

public class LoginUser {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public LoginUser(final UserRepository userRepository, final PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User login(final String email, final String password) {
        var user = userRepository.findByEmail(email).orElseThrow(() -> new NotAllowedException("Not allowed"));
        var hashedPassword = passwordEncoder.encode(email + password);
        if (!user.getPassword().equals(hashedPassword)) throw new NotAllowedException("Not allowed");
        return user;
    }
}
