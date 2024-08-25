package com.customerhub.auth;

public record AuthenticationRequest(
        String username,
        String password
) {
}
