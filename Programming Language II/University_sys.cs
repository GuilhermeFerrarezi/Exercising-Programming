using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Colecoes
{
    class Program
    {
        static void Main(string[] args)
        {
            Departamento d = new Departamento();
            
            d.nome = "vendas";
            d.adicionaFunc("Maria", "6765657", 123);
            d.adicionaFunc("Pedro", "2213438", 789);

            d.imprimeDepartamento();

            Console.ReadKey();
        }
    }
            }
    }
}

//

using System;
using System.Collections.Generic;
using System.Text;

namespace Colecoes
{
    class Funcionario
    {
        public Funcionario(string nome, int matricula, string cpf)
        {
            this.Nome = nome;
            this.Matricula = matricula;
            this.CPF = cpf;
        }
        
        private string Nome;
        private string CPF;
        private int Matricula;
        
        public void setNome(string nome){
            this.Nome = nome
        }

         public string getNome(string nome){
            this.Nome = nome
        }
        
        public void setMatricula(string matricula){
            this.Matriculaome = matricula
        }

         public string getMatricula(string matricula){
            this.Matricula = matricula
        }
        
        public void setCPF(string cpf){
            this.CPF = cpf
        }

         public string getCPF(string cpf){
            this.CPF = cpf
        }

        public void imprimeFuncionario()
        {
            Console.WriteLine("Nome: ", this.Nome, "\nMatricula: ", this.Matricula, "\nCPF: ", this.CPF);
        }

    }
}

//

using System;
using System.Collections.Generic;
using System.Text;
using System.Collections;

namespace Colecoes
{
    class Departamento
    {
        public string Nome { get; set; }
        ArrayList ListaFuncionarios = new ArrayList();
        
        public Departamento(string nome)
        {
            this.Nome = nome;
        }

        public Departamento() { }

        public void adicionaFuncionario(string nome, string cpf, int matricula)
        {
            Funcionario f = new Funcionario(nome, cpf, matricula)
            ListaFuncionarios.Add(f);
        }

        public void imprimeDepartamento()
        {
            foreach(Funcionario f in ListaFuncionarios)
            {
                f.imprimeFuncionario();
            }
        }
    }
}

