package impl;

import models.Client;
import models.ClientAssertion;
import models.ServerKey;
import util.Utils;

public class ClientImpl implements Client {
    private String username;
    private String password;

    /**
     * Generate Client assertion, in form of username, user's public key
     * TODO: Returned assertion pair instead of String.
     */
    @Override
    public ClientAssertion generateClientAssertion(String username, ServerKey serverKey) {
        if (!this.username.equals(username)) {
            throw new IllegalArgumentException("Username is incorrect");
        }
        Utils clientUtils = new Utils();
        clientUtils.init();
        return new ClientAssertionImpl(username,
                Long.toString(clientUtils.powerN(Integer.parseInt(serverKey.getKey()),
                        Integer.parseInt(clientUtils.getHash(this.password)))));
    }

    /**
     * Generates user's response.
     * TODO: Returned response pair instead of String.
     *
     * @return
     */
    @Override
    public String generateResponse() {
        return null;
    }

    /**
     * Get Client's username.
     *
     * @return
     */
    @Override
    public String getUsername() {
        return this.username;
    }

    /**
     * Set Client's username.
     */
    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Set client's password.
     */
    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Get user password.
     *
     * @return
     */
    @Override
    public String getPassword() {
        return this.password;
    }
}
