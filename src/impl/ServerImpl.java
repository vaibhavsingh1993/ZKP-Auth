package impl;

import models.Challenge;
import models.Server;
import models.ServerKey;
import util.Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ServerImpl implements Server {
    private static int NUM_CHALLENGES = 8;
    private static final int BITS = 8;
    private static final int GROUP_SIZE = 10;
    private static Utils serverUtil;
    private static String serverKey;
    private static ArrayList<String> keySet = new ArrayList();

    /**
     * Store client keys.
     */
    public Map<String, String> storedClientKeys = new HashMap<>();

    static {
        serverUtil = new Utils();
        serverUtil.init();
    }


    /**
     * Sets number of challenges, decided by client. Default value is 8.
     *
     * @param num Number of challenges
     */
    @Override
    public void setNoOfChallenges(int num) {
        NUM_CHALLENGES = num;

    }

    /**
     * Generates random public key for the server upon server bootstrapping.
     * TODO: This method should return pair of G, g0.
     */
    @Override
    public ServerKey generatePublicKey() {
        if (serverKey == null) {
            for (int i = 0; i < GROUP_SIZE; i++) {
                keySet.add(new String(serverUtil.generateRandom(BITS).toByteArray()));
            }
            serverKey = keySet.get(serverUtil.getRandom(GROUP_SIZE - 1));
        }
        return new ServerKeyImpl(keySet, serverKey);
    }

    public void storeClientKey(String username, String publicKey) {
        if (!storedClientKeys.containsKey(username)) {
            storedClientKeys.put(username, publicKey);
        }
    }
    /**
     * Create a challenge for the client from client's username
     *
     * @param username
     * @return Challenge
     * TODO: Implement auth workflow.
     */
    @Override
    public Challenge generateChallenge(String username) {
        return null;
    }
}
