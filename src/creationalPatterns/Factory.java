package creationalPatterns;


import Logic.PatternsService;

public class Factory {
    PatternsService factoryService;

    public Factory() {

        factoryService = new PatternsService();
        factoryService.patternLogic("We use this pattern when when you can’t anticipate " +
                "what type of objects you’ll need to create or how to create them.", "" +
                "https://www.google.pl/", "https://www.google.pl/", "Factory");
    }
}
