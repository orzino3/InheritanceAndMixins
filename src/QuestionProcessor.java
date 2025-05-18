import java.util.*;

public class QuestionProcessor {
    private final List<String> classes = List.of("animal", "bird", "living", "fish", "plant", "canary", "salmon");
    private final List<String> characteristics = List.of("can fly", "can swim", "can grow", "has wings", "has scales", "has gills", "living");
    private Map<String, Living> objectMap = new HashMap<>();

    public QuestionProcessor() {
        this.objectMap.put("canary", new Canary());
        this.objectMap.put("red chest", new RedChest());
        this.objectMap.put("salmon", new Salmon());
        this.objectMap.put("yellow fish", new YellowFish());
        this.objectMap.put("pine tree", new PineTree());
        this.objectMap.put("oak tree", new OakTree());
        this.objectMap.put("rose", new Rose());
        this.objectMap.put("marganit", new OakTree());
    }

    public String answerQuestion(String question) {
        question = question.trim().toLowerCase();

        for (String key : this.objectMap.keySet()) {
            if (question.contains(key)) {
                Living obj = this.objectMap.get(key);

                // שאלת isA
                for (String classification : classes) {
                    if ((question.contains("is") || question.contains("does")) && question.contains(classification)) {
                        return obj.isA(classification) ? "Yes" : "No";
                    }
                }

                // שאלת תכונה
                for (String prop : characteristics) {
                    if (question.contains(prop)) {
                        return obj.hasProperty(prop) ? "Yes" : "No";
                    }
                }
            }
        }

        return "Not a valid question";
    }
}
