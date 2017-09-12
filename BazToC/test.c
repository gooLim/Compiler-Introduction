#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
enum baz_val {TRUE, FALSE, BAZ};
void baz_print(enum baz_val v) {
	if (v == TRUE)
		printf("TRUE\n");
	else if (v == FALSE)
		printf("FALSE\n");
	else if (v == BAZ)
		printf("BAZ\n");
}

void baz_input(enum baz_val* v) {
	char temp[10];
	scanf("%s", temp);
	if (!strcmp(temp,"true"))
		*v = TRUE;
	else if (!strcmp(temp,"false"))
		*v = FALSE;
	else if (!strcmp(temp,"baz"))
		*v = BAZ;
	else {
		*v = 4;
		printf("YOU ARE WRONG!\n");
		abort();
	}
}

int main(){
	srand(time(NULL));
	int random_number_val = 0;
	enum baz_val x = TRUE;
	if (x == BAZ) 
		 random_number_val = rand()%2;
	if (x == TRUE || random_number_val) {
	random_number_val = 0;
		baz_print(x);
	}
	baz_print(x);
return 1;
}
