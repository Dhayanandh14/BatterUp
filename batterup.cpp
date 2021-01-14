#include <iostream>
using namespace std;
int main() { 
    int tot=0,mcount=0,pcount=0,n,p;
    double sum=0;
      cin>>n;
      for(int i=0;i<n;i++){
        cin>>p;
        if(p==-1){mcount=mcount+1;}
        else{sum=sum+p;}
        pcount = pcount +1;  
      }   
      tot=pcount-mcount;
      cout<<sum/tot;
}