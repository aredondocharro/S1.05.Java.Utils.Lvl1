public class Main {
    public static void main(String[] args) {
        String entryPath = "Level1_Exercices_Folder";
        String outPath = "DirectoryTree.txt";
        String readFile = "FileToBeRead.txt";
        String serPath = "Coin.ser";
        DirecotryService service = new DirecotryService();
        service.printListDirectory(entryPath); //exercise 2
        service.writeListDirectory(entryPath,outPath);//exercise 3
        FileReader.ReadFile(readFile); //exercise 4
        SerializeWriter.CoinToSer(CoinManager.CoinMaker(),serPath);//exercise 5
        SerializeReader.ReadSerializeCoin(serPath);//exercise 5
    }
}