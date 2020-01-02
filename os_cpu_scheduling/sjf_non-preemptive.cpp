#include<bits/stdc++.h>
using namespace std;

struct process
{
    int burst_time;
    string name;
};
bool operator < (process a,process b)
{
    if(a.burst_time!=b.burst_time)
        return a.burst_time<b.burst_time;
}

int main()
{
    int n;

    while(cin>>n)
    {
        process p[n];

        for(int i=0;i<n;i++)
        {
            cin>>p[i].burst_time;

            int temp=i+1;

            p[i].name="P";
            p[i].name+=temp+'0';
        }
        sort(p,p+n);

        float sum[n];
        sum[0]=p[0].burst_time;
        for(int i=1;i<n;i++)
        {
            sum[i]=sum[i-1]+p[i].burst_time;
        }

        cout<<"Gantt Chart:"<<endl;

        cout<<"-----------------------------"<<endl;
        for(int i=0;i<n;i++)
        {
            cout<<"| "<<p[i].name<<" ";
        }
        cout<<"|\n-----------------------------"<<endl;

        cout<<"0    ";
        for(int i=0;i<n;i++)
        {
            cout<<sum[i]<<"    ";
        }
        cout<<endl;

        float total_wait=0;

        int waiting_time[n];
        waiting_time[0]=0;
        for(int i=1;i<n;i++)
        {
            waiting_time[i]=sum[i-1]-0;
            total_wait+=waiting_time[i];
        }
        for(int i=0;i<n;i++)
        {
            cout<<"Waiting Time for Process "<<p[i].name<<"= "<<waiting_time[i]<<endl;
        }
        cout<<"\nAverage Waiting Time= "<<total_wait/n<<endl;
        cout<<endl;

        float total_time=0;
        int turnaround_time[n];
        turnaround_time[0]=0;
        for(int i=0;i<n;i++)
        {
            turnaround_time[i]=sum[i]-0;
            total_time+=turnaround_time[i];
        }
        for(int i=0;i<n;i++)
        {
            cout<<"Turnaround Time for Process "<<p[i].name<<"= "<<turnaround_time[i]<<endl;
        }
        cout<<"\nAverage Turnaround Time= "<<total_time/n<<endl;
    }

    return 0;
}

/*
4
7
2
3
5
*/

