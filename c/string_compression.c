#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char *compress(const char *input) {
    size_t len = strlen(input);
    const size_t max_compressed_per_char = 2;
    if (len == 0) {
        char *empty = malloc(1);
        if (empty) empty[0] = '\0';
        return empty;
    }

    char *buffer = malloc(len * max_compressed_per_char + 1);
    if (!buffer) return NULL;

    size_t out = 0;
    int count = 1;

    for (size_t i = 1; i <= len; i++) {
        if (i < len && input[i] == input[i - 1]) {
            count++;
        } else {
            out += sprintf(buffer + out, "%c%d", input[i - 1], count);
            count = 1;
        }
    }

    if (out >= len) {
        strcpy(buffer, input);
    }

    return buffer;
}

int main(int argc, char *argv[]) {
    const char *sample = (argc > 1) ? argv[1] : "aabcccccaaa";
    char *result = compress(sample);

    if (!result) {
        fprintf(stderr, "Memory allocation failed\n");
        return 1;
    }

    printf("%s\n", result);
    free(result);
    return 0;
}
