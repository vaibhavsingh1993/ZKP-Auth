package models;

/**
 * Server base interface
 */
public interface Server {
    /**
     * Sets number of challenges, decided by client. Default value is 8.
     * @param num Number of challenges
     */
    public void setNoOfChallenges(int num);

    /**
     * Generates random public key for the server upon server bootstrapping.
     * TODO: This method should return pair of G, g0.
     */
    public String generatePublicKey();

    /**
     *  Create a challenge for the client from client's username
     * @return Challenge
     */
    public Challenge generateChallenge(String username);

}
