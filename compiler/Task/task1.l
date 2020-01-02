%{
int num_count=0;
%}

%%
[ \t\n]+ { }
(1\.5[3-9][0-9]*|1\.[6-9][0-9][0-9]*|[2-9]\.[0-9][0-9][0-9]*|[1-6][0-9]\.[0-9][0-9][0-9]*|7[0-4]\.[0-9][0-9][0-9]*|75\.[0-2][0-9][0-9]*|75\.3[0-1]) {printf("Accepted - %s\n",yytext);num_count++;}
. {printf("Unexpected character found\n");}
%%

int main()
{
	FILE *file;
	file=fopen("task1.c","r");
	
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
