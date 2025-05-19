package CollinsQuillian;

import CollinsQuillian.Abstract.Living;
import CollinsQuillian.Constants.Constants;

import java.util.*;

public class QuestionProcessor {
    private final List<String> classes = Constants.ABSTRACT_CLASSES;
    private final List<String> characteristics = Constants.CHARACTERISTICS;
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
        StringBuilder sb = new StringBuilder();
        question = question.trim().toLowerCase();

        for (String key : this.objectMap.keySet()) {
            if (question.contains(key)) {
                Living obj = this.objectMap.get(key);

                for (String classification : classes) {
                    if ((question.contains("is")) && question.contains(classification)
                            && !question.contains(Constants.FORBIDDEN_WORD_1)&& !question.contains(Constants.FORBIDDEN_WORD_2)
                            && !question.contains(Constants.FORBIDDEN_WORD_3)) {
                        return printAnswer(obj,obj.isA(classification));
                    }
                }

                for (String prop : characteristics) {
                    if (question.contains(prop)) {
                        return printAnswer(obj,obj.hasProperty(prop));
                    }
                }
            }
        }

        return Constants.DEFAULT_MESSAGE;
    }

    private static String getInheritanceChain(Object obj) {
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

    private String printAnswer(Object obj, boolean statement){
        return (statement ? "Yes" : "No") + "\n" + getInheritanceChain(obj);
    }
}
