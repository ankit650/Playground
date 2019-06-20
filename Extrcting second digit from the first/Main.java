#include <stdio.h>
int main() {
 int l,n,rev,s;
  scanf("%d",&n);
  while(n>0)
  {
    l=n%10;
    rev=((rev*10)+l);
    n=n/10;
  }
  s=((rev/10)%10);
  printf("%d",s);
	return 0;
}