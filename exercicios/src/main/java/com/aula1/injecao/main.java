package main.java.com.aula1.injecao;

public class main {
    public static void main(String[] args) {

        Estudante estudante = new Estudante("Hugo");
        Docente docente = new Docente("Analu");

        Enem enemEstudante = new Enem(estudante);
        Enem enemDocente = new Enem(docente);

        enemEstudante.iniciarProva();
        enemDocente.iniciarProva();

    }
}
