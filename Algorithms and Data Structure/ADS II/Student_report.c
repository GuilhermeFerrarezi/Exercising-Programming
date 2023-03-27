#include <stdio.h>
#include <locale.h>

 float calculamedia(float N1, float N2)
{
	float md;
    md = (N1 + N2)/2;
    return (md);
}


int main() {
    
    setlocale(LC_ALL, "Portuguese");
    int i, a;
    float soma, mediaTurma;
    
    printf("Digite o número de alunos da sala: \n");
    scanf("%d", &a);
	
	const int TAM = a;
    
    struct estruturaAluno{
         int matricula;
         float N1;
         float N2;
         float media;
    };
    
    
    struct estruturaAluno arr[TAM];
    
    for (i=0; i<TAM; i++) {
       printf( "|||||||||||||||||||| DADOS DO ALUNO %d ||||||||||||||||||| \n\n", i+1);
       printf( "Matrícula do aluno: ");
       scanf ("%d" ,&arr[i].matricula);
       printf( "Nota N1: ");
       scanf ("%f", &arr[i].N1);
       printf( "Nota N2: ");
       scanf ("%f", &arr[i].N2);
       arr[i].media = calculamedia(arr[i].N1, arr[i].N2);
       soma += arr[i].media;
   }
   
    mediaTurma = soma/TAM;
    

    for (i=0; i<TAM; i++) {
     	printf( "\nBOLETIM DO ALUNO %d\n",  i+1);
        printf( "\nNota N1: %.1f", arr[i].N1);
        printf( "\nNota N2: %.1f", arr[i].N2);
        if (arr[i].media > mediaTurma)
	        printf( "\nMédia: %.1f - ACIMA DA MÉDIA DA TURMA\n\n", arr[i].media);
	    else if (arr[i].media < mediaTurma)
			printf( "\nMédia: %.1f - ABAIXO DA MÉDIA DA TURMA\n\n", arr[i].media);
		else 
			printf( "\nMédia: %.1f - NA MÉDIA DA TURMA\n\n", arr[i].media);
    } 
	
	printf("|||||||||||||||||||| RESUMO DA TURMA |||||||||||||||||||\n\n");
	printf( "\nMédia: %.1f", mediaTurma);
	printf( "\nQuantidade de alunos: %d", TAM);
	
       return (0);
}
