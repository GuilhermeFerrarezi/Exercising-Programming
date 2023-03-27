#include <stdio.h>
#include <locale.h>

int main () {
    setlocale(LC_ALL, "Portuguese");

     int i, sexo[1000], cfem=0, cmasc=0, cadultos=0, soma=0, somaimasc=0, somahfem=0;
     float mitotal, mhfem, mimasc, adultos;
    
    for(i=0; i<1000; i++){
        printf("\nSelecione um número de acordo com o sexo da(o) cidadã(o):\n0 - Feminino\n1 - Masculino\n\n");
        scanf("%d", &sexo[i]);

        if(sexo[i]==1)
        cmasc++;
        else
        cfem++; }
    
    int fem[cfem], masc[cmasc], idademasc[cmasc], idadefem[cfem], alturafem[cfem], alturamasc[cmasc];
    
	for(i=0; i<cmasc; i++){
            printf("\nInsira a idade do %d° homem:\n", i+1);
            scanf("%d", &idademasc[i]);
            soma += idademasc[i];
            somaimasc += idademasc[i];
                if(idademasc[i]>=18 && idademasc[i]<=35)
                cadultos++;

            printf("\nAgora, insira a altura em centímetros:\n");
            scanf("%d", &alturamasc[i]);
    }
    for(i=0; i<cfem; i++){
            printf("\nInsira a idade da %dª mulher:\n", i+1);
            scanf("%d", &idadefem[i]);
            soma += idadefem[i];
                if(idadefem[i]>=18 && idadefem[i]<=35)
                cadultos++;
        
            printf("\nAgora, insira a altura em centímetros:\n");
            scanf("%d", &alturafem[i]);
            somahfem+=alturafem[i];
    }

mitotal = soma/1000;
mhfem = somahfem/cfem;
mimasc = somaimasc/cmasc;
adultos = (cadultos/0.01)/1000;

printf("\n\nA média da idade de todos os cidadãos é %.1f anos.\n", mitotal);
printf("A média da altura de todas as cidadãs (mulheres) é %.1f centímetros.\n", mhfem);
printf("A média da idade de todos os cidadãos (homens) é %.1f anos.\n", mimasc);
printf("A porcentagem de cidadãos que têm entre 18 e 35 anos de toda a população é %.1f porcento.", adultos);

    return 0;
}
