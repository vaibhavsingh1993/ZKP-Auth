package impl;

import models.ServerKey;

import java.util.ArrayList;

/**
 * Wrapper for cryptographic group G as well as some element g0 of G.
 */
public class ServerKeyImpl implements ServerKey {
    private static ArrayList<String> group = new ArrayList<>();
    private static String key = null;

    public ServerKeyImpl(ArrayList<String> group, String key) {
        this.group = group;
        this.key = key;
    }

    @Override
    public void setGroup(ArrayList<String> group) {
        this.group = group;
    }

    @Override
    public ArrayList<String> getGroup() {
        return this.group;
    }

    @Override
    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return this.key;
    }


}
