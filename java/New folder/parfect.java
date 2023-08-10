class Parfect
{
static public void main(String args[])
{
int i,j=1,sum=0;
for(i=1;i<=100;i++)
{
for(j=1;j<=i;j++)
{
if(i%j==0)
sum=sum+i; 
}
System.out.print(sum);
}
}
}
