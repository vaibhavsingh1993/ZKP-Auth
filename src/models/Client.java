package models;

/**
 * Client base interface.
 */
public interface Client {

    /**
     * Generate Client assertion, in form of username, user's public key
     * TODO: Returned assertion pair instead of String.
     */
    public ClientAssertion generateClientAssertion(String username, ServerKey serverKey);

    /**
     * Generates user's response.
     * TODO: Returned response pair instead of String.
     * @return
     */
    public String generateResponse();

    /**
     * Get Client's username.
     * @return
     */
    public String getUsername();

    /**
     * Set Client's username.
     */
    public void setUsername(String username);

    /**
     * Set client's password.
     */
    public void setPassword(String password);

    /**
     * Get user password.
     * @return
     */
    public String getPassword();

}
