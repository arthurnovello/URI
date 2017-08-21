#import <stdio.h>

int main(){
	float vol;
	int raio;
	scanf("%d", &raio);

	vol = (4/3.00)*3.14159*raio*raio*raio;

	printf("VOLUME = %.3lf\n", vol);
}
