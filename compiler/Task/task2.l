%{
int num_count=0;
%}

%%
[ \t\n]+ { }
(242[0-3]|24[0-1][0-9]|2[0-3][0-9][0-9]|7[6-9]|[8-9][0-9]|[1-9][0-9][0-9]|1[0-9][0-9][0-9]) {printf("Accepted - %s\n",yytext);num_count++;}
. {printf("Unexpected character found \n");}
%%

int main()
{
	FILE *file;
	file=fopen("task2.c","r");
	
	if(!file)
	{
		printf("Cannot open file");
		exit(1);
	}
	else
		yyin=file;

	yylex();

	printf("Total Number entered - %d\n",num_count);
}
