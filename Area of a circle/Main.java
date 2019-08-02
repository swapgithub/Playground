#include <stdio.h>
#include <math.h>
#define PI 3.14
 
void main()
{   int dia;
    float r, area;
 
    scanf("%d", &dia);
    r=dia/2.0;
    area = PI * pow(r, 2);
    printf("%.2f\n", area);
}