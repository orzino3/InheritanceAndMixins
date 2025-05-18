package CollinsQuillian;

import CollinsQuillian.Abstract.Living;

import java.util.*;

public class QuestionProcessor {
    private final List<String> classes = List.of("animal", "bird", "living", "fish", "plant", "flower","tree");
    private final List<String> characteristics = List.of("can fly", "can swim", "can grow", "has wings", "has scales", "has gills", "red", "yellow", "can sing","green","has leaves");
    private final Map<String, Living> objectMap = new HashMap<>();

    public QuestionProcessor() {
        this.objectMap.put("canary", new Canary());
        this.objectMap.put("robin", new Robin());
        this.objectMap.put("salmon", new Salmon());
        this.objectMap.put("sunfish", new Sunfish());
        this.objectMap.put("pine tree", new PineTree());
        this.objectMap.put("oak tree", new OakTree());
        this.objectMap.put("rose", new Rose());
        this.objectMap.put("daisy", new Daisy());
    }

    public String answerQuestion(String question) {
        question = question.trim().toLowerCase();

        for (String key : this.objectMap.keySet()) {
            if (question.contains(key)) {
                Living obj = this.objectMap.get(key);

                for (String classification : classes) {
                    if (( question.contains("does")) && question.contains(classification) && !question.contains("color")&& !question.contains("has")) {
                        return obj.isA(classification) ? "Yes\n" + getInheritanceChain(obj) : "No\n" + getInheritanceChain(obj);
                    }
                }

                for (String prop : characteristics) {
                    if (question.contains(prop)) {
                        return obj.hasProperty(prop) ? "Yes\n" + getInheritanceChain(obj) : "No\n" + getInheritanceChain(obj);
                    }
                }
            }
        }

        return "Not a valid question";
    }

    public static String getInheritanceChain(Object obj) {
        StringBuilder text = new StringBuilder();
        Class<?> currentClass = obj.getClass();

        while (currentClass != Object.class) {
            text.append(currentClass.getSimpleName()).append(" -> ");
            currentClass = currentClass.getSuperclass();
        }

        if (text.length() >= 4) {
            text.setLength(text.length() - 4);
        }

        return text.toString();
    }
}
