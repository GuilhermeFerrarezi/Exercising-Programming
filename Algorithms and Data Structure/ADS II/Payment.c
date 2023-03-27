#include <stdio.h>
#include <locale.h>
int main(){
    setlocale (LC_ALL, "Portuguese");
    
    int i, metodo[150], ccheque=0, ccc=0, cdinheiro=0;
    float somacheque, somacc, somadin, somatotal;
    
    printf("ADMINISTRAÇÃO DE PAGAMENTOS - DANCETERIA\n\n");
    
    for(i=0;i<150;i++) {
        printf("\nDigite o número de acordo com o método de pagamento do %dº cliente: \n1 - CHEQUE\n2 - CARTÃO DE CRÉDITO\n3 - DINHEIRO(CÉDULAS)\n\n", i+1);
        scanf("%d", &metodo[i]);
            if(metodo[i]==1) 
                ccheque++;
            else if(metodo[i]==2)
                ccc++;
            else
                cdinheiro++; }
                
    float cheque[ccheque], cc[ccc], dinheiro[cdinheiro];
    
    for(i=0;i<150;i++) {
    //cheque
    if(metodo[i]==1) {
            printf("\n\nDigite o valor pago pelo %dº cliente: R$ ", i+1);
            scanf("%f", &cheque[i]);
            somacheque+=cheque[i];
        } 
        
    //cc
    if(metodo[i]==2) {
            printf("\n\nDigite o valor pago pelo %dº cliente: R$ ", i+1);
            scanf("%f", &cc[i]);
            somacc+=cc[i];
        } 
    
    //dinheiro
    if(metodo[i]==3) {
            printf("\n\nDigite o valor pago pelo %dº cliente: R$ ", i+1);
            scanf("%f", &dinheiro[i]);
            somadin+=dinheiro[i];
        } }
    
    //soma total   
    somatotal = somacheque+somacc+somadin;
    printf("\nO total de dinheiro entrado é R$ %.2f", somatotal);
    
    printf("\n\nHouveram %d pagamento(s) em cheque.\nO total de dinheiro entrado a partir desse método de pagamento foi R$ %.2f", ccheque, somacheque);
    
    printf("\n\nHouveram %d pagamento(s) em cartão de crédito.\nO total de dinheiro entrado a partir desse método de pagamento foi R$ %.2f", ccc, somacc);
    
    printf("\n\nHouveram %d pagamento(s) em dinheiro.\nO total de dinheiro entrado a partir desse método de pagamento foi R$ %.2f", cdinheiro, somadin);
}
