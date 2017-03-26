#include <stdio.h>
#include <math.h>

int main(){
	float  x, y, x1, y1, x2, y2;

	scanf("%f %f", &x1, &y1);
	scanf("%f %f", &x2, &y2);
	x = pow(x2-x1, 2);
	y = pow(y2-y1, 2);
	double p = x+y;
	float d = sqrt(p);

	printf("%.4f\n", d);
}
