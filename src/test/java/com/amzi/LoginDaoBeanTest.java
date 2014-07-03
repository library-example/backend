package com.amzi.dao;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LoginDaoBeanTest {

    @Test
    public void shouldAuthenticate() {
        LoginDaoBean login = new LoginDaoBean();
        boolean expected = true;
        boolean actual = login.validate("Admin", "passw0rd");

        assertThat(actual, is(expected));
    }

    @Test
    public void shouldNotAuthenticate() {
        LoginDaoBean login = new LoginDaoBean();
        boolean expected = false;
        boolean actual = login.validate("Admin", "password");

        assertThat(actual, is(expected));
    }
}