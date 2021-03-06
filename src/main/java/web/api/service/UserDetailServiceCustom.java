package web.api.service;

import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import web.api.model.User;
import web.api.model.UserDetailCustom;
import web.api.repository.UserRepository;

@Service
public class UserDetailServiceCustom implements UserDetailsService {

    private final UserRepository userRepository;

    public UserDetailServiceCustom(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Bean
    JwtAuthenticationFilter jwtAuthenticationFilterBean(){
        return new JwtAuthenticationFilter();
    }

    @Override
    public UserDetailCustom loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(s);
        if(user == null) {
            return null;
        }
        return new UserDetailCustom(user);
    }

    public UserDetailCustom loadUserByEmail(String email){
        User user = userRepository.findByEmail(email);
        if(user == null) {
            return null;
        }
        return new UserDetailCustom(user);
    }

}
