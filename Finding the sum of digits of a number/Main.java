#include <stdio.h>
int main() {
  int a, rem, sum=0;
  scanf("%d", &a);
  while(a>0)
  {
  rem = a%10;
  a/=10;
  sum+=rem;
  }
  printf("%d", sum);
	return 0;
}