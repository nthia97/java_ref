#include <iostream>
#include <cstring>

using namespace std;

int main() {
  
  int n,i;
  long x = 0;
  char s[3];
  long y;
  
  cin>>n;
  for (i = 0; i < n; i++) {
    cin>>s;
    cin>>y;
    
    if (strcmp(s, "add")==0) {
      if (y>=0) {
        x= x+y;
      }
    }
    if (strcmp(s, "set")==0) {
      if (y>0 && y>x) {
        x = y;
      }
    }
  }
	cout<<x<<endl;

  return 0;
}
