def compress(input_str: str) -> str:
    if not input_str:
        return ""

    compressed = []
    count = 1

    for i in range(1, len(input_str) + 1):
        if i < len(input_str) and input_str[i] == input_str[i - 1]:
            count += 1
        else:
            compressed.append(f"{input_str[i - 1]}{count}")
            count = 1

    result = "".join(compressed)
    return result if len(result) < len(input_str) else input_str


if __name__ == "__main__":
    import sys

    sample = sys.argv[1] if len(sys.argv) > 1 else "aabcccccaaa"
    print(compress(sample))
