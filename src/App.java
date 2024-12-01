import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Locatarios.Locatarios;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        //scan para entrada de dados
        //criar uma list para adicionar os locatarios
        List <Locatarios> locatario  = new ArrayList<>();
        final int qtdDePontos = 4;

        for(int i=0;i<qtdDePontos;i++){
            Locatarios nome = new Locatarios();
            nome.setNome(entrada.nextLine());
            nome.setPonto(entrada.nextLine());
            locatario.add(i,nome);
            System.out.println(i+" teste "+locatario);
            }
            entrada.close();

System.out.println(locatario);
        }

    }

