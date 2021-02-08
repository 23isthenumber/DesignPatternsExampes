package structuralPatterns;

import logic.Pattern;
import logic.PatternsService;

public class Proxy implements Pattern {

    PatternsService proxyService;

    public Proxy() {

        usageMessage();

        proxyService = new PatternsService();
        proxyService.patternLogic(
                "https://github.com/23isthenumber/DesignPatternsExampes/" +
                        "tree/main/src/structuralPatterns/proxyDemo",
                "https://raw.githubusercontent.com/23isthenumber/" +
                        "DesignPatternsExampes/main/src/structuralPatterns/" +
                        "proxyDemo/proxy_pattern_uml_diagram.jpg", "Proxy");
    }

    @Override
    public void usageMessage() {
        System.out.println("In proxy pattern, a class represents " +
                "functionality of another class.");
    }

}
