package com.laurentiuspilca.ssia.services;

import com.laurentiuspilca.ssia.entities.Otp;
import com.laurentiuspilca.ssia.entities.User;
import com.laurentiuspilca.ssia.repositories.OtpRepository;
import com.laurentiuspilca.ssia.repositories.UserRepository;
import com.laurentiuspilca.ssia.utils.GenerateCodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

@Service
@Transactional
public class UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OtpRepository otpRepository;

    public void addUser(User user) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void auth(User user) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean check(Otp otpToValidate) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void renewOtp(User u) {
        String code = GenerateCodeUtil.generateCode();
        Optional<Otp> userOtp = otpRepository.findOtpByUsername(u.getUsername());
        if (userOtp.isPresent()) {
            Otp otp = userOtp.get();
            otp.setCode(code);
        } else {
            Otp otp = new Otp();
            otp.setUsername(u.getUsername());
            otp.setCode(code);
            otpRepository.save(otp);
        }
    }
}
