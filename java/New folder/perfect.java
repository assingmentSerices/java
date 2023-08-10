class Parfect
{
static public void main(String args[])
{
int i,j=1,sum=0;
for(i=1;i<=100;i++)
{
for(j=1;j<=i/2;j++)
{
if(i%j==0)
{
sum=sum+i; 
}
if(sum==i)
System.out.print(sum);
}
}
}
}
