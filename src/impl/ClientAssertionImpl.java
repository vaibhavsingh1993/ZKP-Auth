package impl;

import models.ClientAssertion;

public class ClientAssertionImpl implements ClientAssertion {
    private String username;
    private String clientKey;

    public ClientAssertionImpl(String username, String key) {
        this.username = username;
        this.clientKey = key;
    }
    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void setClientKey(String key) {
        this.clientKey = key;
    }

    @Override
    public ClientAssertion getClientAssertion() {
        return this;
    }
}
