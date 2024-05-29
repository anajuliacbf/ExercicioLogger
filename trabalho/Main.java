package trabalho;
public class Main {
    public static void main(String[] args) {
        Logger consoleLogger = new LoggerConsole();
        consoleLogger.log(Level.WARNING, "Aviso: Isso é um aviso!");

        Logger fileLogger = new LoggerFile("log.txt");
        fileLogger.log(Level.ERROR, "Erro: Algo deu errado!");

    }
}