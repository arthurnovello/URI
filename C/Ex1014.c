#include <stdio.h>

int main(){
	int km;
	float l;

	scanf("%d", &km);
	scanf("%f", &l);

	float kml;

	kml = km/l;

	printf("%.3f km/l\n", kml);
}
