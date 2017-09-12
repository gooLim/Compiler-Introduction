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
	int temp = 0;
	enum baz_val x = TRUE;
	x = BAZ;
	if (x == BAZ) 
		 temp = rand()%2;
	if (x == TRUE || temp) {
	temp = 0;
		baz_print(x);
	}
	baz_print(x);
}
