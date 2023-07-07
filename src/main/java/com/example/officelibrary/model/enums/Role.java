package com.example.officelibrary.model.enums;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    READER, EDITOR;

    @Override
    public String getAuthority() { return name(); }
}