import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.SpeechResult;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;

public class test {       
                                     
    public static void main(String[] args) throws Exception {
                                     
        Configuration configuration = new Configuration();

        configuration.setAcousticModelPath("en-us");
        configuration.setDictionaryPath("cmudict-en-us.dict");
        //configuration.setLanguageModelPath("bin.bin");
        configuration.setGrammarPath("en-us");
        configuration.setUseGrammar(true);
        configuration.setGrammarName("i");
        LiveSpeechRecognizer recognizer = new LiveSpeechRecognizer(configuration);
        recognizer.startRecognition(true);
        SpeechResult result = recognizer.getResult();
        while ((result = recognizer.getResult()) != null) {
            System.out.format("found: " + result.getHypothesis());
        }
        recognizer.stopRecognition();
    }
}