package dev.iraelie.book_social_network.security;

import org.springframework.stereotype.Service;
import org.springframework.web.filter.OncePerRequestFilter;

@Service
public class JwtAuthFilter extends OncePerRequestFilter {
}
