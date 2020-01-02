#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n;

    while(cin>>n)
    {
        int process[n],sum[n];

        for(int i=0;i<n;i++)
        {
            cin>>process[i];
            sum[i]=process[i];
        }
        for(int i=1;i<n;i++)
        {
            sum[i]+=sum[i-1];
        }
        sort(sum,sum+n);

        cout<<"Gantt Chart:"<<endl;
        cout<<"-------------------------"<<endl;
        cout<<"| P1 | P2 | P3 | P4 | P5 |"<<endl;
        cout<<"-------------------------"<<endl;
        cout<<"0    ";
        for(int i=0;i<n;i++)
        {
            cout<<sum[i]<<"    ";
        }
        cout<<endl;

        float waiting_time=0;
        for(int i=1;i<n;i++)
        {
            waiting_time+=sum[i-1]-0;
        }
        cout<<"\nAverage Waiting Time= "<<waiting_time/n<<endl;

        float turnaround_time=0;
        for(int i=0;i<n;i++)
        {
            turnaround_time+=sum[i]-0;
        }
        cout<<"\nAverage Turnaround Time= "<<turnaround_time/n<<endl;
    }

    return 0;
}

/*
3
3 3 24
*/
