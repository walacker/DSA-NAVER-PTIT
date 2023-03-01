#include <bits/stdc++.h>
using namespace std;

bool prime(long long n){
    if(n<2) return false;
        if(n==2 || n==3) return true ;
        if(n%2==0 || n%3==0) return false ;
        for(long i=5;i<=sqrt(n);i+=6){
            if(n%i==0||n%(i+2)==0) return false ;
        }
        return true ;
}

long long uoc(long long n){
    int i ; 
    long long x ; 
    for(i = 1 ; i<=sqrt(n) ; i++){
        if(n%i==0){
            if(prime(n/i)) return n/i ; 
            else if(prime(i)) x = i ;  
        }
    }
    return x ; 
}


int main()
{
    int t;
    long long n;
    cin>>t;
    while(t--){
        cin>>n;
        cout << uoc(n)<<endl;
    }

}