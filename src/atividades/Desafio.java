package atividades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class Desafio {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int alunos = toInt(read());
        int index, numero, eliminado;

        List<Student> roda;
        List<String> vencedores = new ArrayList<>();

        while(alunos > 0) {
            roda = new ArrayList<>();
            index = 0;

            for(int count = 0; count < alunos; count++) {
                String[] detalhes = read().split(" ");
                roda.add(new Student(detalhes[0], detalhes[1]));
            }

            numero = roda.get(index).getNumero();
            while(roda.size() > 1) {
//                eliminado = (numero % roda.size()) + index;

                if(numero % 2 == 0) {
                    eliminado = (roda.size() - (numero % roda.size()) + index) % roda.size();
                } else {
                    eliminado = (numero % roda.size() + index) % roda.size();
                }

//                eliminado = eliminado % roda.size();

                numero = roda.get(eliminado).getNumero();

                roda.remove(eliminado);

                if(numero % 2 == 0) {
                    index = eliminado <= roda.size() - 1? eliminado: 0;
                } else {
                    index = eliminado == 0? roda.size() - 1 : eliminado - 1;
                }

            }

            vencedores.add(roda.get(0).getName());
            roda.clear();

            alunos = toInt(read());
        }
        vencedores.forEach(s -> System.out.println("Vencedor(a): " + s));


        out.close();
    }

    private static String read() throws IOException {
        return in.readLine();
    }

    private static int toInt(String s) {
        return Integer.parseInt(s);
    }

}

class Student {

    private String name;
    private Integer numero;

    public Student(String nome, String numero) {
        this.name = nome;
        this.numero = Integer.parseInt(numero);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}