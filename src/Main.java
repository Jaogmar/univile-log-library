import br.univille.log.*;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = LoggerFactory.onConsole();
        logger1.log(Level.WARNING, "Mensagem no console!");

        Logger logger2 = LoggerFactory.onFile();
        logger2.log(Level.ERROR, "Mensagem no arquivo!");
    }
}
