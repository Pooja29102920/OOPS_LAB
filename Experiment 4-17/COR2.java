class Translator {
    Translator(String text) {
        translate(text);
    }
    
    void translate(String text) {
        System.out.println("Translating text: " + text);
    }
}

class EnglishToFrench extends Translator {
    EnglishToFrench(String text) {
        super(text);
    }
    
    @Override
    void translate(String text) {
        System.out.println("Translation to French: Traduction en français");
    }
}

class EnglishToSpanish extends Translator {
    EnglishToSpanish(String text) {
        super(text);
    }
    
    @Override
    void translate(String text) {
        System.out.println("Translation to Spanish: Traducción al español");
    }
}

class EnglishToGerman extends Translator {
    EnglishToGerman(String text) {
        super(text);
    }
    
    @Override
    void translate(String text) {
        System.out.println("Translation to German: Übersetzung ins Deutsche");
    }
}

public class COR2 {
    public static void main(String[] args) {
        new EnglishToFrench("Hello");
        new EnglishToSpanish("Hello");
        new EnglishToGerman("Hello");
    }
}
