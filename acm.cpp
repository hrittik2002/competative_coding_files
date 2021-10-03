#include<bits/stdc++.h>
using namespace std;

void solve_helper()
{
  ll n,x,y;

  cin>>n;

  vi v(n);

  rep(i,0,n)

  cin>>v[i];

  sort(v.begin(),v.end());

  vi pre = v;

  rep(i,1,n)

  pre[i]+=pre[i-1];

  ll q;

  cin>>q;

  while(q)
  {

    cin>>x>>y;

    ll ans = INF;

    ll position = std::lower_bound(v.begin(),v.end(),x) - v.begin();

    ll need = 0;




    if(position == n)
    {
      ans = x - v[position-1] + max(ll(0) , y - pre[n-1] + v[position-1]);
    }
    else if(position != 0)
    {
      ans = min(max(ll(0) , x - v[position]) +  max(ll(0) , y - pre[n-1] + v[position]) , max(ll(0) , x - v[position-1]) +  max(ll(0) , y - pre[n-1] + v[position-1]));
    }
    else
    {
      ans = max(ll(0) , x - v[position]) +  max(ll(0) , y - pre[n-1] + v[position]);
    }
    cout<<ans<<"\n";
    q--;
  }
 
 




}
int main()
{


    fastIO;
    int testcase = 1;
    while(testcase--)
    {
        solve_helper();
        cnt++;
    }
    return 0;
}