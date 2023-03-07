#include<bits/stdc++.h>

using namespace std;

int prime(long n){
    if(n==2||n==3||n==5||n==7) return 1;
    return 0 ; 
}

int isPrime(long n){
    while(n>0){
        if(prime(n%10)==0) return 0 ;
        n/=10 ;
    }
    return 1 ; 
}
int main(){
    long n ;  
    vector<long> v ;
    map<long, long> m ; 
    while(cin>>n){
        if(isPrime(n)){
            v.push_back(n) ; 
            m[n]++ ; 
        }
    }
    for(int i=0 ; i<v.size() ; i++){
        if(m[v[i]]) {
            cout<<v[i]<<" "<<m[v[i]]<<endl ; 
            m[v[i]] = 0 ;
        }
    }
}