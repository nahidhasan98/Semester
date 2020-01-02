%{
int num_count=0;
int vowel_count=0;
int double_count=0;
int char_count=0;
%}
%%
[ \t\n]+ { }
([0-9]+\.[0-9]+) {printf("Double found - %s\n",yytext);double_count++;}
([0-9]+) {printf("Integer found - %s\n",yytext);num_count++;}
([aeiou][a-z]+) {printf("Vowel word found - %s\n",yytext);vowel_count++;}
([a-z][a-z]+) {printf("Word found - %s\n",yytext);}
[a-z] {printf("Character word found - %s\n",yytext);char_count++;}
. {printf("Unexpected character found\n");}
%%
int main()
{
	FILE *file;
	file=fopen("code.c","r");
	
	if(!file)
	{
		printf("Cannot open file");
		exit(1);
	}
	else
		yyin=file;

	yylex();

	printf("Vowel count - %d\n",vowel_count);
	printf("Character count - %d\n",char_count);
	printf("Double count - %d\n",double_count);
	printf("Integer count - %d\n",num_count);
}
