package io.portfolio;

public final class PolicyTest {
    public static void main(String[] args) {
        var signalcase_1 = new Policy.Signal(66, 71, 25, 12, 9);
        if (Policy.score(signalcase_1) != 71) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_1).equals("review")) throw new AssertionError("decision mismatch");
        var signalcase_2 = new Policy.Signal(84, 86, 8, 21, 11);
        if (Policy.score(signalcase_2) != 116) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_2).equals("review")) throw new AssertionError("decision mismatch");
        var signalcase_3 = new Policy.Signal(91, 96, 14, 24, 5);
        if (Policy.score(signalcase_3) != 83) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_3).equals("review")) throw new AssertionError("decision mismatch");
    }
}
