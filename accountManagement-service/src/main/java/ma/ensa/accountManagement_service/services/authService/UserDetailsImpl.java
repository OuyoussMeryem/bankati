package ma.ensa.accountManagement_service.services.authService;

import lombok.RequiredArgsConstructor;
import ma.ensa.accountManagement_service.repositories.UserAppRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsImpl implements UserDetailsService {

    @Autowired
    private UserAppRepo userAppRepo;

    public UserDetailsImpl() {
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userAppRepo.findByUsername(username).orElseThrow(()->new UsernameNotFoundException("User not found !"));
    }
}
