package models;

/**
 * Client base interface.
 */
public interface Client {

    /**
     * Generate Client assertion, in form of username, user's public key
     * TODO: Returned assertion pair instead of String.
     */
    public String generateClientAssertion();

    /**
     * Generates user's response.
     * TODO: Returned response pair instead of String.
     * @return
     */
    public String generateResponse();

}
