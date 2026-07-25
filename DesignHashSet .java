class MyHashSet {
    private boolean[] set;

    public MyHashSet() {
        // The constraints state 0 <= key <= 10^6.
        // We need an array of size 1,000,001 to include index 1,000,000.
        set = new boolean[1000001];
    }

    public void add(int key) {
        // Mark the key as present 
        set[key] = true;
    }

    public void remove(int key) {
        // Mark the key as not present
        // If the key was never added, setting it to false has no negative effect
        set[key] = false;
    }

    public boolean contains(int key) {
        // Return whether the key is present
        return set[key];
    }
}