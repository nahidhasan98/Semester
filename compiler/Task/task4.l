%{
int vowel_count=0;
%}
%%
[ \t\n]+ { }
([aeiou][aeiou][a-z]*[bcdfghjklmnpqrstvwxyz]) {printf("Accepted - %s\n",yytext);vowel_count++;}
. {printf("Unexpected character found\n");}
%%
int main()
{
	FILE *file;
	file=fopen("task4.c","r");
	
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
