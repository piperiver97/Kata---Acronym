package dev.felipe;

public class Acronym {


    private  String acronym;

    Acronym(String phrase) {
        acronym = generateAcronym(phrase);
    }

    private String generateAcronym(String phrase) {
        
        phrase = phrase.replaceAll("[^a-zA-Z\\- ]", "");

        String[] words = phrase.split("[\\s\\-]+");

        StringBuilder acronymBuilder = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                acronymBuilder.append(word.charAt(0));
            }
        }

        return acronymBuilder.toString().toUpperCase();
    }

    String get() {
        return acronym;
    }
}