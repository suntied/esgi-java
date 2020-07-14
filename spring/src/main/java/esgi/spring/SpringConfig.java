package esgi.spring;

import com.slalom.example.db.hazelcast.HazelcastUserRepository;
import esgi.encoder.Sha256PasswordEncoder;
import esgi.uuid.UuidGenerator;
import services.CreateUser;
import services.FindUser;
import services.LoginUser;
import services.port.PasswordEncoder;
import services.port.UserRepository;

public class SpringConfig {

    private final UserRepository userRepository = new HazelcastUserRepository();
    private final PasswordEncoder passwordEncoder = new Sha256PasswordEncoder();

    public CreateUser createUser() {
        return new CreateUser(userRepository, passwordEncoder, new UuidGenerator());
    }

    public FindUser findUser() {
        return new FindUser(userRepository);
    }

    public LoginUser loginUser() {
        return new LoginUser(userRepository, passwordEncoder);
    }
}
