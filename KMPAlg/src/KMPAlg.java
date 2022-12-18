import java.util.Arrays;

public class KMPAlg {

    private final char[] sample;
    private final int[] maxSuffLength;

    public KMPAlg(String sample) {
        this.sample = sample.toCharArray();
        maxSuffLength = new int[sample.length()];
        fillMaxSuffLength();
    }

    private void fillMaxSuffLength() {
        int ind = 1;
        int jnd = 0;

        while (ind < sample.length) {
            if (sample[jnd] == sample[ind]) {
                maxSuffLength[ind] = jnd + 1;
                ++ind;
                ++jnd;
            } else {
                if (jnd == 0) {
                    maxSuffLength[ind] = 0;
                    ++ind;
                } else {
                    jnd = maxSuffLength[jnd - 1];
                }
            }
        }
    }

    public void matchSample(String phrase) {
        int phraseInd = 0;
        int sampleInd = 0;
        boolean isFoundSomething = false;
        char[] symbols = phrase.toLowerCase().toCharArray();

        while (phraseInd < phrase.length()) {
            if (symbols[phraseInd] == sample[sampleInd]) {
                ++phraseInd;
                ++sampleInd;
                if (sampleInd == sample.length) {
                    isFoundSomething = true;
                    System.out.print("Found sample " + Arrays.toString(sample) + ", index: ");
                    System.out.println(phraseInd - sample.length);
                    sampleInd = 0;
                }
            } else {
                if (sampleInd > 0) {
                    sampleInd = maxSuffLength[sampleInd - 1];
                } else {
                    ++phraseInd;
                }
            }
        }
        if (!isFoundSomething) {
            System.out.println("Didn't find anything");
        }
    }
}
