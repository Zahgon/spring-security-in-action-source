package com.laurentiuspilca.ssia.filters;

import org.jboss.logging.Logger;
import org.springframework.security.web.csrf.CsrfToken;
import javax.servlet.*;
import java.io.IOException;

public class CsrfTokenLogger implements Filter {

    private Logger logger = Logger.getLogger(CsrfTokenLogger.class.getName());

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
