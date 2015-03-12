#include <stdio.h>
#include <cstdlib>
#include <iostream>
using namespace std;

std::string command = "date";

int main()
{
	FILE* handle = popen(command.c_str(), "r");
	if (handle == NULL)
		return EXIT_FAILURE;
	const int SIZE = 10001;
	char output[SIZE];
	output[0] = '\0';

	int output_char_count;

	fread(output, 1, SIZE, handle);
	cout << output << endl;

	pclose(handle);
	return EXIT_SUCCESS;
}

