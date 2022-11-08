package br.com.NewtonPaiva.ExemploIO;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class ManipuladorArquivo {
    public static void leitor(String path) throws IOException{
        BufferedReader buffRead =  new BufferedReader(new FileReader(path));
        String linha = "";
        while (true){
            if (linha!=null){
                System.out.println(linha);
            }
            else{
                break;
            }

            linha = buffRead.readLine();
        }
        buffRead.close();
    }


}
