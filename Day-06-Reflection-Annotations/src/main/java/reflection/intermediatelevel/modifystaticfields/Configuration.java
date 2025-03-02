package reflection.intermediatelevel.modifystaticfields;

class Configuration {
    // Private static field
    private static String API_KEY = "ORIGINAL_KEY";

    // Public method to get API_KEY (for verification)
    public static String getApiKey() {
        return API_KEY;
    }
}
