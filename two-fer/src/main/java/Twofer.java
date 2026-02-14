public class Twofer {
    public String twofer(String name) {
        String subject = name != null ? name : "you";
        return "One for " + subject + ", one for me.";
    }
}
