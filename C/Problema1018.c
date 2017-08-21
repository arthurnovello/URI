#include <stdio.h>

int main(){
	int Din, D, cem, ciq, vin, dez, cin, dois, um;
	scanf("%d", &Din);
	D = Din;

	cem = D/100;
	D = D-(cem*100);
	ciq = D/50;
	D = D-(ciq*50);
	vin = D/20;
	D = D-(vin*20);
	dez = D/10;
	D = D-(dez*10);
	cin = D/5;
	D = D-(cin*5);
	dois = D/2;
	D = D-(dois*2);
	um = D/1;

	printf("%i\n", Din);
	printf("%i nota(s) de R$ 100,00\n", cem);
	printf("%i nota(s) de R$ 50,00\n", ciq);
	printf("%i nota(s) de R$ 20,00\n", vin);
	printf("%i nota(s) de R$ 10,00\n", dez);
	printf("%i nota(s) de R$ 5,00\n", cin);
	printf("%i nota(s) de R$ 2,00\n", dois);
	printf("%i nota(s) de R$ 1,00\n", um);


}
