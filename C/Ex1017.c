#include <stdio.h>

int main(){
	int t, v;

	scanf("%d", &t);
	scanf("%d", &v);

	float L;
	L = (t*v)/12.0;
	
	printf("%.3f", L);
}
