package com.auth0.jwt.impl;

import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.Claim;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * The {@code NullClaim} class is a Claim implementation that returns null when any of it's methods is called.
 */
public class NullClaim implements Claim {
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public Boolean asBoolean() {
        return null;
    }

    @Override
    public Integer asInt() {
        return null;
    }

    @Override
    public Long asLong() {
        return null;
    }

    @Override
    public Double asDouble() {
        return null;
    }

    @Override
    public String asString() {
        return null;
    }

    @Override
    public Date asDate() {
        return null;
    }

    @Override
    public Instant asInstant() {
        return null;
    }

    @Override
    public <T> T[] asArray(Class<T> clazz) throws JWTDecodeException {
        return null;
    }

    @Override
    public <T> List<T> asList(Class<T> clazz) throws JWTDecodeException {
        return null;
    }

    @Override
    public Map<String, Object> asMap() throws JWTDecodeException {
        return null;
    }

    @Override
    public <T> T as(Class<T> clazz) throws JWTDecodeException {
        return null;
    }

    @Override
    public String toString() {
        return "Null Claim";
    }
}
