#include <stdio.h>
int main() {
  int n, last;
  scanf("%d", &n);
  last = n%10;
  while(n>10)
  { n/=10;
  }
  printf("%d", (last+n));
  return 0;
}