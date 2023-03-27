package edIII;

import java.util.Arrays;

public class Aluno {
    String nome;
    int codmat;
    String cpf;
    char sexo;
    double P1;
    double P2;
    double P3;
    double media;
}

public Aluno(String nome, int codmat, String cpf, char sexo, double P1, double P2, double P3) {
    this.nome = nome;
    this.codmat = codmat;
    this.cpf = cpf;
    this.sexo = sexo;
    this.P1 = P1;
    this.P2 = P2;
    this.P3 = P3;
}

public void Imprime_Aluno() {
    System.out.println("Nome: "+nome+"\nMatricula: "+codmat+"\nCPF: "+cpf+"\nNota P1: "+P1+"\nNota P2: "+P2+"\nNota P3: "+P3);
}

public void Imprime_Sexo() {

if (sexo == 'F'){
    System.out.println("O sexo de "+ nome + " é feminino.");
}

else {
    System.out.println("O sexo de "+ nome + " é masculino.");
}

}

public double Media_Aluno(){
    double media;
    double[] notas = new double[3];

    notas[0] = this.P1;
    notas[1] = this.P2;
    notas[2] = this.P3;

    Arrays.sort(notas);

    this.media = (notas[1] + notas[2]) / 2;
}


public void Imprime_Media(){
    System.out.println("A média final é "+this.media);
}

public void Resultado(){
    if (this.media >= 6)
        System.out.println("APROVADO");
    }
    else{
        System.out.println("REPROVADO");
    }
}
