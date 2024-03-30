
public class Main {
    public static void main(String[] args) {
        ReaderFile rF = new ReaderFile();
        WordsCounter wC = new WordsCounter(rF.readFile());
        System.err.println("Общее количество слов в файле: " + wC.getCntOfWords());
        System.out.println("Самое длинное слово: " + wC.getLongerWord());
        System.out.println("Количество уникальных слов в файле: ");
        wC.printWords();
    }
}
