#include <bits/stdc++.h>

# define ll long long int


using namespace std;


bool pow(ll n){
    if(n != 0 && (n & (n-1)) == 0){
        return true;
    }
    else{
        return false;
    }
}
void solve_hrittik(){
    ll n;
    cin>>n;
    

    if(n == 2){
        cout<<"Bob"<<"\n";
        return;
    }
    if(n == 1){
        cout<<"Alice"<<"\n";
        return;
    }
    if(n % 2 == 0){
        if(pow(n+2) == true){
            cout<<"Bob"<<"\n";
        }
        else{
            cout<<"Alice"<<"\n";
        }
        return;
    }
    if(n % 2 != 0){
        if(pow(n+1) == true){
            cout<<"Alice"<<"\n";
        }
        else{
            cout<<"Bob"<<"\n";
        }
        return;
    }

}
int main(){
    ll t;
    cin >> t;
    while (t--)
    {
        /* code */
        solve_hrittik();
    }
    return 0;
    
}