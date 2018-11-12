package models;

import java.util.ArrayList;

/**
 * Wrapper for cryptographic group G as well as some element g0 of G.
 */
public interface ServerKey {
    public void setGroup(ArrayList<String> group);
    public ArrayList<String> getGroup();
    public void setKey(String key);

    public String getKey();
}
