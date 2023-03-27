using System;

namespace Herança
{
    class Program
    {
        static void Main(string[] args)
        {
            Aluno a1 = new Aluno();
            a1.Nome = "Ricardo";
            a1.Mat = "1529";
            a1.RG = "45887";
            a1.CPF = "55841";
            a1.Address = "Rua Santo André, 123";
            a1.P1 = 9.6F;
            a1.P2 = 5.9F;
            a1.Faltas = 2;
        }
    }
}
/////////////////
using System;
using System.Collections.Generic;
using System.Text;

namespace Herança
{
    class Pessoa
    {
        public string Nome { get; set; }
        public string Address { get; set; }
        public string CPF { get; set; }
        public string RG { get; set; }

        public Pessoa (string nome, string address, string CPF, string RG)
        {
            this.Nome = nome;
            this.Address = address;
            this.CPF = CPF;
            this.RG = RG;

        }
        public Pessoa()
        {

        }
    }
    class Aluno : Pessoa
    {

        public string Mat { get; set; }
        public float  P1 { get; set; }
        public float P2 { get; set; }
        public int Faltas { get; set; }


        public Aluno(string mat, float P1, float P2, int faltas, string nome, string address, string CPF, string RG) : base(nome, address, CPF, RG)
        {
            this.Mat = mat;
            this.P1 = P1;
            this.P2 = P2;
            this.Faltas = faltas;
            this.Nome = nome;
            this.Address = address;
            this.CPF = CPF;
            this.RG = RG;
        }
        public Aluno()
        {

        }
        public void imprimePessoa()
        {
            Console.WriteLine("Nome: " + this.Nome + "Endereço: " + this.Address + "CPF: " + this.CPF + "RG: " + this.RG);
        }
        public void media()
        {
            float media_de_aprovacao = 7;
            float media = (this.P1 + this.P2) / 2;

            if (media < media_de_aprovacao || this.Faltas > 10)
                Console.WriteLine("Média: "+media+"Aluno reprovado");
            else if (media > 3 && media <7)
                Console.WriteLine("Média: " + media + "Aluno em reavaliação");
            else
                Console.WriteLine("Média: " + media + "Aluno aprovado");
        }

    }
}

