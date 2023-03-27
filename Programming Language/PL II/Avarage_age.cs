namespace Atividade2
{
    class Program
    {
        static void Main(string[] args)
        {
            decimal media;
            Funcionario[] f1 = new Funcionario[4];

            f1[0] = new Funcionario();
            f1[0].setNome("Luana");
            f1[0].setMatricula(3758);
            f1[0].setSalario(1800);
            
            f1[1] = new Funcionario();
            f1[1].setNome("Ruan");
            f1[1].setMatricula(9586);
            f1[1].setSalario(3800);

            f1[2] = new Funcionario();
            f1[2].setNome("Rodrigo");
            f1[2].setMatricula(0284);
            f1[2].setSalario(1500);

            f1[3] = new Funcionario();
            f1[3].setNome("Richard");
            f1[3].setMatricula(2546);
            f1[3].setSalario(1400);

            media = (f1[0].getSalario() + f1[1].getSalario() + f1[2].getSalario() + f1[3].getSalario()) / 4;

            Console.WriteLine("O(s) funcionário(s) com salário acima da média salarial é(são): ");

            for(int i=0; i < 4; i++)
            {
                if (f1[i].getSalario() > media)
                    f1[i].imprimir();
            }
            
            Console.ReadKey();
        }
    }

    class Funcionario
    {
        private string Nome;
        private int Matricula;
        private decimal Salario;

        //get e set
        public string getNome()
        {
            return this.Nome;
        }
        public void setNome(string Nome)
        {
            this.Nome = Nome;
        }

        public int getMatricula()
        {
            return this.Matricula;
        }
        public void setMatricula(int Matricula)
        {
            this.Matricula = Matricula;
        }

        public decimal getSalario()
        {
            return this.Salario;
        }
        public void setSalario(decimal Salario)
        {
            this.Salario = Salario;
        }
                public void imprimir()
        {
            Console.WriteLine("Nome: " + this.Nome + ", matrícula: " + this.Matricula + ", salário: " + this.Salario);
        }
    }
}
