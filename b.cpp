#include<bits/stdc++.h>
using namespace std;
#define ll long long int

void solve_helper()
{
    int n;
    cin>>n;
    string s;
    string p;
    cin>>s>>p;
    if(s == p){
        cout<<"YES"<<"\n";
        return;
    }
    int s0 = 0 , s1 = 0 , p0 = 0 , p1 = 0;
    for(int i = 0; i < s.size(); i++){
        if(s[i] == '0'){
            s0++;
        }
        else{
            s1++;
        }
        if(p[i] == '0'){
            p0++;
        }
        else{
            p1++;
        }
    }
    if(p0 && p1){
        cout<<"YES"<<"\n";
    }
    else{
        cout<<"NO"<<"\n";
    }

}
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
 
    int t;
    cin>>t;
    while(t--) {
        solve_helper();
    }
    return 0;
}