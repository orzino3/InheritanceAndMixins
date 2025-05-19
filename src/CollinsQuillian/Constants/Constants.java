package CollinsQuillian.Constants;

import java.util.List;

public class Constants {
    public static final List<String> ABSTRACT_CLASSES = List.of(
            "animal",
            "bird",
            "living",
            "fish",
            "plant",
            "flower",
            "tree"
    );

    public static final List<String> CHARACTERISTICS = List.of(

            "can grow",
            "alive",
            "can move",
            "has skin",
            "has roots",
            "can swim",
            "has scales",
            "has gills",
            "can fly",
            "has wings",
            "has feathers",
            "has petals",
            "has leaves",
            "beautiful",
            "has bark",
            "has branches",
            "big",
            "red",
            "yellow",
            "can sing",
            "green"
            );

    public static String FORBIDDEN_WORD_1 = "color";
    public static String FORBIDDEN_WORD_2 = "size";
    public static String FORBIDDEN_WORD_3 = "has";
    public static String DEFAULT_MESSAGE = "INVALID QUESTION!";
    public static String OPENING_MESSAGE = """
        \nAsk me a question.
        ---------------------
        Please use proper english
        Example:
        The color of ..... is ..... ?
        Is a ..... a type of ..... ?
        
        Output: Yes / No + Inheritance Tree.
        ---------------------
        
        To stop asking questions, just type - "Finish"\s""";

    public static String END_WORD = "Finish";
    public static String ANSWER_OPENING = "Answer: ";
}
