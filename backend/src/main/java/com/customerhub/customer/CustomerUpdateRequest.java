package com.customerhub.customer;

public record CustomerUpdateRequest(
        String name,
        String email,
        Integer age
) {
}
