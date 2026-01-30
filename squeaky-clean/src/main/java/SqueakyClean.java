
class SqueakyClean {

    static String clean(String identifier) {

        var builder = new StringBuilder();

        for (int i = 0; i < identifier.length(); i++) {
            char letter = identifier.charAt(i);
        
            if (Character.isWhitespace(letter)) {
                builder.append('_');
                continue;
            }

            if (identifier.length() > 0 && i + 1 < identifier.length()) {
                char nextLetter = identifier.charAt(i + 1);
                if (letter == '-' && Character.isLetter(nextLetter)) {
                    builder.append(Character.toUpperCase(nextLetter));
                    i++;
                    continue;
                }
            }

            if (!Character.isLetterOrDigit(letter)) {
                continue;
            }

            switch (letter) {
                case '4' -> {
                    builder.append('a');
                }
                case '3' -> {
                    builder.append('e');
                }
                case '0' -> {
                    builder.append('o');
                }
                case '1' -> {
                    builder.append('l');
                }
                case '7' -> {
                    builder.append('t');
                }
                default -> {
                    builder.append(letter);
                }
            }

        }

        return builder.toString();
    }
}
