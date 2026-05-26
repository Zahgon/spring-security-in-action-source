package com.laurentiuspilca.ssia.csrf;

import com.laurentiuspilca.ssia.entities.Token;
import com.laurentiuspilca.ssia.repositories.JpaTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.security.web.csrf.DefaultCsrfToken;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;
import java.util.UUID;

public class CustomCsrfTokenRepository implements CsrfTokenRepository {

    @Autowired
    private JpaTokenRepository jpaTokenRepository;

    @Override
    public CsrfToken generateToken(HttpServletRequest httpServletRequest) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void saveToken(CsrfToken csrfToken, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public CsrfToken loadToken(HttpServletRequest httpServletRequest) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
