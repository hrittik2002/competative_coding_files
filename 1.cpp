#include <bits/stdc++.h>

# define ll long long int


using namespace std;

ll solve_hrittik(){
    ll l;
    ll r;
    cin >>l>>r;
    for(int i = 0; i < 3; i++){
        if(l>r){
            return 0;
        }
        if(l <= r && l % 3 == 0){
            break;
        }
        else l++;
    }
    for(int j = 0; j < 3; j++){
        if(l <= r && r % 3 == 0){
            break;
        }
        else r--;
    }

    ll ans = (l / 3);
    ll bns = (r / 3);
    ll sol = abs(ans-bns) + 1;
    return sol;
}
int main(){
    ll t;
    cin >> t;
    while (t--)
    {
        /* code */
        cout<<solve_hrittik()<<"\n";
    }
    return 0;
    
}