#import <stdio.h>

int main() {
	int cod1, cod2, n1, n2;
	float val1, val2, valpg;

	scanf("%d %d %f", &cod1, &n1, &val1);
	scanf("%d %d %f", &cod2, &n2, &val2);

	valpg = (n1*val1)+(n2*val2);

	printf("VALOR A PAGAR: R$ %.2f\n", valpg);
}
