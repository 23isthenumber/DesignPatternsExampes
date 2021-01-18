package logic;

public class PatternTypeFactory {
    public PatternType getPatternType(String patternType) {
        if (patternType == "Creational") {
            return new Creational();
        }
        return null;
    }
}