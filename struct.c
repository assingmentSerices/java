#include<stdio.h>
struct employee
{
	int empId;
	char empName[20];
	int empSal;
	char empDep[10];
}chet[100];
int index=0;
void create()
{
	int option;
	char 5;
	printf("\n\npress any to continue");
	scanf("%c",&s);
	printf("\n\npress 1 add employee.\npress 2 view all employee details \nfor search employee by Id.\npress 4 employee dep");
	scanf("%d",&option);
	switch(option)
	{
		case 1
		{
			add();
			break;

		}
		case 2
		{
			view();
			break;
		}
		case 3
		{
			search();
			break;
		}
		case 4
		{
			update();
			berak;
		}
		case 5
		{
			printf("\nEnded");
			break;
		}

	}
}
void add()
{
	printf("\nenter employee Id");
	scanf("%d",&chet[index].empId);
	printf("enter employee name");
	scanf("%s",&chet[index].empname);
	printf("enter employee sal");
	scanf("%d",&chet[index].empsal);
	printf("enter employee department");
	scanf("%s",&chet[index].empDep);
	printf("\n\nemployee details added");
	index++;
	create();
}
void view()
{
	if(index!=0){
		int i;
		for(i=0;i<index;i++)
		{
			printf("\n\n%d employee detials",i+1);
			printf("\nemployee id %d",chet[i].empId);
			printf("\nemployee name%d",chet[i].empName);
			printf("\n %demployee sal",chet[i].empsal);
			printf("\n%semployee department",chet[i]empdep);

		}

	}
	else{
		printf("\n no record");
	}
	create();
}
void serch()
{
	if(index!=0)
	{
		int i,id;
		printf("enter employee id for details");
		scanf("%d",&id);
		for(i=0;i<index;i++)
		{
			if(chet[i].empId==id)
			{
				printf("\nemployee id %d"chet[i].empId);
				printf("\nemployee name %s"chet[i].empName);
				printf("\nemployee sal %d"chet[i].empsal);
				printf("\nemployee departement %d"chet[i].empdep);
				break;

			}
		}
	}
	else
	{
		printf("\n no record");
	}
	create();
}
void edit()
{
	if(index!=0)
	{
		int i,id;
		printf("enter the employee id edit details");
		scanf("%d",&id);
		for(I=0;i<=index;i++)
		{
			if(chet[i].empid==id)
			{
				printf("enter the employee name");
				scanf("%s",&chet[i].empName);
			}
		}
	}
}

void main()
{
	printf("chet")
	create();
}

