#include <iostream>
#include "bits/stdc++.h"
using namespace std;

int main() {
	// your code goes here
    int t;
    cin >> t;
    while(t-- > 0){
        int n;
        cin >> n;
        int arr[n];
        bool flag = true;
        for(int i = 0; i < n; i++){
            cin >> arr[i];
            if(i > 0 && arr[i-1] % arr[i]!=0){
                    flag = false;
            }
        }
        if(flag == true){
            for(int i=0; i<n; i++){
                cout << arr[i] << ' ';
            } 
            cout << "\n";
        }
        else{
            cout << "-1\n";
        }

    }
	return 0;
}