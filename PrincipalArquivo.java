package br.com.NewtonPaiva.ExemploIO;
import java.io.IOException;
public class PrincipalArquivo {
    public static void main(String[]args) throws IOException{
        String path = "/tmp/teste.txt";

        ManipuladorArquivo.escritor(path);
        ManipuladorArquivo.leitor(path);
    }
}
