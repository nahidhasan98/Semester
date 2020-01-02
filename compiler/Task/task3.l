%{
int vowel_count=0;
%}
%%
[ \t\n]+ { }
([aeiou][a-z]{2,}[aeiou]) {printf("Accepted - %s\n",yytext);vowel_count++;}
. {printf("Unexpected character found\n");}
%%
int main()
{
	FILE *file;
	file=fopen("task3.c","r");
	
	if(!file)
	{
		printf("Cannot open file");
		exit(1);
	}
	else
		yyin=file;

	yylex();

	printf("Total word entered - %d\n",vowel_count);
}
