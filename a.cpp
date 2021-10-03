#include<bits/stdc++.h>
using namespace std;
#define ll long long int

int main()
{
    //fast input and output
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
 
    int t;
    cin>>t;

    while(t--) {

    ll n,k;

    cin>>n>>k;

    string str;
    cin>>str;

    char res = str[0];

    int count = 0;

    for(int i=1;i<n;i++) {

        if(res != str[i]) {
            count++;
            res = str[i];
        }
    }

    if(count<k) {

        cout<<-1<<"\n";
        return;
    }

    if(str[0]=='0') {

        if( k % 2) {
            for(int i=str.size()-1; i>=0; i--) {

                if(str[i] == '1') {
                    cout<<i+1<<"\n";
                    return;
                }
            }
        }

        else {

            for(int i=str.size()-1; i>=0; i--) {
                if(str[i] == '0') {
                    cout<<i+1<<"\n";
                    return;
                }
            }
        }
    }
    else {
        if( k % 2) {
            for(int i=str.size()-1; i>=0; i--) {
                if(str[i] == '0') {
                    cout<<i+1<<"\n";
                    return;
                }
            }
        }
        else {
            for(int i=str.size()-1; i>=0; i--) {
                if(str[i] == '1') {

                    cout<<i+1<<"\n";
                    return;
                }
            }
        }
    }
    }
    
    return 0;
}