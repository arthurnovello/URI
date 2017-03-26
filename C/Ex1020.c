#include <stdio.h>

int main(){
	int D;
	scanf("%d", &D);

	int ano, mes, dia;
	ano = D/365;
	mes = (D%365)/30;
	dia = (D%365%30);

	printf("%d ano(s)\n", ano);
	printf("%d mes(es)\n", mes);
	printf("%d dias(s)\n", dia);
}
