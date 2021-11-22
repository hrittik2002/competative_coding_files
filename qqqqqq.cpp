
#include <stdint.h>
#include <bits/stdc++.h>

using namespace std;

#define ll long long

int main()
{
    ll t;
    cin >> t;
    while (t--)
    {
        ll ans_hrittik = 0;





        ll n; cin>>n;
        ll arr[n];

        for (ll i = 0; i < n;   i++){
            cin>>arr[i];
        }
    





        
        for (ll i = 0; i < n;  i++)
        {
            set<ll> s;

            ll maximum_hrittik  = arr[i];
            ll minimum_hrittik = arr[i];
             
            for (ll j = i; j<n; j++)
            {
                

                maximum_hrittik = max(maximum_hrittik , arr[j]);
                minimum_hrittik = min(minimum_hrittik, arr[j]);

                s.insert(arr[j]);

                if (j - i < 2)
                    continue;


                ll value = 0;


                auto pos = s.lower_bound((maximum_hrittik  +   minimum_hrittik) / 2);

                if (pos != s.end())
                {
                    value = max(value,     (maximum_hrittik  -      (*pos)) * ((*pos) - minimum_hrittik));
                }


                if (pos != s.begin())
                {
                    pos--;
                    value = max(value,     (maximum_hrittik  -         (*pos)) * ((*pos) - minimum_hrittik));
                }
                ans_hrittik += value;
            }
        }




        cout << ans_hrittik << endl;
    }
}